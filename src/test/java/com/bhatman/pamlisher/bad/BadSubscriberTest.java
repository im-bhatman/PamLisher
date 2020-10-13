package com.bhatman.pamlisher.bad;

import org.reactivestreams.Subscriber;
import org.reactivestreams.tck.SubscriberBlackboxVerification;
import org.reactivestreams.tck.TestEnvironment;

import static org.testng.Assert.*;

public class BadSubscriberTest extends SubscriberBlackboxVerification<Integer> {

    public BadSubscriberTest() {
        super(new TestEnvironment());
    }

    @Override
    public Subscriber<Integer> createSubscriber() {
        return new BadSubscriber();
    }

    @Override
    public Integer createElement(int i) {
        return i;
    }
}