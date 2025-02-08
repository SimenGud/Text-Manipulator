package org.BIDATA.project.replace;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceFirstTextCommandTest {

  @Test
  void testReplace() {
    ReplaceTextCommand command = new ReplaceFirstTextCommand("one", "two");

    String input = "text with one and one";
    String expectedOutput = "text with two and one";

    assertEquals(expectedOutput, command.execute(input));
  }
}
