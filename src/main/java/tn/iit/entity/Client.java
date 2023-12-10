package tn.iit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.EqualsAndHashCode.Include;
import lombok.ToString.Exclude;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor // obligatoire selon JEE
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity // cet objet fera un mapping avec la base de données
@Table(name = "t_client")
public class Client implements Serializable /* obligatoire selon JEE */ {
    private static final long serialVersionUID = 1L;
    @Include
    @Id // PK
    @Column(length = 10)
    private String cin;
    private String nom;
    private String prenom;
    private String address;

    // bidirectionnelle
    @Exclude // casser la boucle toString
    @JsonIgnore // casser la boucle Json
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    // à elle seule --> table de jointure
    private List<BankAccount> bankAccounts;
    //default fetch LAZY

    public Client(String cin, String nom, String prenom, String address) {
        super();
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
    }


}
