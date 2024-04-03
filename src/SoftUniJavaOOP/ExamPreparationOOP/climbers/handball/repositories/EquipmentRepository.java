package SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.equipment.Equipment;

import java.util.Collection;

public abstract class EquipmentRepository {
    private Collection<Equipment> equipments;

    public EquipmentRepository(Collection<Equipment> equipments) {
        this.equipments = equipments;
    }

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    public boolean remove(Equipment equipment) {
        try {
            equipments.remove(equipment);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public Equipment findByType(String type) {
        for (Equipment equipment : equipments) {
            if (equipment.getClass().getSimpleName().equals(type)) {
                return equipment;
            }
        }
        return null;
    }
}
