package org.BIDATA.project.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

  public WrapSelectionTextCommand(String start, String end) {
    super(start, end);
  }

  @Override
  public String execute(String text) {
    return start + text + end;
  }
}
