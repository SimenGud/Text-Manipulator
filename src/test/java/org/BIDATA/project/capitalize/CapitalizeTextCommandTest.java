package org.BIDATA.project.capitalize;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  @Test
  void CapitalizeTextCommand() {

    TextCommand command = new CapitalizeTextCommand();

    String input = "text to be capitalized";
    String expectedOutput = "Text to be capitalized";

    assertEquals(expectedOutput, command.execute(input));
  }
}
