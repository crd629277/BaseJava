package com.designpattern.state;

/**
 * Created by chenwinfred on 17/2/25.
 */
public abstract  class TCPState {

    public void activeOpen(TCPConnection tcpConnection) {};
    public void passiveOpen(TCPConnection tcpConnection){};
    public void send(TCPConnection tcpConnection){};
    public void close(TCPConnection tcpConnection){};
    public void transmit(TCPConnection tcpConnection) {};

    protected void changeState(TCPConnection connection, TCPState state) {
        connection.changeState(state);
    }
}
