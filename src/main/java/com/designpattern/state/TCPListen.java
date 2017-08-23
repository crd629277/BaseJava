package com.designpattern.state;

/**
 * Created by chenwinfred on 17/2/25.
 */
public class TCPListen extends TCPState {
    private static TCPListen instance = new TCPListen();

    private TCPListen() {};

    public static TCPListen getInstance() {
        return instance;
    }

    @Override
    public void send(TCPConnection tcpConnection) {
        System.out.println("run TCPListen send...");
        changeState(tcpConnection, TCPEstablished.getInstance());
    }


}
