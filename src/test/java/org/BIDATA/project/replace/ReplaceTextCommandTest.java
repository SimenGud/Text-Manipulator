package org.BIDATA.project.replace;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {
  @Test
  void testReplace() {
    TextCommand command = new ReplaceTextCommand("one", "two");

    String input = "text with one and one";
    String expectedOutput = "text with two and two";

    assertEquals(expectedOutput, command.execute(input));
  }
}

