package com.designpattern.state;

/**
 * Created by chenwinfred on 17/2/25.
 */
public class TCPClosed extends TCPState {
    private static TCPClosed instance = new TCPClosed();

    private TCPClosed() {};

    public static TCPClosed getInstance() {
        return instance;
    }

    @Override
    public void activeOpen(TCPConnection tcpConnection) {
        System.out.println("run TCPClosed activeOpen...");
        changeState(tcpConnection, TCPEstablished.getInstance());
    }


    @Override
    public void passiveOpen(TCPConnection tcpConnection) {
        System.out.println("run TCPClosed passiveOpen...");
        changeState(tcpConnection, TCPListen.getInstance());
    }

}
