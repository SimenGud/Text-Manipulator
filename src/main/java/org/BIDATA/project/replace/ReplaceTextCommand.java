package org.BIDATA.project.replace;


import org.BIDATA.project.text.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  protected final String target;
  protected final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    return text.replaceAll(target, replacement);
  }
}

