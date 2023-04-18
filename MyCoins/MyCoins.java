public class MyCoins {

    public static void main(String[] args) {
        int coins;
        int adults;
        int coinsperadults;

        coins = 30;
        adults = 4;
        coinsperadults = coins / adults;

        System.out.print("Each adult gets ");
        System.out.print(coinsperadults);
        System.out.println(" coins.");
    }
}
