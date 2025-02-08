package org.BIDATA.project.replace;

import org.BIDATA.project.text.TextCommand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {
  @Test
  void testReplace() {
    TextCommand cmd = new ReplaceTextCommand("one", "two");
    assertEquals("text with two and two", cmd.execute("text with one and one"));
  }
}

