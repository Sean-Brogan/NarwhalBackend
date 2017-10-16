package main.java.Services;

import main.java.Services.Interfaces.IMedicalRecordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.java.Repository.Interfaces.IMedicalRecordRepository;
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;

@Service
public class MedicalRecordService implements IMedicalRecordService{
	@Autowired
	private IMedicalRecordRepository medicalRecordRepository;
	
        //Generic Medical Record Index Management Service Calls
	@Override
	public List<MedicalRecord> getAllMedicalRecords(){
		return medicalRecordRepository.getAllMedicalRecords();
	}
	
	@Override
        //this will probably never be used since any gets will go directly to the appropriate record type table
	public MedicalRecord getMedicalRecordById(int recordId){
		MedicalRecord obj = medicalRecordRepository.getMedicalRecordById(recordId);
		return obj;
	}
	
	@Override
	public void createMedicalRecord(MedicalRecord medicalRecord){
		medicalRecordRepository.createMedicalRecord(medicalRecord);
	}
	
	@Override
	public void updateMedicalRecord(MedicalRecord medicalRecord){
		// TODO : this is a strange one since with blockchain we can't just overwrite the old data
		// we can discuss when we need to implement it
	}
	
	@Override
        //should also delete the record in the appropriate table
	public void deleteMedicalRecord(int recordId){
		// TODO : again this is strange because we have to save all the data for the chain
		// implementation tbd
	}
        
        //Diagnosis Record Service Calls
        @Override
        Diagnosis getDiagnosisRecordById(int recordId){
            
        }
        
        @Override
        void createDiagnosisRecord(Diagnosis record){
            
        }
    
        //Immunization Record Serivice Calls
        @Override
        Immunization getImmunizationRecordById(int recordId){
            
        }
        
        @Override
        void createImmunizationRecord(Immunization record){
            
        }
    
        
        //MedicalTest Record Serivice Calls
        @Override
        MedicalTest getMedicalTestRecordById(int recordId){
            
        }
        
        @Override
        void createMedicalTest(MedicalTest record){
            
        }
    
        
        //Medication Record Serivice Calls
        @Override
        Medication getMedicationRecordById(int recordId){
            
        }
        
        @Override
        void createMedicationRecord(Medication record){
            
        }
        
        //SocialHistory Record Serivice Calls
        @Override
        SocialHistory getSocialHistoryTestRecordById(int recordId){
            
        }
        
        @Override
        void createSocialHistory(SocialHistory record){
            
        }
    

        //Surgery Record Serivice Calls
        @Override
        Surgery getSurgeryRecordById(int recordId){
            
        }
        
        @Override
        void createSurgeryRecord(Surgery record){
            
        }
}
