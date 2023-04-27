import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class TwoPlayers {

    public static void main(String[] args) {
        var keyboard = new Scanner(in);
        int blueplayer, redplayer;

        out.print("What is the score of the Blue Player, then the score of the Red Player ? Write all this on the same line : ");
        blueplayer = keyboard.nextInt();
        redplayer = keyboard.nextInt();
        out.println();

        if (blueplayer > redplayer) {
            out.print("Blue Player: ");
            out.println(blueplayer);
            out.print("Red Player: ");
            out.println(redplayer);
        } else {
            out.print("Red Player: ");
            out.println(redplayer);
            out.print("Blue Player: ");
            out.println(blueplayer);
        }

        keyboard.close();
    }
}
