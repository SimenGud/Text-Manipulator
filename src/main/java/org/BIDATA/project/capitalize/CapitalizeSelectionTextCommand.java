package org.BIDATA.project.capitalize;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

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

