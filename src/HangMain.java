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

        while

        for(int i = 0; i < randomString.length(); i++)
        {
            while (limit < 7)
            {
                System.out.print("Guess a letter in the word >>> ");
                userEntry = input.nextLine();
                if (limit == 1)
                {
                    Graphics.GraphicsTwo();
                }
                if (limit == 2)
                {
                    Graphics.GraphicsThree();
                }
                if (limit == 3)
                {
                    Graphics.GraphicsFour();
                }
                if (limit == 4)
                {
                    Graphics.GraphicsFive();
                }
                if (limit == 5)
                {
                    Graphics.GraphicsSix();
                }
                else if (limit == 5)
                {
                    Graphics.GraphicsSeven();
                    System.out.println("Game Over, the word was " + randomString);
                }
            }

        }

    }

}
