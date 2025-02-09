package org.BIDATA.project.wrap;

import org.BIDATA.project.text.TextCommand;

/**
 * Wraps text with a start and end string.
 *
 * @version 0.1
 * @author Simen
 */

public class WrapTextCommand implements TextCommand {
  protected final String start;
  protected final String end;

  /**
   * Constructor for WrapTextCommand.
   *
   * @param start the string to be added at the start of the text
   * @param end the string to be added at the end of the text
   */

  public WrapTextCommand(String start, String end) {

    if (start == null || start.isEmpty() || end == null || end.isEmpty()) {
      throw new IllegalArgumentException("Start or end cannot be null");
    }

    this.start = start;
    this.end = end;
  }

  /**
   * Wraps the input text using the start and end strings.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {
    return start + text + end;
  }
}
