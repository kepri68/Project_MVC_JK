package pl.sda.mvc.model;

public enum Nourishment {

    HUNGRY("hungry"),
    NOTHUNGRY("noyhungry");

    private String title;

    Nourishment(String title){
        this.title = title;
    }

}
