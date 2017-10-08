package main.java.Repository;

import main.java.Classes.ConditionType;

public interface IConditionTypeRepository {
    ConditionType getConditionTypeById(int conditionTypeId);
    void createConditionType(ConditionType conditionType);
}
