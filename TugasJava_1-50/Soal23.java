public class Soal23 {
    public static void main(String[] args) {
        int maksimum = 50;
        int a = 0;
        int b = 1;

        while (a <= maksimum) {
            System.out.print(a + " ");
            int berikutnya = a + b;
            a = b;
            b = berikutnya;
        }
    }
}