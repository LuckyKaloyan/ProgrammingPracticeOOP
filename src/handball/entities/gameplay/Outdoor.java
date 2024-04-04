package handball.entities.gameplay;

import handball.entities.equipment.Equipment;
import handball.entities.team.Team;

import java.util.Collection;

public class Outdoor extends BaseGameplay {
    private static final int DEFAULT_CAPACITY_VALUE = 150;

    public Outdoor(String name) {
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
