package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.BIDATA.project.text.TextCommand;

class WrapTextCommandTest {

  @Test
  void WrapTextCommand() {

    TextCommand command = new WrapTextCommand("<p>", "</p>");

    String input = "This is a test.";
    String expectedOutput = "<p>This is a test.</p>";

    assertEquals(expectedOutput, command.execute(input));

  }
}
