package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

  @Test
  void WrapLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");

    String input = "first line\nsecond line";
    String expected = "<p>first line</p>\n<p>second line</p>";

    assertEquals(expected, command.execute(input));
  }

  @Test
  void NegativeWrapLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");

    String input = "first line\nsecond line";
    String expected = "first line\nsecond line";

    assertNotEquals(expected, command.execute(input));
  }

  @Test
  void WrapMultipleLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");

    String input = "first line\nsecond line\nthird line";
    String expected = "<p>first line</p>\n<p>second line</p>\n<p>third line</p>";

    assertEquals(expected, command.execute(input));
  }

  @Test
  void WrapLinesEmptyWrapOne() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapLinesTextCommand command = new WrapLinesTextCommand("", "</p>");
      command.execute("first line\nsecond line");
    });
  }

  @Test
  void WrapLinesEmptyWrapTwo() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "");
      command.execute("first line\nsecond line");
    });
  }

  @Test
  void WrapLinesEmptyText() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapLinesTextCommand command = new WrapLinesTextCommand("<p>", "</p>");
      command.execute("");
    });
  }
}