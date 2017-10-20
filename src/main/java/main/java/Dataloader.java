package main.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import main.java.Classes.ConditionType;
import main.java.Classes.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import main.java.Repository.Interfaces.IUserRepository;
import main.java.Repository.Interfaces.IConditionTypeRepository;
import main.java.Repository.Interfaces.IMedicalRecordRepository;

@Component
public class Dataloader implements ApplicationRunner {
        
    private IUserRepository userRepository;
    private IConditionTypeRepository conditionTypeRepository;
    private IMedicalRecordRepository medicalRecordRepository;
    //add medical records of various classes
       
    @Autowired
    public Dataloader(IUserRepository userRepository, IConditionTypeRepository condtionTypeRepository, IMedicalRecordRepository medicalRecordRepository) {
        this.userRepository = userRepository;
        this.conditionTypeRepository = condtionTypeRepository;
        this.medicalRecordRepository = medicalRecordRepository;
        //add the reposiory of the requred category here (so you can access the create method)
    }

    public void run(ApplicationArguments args) {
        //when more users are added maybe make a list of them and then loop the create function on the List objects
        userRepository.createUser(new User("SuperAdmin", "Narwhal123", "Sean", "Brogan", new Date(), 123456789, true, null,  2));
	userRepository.createUser(new User("Jesse", "Narwhal123", "Jesse", "Stell", new Date(), 123456781, true, null,  2));
	userRepository.createUser(new User("Matthew", "Narwhal123", "Matthew", "Current", new Date(), 123456782, true, null,  2));
	userRepository.createUser(new User("Amanda", "Narwhal123", "Amanda", "Diaz", new Date(), 123456783, true, null,  2));
	userRepository.createUser(new User("Robert", "Narwhal123", "Robert", "Ellis", new Date(), 123456784, true, null,  2));
	userRepository.createUser(new User("Thalo", "Narwhal123", "Thalo", "Menninga", new Date(), 123456785, true, null,  2));

	List<User> users = new ArrayList<User>();
	users.add(new User("Man", "Narwhal123", "Tom", "Futzington", new Date(), 223456789, true, null, 1));
	users.add(new User("Guy", "Narwhal123", "Margo", "Cleopatra", new Date(), 323456789, true, null, 1));
	users.add(new User("Buddy", "Narwhal123", "Drat", "Danlloyd", new Date(), 423456789, true, null, 1));
	users.add(new User("Dude", "Narwhal123", "Jomey", "Kilpatrick", new Date(), 523456789, true, null, 1));
	users.add(new User("Simpleton", "Narwhal123", "Barnsworth", "Carmichelle", new Date(), 623456789, true, null, 1));
	users.add(new User("Person", "Narwhal123", "Gary", "Sormpson", new Date(), 723456789, true, null, 1));
	users.add(new User("Sonny", "Narwhal123", "Benson", "Deadbeat", new Date(), 823456789, true, new Date(), 1));
	users.add(new User("Username", "Narwhal123", "Lambsworth", "Gertrude", new Date(), 923456789, true, new Date(),  1));
	users.add(new User("Calm", "Narwhal123", "Kelly", "McAnnley", new Date(), 113456789, true, null,  1));
	users.add(new User("Stats", "Narwhal123", "Robert", "Leesom", new Date(), 133456789, true, null,  1));
	users.add(new User("Effort", "Narwhal123", "Jude", "Binshamp", new Date(), 143456789, true, null,  1));
	users.add(new User("Fork", "Narwhal123", "Drew", "Ainsworth", new Date(), 153456789, true, null,  1));
	users.add(new User("Cold", "Narwhal123", "Farms", "Berrymore", new Date(), 163456789, true, new Date(), 1));
	users.add(new User("Touch", "Narwhal123", "Mullen", "Inklewood", new Date(), 173456789, true, null, 1));
	users.add(new User("Some", "Narwhal123", "Nam", "Cort", new Date(), 183456789, true, null, 1));
	users.add(new User("Lazy", "Narwhal123", "Hint", "Chilberry", new Date(), 193456789, true, new Date(), 1));
	users.add(new User("July", "Narwhal123", "Soren", "McAstley", new Date(), 121456789, true, null, 1));
	users.add(new User("Art", "Narwhal123", "Minty", "Sickleston", new Date(), 122456789, true, null, 1));
	users.add(new User("Mack", "Narwhal123", "Ella", "Cinders", new Date(), 124456789, true, null, 1));
	users.add(new User("Flash", "Narwhal123", "Troom", "Stinton", new Date(), 125456789, true, null, 1));
	users.add(new User("Morrow", "Narwhal123", "Harold", "Gourndon", new Date(), 126456789, true, new Date(), 1));
	users.add(new User("Mar", "Narwhal123", "Sealow", "Grean", new Date(), 127456789, true, null, 1));
	users.add(new User("Grade", "Narwhal123", "Benward", "Kalting", new Date(), 128456789, true, null, 1));
	users.add(new User("Play", "Narwhal123", "Scio", "Chompton", new Date(), 129456789, true, new Date(), 1));

	users.add(new User("Green", "Narwhal123", "Kerry", "Kerrington", new Date(), 123156789, true, null, 1));
	users.add(new User("Red", "Narwhal123", "Marc", "Guasch", new Date(), 123256789, true, null, 1));
	users.add(new User("Thing", "Narwhal123", "Eddy", "Zulu", new Date(), 123356789, true, null, 1));
	users.add(new User("Pray", "Narwhal123", "Samuel", "Chortles", new Date(), 123556789, true, null, 1));
	users.add(new User("Splinter", "Narwhal123", "Graynard", "Woodsworth", new Date(), 123656789, true, null, 1));
	users.add(new User("Sorry", "Narwhal123", "Medley", "Woodsworth", new Date(), 123756789, true, new Date(), 1));
	users.add(new User("Scram", "Narwhal123", "Niner", "Woodsworth", new Date(), 123856789, true, null, 1));
	users.add(new User("Show", "Narwhal123", "Benji", "Woodsworth", new Date(), 123956789, true, new Date(), 1));

	for (int i = 0; i < users.size(); i++){
            userRepository.createUser(users.get(i));
        }
        
        conditionTypeRepository.createConditionType(new ConditionType("Diagnosis"));
        conditionTypeRepository.createConditionType(new ConditionType("Immunization"));
        conditionTypeRepository.createConditionType(new ConditionType("MedicalTest"));
        conditionTypeRepository.createConditionType(new ConditionType("Medication"));
        conditionTypeRepository.createConditionType(new ConditionType("SocialHistory"));
        conditionTypeRepository.createConditionType(new ConditionType("Surgery"));



        //use the coresponding repo to grab the create function
    }

}
