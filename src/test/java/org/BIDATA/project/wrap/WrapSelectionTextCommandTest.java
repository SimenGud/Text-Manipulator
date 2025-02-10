package org.BIDATA.project.wrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  @Test
  void WrapSelection() {
    WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "selection");

    String input = "text with selection";
    String expectedOutput = "text with <p>selection</p>";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void negativeWrapSelection() {
    WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "selection");

    String input = "text with selection";
    String expectedOutput = "text with selection";

    assertNotEquals(expectedOutput, command.execute(input));
  }

  @Test
  void WrapMultipleSelections() {
    WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "selection");

    String input = "text with selection and another selection";
    String expectedOutput = "text with <p>selection</p> and another <p>selection</p>";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void WrapSelectionEmptyWrapStart() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapTextCommand command = new WrapSelectionTextCommand("", "</p>", "selection");
      command.execute("text with selection");
    });
  }

  @Test
  void WrapSelectionEmptyWrapEnd() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapTextCommand command = new WrapSelectionTextCommand("<p>", "", "selection");
      command.execute("text with selection");
    });
  }

  @Test
  void WrapSelectionEmptySelection() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "");
      command.execute("text with selection");
    });
  }

  @Test
  void WrapSelectionEmptyText() {
    assertThrows(IllegalArgumentException.class, () -> {
      WrapTextCommand command = new WrapSelectionTextCommand("<p>", "</p>", "selection");
      command.execute("");
    });
  }
}
