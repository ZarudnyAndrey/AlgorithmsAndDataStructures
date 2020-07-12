package ru.zarudny.algorithms;

public class DequeRealization {

  private int maxSize;
  private long[] dequeArray;
  private int front;
  private int rear;
  private int countElements;

  /**
   FIFO and LIFO (variably), insertLeft, insertRight, removeLeft and removeRight
   */

  public DequeRealization(int size) {
    maxSize = size;
    dequeArray = new long[maxSize];
    front = 0;
    rear = -1;
    countElements = 0;
  }

  public void insertLeft(long value) {
    if (rear == maxSize - 1) {
      rear = -1;
    }
    dequeArray[++rear] = value;
    countElements++;
  }

  public void insertRight(long value) {
    if (front == 0) {
      front = maxSize;
    }
    dequeArray[--front] = value;
    countElements++;
  }

  public long removeLeft() {
    long temp = dequeArray[rear--];
    if (rear == 0) {
      rear = maxSize;
    }
    countElements--;
    return temp;
  }

  public long removeRight() {
    long temp = dequeArray[front++];
    if (front == maxSize) {
      front = 0;
    }
    countElements--;
    return temp;
  }

  public long peekFront() {
    return dequeArray[front];
  }

  public long peekRear() {
    return dequeArray[rear];
  }

  public boolean isEmpty() {
    return (countElements == 0);
  }

  public boolean isFull() {
    return (countElements == maxSize);
  }

  public int size() {
    return countElements;
  }
}
