public class Soal50 {
    public static void main(String[] args) {
        int awal = 1, akhir = 50, jumlah = 0;

        for (int n = awal; n <= akhir; n++) {
            boolean prima = n >= 2;
            for (int i = 2; i * i <= n && prima; i++) {
                if (n % i == 0) prima = false;
            }
            if (prima) jumlah++;
        }

        System.out.println("Jumlah bilangan prima dari " + awal +
                           " sampai " + akhir + " = " + jumlah);
    }
}