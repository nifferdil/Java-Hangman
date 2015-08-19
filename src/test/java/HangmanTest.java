import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void hangman_instantiatesCorrectly_false() {
  Hangman bob = new Hangman("some word whatever");
   String theWord = bob.generateWord();
    assertEquals("word not in our list", theWord);
  }

}
