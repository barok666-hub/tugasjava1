public class Soal47 {
    public static void main(String[] args) {
        int awal = 1, akhir = 10, total = 0;
        for (int i = awal; i <= akhir; i++) if (i % 2 == 0) total += i;
        System.out.println("Total bilangan genap: " + total);
    }
}