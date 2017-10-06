package main.java.Classes;

import java.util.Date;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import main.java.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Dataloader implements ApplicationRunner {
        
    private IUserRepository userRepository;
       
    @Autowired
    public Dataloader(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(ApplicationArguments args) {
        userRepository.createUser(new User("SuperAdmin", "Narwhal123", "Sean", "Brogan", new Date(), 123456789, true));

    }

}
