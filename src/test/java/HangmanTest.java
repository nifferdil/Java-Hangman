import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  // @Test
  // public void hangman_instantiatesCorrectly_false() {
  // Hangman bob = new Hangman();
  //  String theWord = bob.generateWord();
  //   assertEquals("word not in our list", theWord);
  // }

  // @Test
  // public void hangman_instantiatesCorrectly_true() {
  // Hangman bob = new Hangman();
  //  String dashWord = bob.dashWord();
  //   assertEquals("_ _ _ _ _ _", dashWord);
  // }

  @Test
  public void hangman_instantiatesCorrectly_true() {
    assertEquals("_ _ _", Hangman.dashWord("bob"));
  }
}
