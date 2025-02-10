package org.BIDATA.project.replace;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {
  @Test
  void testReplace() {
    TextCommand command = new ReplaceTextCommand("target", "replacement");

    String input = "text with target and target";
    String expectedOutput = "text with replacement and replacement";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void negativeTestReplace() {
    TextCommand command = new ReplaceTextCommand("target", "replacement");

    String input = "text with target and target";
    String expectedOutput = "text with target and target";

    assertNotEquals(expectedOutput, command.execute(input));
  }
}

