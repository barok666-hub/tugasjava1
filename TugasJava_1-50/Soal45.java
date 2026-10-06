public class Soal45 {
    public static void main(String[] args) {
        int[] angka = {12, 5, 18, 7, 24, 3, 15, 9, 20, 11};
        int jumlah = 0;

        for (int nilai : angka) {
            if (nilai % 2 != 0) jumlah++;
        }

        System.out.println("Jumlah bilangan ganjil: " + jumlah);
    }
}