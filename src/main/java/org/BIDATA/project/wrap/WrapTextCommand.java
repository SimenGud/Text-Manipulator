package org.BIDATA.project.wrap;

import org.BIDATA.project.text.TextCommand;

public class WrapTextCommand implements TextCommand {
  protected final String start;
  protected final String end;

  public WrapTextCommand(String start, String end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public String execute(String text) {
    return start + text + end;
  }
}
