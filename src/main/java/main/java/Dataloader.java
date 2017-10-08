package main.java;

import java.util.Date;
import main.java.Classes.ConditionType;
import main.java.Classes.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import main.java.Repository.Interfaces.IUserRepository;
import main.java.Repository.Interfaces.IConditionTypeRepository;

@Component
public class Dataloader implements ApplicationRunner {
        
    private IUserRepository userRepository;
    private IConditionTypeRepository conditionTypeRepository;
    //add some patient relations
    //add add medical records of various classes
       
    @Autowired
    public Dataloader(IUserRepository userRepository, IConditionTypeRepository condtionTypeRepository) {
        this.userRepository = userRepository;
        this.conditionTypeRepository = condtionTypeRepository;
        //add the reposiory of the requred category here (so you can access the create method)
    }

    public void run(ApplicationArguments args) {
        //when more users are added maybe make a list of them and then loop the create function on the List objects
        userRepository.createUser(new User("SuperAdmin", "Narwhal123", "Sean", "Brogan", new Date(), 123456789, true));
        
        
        conditionTypeRepository.createConditionType(new ConditionType("Diagnosis"));
        conditionTypeRepository.createConditionType(new ConditionType("Immunization"));
        conditionTypeRepository.createConditionType(new ConditionType("MedicalTest"));
        conditionTypeRepository.createConditionType(new ConditionType("Medication"));
        conditionTypeRepository.createConditionType(new ConditionType("SocialHistory"));
        conditionTypeRepository.createConditionType(new ConditionType("Surgery"));

        //use the coresponding repo to grab the create function
    }

}
