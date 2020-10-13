package com.bhatman.pamlisher.bad;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class BadSubscriber implements Subscriber<Integer> {

    private Subscription sub;

    @Override
    public void onSubscribe(Subscription s) {
        sub = s;
        sub.request(10);
    }

    @Override
    public void onNext(Integer integer) {
        System.out.println(integer);
        sub.cancel();
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
        sub=null;
    }

    @Override
    public void onComplete() {
        System.out.println("-- Completed --");
        sub = null;
    }
}
