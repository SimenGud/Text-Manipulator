package org.BIDATA.project.capitalize;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * CapitalizeSelectionTextCommand class. This class is
 * responsible for capitalizing the selected text.
 *
 * @version 0.1
 * @author Simen
 */

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

  /**
   * Capitalizes the first letter of each word in the input text.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }
    String[] lines = text.split("\n");
    return Arrays.stream(lines)
        .map(super::execute)
        .collect(Collectors.joining("\n"));
  }
}

