public class Soal22 {
    public static void main(String[] args) {
        int n = 3;
        long hasil = 1;

        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            hasil *= i;
            if (i > 1) System.out.print(" x ");
        }

        System.out.println(" = " + hasil);
    }
}