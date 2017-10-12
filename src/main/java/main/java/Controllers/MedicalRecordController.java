package main.java.Controllers;

import java.util.List;
import java.util.Map;

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
import main.java.Classes.MedicalRecord;
import main.java.Services.Users.IMedicalRecordService;

@RestController
public class MedicalRecordController {
	@Autowired
	private IMedicalRecordService medicalRecordService;
	
	@GetMapping("all-medicalrecords")
	public ResponseEntity<List<MedicalRecord>> getAllMedicalRecords() {
		List<MedicalRecord> list = medicalRecordService.getAllMedicalRecords();
		return new ResponseEntity<List<MedicalRecord>>(list, HttpStatus.OK);
	}
	
	/* TODO : will need a point for getting all records a certain entity has access to
			  this point can return the records in full and store them as a list within the session (we could do this at login)
			  then when we need to display records we can do queries within the typescript on the List we have in the cache
			  
			  the same concept applies to when we need to get individual records
			  we will already have the record in the cache and we just query for the id
			  (clicking the record just opens the modal and fills the data in but we already have all the data in storage)
			  
			  
	*/
}
