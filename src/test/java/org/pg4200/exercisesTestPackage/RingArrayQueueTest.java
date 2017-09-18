package org.pg4200.exercisesTestPackage;

import org.pg4200.datastructure.queue.MyQueue;
import org.pg4200.datastructure.queue.MyQueueTestTemplate;
import org.pg4200.exercisePackage.RingArrayQueue;

public class RingArrayQueueTest extends MyQueueTestTemplate{

    @Override
    protected <T> MyQueue<T> getNewInstance(Class<T> klass) {
        return new RingArrayQueue();
    }
}
