
    public class Mani {
    public static void main(String[] args) {
        int a = -10, b = -4;
        int avg = (a + b) / 2;
        if ((a + b) % 2 != 0 && avg < 0) {
            avg -= 1;
        }
        System.out.println(avg);
    }
}