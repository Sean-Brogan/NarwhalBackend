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
        userRepository.createUser(new User("SuperAdmin", "Narwhal123", "Sean", "Brogan", new Date(), 123456789, true, 2));
	userRepository.createUser(new User("Jesse", "Narwhal123", "Jesse", "Stell", new Date(), 123456781, true, 2));
	userRepository.createUser(new User("Matthew", "Narwhal123", "Matthew", "Current", new Date(), 123456782, true, 2));
	userRepository.createUser(new User("Amanda", "Narwhal123", "Amanda", "Diaz", new Date(), 123456783, true, 2));
	userRepository.createUser(new User("Robert", "Narwhal123", "Robert", "Ellis", new Date(), 123456784, true, 2));
	userRepository.createUser(new User("Thalo", "Narwhal123", "Thalo", "Menninga", new Date(), 123456785, true, 2));

	User[] users = new User[32];
	User[0] = new User("Man", "Narwhal123", "Tom", "Futzington", new Date(), 223456789, true, 0);
	User[1] = new User("Guy", "Narwhal123", "Margo", "Cleopatra", new Date(), 323456789, true, 0);
	User[2] = new User("Buddy", "Narwhal123", "Drat", "Danlloyd", new Date(), 423456789, true, 0);
	User[3] = new User("Dude", "Narwhal123", "Jomey", "Kilpatrick", new Date(), 523456789, true, 0);
	User[4] = new User("Simpleton", "Narwhal123", "Barnsworth", "Carmichelle", new Date(), 623456789, true, 0);
	User[5] = new User("Person", "Narwhal123", "Gary", "Sormpson", new Date(), 723456789, true, 0);
	User[6] = new User("Sonny", "Narwhal123", "Benson", "Deadbeat", new Date(), 823456789, false, 0);
	User[7] = new User("Username", "Narwhal123", "Lambsworth", "Gertrude", new Date(), 923456789, false, 1);
	User[8] = new User("Calm", "Narwhal123", "Kelly", "McAnnley", new Date(), 113456789, true, 1);
	User[9] = new User("Stats", "Narwhal123", "Robert", "Leesom", new Date(), 133456789, true, 1);
	User[10] = new User("Effort", "Narwhal123", "Jude", "Binshamp", new Date(), 143456789, true, 1);
	User[11] = new User("Fork", "Narwhal123", "Drew", "Ainsworth", new Date(), 153456789, true, 1);
	User[12] = new User("Cold", "Narwhal123", "Farms", "Berrymore", new Date(), 163456789, false, 0);
	User[13] = new User("Touch", "Narwhal123", "Mullen", "Inklewood", new Date(), 173456789, true, 0);
	User[14] = new User("Some", "Narwhal123", "Nam", "Cort", new Date(), 183456789, true, 0);
	User[15] = new User("Lazy", "Narwhal123", "Hint", "Chilberry", new Date(), 193456789, false, 0);
	User[16] = new User("July", "Narwhal123", "Soren", "McAstley", new Date(), 121456789, true, 0);
	User[17] = new User("Art", "Narwhal123", "Minty", "Sickleston", new Date(), 122456789, true, 0);
	User[18] = new User("Mack", "Narwhal123", "Ella", "Cinders", new Date(), 124456789, true, 0);
	User[19] = new User("Flash", "Narwhal123", "Troom", "Stinton", new Date(), 125456789, true, 0);
	User[20] = new User("Morrow", "Narwhal123", "Harold", "Gourndon", new Date(), 126456789, false, 0);
	User[21] = new User("Mar", "Narwhal123", "Sealow", "Grean", new Date(), 127456789, true, 0);
	User[22] = new User("Grade", "Narwhal123", "Benward", "Kalting", new Date(), 128456789, true, 0);
	User[23] = new User("Play", "Narwhal123", "Scio", "Chompton", new Date(), 129456789, false, 0);

	User[24] = new User("Green", "Narwhal123", "Kerry", "Kerrington", new Date(), 123156789, true, 0);
	User[25] = new User("Red", "Narwhal123", "Marc", "Guasch", new Date(), 123256789, true, 0);
	User[26] = new User("Thing", "Narwhal123", "Eddy", "Zulu", new Date(), 123356789, true, 0);
	User[27] = new User("Pray", "Narwhal123", "Samuel", "Chortles", new Date(), 123556789, true, 0);
	User[28] = new User("Splinter", "Narwhal123", "Graynard", "Woodsworth", new Date(), 123656789, true, 0);
	User[29] = new User("Sorry", "Narwhal123", "Medley", "Woodsworth", new Date(), 123756789, false, 0);
	User[30] = new User("Scram", "Narwhal123", "Niner", "Woodsworth", new Date(), 123856789, true, 0);
	User[31] = new User("Show", "Narwhal123", "Benji", "Woodsworth", new Date(), 123956789, false, 0);

	for (int i = 0; i < users.length; i++)
		userRepository.createUser(users[i]);
	
        
        conditionTypeRepository.createConditionType(new ConditionType("Diagnosis"));
        conditionTypeRepository.createConditionType(new ConditionType("Immunization"));
        conditionTypeRepository.createConditionType(new ConditionType("MedicalTest"));
        conditionTypeRepository.createConditionType(new ConditionType("Medication"));
        conditionTypeRepository.createConditionType(new ConditionType("SocialHistory"));
        conditionTypeRepository.createConditionType(new ConditionType("Surgery"));

	medicalRecordRepository.createMedicalRecord(new MedicalRecord(1, 1, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(2, 2, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(3, 3, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(4, 4, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(5, 5, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(6, 6, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(7, 7, new Date());
	medicalRecordRepository.createMedicalRecord(new MedicalRecord(8, 8, new Date());

	


        //use the coresponding repo to grab the create function
    }

}
