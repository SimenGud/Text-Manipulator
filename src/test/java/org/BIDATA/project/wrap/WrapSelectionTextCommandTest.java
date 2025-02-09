package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  @Test
  void testWrapSelection() {
    WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "selection");

    String input = "text with selection";
    String expectedOutput = "text with <p>selection</p>";

    assertEquals(expectedOutput, command.execute(input));
  }
}
