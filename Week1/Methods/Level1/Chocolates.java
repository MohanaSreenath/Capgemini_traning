public class Chocolates {

    public static void main(String[] args) {
        int chocolates = 20;
        int children = 6;

        distributeChocolates(chocolates, children);
    }

    public static void distributeChocolates(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets: " + eachChildGets);
        System.out.println("Remaining chocolates: " + remaining);
    }
}