package org.BIDATA.project.client;

import org.BIDATA.project.capitalize.CapitalizeWordsTextCommand;
import org.BIDATA.project.text.TextCommand;

import java.util.Scanner;

public class TerminalClient {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String input = scanner.nextLine();

    TextCommand command = new CapitalizeWordsTextCommand();
    String result = command.execute(input);

    System.out.println("Result: " + result);
  }
}