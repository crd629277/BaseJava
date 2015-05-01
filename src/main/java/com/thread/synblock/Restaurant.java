package com.thread.synblock;

/**
 * Created by Chen on 2015/5/1.
 */

/**
 *  The producer-consumer approach to thread cooperation
 *
 */

class Order {
    private static int i = 0;
    private int count = i++;
    public Order() {
        if (count == 10 ) {
            System.out.println("Out of food, closing!");
            System.exit(0);
        }
    }
    @Override
    public String toString() {
        return "Order{" +
                "count=" + count +
                '}';
    }
}

class WaitPerson extends Thread {
    private Restaurant restaurant;
    public WaitPerson(Restaurant r) {
        restaurant = r;
        start();
    }
    @Override
    public void run() {
        while (true) {
            while (restaurant.order == null) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println("Waitperson got " + restaurant.order);
            restaurant.order = null;
        }
    }
}


class Chef extends Thread {
    private Restaurant restaurant;
    private WaitPerson waitPerson;
    public Chef(Restaurant r, WaitPerson w) {
        restaurant = r;
        waitPerson = w;
        start();
    }

    @Override
    public void run() {
        while (true) {
            if (restaurant.order == null) {
                restaurant.order = new Order();
                System.out.println("Order up!");
                synchronized (waitPerson) {
                    waitPerson.notify();
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Restaurant {
    Order order;

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        WaitPerson waitPerson = new WaitPerson(restaurant);
        Chef chef = new Chef(restaurant, waitPerson);
    }
}
