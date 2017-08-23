package com.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by chenwinfred on 6/28/15.
 */
public class TestAll {

    private static String getFirstResult(String question, List<String> engines) {
        final AtomicReference<String> result = new AtomicReference<String>();
        for (String base : engines) {
            final String url = base + question;

            Thread thread = new Thread() {
                public void run() {
                    System.out.println(getName() + " is running...");
                    result.compareAndSet(null, url);
                }
            };
            thread.start();
        }
        while (result.get() == null);
        System.out.println(result.get());
        return result.get();
    }

    private static String getFirstResultExecutors(String question, List<String> engines) {
        ExecutorCompletionService service = new ExecutorCompletionService(Executors.newFixedThreadPool(2));

        for (String base : engines) {
            final String url = base + question;
            Callable callable = new Callable() {
                public String call() throws Exception {
                    System.out.println("Running callable now...");
                    return "result" + url;
                }
            };
            service.submit(callable);
        }
        try {
            String result = (String) service.take().get();
            System.out.println(result);
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        List<String> engines = new ArrayList<String>();
        engines.add("a");
        engines.add("b");
//        getFirstResult("question", engines);
        getFirstResultExecutors("question", engines);
        System.out.println("End...");
    }

}
