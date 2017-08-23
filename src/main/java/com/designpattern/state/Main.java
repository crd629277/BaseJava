package com.designpattern.state;

/**
 * Created by chenwinfred on 17/2/25.
 */
public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.passiveOpen();
        tcpConnection.send();
        tcpConnection.activeOpen();
        tcpConnection.transmint();
        tcpConnection.close();

    }
}
