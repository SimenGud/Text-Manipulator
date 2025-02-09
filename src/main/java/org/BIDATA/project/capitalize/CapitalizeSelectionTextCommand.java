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
      return text;
    }

    String capitalizedSelection = super.execute(selection);

    String regex = "\\b" + Pattern.quote(selection) + "\\b";

    return text.replaceAll(regex, capitalizedSelection);
  }
}