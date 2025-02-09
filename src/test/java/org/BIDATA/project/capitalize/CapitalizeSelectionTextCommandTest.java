package org.BIDATA.project.capitalize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  @Test
  void CapitalizeSelectionTextCommand() {

    CapitalizeTextCommand command = new CapitalizeSelectionTextCommand("selection");

    String input = "text with selection and another selection";
    String expectedOutput = "text with Selection and another Selection";

    assertEquals(expectedOutput, command.execute(input));
  }


}
