import java.util.Scanner;

public class HangMain {

    public static void main(String[] args)
    {
        Graphics.Graphics();

        String[] words = {"Tool", "INK", "Metallica"};

        Scanner input = new Scanner(System.in);

        int random;
        char userEntry;
        random = ((int) (Math.random() * words.length));
        String randomString = words[random];


        for(int i = 0; i < randomString.length(); i++)
        {
            System.out.print("_ ");
        }
        System.out.print("Guess your ");
    }

}
