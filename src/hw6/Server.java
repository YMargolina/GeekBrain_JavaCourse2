package hw6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket server;
    private static Socket socket;
    private static final int PORT = 7174;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");

            socket = server.accept();
            System.out.println("Client connected");

            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner serverscanner = new Scanner(System.in);

            Thread readThread = new Thread(() -> {
                while (true) {
                    try {
                        String str = serverscanner.nextLine();
                        out.println("Server:" + "" + str);
                    }
                    catch (RuntimeException e) {
                        System.out.println(e);
                    }

                }
            });
            readThread.setDaemon(true);
            readThread.start();

            while (true) {
                String str = scanner.nextLine();
                if (str.equals("/end")) {
                    System.out.println("Session is over");
                    break;
                }

                System.out.println("Client: " + str);
              //  out.println("ECHO: "+ str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
