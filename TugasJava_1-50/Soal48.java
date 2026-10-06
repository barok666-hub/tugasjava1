public class Soal48 {
    public static void main(String[] args) {
        int awal = 1, akhir = 10, total = 0;
        for (int i = awal; i <= akhir; i++) if (i % 2 != 0) total += i;
        System.out.println("Total bilangan ganjil: " + total);
    }
}