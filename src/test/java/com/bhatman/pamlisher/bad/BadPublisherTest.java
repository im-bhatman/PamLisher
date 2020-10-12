package com.bhatman.pamlisher.bad;

import org.reactivestreams.Publisher;
import org.reactivestreams.tck.PublisherVerification;
import org.reactivestreams.tck.TestEnvironment;

public class BadPublisherTest extends PublisherVerification<Integer> {
    public BadPublisherTest() {
        super(new TestEnvironment());
    }

    @Override
    public Publisher<Integer> createPublisher(long l) {
        return new BadPublisher();
    }

    @Override
    public Publisher<Integer> createFailedPublisher() {
        return null;
    }
}