package main.java.Repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.MedicalRecord;
import main.java.Classes.User;

@Transactional
@Repository
public class MedicalRecordRepository implements IMedicalRecordRepository{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MedicalRecord> getAllMedicalRecords() {
		String hql = "FROM MEDICALRECORD as record ORDER BY record.Recordid Desc";
		return (List<MedicalRecord>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public MedicalRecord getMedicalRecordById(int recordId) {
		return entityManager.find(MedicalRecord.class, recordId);
	}
	
	@Override
	public void createMedicalRecord(MedicalRecord medicalRecord) {
		entityManager.persist(medicalRecord);
	}
	
	@Override
	public void updateMedicalRecord(MedicalRecord medicalRecord) {
		MedicalRecord holderMedicalRecord = getMedicalRecordById(medicalRecord.getRecordId());
		//set your values to be updated based on the input from the Api
		//holderMedicalRecord.set(medicalRecord.getFirstName());
		//holderMedicalRecord.set(medicalRecord.getLastName());
		entityManager.flush();
	}
	
	@Override
	public void deleteMedicalRecord(int recordId) {
		entityManager.remove(getMedicalRecordById(recordId));
	}
}
