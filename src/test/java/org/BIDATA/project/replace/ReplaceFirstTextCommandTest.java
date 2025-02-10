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

  @Test
  void negativeTestReplace() {
    ReplaceTextCommand command = new ReplaceFirstTextCommand("target", "replacement");

    String input = "text with target and target";
    String expectedOutput = "text with target and target";

    assertNotEquals(expectedOutput, command.execute(input));
  }

  @Test
  void testReplaceTestExceptionEmptyReplacement() {
    assertThrows(IllegalArgumentException.class, () -> {
      ReplaceTextCommand command = new ReplaceFirstTextCommand("target", "");
      String input = "text with target and target";
      command.execute(input);
    });
  }

  @Test
  void testReplaceTestExceptionEmptyTarget() {
    assertThrows(IllegalArgumentException.class, () -> {
      ReplaceTextCommand command = new ReplaceFirstTextCommand("", "replacement");
      String input = "text with target and target";
      command.execute(input);
    });
  }

  @Test
  void testReplaceTestExceptionEmptyText() {
    assertThrows(IllegalArgumentException.class, () -> {
      ReplaceTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
      String input = "";
      command.execute(input);
    });
  }
}
