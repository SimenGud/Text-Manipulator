package org.BIDATA.project.capitalize;

/**
 * A subclass of CapitalizeTextCommand that capitalizes
 * the first letter of each word in the input text.
 *
 * @version 0.1
 * @author Simen
 */

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  /**
   * Capitalizes the first letter of each word in the input text.
   * Iterates over each character in the input text and capitalizes
   * the first letter of each word.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Need text to wrap");
    }

    StringBuilder result = new StringBuilder();
    boolean capitalizeNext = true;
    for (char c : text.toCharArray()) {
      if (Character.isWhitespace(c)) {
        result.append(c);
        capitalizeNext = true;
      } else if (capitalizeNext) {
        result.append(Character.toUpperCase(c));
        capitalizeNext = false;
      } else {
        result.append(c);
      }
    }
    return result.toString();
  }
}
