package SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.repositories;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.equipment.Equipment;

public interface Repository {
    void add(Equipment equipment);
    boolean remove(Equipment equipment);
    Equipment findByType(String type);
}
