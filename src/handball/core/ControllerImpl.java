package handball.core;

import handball.entities.equipment.ElbowPad;
import handball.entities.equipment.Kneepad;
import handball.entities.gameplay.Gameplay;
import handball.entities.gameplay.Indoor;
import handball.entities.gameplay.Outdoor;
import handball.repositories.EquipmentRepository;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ControllerImpl implements Controller {
    private EquipmentRepository equipment;
    private Collection<Gameplay> gameplays;


    public ControllerImpl(){
        this.equipment = new EquipmentRepository();
        this.gameplays = new ArrayList<Gameplay>();
    }

    @Override
    public String addGameplay(String gameplayType, String gameplayName) {
        if(!gameplayType.equals("Indoor") && !gameplayType.equals("Outdoor")){
            throw new NullPointerException("Invalid gameplay type.");

        }else {
            Gameplay gameplay;
            if(gameplayType.equals("Indoor")) {
                gameplay = new Indoor(gameplayName) {};
            }else{
                gameplay = new Outdoor(gameplayName) {};
            }
            gameplays.add(gameplay);
            return String.format("Successfully added %s", gameplayType);
        }
    }
    @Override
    public String addEquipment(String equipmentType){
        if(equipmentType.equals("Kneepad")){
            Kneepad kneepad = new Kneepad();
         equipment.add(kneepad);
            return String.format("Successfully added %s",kneepad.getClass().getSimpleName());
        }else if(equipmentType.equals("ElbowPad")){
              ElbowPad elbowPad = new ElbowPad();
              equipment.add(elbowPad);
            return String.format("Successfully added %s",elbowPad.getClass().getSimpleName());
        }else{
            throw new IllegalArgumentException("Invalid equipment type.");
        }
        }

      public String equipmentRequirement(String gameplayName, String equipmentType){

        if(equipmentType.equals("Kneepad")){
            for(Gameplay gameplay: gameplays){
                if(gameplay.getName().equals(gameplayName)){
                    Kneepad kneepad = new Kneepad();
                    gameplay.addEquipment(kneepad);
                    return String.format("Successfully added %s to %s",equipmentType,gameplayName);
                }
        }
            return String.format("There isn't an equipment of type %s.",equipmentType);
        }else if (equipmentType.equals("ElbowPad")){
            for(Gameplay gameplay: gameplays){
                if(gameplay.getName().equals(gameplayName)){
                    ElbowPad elbowPad = new ElbowPad();
                    gameplay.addEquipment(elbowPad);
                    return String.format("Successfully added %s to %s",equipmentType,gameplayName);
                }
          }
            return String.format("There isn't an equipment of type %s.",equipmentType);
      }else{return String.format("There isn't an equipment of type %s.",equipmentType);}
      }

    public String addTeam(String gameplayName, String teamType, String teamName, String country, int advantage){
        if(!teamType.equals("Bulgaria") && !teamType.equals("Germany")){
            throw new IllegalArgumentException("Invalid team type.");
        } else if(teamType.equals("Bulgaria")){
            if(gameplayName.equals("Outdoor")){
                Gameplay gameplay = new Outdoor(gameplayName);
                gameplays.add(gameplay);
                return String.format("Successfully added %s to %s.",teamType,gameplayName);
            }else {
                return "The coverage of the terrain is not suitable.";
            }
        } else {
            if (gameplayName.equals("Outdoor")) {
                return "The coverage of the terrain is not suitable.";
            } else {
                Gameplay gameplay = new Indoor(gameplayName);
                gameplays.add(gameplay);
                return String.format("Successfully added %s to %s.", teamType, gameplayName);
            }
        }
    }

    public String playInGame(String gameplayName){
           String playedTeams = "";
        for(Gameplay gameplay: gameplays){
            if(gameplay.getName().equals(gameplayName)){
                gameplay.teamsInGameplay();
               playedTeams = playedTeams + 
            }

        }

    }
    
    }



