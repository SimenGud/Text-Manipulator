package org.BIDATA.project.wrap;

/**
 * A subclass of WrapTextCommand that wraps a selection of text.
 *
 * @version 0.2
 * @author Simen
 */

public class WrapSelectionTextCommand extends WrapTextCommand {

  /**
   * The selection to wrap.
   */

  protected String selection;

  /**
   * Constructor for WrapSelectionTextCommand.
   *
   * @param start the string to be added at the start of the selection
   * @param end the string to be added at the end of the selection
   * @param selection the selection to wrap
   */

  public WrapSelectionTextCommand(String start, String end, String selection) {
    super(start, end);

    if (selection == null || selection.isEmpty()) {
      throw new IllegalArgumentException("Selection cannot be null");
    }

    this.selection = selection;
  }

  /**
   * Wraps the selection of the input text using the start and end strings.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {

    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Need text to wrap");
    }

    return text.replaceAll(selection, start + selection + end);
  }
}
