public class Soal42 {
    public static void main(String[] args) {
        int[] angka = {12, 5, 18, 7, 24, 3, 15, 9, 20, 11};
        int terbesar = angka[0];

        for (int nilai : angka) {
            if (nilai > terbesar) terbesar = nilai;
        }

        System.out.println("Bilangan terbesar: " + terbesar);
    }
}