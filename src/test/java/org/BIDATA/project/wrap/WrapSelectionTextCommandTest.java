package org.BIDATA.project.wrap;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WrapSelectionTextCommandTest {

  @Test
  void testWrapSelection() {
    TextCommand cmd = new WrapSelectionTextCommand("<p>", "</p>", "test");

    String input = "This is test text.";
    String expectedOutput = "This is <p>test</p> text.";

    assertEquals(expectedOutput, cmd.execute(input));
  }
}
