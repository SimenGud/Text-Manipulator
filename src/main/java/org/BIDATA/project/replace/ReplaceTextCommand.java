package org.BIDATA.project.replace;

import org.BIDATA.project.text.TextCommand;

/**
 * ReplaceTextCommand is a class that replaces all
 * occurrences of a target string with a replacement string.
 *
 * @version 0.1
 * @author Simen
 */

public class ReplaceTextCommand implements TextCommand {
  protected final String target;
  protected final String replacement;

  /**
   * Constructor for ReplaceTextCommand.
   *
   * @param target the string to be replaced
   * @param replacement the string to replace the target with
   */

  public ReplaceTextCommand(String target, String replacement) {
    if (target == null || target.isEmpty() || replacement == null || replacement.isEmpty()) {
      throw new IllegalArgumentException("Target or replacement cannot be null");
    }
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * Replaces all occurrences of the target string with the replacement string.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {

    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Need text to replace");
    }

    if (target.equals(replacement)) {
      throw new IllegalArgumentException("Cant replace with the same string");
    }

    return text.replaceAll(target, replacement);
  }
}

