package ru.zarudny.algorithms.infix;

import ru.zarudny.algorithms.stack.StackRealization;

public class StackInfix extends StackRealization {

  public StackInfix(int size) {
    super(size);
  }

  public int size() {
    return super.top + 1;
  }

  public int peekN(int n) {
    return stackArray[n];
  }

  public void displayStack(String s) {
    System.out.println(s);
    System.out.println("Stack (bottom -> top): ");

    for (int j = 0; j < size(); j++) {
      System.out.println(peekN(j));
      System.out.println();
    }
    System.out.println();
  }
}
