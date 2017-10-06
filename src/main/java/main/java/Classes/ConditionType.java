package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="conditionType")
public class ConditionType implements Serializable
{
    @Id @Column(name="conditionId")
    private int conditionId;
    @Column(name="conditionName")
    private String conditionName;
    
    public ConditionType(int conditionId, String conditionName){
        super();
        this.setConditionId(conditionId);
        this.setConditionName(conditionName);
    }
    
    public ConditionType(){
        super();
    }
    
    public int getConditionId(){
        return conditionId;
    }
    
    public void setConditionId(int conditionId){
        this.conditionId = conditionId;
    }
    
    public String getConditionName(){
        return conditionName;
    }
    
    public void setConditionName(String conditionName){
        this.conditionName = conditionName;
    }
}
