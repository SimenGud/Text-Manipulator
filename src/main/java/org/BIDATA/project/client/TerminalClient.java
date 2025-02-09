package org.BIDATA.project.client;

import org.BIDATA.project.capitalize.CapitalizeWordsTextCommand;
import org.BIDATA.project.text.TextCommand;

import java.util.Scanner;

/**
 * A simple terminal client for the CapitalizeWordsTextCommand for proof of concept.
 *
 * @version 0.1
 * @author Simen
 */

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