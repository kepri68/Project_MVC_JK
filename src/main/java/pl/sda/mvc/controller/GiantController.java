package pl.sda.mvc.controller;

import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.view.GiantView;

public class GiantController {

    private GiantModel giant;
    private GiantView view;

    public GiantController(GiantModel giant,
                           GiantView view){
        this.giant = giant;
        this.view = view;
    }
    public void updateView(){
        //wyswietlenie potworka
        view.displayGiant(this.giant);
    }

}
