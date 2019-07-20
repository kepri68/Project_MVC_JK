package pl.sda.mvc.model;

public enum Health {

    //dwa stany(potworek moze byc albo zywy albo martwy):
    HEALTH("healthy"), DEAD("dead");
    private String title;
    Health(String title){
        this.title = title;
    }

}
