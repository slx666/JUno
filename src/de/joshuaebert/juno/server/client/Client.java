package de.joshuaebert.juno.server.client;

import de.joshuaebert.juno.player.Player;
import lombok.Getter;

import java.net.Socket;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */
public class Client {

    @Getter
    private final Player player;

    @Getter
    private final Socket connectionSocket;

    public Client(Socket connectionSocket, Player player) {
        this.connectionSocket = connectionSocket;
        this.player = player;
    }
}
