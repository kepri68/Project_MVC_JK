package pl.sda.mvc;

import pl.sda.mvc.controller.GiantController;
import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.model.Nourishment;
import pl.sda.mvc.view.GiantView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        GiantModel giantModel = new GiantModel(Health.HEALTH,
                Fatigue.NOTTIRED,
                Nourishment.HUNGRY);

        GiantView giantView = new GiantView();

        GiantController controller = new GiantController(giantModel, giantView);
    }
}
