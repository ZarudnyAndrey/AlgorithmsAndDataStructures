package ru.zarudny.algorithms;

public class PriorityQueueRealization {

  private int maxSize;
  private long[] queueArray;
  private int countElements;

  public PriorityQueueRealization(int size) {
    maxSize = size;
    queueArray = new long[maxSize];
    countElements = 0;
  }

  public void insert(long value) {
    int j;
    if (countElements == 0) {
      queueArray[countElements++] = value;
    } else {
      for (j = countElements - 1; j >= 0; j--) {
        if (value > queueArray[j]) {
          queueArray[j + 1] = queueArray[j];
        } else {
          break;
        }
      }
      queueArray[j + 1] = value;
      countElements++;
    }
  }

  public long remove() {
    return queueArray[--countElements];
  }

  public long peekMin() {
    return queueArray[countElements - 1];
  }

  public boolean isEmpty() {
    return (countElements == 0);
  }

  public boolean isFull() {
    return (countElements == maxSize);
  }

  public int size() {
    return maxSize;
  }
}
