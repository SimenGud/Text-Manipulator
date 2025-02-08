package org.BIDATA.project.replace;

/**
 * The ReplaceFirstTextCommand is a subclass of
 * the ReplaceTextCommand that replaces the first
 * occurrence of the target text in the input
 * text with the replacement text.
 *
 * @version 0.1
 * @author Simen
 */

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  /**
   * Constructor for ReplaceFirstTextCommand.
   *
   * @param target the string to be replaced
   * @param replacement the string to replace the target with
   */

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  /**
   * Replaces the first occurrence of the target string with the replacement string.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {
    return text.replaceFirst(target, super.replacement);
  }
}
