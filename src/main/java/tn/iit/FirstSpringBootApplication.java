package tn.iit;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import tn.iit.dao.ClientDao;
import tn.iit.dao.BankAccountDao;
import tn.iit.entity.BankAccount;
import tn.iit.entity.Client;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {

    @Autowired
    private BankAccountDao bankAccountDao;

    @Autowired
    private ClientDao clientDao;

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootApplication.class, args);
    }

    @Transactional // pour le commit
    @Override
    public void run(String... args) throws Exception {
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        // Replace "yourPlaintextPassword" with the password you want to encrypt.
//        String encryptedPassword = passwordEncoder.encode("admin");
//        System.out.println(encryptedPassword);
    }

}
