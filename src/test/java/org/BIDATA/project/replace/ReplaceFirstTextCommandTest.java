package org.BIDATA.project.replace;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceFirstTextCommandTest {

  @Test
  void testReplace() {
    TextCommand cmd = new ReplaceFirstTextCommand("one", "two");
    assertEquals("text with two and one", cmd.execute("text with one and one"));
  }
}
