package pl.sda.mvc.controller;

import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.view.GiantView;

public class GiantController {

    private GiantModel giant;
    private GiantView view;
    private Health health;
    private Fatigue fatigue;


    public GiantController(GiantModel giant,
                           GiantView view){
        this.giant = giant;
        this.view = view;
        this.health = Health.HEALTH;
        this.fatigue = Fatigue.NOTTIRED;
    }
    public void updateView(){
        //wyswietlenie potworka
        view.displayGiant(this.giant);
    }
    public void setHealth(Health health){
        //aktualizuje model
        this.giant.setHealth(health);
        //this.setHealth(health);

    }
    public void setFatigue(Fatigue fatigue){

        this.giant.setFatigue(fatigue);
    }

}
