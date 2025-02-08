package org.BIDATA.project.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

  /**
   * Wrap the selected text with the given start and end strings.
   *
   * @param start the start string
   * @param end the end string
   */

  public WrapSelectionTextCommand(String start, String end) {
    super(start, end);
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
