package pl.sda.mvc;

import pl.sda.mvc.controller.GiantController;
import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.model.Nourishment;
import pl.sda.mvc.view.GiantView;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //

        GiantModel giantModel = new GiantModel(Health.HEALTH,
                Fatigue.NOTTIRED,
                Nourishment.HUNGRY);

        GiantView giantView = new GiantView();

        List<GiantModel> models = new ArrayList<>();
        models.add(giantModel);


        GiantController controller = new GiantController(models, giantView);
        controller.updateView();
        controller.setHealth(Health.DEAD, 1);
        controller.updateView();
      //  controller.setFatigue(Fatigue.TIRED);
       // controller.updateView();
    }
}
