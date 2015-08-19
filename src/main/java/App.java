import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    Hangman bob = new Hangman();


    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String word = Hangman.generateWord();
      request.session().attribute("word", word);
      model.put("word", word);
      // String dashedWord1 = bob.dashWord();
      // int fakeWordLength = dashedWord1.length();
      // int wordLength = (fakeWordLength * 2);
      // char [] dashedWordArray = dashedWord1.toCharArray();
      // for(int idx = 0; idx < wordLength; idx++){
      //   dashedWordArray[idx] = '_';
      //   idx++;
      //   dashedWordArray[idx] = ' ';
      // }
      // String dashedWord = new String(dashedWordArray);

      model.put("bob", bob);
      // model.put("dashedWord", dashedWord);

      String letter = request.queryParams("letter");
      model.put("letter", letter);

      model.put("template", "templates/hangman_form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());





    // get("/hangman_form", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   String chosenWord = generateWord();
    //   model.put("word", request.session().attribute("word");
    //   model.put("bob", bob);
    //   model.put("template", "templates/hangman_form.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // post("/hangman", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //
    //   String gameWord = request.session().attribute("word");
    //
    //   String dashedGameWord = Hangman.dashWord(gameWord);
    //
    //   String letterGuessed = request.queryParams("letter");
    // }
}//End of main


}
