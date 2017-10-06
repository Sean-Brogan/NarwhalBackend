package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import main.java.Classes.ConditionType;

@Entity
@Table(name="familyMedicalHistory")
public class FamilyMedicalHistory implements Serializable{
    
    @Id @JoinColumn(name="userId")
    private int patientId;
    @Id @JoinColumn(name="userId")
    private int relationId;
    @Id @Column
    private ConditionType condition;
}
