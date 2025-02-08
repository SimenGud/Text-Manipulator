package org.BIDATA.project.wrap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String start, String end) {
    super(start, end);
  }

  @Override
  public String execute(String text) {
    String[] lines = text.split("\n");
    return Arrays.stream(lines)
        .map(super::execute)
        .collect(Collectors.joining("\n"));
  }
}

