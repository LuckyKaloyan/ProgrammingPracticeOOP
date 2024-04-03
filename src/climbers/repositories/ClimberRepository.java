package climbers.repositories;

import climbers.models.climber.Climber;

import java.util.Collection;

public interface ClimberRepository {
    void add(Climber climber);

    boolean remove(Climber climber);

    Climber byName(String name);

    Collection<Climber> getCollection();
}