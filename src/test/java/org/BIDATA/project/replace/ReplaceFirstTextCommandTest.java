package org.BIDATA.project.replace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

  @Test
  void testReplace() {
    ReplaceTextCommand command = new ReplaceFirstTextCommand("target", "replacement");

    String input = "text with target and target";
    String expectedOutput = "text with replacement and target";

    assertEquals(expectedOutput, command.execute(input));
  }
}
