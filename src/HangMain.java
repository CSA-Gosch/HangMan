import java.util.Scanner;

public class HangMain {
    private static int limit = 0;

    public static void main(String[] args)
    {
        Graphics.Graphics();

        String[] words = {"tool", "nirvana", "metallica"};
        Scanner input = new Scanner(System.in);

        String delimiter = "|";

        //Randomization + setter + increment variable
        int random;
        int bruh = 0;
        random = ((int) (Math.random() * words.length));
        GetWord word = new GetWord();
        word.setWord(words[random]);
        char[] alreadyGuessed = new char[7];


        //Initializing the hidden version of our random word
        String hiddenWord = "";
        for(int j = 1; j <= word.getWord().length(); j++)
        { hiddenWord += "-"; }

        //User interacting with the program
        while(limit < 6 && hiddenWord.contains("-")) {
            System.out.println("Already guessed: " + alreadyGuessed);
            System.out.println("Guess a letter in the word >>> ");
            System.out.println(hiddenWord);
            char userEntry = input.next().charAt(0);
            alreadyGuessed[bruh++] = userEntry;

            String replace = "";

            for (int i = 0; i < word.getWord().length(); i++)
            {
                if (word.getWord().charAt(i) == userEntry)
                {
                    replace += userEntry;
                }
                else if (hiddenWord.charAt(i) != '-')
                {
                    replace += word.getWord().charAt(i);
                }
                else
                {
                    replace += "-";
                }
            }
            if(hiddenWord.equals(replace))
            {
                limit++;
                if (limit == 1) {
                    Graphics.GraphicsTwo();
                    System.out.println("WRONG!");
                }
                else if (limit == 2) {
                    Graphics.GraphicsThree();
                    System.out.println("WRONG!");
                }
                else if (limit == 3) {
                    Graphics.GraphicsFour();
                    System.out.println("WRONG!");
                }
                else if (limit == 4) {
                    Graphics.GraphicsFive();
                    System.out.println("WRONG!");
                }
                else if (limit == 5) {
                    Graphics.GraphicsSix();
                    System.out.println("WRONG!");
                }
                else if (limit == 6) {
                    Graphics.GraphicsSeven();
                    System.out.println("You failed." +
                            " Do not pass go... do not collect $200. " +
                            "The word was: " + word.getWord());
                }
            }
            else
            {
                hiddenWord = replace;
            }
            if(hiddenWord.equals(word.getWord()))
            {
                System.out.println("You won. You're so cool, The word was " + word.getWord());

            }
        }
        String leaderboard = "";
        System.out.print("Can I have your autograph? >>> ");
        leaderboard = input.nextLine();
        TextWriter.writeString(leaderboard);
        TextWriter.saveAndClose();
    }
}
