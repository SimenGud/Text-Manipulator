package org.BIDATA.project.capitalize;

import org.BIDATA.project.text.TextCommand;

/**
 * Capitalizes the first letter of the input text.
 *
 * @version 0.1
 * @author Simen
 */

public class CapitalizeTextCommand implements TextCommand {

  /**
   * Capitalizes the first letter of the input text.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
