package com.designpattern.state;

/**
 * Created by chenwinfred on 17/2/25.
 */
public class TCPEstablished extends TCPState {
    private static TCPEstablished instance = new TCPEstablished();

    private TCPEstablished() {};

    public static TCPState getInstance() {
        return instance;
    }

    @Override
    public void transmit(TCPConnection tcpConnection) {
        System.out.println("run TCPEstablished transmit...");
        tcpConnection.processData();
    }

    public void close(TCPConnection tcpConnection) {
        System.out.println("run TCPEstablished close...");
        changeState(tcpConnection, TCPClosed.getInstance());
    }
}
