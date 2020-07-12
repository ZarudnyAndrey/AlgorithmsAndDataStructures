package ru.zarudny.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ru.zarudny.algorithms.stack.BracketChecker;
import ru.zarudny.algorithms.stack.Reverser;

public class Main {

  public static void main(String[] args) {
    loadReverser();
//    loadChecker();
  }

  public static void loadReverser() {
    String input, output;

    while (true) {
      System.out.println("Enter a string: ");
      System.out.flush();

      input = getString();
      if (input.equals("")) {
        break;
      }

      Reverser reverser = new Reverser(input);
      output = reverser.doReverse();
      System.out.println("Reversed: " + output);
    }
  }

  public static void loadChecker() {
    String input;

    while (true) {
      System.out.println("Enter string containing delimiters: ");
      System.out.flush();
      input = getString();

      if (input.equals("")) {
        break;
      }

      BracketChecker checker = new BracketChecker(input);
      checker.check();
    }
  }

  public static String getString() {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String str = null;

    try {
      str = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return str;
  }
}
