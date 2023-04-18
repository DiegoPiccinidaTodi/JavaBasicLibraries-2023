import static java.lang.System.out;

public class RepeatAgain {

    public static void main(String[] args) {

        for (int count = 0; count < 40; count++) {
            if (count % 8 == 0) {
                out.print("I need to repeat ");
                out.print(count);
                out.println(" time(s).");
            }
        }
        out.println("Yes, they ask me to repeat this sentence 40 times!");
        out.println("But I won't be able to talk anymore for at least few minutes!");
    }
}

