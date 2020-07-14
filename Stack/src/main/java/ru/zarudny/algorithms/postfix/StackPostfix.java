package ru.zarudny.algorithms.postfix;

public class StackPostfix {

  private int maxSize;
  protected int[] stackArray;
  protected int top;

  public StackPostfix(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int j) {
    stackArray[++top] = j;
  }

  public int pop() {
    return stackArray[top--];
  }

  public int peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize - 1);
  }

  public int size() {
    return top + 1;
  }

  public int peekN(int n) {
    return stackArray[n];
  }

  public void displayStack(String s) {
    System.out.println(s);
    System.out.println("Stack (bottom -> top): ");

    for (int j = 0; j < size(); j++) {
      System.out.println(peekN(j));
      System.out.println(" ");
    }
    System.out.println(" ");
  }
}
