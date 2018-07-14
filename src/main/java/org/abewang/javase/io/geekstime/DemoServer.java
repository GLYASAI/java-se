package org.abewang.javase.io.geekstime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 一个简单的Socket服务器
 *
 * @Author Abe
 * @Date 2018/7/14.
 */
public class DemoServer extends Thread {
    private ServerSocket serverSocket;

    public int getPort() {
        return serverSocket.getLocalPort();
    }

    @Override
    public void run() {
        try {
            //  端口0表示自动绑定一个空闲端口
            serverSocket = new ServerSocket(0);
            while (true) {
                // 监听端口, 获取对应的socket
                Socket socket = serverSocket.accept();
                RequestHandler requestHandler = new RequestHandler(socket);
                requestHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        DemoServer server = new DemoServer();
        server.start();

        try (Socket client = new Socket(InetAddress.getLocalHost(), server.getPort())) {
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            br.lines().forEach(System.out::println);
        }
    }
}

// 简化实现, 不做读取, 直接发送字符串
class RequestHandler extends Thread {
    private Socket socket;

    public RequestHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (PrintWriter out = new PrintWriter(socket.getOutputStream())) {
            out.println("Hello world!");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}