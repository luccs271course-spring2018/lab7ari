package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(String[] args) {
    // Done read successive input lines until EOF, then print out in reverse order

    LinkedStack<String> stack = new LinkedStack<String>();

    final Scanner input = new Scanner(System.in);
    String line = null;
    while (input.hasNextLine()) {
      line = input.nextLine();
      stack.push(line);
    }

    String word = "";
    while (!stack.isEmpty()) {
      word += "\n" + stack.pop();
    }

    System.out.println(word);
  }
}
