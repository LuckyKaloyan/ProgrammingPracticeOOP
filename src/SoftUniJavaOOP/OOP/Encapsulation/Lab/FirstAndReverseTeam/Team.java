package SoftUniJavaOOP.OOP.Encapsulation.Lab.FirstAndReverseTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private   String name;
    private List<Person> firstTeam = new ArrayList<>();
    private  List<Person> reverseTeam = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addPlayer(Person person){
        if(person.getAge()<40){
            firstTeam.add(person);
        }else{
            reverseTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
      return  Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReverseTeam() {
        return  Collections.unmodifiableList(this.reverseTeam);
    }

}
