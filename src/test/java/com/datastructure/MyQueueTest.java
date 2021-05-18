package com.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAppendedToQueueShouldHaveFirstAddedNode() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assertions.assertEquals(myFirstNode, peak);
    }

    @Test
    public void given3NumbersWhenDeletedFromQueueShouldMatchFirstAddedNode() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode dequeue = myQueue.dequeue();
        myQueue.printQueue();
        Assertions.assertEquals(myFirstNode, dequeue);
    }
}
