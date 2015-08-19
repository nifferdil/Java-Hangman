import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static Random rand = new Random();

  public static void main(String[] args) {
    // staticFileLocation("/public");
    // String layout = "templates/layout.vtl";
    // Hangman bob = new Hangman();
    //
    //
    // get("/", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   String chosenWord = generateWord();
    //   model.put("bob", bob);
    //   model.put("template", "templates/index.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // post("/hangman", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   String letterGuessed = request.queryParams("letter");
    // }


}//End of main


}
