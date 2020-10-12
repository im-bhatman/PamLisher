package com.bhatman.pamlisher.bad;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/**
 * Not a great Publisher implementation, why ?
 * No Scope of subscription.
 * NO error event - the termination event.
 * No backpressure compatibility.
 */
public class BadPublisher implements Publisher<Integer> {
    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        int count = 0;

        while (count < 20) {
            subscriber.onNext(count);
            count++;
        }

        subscriber.onComplete();

    }
}
