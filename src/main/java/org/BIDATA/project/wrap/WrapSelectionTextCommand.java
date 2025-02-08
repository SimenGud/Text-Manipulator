package org.BIDATA.project.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {

  protected String selection;

  public WrapSelectionTextCommand(String start, String end, String selection) {
    super(start, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replaceFirst(selection, start + selection + end);
  }
}
