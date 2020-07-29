package ru.zarudny.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IteratorApp {

  public static void main(String[] args) {
    LinkList list = new LinkList();
    LinkListIterator iterator = list.getIterator();
    long value;

    iterator.insertAfter(20);
    iterator.insertAfter(40);
    iterator.insertAfter(60);
    iterator.insertAfter(80);

    while (true) {
      System.out.print("Enter first letter of show, reset, ");
      System.out.print("next, get, before, after, delete: ");
      System.out.flush();
      int choice = getChar();

      switch (choice) {
        case 's':
          if (!list.isEmpty()) {
            list.displayList();
          } else {
            System.out.println("List is empty");
          }
          break;

        case 'r':
          iterator.reset();
          break;

        case 'n':
          if (!list.isEmpty() && !iterator.atEnd()) {
            iterator.nextLink();
          } else {
            System.out.println("Can't go to next link");
          }
          break;

        case 'g':
          if (!list.isEmpty()) {
            value = iterator.getCurrent().dData;
            System.out.println("Returned " + value);
          } else {
            System.out.println("List is empty");
          }
          break;

        case 'b':
          System.out.print("Enter value to insert: ");
          System.out.flush();
          value = getInt();
          iterator.insertBefore(value);
          break;

        case 'a':
          System.out.print("Enter value to insert: ");
          System.out.flush();
          value = getInt();
          iterator.insertAfter(value);
          break;

        case 'd':
          if (!list.isEmpty()) {
            value = iterator.deleteCurrent();
            System.out.println("Deleted " + value);
          } else {
            System.out.println("Can't delete");
          }
          break;

        default:
          System.out.println("Invalid entry");
      }
    }
  }

  public static String getString() {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = null;
    try {
      s = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return s;
  }

  public static char getChar() {
    String s = getString();
    return s.charAt(0);
  }

  public static int getInt() {
    String s = getString();
    return Integer.parseInt(s);
  }
}
