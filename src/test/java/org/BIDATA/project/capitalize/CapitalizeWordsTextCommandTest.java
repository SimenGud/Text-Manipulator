package org.BIDATA.project.capitalize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  @Test
  void CapitalizeWordsText() {

    CapitalizeTextCommand command = new CapitalizeWordsTextCommand();

    String input = "text to be capitalized";
    String expectedOutput = "Text To Be Capitalized";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void negativeCapitalizeWordsText() {

    CapitalizeTextCommand command = new CapitalizeWordsTextCommand();

    String input = "text to be capitalized";
    String expectedOutput = "text to be capitalized";

    assertNotEquals(expectedOutput, command.execute(input));
  }

  @Test
  void CapitalizeWordsTextEmptyText() {

    assertThrows(IllegalArgumentException.class, () -> {
      CapitalizeTextCommand command = new CapitalizeWordsTextCommand();
      command.execute("");
    });
  }
}
