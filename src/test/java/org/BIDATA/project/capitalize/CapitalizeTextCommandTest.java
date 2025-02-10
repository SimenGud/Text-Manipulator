package org.BIDATA.project.capitalize;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

  @Test
  void CapitalizeText() {

    TextCommand command = new CapitalizeTextCommand();

    String input = "text to be capitalized";
    String expectedOutput = "Text to be capitalized";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void negativeCapitalizeText() {

    TextCommand command = new CapitalizeTextCommand();

    String input = "text to be capitalized";
    String expectedOutput = "text to be capitalized";

    assertNotEquals(expectedOutput, command.execute(input));
  }

  @Test
  void CapitalizeTextEmptyText() {

    assertThrows(IllegalArgumentException.class, () -> {
      TextCommand command = new CapitalizeTextCommand();
      command.execute("");
    });
  }
}
