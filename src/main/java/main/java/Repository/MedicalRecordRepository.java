package main.java.Repository;

import main.java.Repository.Interfaces.IMedicalRecordRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import main.java.Classes.MedicalRecord;

@Transactional
@Repository
public class MedicalRecordRepository implements IMedicalRecordRepository{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MedicalRecord> getAllMedicalRecords(int id) {
                String hql1 = "SELECT recordId FROM RECORDACCESS WHERE userId = ?";
                List records = entityManager.createQuery(hql1).setParameter(1, id).getResultList();
                String hql2 = "FROM MEDICALRECORD as record WHERE recordId IN ? ORDER BY record.Recordid Desc";
                return (List<MedicalRecord>) entityManager.createQuery(hql2).setParameter(1, records).getResultList();
	}
	
	@Override
	public MedicalRecord getMedicalRecordById(int recordId) {
		return entityManager.find(MedicalRecord.class, recordId);
	}
	
	@Override
	public int createMedicalRecord(MedicalRecord medicalRecord) {
                entityManager.persist(medicalRecord);
                return medicalRecord.getRecordId();
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
