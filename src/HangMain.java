import java.util.Scanner;

public class HangMain {

    public static void main(String[] args)
    {
        Graphics.Graphics();

        String[] words = {"tool", "nirvana", "metallica"};

        Scanner input = new Scanner(System.in);

        int random;
        random = ((int) (Math.random() * words.length));
        String word = words[random];

        int limit = 0;

        String hiddenWord = "";

        for(int j = 1; j <= word.length(); j++)
        { hiddenWord += "-"; }

        while(limit < 6 && hiddenWord.contains("-")) {
            System.out.println("Guess a letter in the word >>> ");
            System.out.println(hiddenWord);
            String userEntry = input.next();

            String replace = "";

            for (int i = 0; i < word.length(); i++)
            {
                if (word.charAt(i) == userEntry.charAt(0)) {
                    replace += userEntry.charAt(0);
                }
                else if (hiddenWord.charAt(i) != '-')
                {
                    replace += word.charAt(i);
                }
                else
                    {
                    replace += "-";
                }
            }
            if(hiddenWord.equals(replace))
            {
                limit++;
            }
            else
            {
                hiddenWord = replace;
            }

            if(hiddenWord.equals(word))
            {
                System.out.print("You won. You're so cool, " +
                        "can I have you're autograph? >>> ");
                String leaderboard = input.nextLine();
            }
        }

            if (limit == 1) {
                Graphics.GraphicsTwo();
                System.out.println("WRONG!");
            }
            if (limit == 2) {
                Graphics.GraphicsThree();
                System.out.println("WRONG!");
            }
            if (limit == 3) {
                Graphics.GraphicsFour();
                System.out.println("WRONG!");
            }
            if (limit == 4) {
                Graphics.GraphicsFive();
                System.out.println("WRONG!");
            }
            if (limit == 5) {
                Graphics.GraphicsSix();
                System.out.println("WRONG!");
            }
            else if (limit == 6) {
                Graphics.GraphicsSeven();
                System.out.println("You failed." +
                        " Do not pass go... do not collect $200. " +
                        "The word was: " + word);
            }

    }

}
