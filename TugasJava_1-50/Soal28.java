public class Soal28 {
    public static void main(String[] args) {
        int awal = 2000;
        int akhir = 2030;

        System.out.println("Tahun kabisat dengan angka terakhir 8:");
        for (int tahun = awal; tahun <= akhir; tahun++) {
            if (tahun % 10 == 8 &&
                (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0))) {
                System.out.print(tahun + " ");
            }
        }
    }
}