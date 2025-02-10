package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.BIDATA.project.text.TextCommand;

class WrapTextCommandTest {

  @Test
  void WrapText() {

    TextCommand command = new WrapTextCommand("<p>", "</p>");

    String input = "This is a test.";
    String expectedOutput = "<p>This is a test.</p>";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void negativeWrapText() {

    TextCommand command = new WrapTextCommand("<p>", "</p>");

    String input = "This is a test.";
    String expectedOutput = "This is a test.";

    assertNotEquals(expectedOutput, command.execute(input));
  }

  @Test
  void WrapTextEmptyWrapStart() {

    assertThrows(IllegalArgumentException.class, () -> {
      TextCommand command = new WrapTextCommand("", "</p>");
      command.execute("This is a test.");
    });
  }

  @Test
  void WrapTextEmptyWrapEnd() {

    assertThrows(IllegalArgumentException.class, () -> {
      TextCommand command = new WrapTextCommand("<p>", "");
      command.execute("This is a test.");
    });
  }

  @Test
  void WrapTextEmptyText() {

    assertThrows(IllegalArgumentException.class, () -> {
      TextCommand command = new WrapTextCommand("<p>", "</p>");
      command.execute("");
    });
  }
}
