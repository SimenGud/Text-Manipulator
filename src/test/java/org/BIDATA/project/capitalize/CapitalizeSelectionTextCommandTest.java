package org.BIDATA.project.capitalize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  @Test
  void CapitalizeSelectionText() {

    CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("selection");

    String input = "text with selection and another selection";
    String expectedOutput = "text with Selection and another Selection";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void negativeCapitalizeSelectionText() {

    CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("selection");

    String input = "text with selection and another selection";
    String expectedOutput = "text with selection and another selection";

    assertNotEquals(expectedOutput, command.execute(input));
  }

  @Test
  void CapitalizeSelectionTextNoSelection() {

    CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("selection");

    String input = "text with no selections";
    String expectedOutput = "text with no selections";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void CapitalizeSelectionTextMultipleSelections() {

    CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("selection");

    String input = "text with selection and another selection";
    String expectedOutput = "text with Selection and another Selection";

    assertEquals(expectedOutput, command.execute(input));
  }

  @Test
  void CapitalizeSelectionTextEmptySelection() {

    assertThrows(IllegalArgumentException.class, () -> {
      CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("");
      command.execute("text with selection");
    });
  }

  @Test
  void CapitalizeSelectionTextEmptyText() {

    assertThrows(IllegalArgumentException.class, () -> {
      CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("selection");
      command.execute("");
    });
  }
}
