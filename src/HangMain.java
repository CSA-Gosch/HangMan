import java.util.Scanner;

public class HangMain {

    public static void main(String[] args)
    {
        Graphics.Graphics();

        String[] words = {"Tool", "INK", "Metallica"};

        Scanner input = new Scanner(System.in);

        int random;
        int limit = 0;
        String userEntry;
        random = ((int) (Math.random() * words.length));
        String randomString = words[random];
        String[] sepWord = new String[randomString.length()];


        for(int i = 0; i < randomString.length(); i++)
        {
            sepWord[i] = Character.toString(randomString.charAt(i));
            System.out.print("_ ");

            while (limit < 7)
            {
                System.out.print("Guess a letter in the word >>> ");
                userEntry = input.nextLine();
            }

        }

    }

}
