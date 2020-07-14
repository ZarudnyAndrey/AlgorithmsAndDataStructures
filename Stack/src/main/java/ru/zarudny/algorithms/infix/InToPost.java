package ru.zarudny.algorithms.infix;

public class InToPost {

  private StackInfix stack;
  private String input;
  private String output;

  public InToPost(String in) {
    input = in;
    int stackSize = input.length();
    stack = new StackInfix(stackSize);
  }

  public String doTrans() {
    for (int j = 0; j < input.length(); j++) {
      char ch = input.charAt(j);
      stack.displayStack("For " + ch + " ");
      switch (ch) {
        case '+':
        case '-':
          gotOper(ch, 1);
          break;
        case '*':
        case '/':
          gotOper(ch, 2);
        case '(':
          stack.push(ch);
          break;
        case ')':
          gotParen(ch);
          break;
        default:
          output = output + ch;
          break;
      }
    }
    while (!stack.isEmpty()) {
      stack.displayStack("While ");
      output = output + stack.pop();
    }
    stack.displayStack("End ");
    return output;
  }

  public void gotOper(char opThis, int prec1) {
    while (!stack.isEmpty()) {
      char opTop = stack.pop();

      if (opTop == '(') {
        stack.push(opTop);
        break;
      } else {
        int prec2;

        if (opTop == '+' || opTop == '-') {
          prec2 = 1;
        } else {
          prec2 = 2;
        }

        if (prec2 < prec1) {
          stack.push(opTop);
          break;
        } else {
          output = output + opTop;
        }

      }
      stack.push(opThis);
    }
  }

  public void gotParen(char ch) {
    while (!stack.isEmpty()) {
      char chx = stack.pop();
      if (chx == '(') {
        break;
      } else {
        output = output + chx;
      }
    }
  }
}
