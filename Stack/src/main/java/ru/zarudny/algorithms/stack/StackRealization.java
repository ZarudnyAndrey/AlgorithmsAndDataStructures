package ru.zarudny.algorithms.stack;

public class StackRealization {

  private int maxSize;
  protected char[] stackArray;
  protected int top;

  /**
   LIFO, insertLeft and removeLeft
   */

  public StackRealization(int size) {
    maxSize = size;
    stackArray = new char[maxSize];
    top = -1;
  }

  public void push(char j) {
    stackArray[++top] = j;
  }

  public char pop() {
    return stackArray[top--];
  }

  public char peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize - 1);
  }
}
