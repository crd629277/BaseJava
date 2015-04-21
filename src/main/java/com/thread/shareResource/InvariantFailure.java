package com.thread.shareResource;

/**
 * Created by Chen on 2015/4/18.
 */
public class InvariantFailure implements InvariantState {
    public Object value;

    public InvariantFailure(Object value) {
        this.value = value;
    }
}
