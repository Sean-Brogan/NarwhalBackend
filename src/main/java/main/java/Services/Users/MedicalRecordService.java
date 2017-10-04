package main.java.Services.Users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.java.Repository.IMedicalRecordRepository;
import main.java.Classes.MedicalRecord;

@Service
public class MedicalRecordService implements IMedicalRecordService{
	@Autowired
	private IMedicalRecordRepository medicalRecordRepository;
	
	@Override
	public List<MedicalRecord> getAllMedicalRecords(){
		return medicalRecordRepository.getAllMedicalRecords();
	}
	
	@Override
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
	public void deleteMedicalRecord(int recordId){
		// TODO : again this is strange because we have to save all the data for the chain
		// implementation tbd
	}
}
