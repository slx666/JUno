package de.joshuaebert.juno.server;

import de.joshuaebert.juno.player.Player;
import de.joshuaebert.juno.server.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */
public class Server {

    private final List<Client> playerList = new ArrayList<>();

    private ServerSocket serverSocket;

    public void createServer(int port) {
        Thread serverThread = new Thread(() -> {
            try {
                this.serverSocket = new ServerSocket(port);

                while (playerList.size() < 4) {
                    Socket socket = serverSocket.accept();
                    System.out.println("Accepted client.");

                    Client client = new Client(socket, new Player("Yeetor"));

                    this.playerList.add(client);
                    this.listen(client);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, "server_thread");
        serverThread.start();
    }

    public void listen(Client client) {
        Thread listenThread = new Thread(() -> {
            while (true) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getConnectionSocket().getInputStream()));

                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(client.getPlayer().getPlayerName() + " -> " + line);
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }, "client_listen_thread");
        listenThread.start();
    }
}
