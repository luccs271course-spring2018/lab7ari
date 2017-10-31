package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in
    // reverse order

    if (input.hasNext()) {
      String temp = input.nextLine();
      System.out.println(temp);
      printReverse(input);
      System.out.println(temp);
    } else {
      return;
    }
  }
}
