package com.singtel.assignment.animals.birds;

public enum RoosterLanguages {

    Tamil("Kokarakoko"),
    Danish("kykyliky"),
    Dutch("kukeleku"),
    Finnish("kukko kiekuu"),
    French("cocorico"),
    German("kikeriki"),
    Greek("kikiriki"),
    Hebrew("coo-koo-ri-koo"),
    Hungarian("kukuriku"),
    Italian("chicchirichi"),
    Japanese("ko-ke-kok-ko-o"),
    Portuguese("cucurucu"),
    Russian("kukareku"),
    Swedish("kuckeliku"),
    Turkish("kuk-kurri-kuuu"),
    Urdu("kuklooku");

    private String sound;

    RoosterLanguages(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
