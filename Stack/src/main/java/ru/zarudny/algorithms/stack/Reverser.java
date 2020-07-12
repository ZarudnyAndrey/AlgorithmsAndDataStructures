package ru.zarudny.algorithms.stack;

public class Reverser {

  private String input;
  private String output;

  public Reverser(String input) {
    this.input = input;
  }

  public String doReverse() {
    int stackSize = input.length();
    StackRealization stack = new StackRealization(stackSize);

    for (int j = 0; j < input.length(); j++) {
      char ch = input.charAt(j);
      stack.push(ch);
    }

    output = "";

    while (!stack.isEmpty()) {
      char ch = stack.pop();
      output = output + ch;
    }

    return output;
  }
}
