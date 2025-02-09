package org.BIDATA.project.capitalize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

  @Test
  void CapitalizeWordsTextCommand() {

    CapitalizeTextCommand command = new CapitalizeWordsTextCommand();

    String input = "text to be capitalized";
    String expectedOutput = "Text To Be Capitalized";

    assertEquals(expectedOutput, command.execute(input));
  }
}
