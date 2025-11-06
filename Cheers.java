//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        // Replace this comment with your code
                String word = args[0];
                int times = Integer.parseInt(args[1]);
                String letters = "AEFHILMNORSX";
                String shout = "";
                String letter = "";
                for(int i = 0; i < word.length(); i++){
                        letter = (word.charAt(i) + "").toUpperCase();
                        shout = String.format("Give me a%s %s: %s!", (letters.contains(letter) ? "n" : " "), letter, letter);
                        System.out.println(shout);
                }
                System.out.println("What does that spell?");
                for(int i = 0; i < times; i++){
                        System.out.println(word.toUpperCase() + "!!!");
                }

        }
}
