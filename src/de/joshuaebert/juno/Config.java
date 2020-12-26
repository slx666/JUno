package de.joshuaebert.juno;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */
public class Config {

    @Getter @Setter
    private String cardLocation;

    public Config(String cardLocation) {
        this.cardLocation = cardLocation;
    }
}
