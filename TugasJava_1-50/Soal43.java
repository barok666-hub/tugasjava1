public class Soal43 {
    public static void main(String[] args) {
        int[] angka = {12, 5, 18, 7, 24, 3, 15, 9, 20, 11};
        int terkecil = angka[0];

        for (int nilai : angka) {
            if (nilai < terkecil) terkecil = nilai;
        }

        System.out.println("Bilangan terkecil: " + terkecil);
    }
}