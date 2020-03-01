package pl.coderslab.warsztat3krkjeew04.model;

public class Excercise {
    private int id;
    private String title;
    private String descrition;

    public Excercise(int id, String title, String descrition) {
        this.id = id;
        this.title = title;
        this.descrition = descrition;
    }
    public Excercise(){}

    public Excercise(String title, String descrition) {
        this.title = title;
        this.descrition = descrition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }
}
