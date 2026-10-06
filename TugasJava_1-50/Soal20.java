public class Soal20 {
    public static void main(String[] args) {
        int nilai = 1;
        int tambah = 1;

        for (int i = 0; i < 13; i++) {
            System.out.print(nilai + " ");
            nilai += tambah;
            tambah++;
        }
    }
}