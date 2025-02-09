package org.BIDATA.project.script;

import java.util.List;
import org.BIDATA.project.text.TextCommand;

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
    if (commands == null || commands.isEmpty()) {
      throw new IllegalArgumentException("Commands cannot be null or empty");
    }
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
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Need text to wrap");
    }

    for (TextCommand command : commands) {
      text = command.execute(text);
    }
    return text;
  }
}
