package main.java.Controllers;

import java.util.List;
//Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
//Classes
import main.java.Classes.MedicalRecord;
import main.java.Classes.MedicalRecordTypes.Diagnosis;
import main.java.Classes.MedicalRecordTypes.Immunization;
import main.java.Classes.MedicalRecordTypes.MedicalTest;
import main.java.Classes.MedicalRecordTypes.Medication;
import main.java.Classes.MedicalRecordTypes.SocialHistory;
import main.java.Classes.MedicalRecordTypes.Surgery;
//Service
import main.java.Services.Interfaces.IMedicalRecordService;

@RestController
public class MedicalRecordController {
	@Autowired
	private IMedicalRecordService medicalRecordService;
	
	@GetMapping("all-medicalrecords")
	public ResponseEntity<List<MedicalRecord>> getAllMedicalRecords() {
		List<MedicalRecord> list = medicalRecordService.getAllMedicalRecords();
		return new ResponseEntity<List<MedicalRecord>>(list, HttpStatus.OK);
	}
        
        @PostMapping("medicalRecord")
        public ResponseEntity<Void> createMedicalRecord(@RequestBody MedicalRecord record, UriComponentsBuilder builder) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createMedicalRecord(record);
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(builder.path("/medicalRecord?id={id}").buildAndExpand(record.getRecordId()).toUri());
            return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
        }
        
        //in front end have all createMedical record add and index
        //the in a case/if based on the record type call the corect post below
        
	@PostMapping("diagnosis")
        public ResponseEntity<Void> createDiagnosisRecord(@RequestBody Diagnosis record, UriComponentsBuilder builder) {
            //record sent in requires patientId, doctorId, the type of record (an int), and the date of the records creation
            medicalRecordService.createMedicalRecord(record);
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(builder.path("/medicalRecord?id={id}").buildAndExpand(record.getRecordId()).toUri());
            return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
        }		  
}
