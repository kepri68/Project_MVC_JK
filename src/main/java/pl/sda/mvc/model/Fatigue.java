package pl.sda.mvc.model;

public enum Fatigue {//zmeczenie

    TIRED("tired"),
    NOTTIRED("nottired"),
    SLEPPING("slepping");

    private String title;
    Fatigue(String title){
        this.title = title;
    }
}
