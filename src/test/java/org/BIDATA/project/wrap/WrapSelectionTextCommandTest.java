package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  @Test
  void testWrapSelection() {
    WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "test");

    String input = "This is test text.";
    String expectedOutput = "This is <p>test</p> text.";

    assertEquals(expectedOutput, command.execute(input));
  }
}
