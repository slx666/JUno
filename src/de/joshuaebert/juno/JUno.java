package de.joshuaebert.juno;

import de.joshuaebert.juno.cards.Card;
import de.joshuaebert.juno.server.Server;
import de.joshuaebert.juno.util.CardUtil;
import lombok.Getter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua
 * in JUno
 * at 24.12.2020
 */
public class JUno {

    public static void main(String[] args) {
        String cardLocation = "cards/modern/";

        if (args.length != 0)
            cardLocation = args[0];

        JUno jUno = new JUno(cardLocation);
    }

    @Getter
    private static JUno instance;

    @Getter
    private final Config config;

    @Getter
    private Server server;

    public JUno(String cardLocation) {
        instance = this;

        this.config = new Config(cardLocation);

        this.testCards();
        this.openServer();
        this.testServer();
    }

    public void testCards() {
        System.out.println("Testing cards...");

        Arrays.stream(Card.values()).forEach(System.out::println);

        System.out.println("Testing random");

        for (int i = 0; i < 4; i++) {
            List<Card> cardList = CardUtil.generateCardList(7);

            cardList.forEach(System.out::println);

            cardList.clear();
        }
    }

    public void testServer() {
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.1", 8869);

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bufferedWriter.write("xdddd");

            bufferedWriter.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                assert socket != null;
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    public void openServer() {
        this.server = new Server();

        this.server.createServer(8869);
    }


}
