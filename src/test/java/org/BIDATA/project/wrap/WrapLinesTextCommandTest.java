package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  @Test
  void testWrapMultipleLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");

    String input = "first line\nsecond line";
    String expected = "<p>first line</p>\n<p>second line</p>";

    assertEquals(expected, command.execute(input));
  }
}