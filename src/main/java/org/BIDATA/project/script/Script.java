package org.BIDATA.project.script;

import org.BIDATA.project.text.TextCommand;
import java.util.List;

/** This class is responsible for executing a list of commands.
 *
 * @version 0.1
 * @since 0.1
 */

public class Script implements TextCommand {
  private final List<TextCommand> commands;

  /**
   * Constructor for Script.
   *
   * @param commands the list of commands to be executed
   */

  public Script(List<TextCommand> commands) {
    this.commands = commands;
  }

  /**
   * Executes the list of commands on the input text.
   *
   * @param text the text to be modified
   * @return the modified text
   */

  @Override
  public String execute(String text) {
    for (TextCommand command : commands) {
      text = command.execute(text);
    }
    return text;
  }
}
