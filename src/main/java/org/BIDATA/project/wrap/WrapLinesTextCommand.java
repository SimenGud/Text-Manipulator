package org.BIDATA.project.wrap;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Wraps lines of text. The text is split by new line characters
 * and each line is wrapped using the WrapTextCommand.
 * Subclass of WrapTextCommand.
 *
 * @version 0.1
 * @author Simen
 */

public class WrapLinesTextCommand extends WrapTextCommand {

  /**
   * Constructor for WrapLinesTextCommand.
   *
   * @param start the string to be added at the start of each line
   * @param end the string to be added at the end of each line
   */

  public WrapLinesTextCommand(String start, String end) {
    super(start, end);
  }

  /**
   * Wraps each line of the input text using the WrapTextCommand class.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {

    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Need text to wrap");
    }

    return text.replaceAll("(?m)^(.*)$", "<p>$1</p>");
  }
}

