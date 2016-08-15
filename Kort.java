package com.example.android.myapplication;

/**
 * Created by Skulstad on 08.08.2016.
 */
public class Kort {

    private Kort kort;
    private int kortnr;
    private String type;

    /**
     * Constructor for objects of class Kort
     */
    public Kort()
    {
        this.kort = kort;
        this.kortnr = kortnr;
        this.type = type;
    }

    public Kort getKort()
    {
        return kort;
    }

    public int getKortnr()
    {
        return kortnr;
    }

    public void typer(int kortnr)
    {
        this.kortnr = kortnr;
        if (0 < kortnr && kortnr < 13) {
            type = "Hjerter";
        } else if (13 < kortnr && kortnr < 26) {
            type = "Spar";
        } else if (26 < kortnr && kortnr < 39) {
            type = "Ruter";
        } else if (39 < kortnr && kortnr < 52) {
            type = "Kløver";
        } else {
            System.out.println("Kortet er ikke mellom 1 og 52.");
        }
    }

}
