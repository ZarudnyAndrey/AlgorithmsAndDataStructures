package ru.zarudny.algorithms;

public class QueueRealization {

  private int maxSize;
  private long[] queueArray;
  private int front;
  private int rear;
  private int countElements;

  /**
  FIFO, insertLeft and removeRight
   */

  public QueueRealization(int size) {
    maxSize = size;
    queueArray = new long[maxSize];
    front = 0;
    rear = -1;
    countElements = 0;
  }

  public void insert(long value) {
    if (rear == maxSize - 1) {
      rear = -1;
    }
    queueArray[++rear] = value;
    countElements++;
  }

  public long remove() {
    long temp = queueArray[front++];
    if (front == maxSize) {
      front = 0;
    }
    countElements--;
    return temp;
  }

  public long peekFront() {
    return queueArray[front];
  }

  public long peekRear() {
    return queueArray[rear];
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
