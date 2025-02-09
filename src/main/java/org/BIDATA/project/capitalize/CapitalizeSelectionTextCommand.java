package org.BIDATA.project.capitalize;

import java.util.regex.Pattern;

/**
 * CapitalizeSelectionTextCommand class. This class is
 * responsible for capitalizing the selected text chosen.
 *
 * @version 0.1
 * @author Simen
 */

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

  /**
   * The {code: Selection} of text to be capitalized.
   */

  String selection;

  /**
   * Constructor for CapitalizeSelectionTextCommand.
   *
   * @param selection the text to be capitalized
   */

  public CapitalizeSelectionTextCommand(String selection) {
    if (selection == null || selection.isEmpty()) {
      throw new IllegalArgumentException("Selection cannot be null or empty");
    }
    this.selection = selection;
  }

  /**
   * Capitalizes the selected text in the input text.
   *
   * @param text the text to be modified
   * @return
   */

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Need text to wrap");
    }

    return text.replaceAll("\\b" + Pattern.quote(selection) + "\\b", super.execute(selection));
  }
}