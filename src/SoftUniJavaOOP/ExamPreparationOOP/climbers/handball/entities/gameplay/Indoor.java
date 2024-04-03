package SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.gameplay;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.equipment.Equipment;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.team.Team;

import java.util.Collection;

public class Indoor extends BaseGameplay {
    private static final int DEFAULT_CAPACITY_VALUE = 250;

    public Indoor(String name) {
        super(name, DEFAULT_CAPACITY_VALUE);
    }

    @Override
    public Collection<Team> getTeam() {
        return null;
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
