import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class Hangman {
  private static String mWord;
  private static String mDashWord;
  private String mLetter;
  //private Array<int>[] mLettersGuessed =
  public static Random rand = new Random();


  public Hangman() {
    mWord = generateWord();
  }

  public String getChosenWord(){
    return mWord;
  }


  public static String generateWord(){
      String[] hangmanWords = {"murderer", "wheels of steel",
     "how to win at hangman", "other elf", "free pass", "nice variety"};
      int idx = randInt(0, 5);
      String chosenWord = hangmanWords[idx];
      return chosenWord;
  }

  public static int randInt(int min, int max) {
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
  }

//     String guessWord.contains("")
//     return guessWord;
//
//     .replace _ _ _ _ _ _
//
//   }
//
// //computer takes word and replaces with underscores
//
// public wordDashes(String dashedWord, char guess) {
// // how many letters are in dashedWord
// // fill in dashedWord with letters that match mWord
// }
//
  public static String dashWord() {
   char [] wordChar = mWord.toCharArray();

   for (int i = 0; i < mWord.length(); i++) {
      wordChar[i] = '_';
    }
    String dashedWord = new String(wordChar);
    return dashedWord;
  }

public static String changeDashWordAfterGuess(){

  return "";
}



//
//   public Guess() {
//     mGuess = guess;
//   }
//
//   public displayWord() {
//


}
