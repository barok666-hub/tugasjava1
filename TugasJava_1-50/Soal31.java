public class Soal31 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 50;

        System.out.println("Bilangan yang habis dibagi 5:");
        for (int i = awal; i <= akhir; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}