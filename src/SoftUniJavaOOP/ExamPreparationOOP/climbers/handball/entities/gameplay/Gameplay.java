package SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.gameplay;

import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.team.Team;
import SoftUniJavaOOP.ExamPreparationOOP.climbers.handball.entities.equipment.Equipment;

import java.util.Collection;

public interface Gameplay {
    int allProtection();

    void addTeam(Team team);

    void removeTeam(Team team);

    void addEquipment(Equipment equipment);

    void teamsInGameplay();

    Collection<Team> getTeam();

    Collection<Equipment> getEquipments();

    String getName();


}
