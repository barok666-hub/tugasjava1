public class Soal33 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 50;

        System.out.println("Bilangan yang habis dibagi 7:");
        for (int i = awal; i <= akhir; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}