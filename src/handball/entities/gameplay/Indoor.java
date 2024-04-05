package handball.entities.gameplay;

import handball.entities.equipment.Equipment;
import handball.entities.team.Team;

import java.util.Collection;

public class Indoor extends BaseGameplay {
    private String name;
    private Collection<Equipment> equipments;
    private Collection<Team> teams;
    private static final int DEFAULT_CAPACITY_VALUE = 250;

    public Indoor(String name) {
        super(name, DEFAULT_CAPACITY_VALUE);
    }

    @Override
    public Collection<Team> getTeam() {
        return teams;
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return equipments;
    }

    @Override
    public String getName() {
        return name;
    }
}
