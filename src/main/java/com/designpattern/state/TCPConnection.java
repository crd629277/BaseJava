package com.designpattern.state;

/**
 * Created by chenwinfred on 17/2/25.
 */
public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        state = TCPClosed.getInstance();
    }

    void changeState(TCPState state) {
        this.state = state;
        System.out.println("current state=" + state);
    }

    public void processData() {
        System.out.println("TCPConnection is processing data...");
    }

    public void activeOpen() {
        state.activeOpen(this);
    }

    public void passiveOpen() {
        state.passiveOpen(this);
    }

    public void send(){
        state.send(this);
    }

    public void close() {
        state.close(this);
    }

    public void transmint() {
        state.transmit(this);
    }

}
