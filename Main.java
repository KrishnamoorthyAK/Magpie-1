import java.util.Scanner;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * - Uses indexOf to find strings
 * - Handles responding to simple words and phrases
 * This version uses a nested if to handle default responses.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (Akshay)
 * @version (11/30/22)
 */
class Magpie2 {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)                  // modified
    {
        String response = "";
       statement = statement.trim();


        if (statement.length()==0){
            response = "Say something, please.";
        }

        else if (statement.indexOf("no") >= 0)
        {

            response = "Why so negative?";
        }
        else if (statement.indexOf( "mother") >= 0 || statement.indexOf( "father") >= 0 || statement.indexOf( "sister") >= 0 || statement.indexOf( "brother") >= 0)
        {
            response = "Tell me more about your family.";
        } else if (statement.indexOf( "cat") >= 0 || statement.indexOf( "dog") >= 0) {
            response = "Tell me more about your pets.";
        } else if (statement.indexOf( "Finkelstein") >= 0) {
            response = "He sounds like a good teacher.";
        } else if (statement.indexOf( "tennis") >= 0) {                 // modified - added a keyword
            response = "Tell me more about the sport";

        } else if (statement.indexOf( "hawaii") >= 0) {                  // modified - added a keyword
            response = " tell me more about the vacation spot";

        } else if (statement.indexOf("movies") >= 0) {                   // modified - added a keyword
            response = "What are the popular movies and shows!";

        } else {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {                     // modified - added a new random response
            response = "That's really nice!";
        } else if (whichResponse == 5) {                  // modified - added a new randOm response
            response = "okay, great!";
        }

        return response;
    }
}