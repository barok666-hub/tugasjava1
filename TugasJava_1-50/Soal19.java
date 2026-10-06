public class Soal19 {
    public static void main(String[] args) {
        int nilai = 3;

        for (int i = 0; i < 5; i++) {
            System.out.print(nilai + " ");
            if (i % 2 == 0) {
                nilai *= 3;
            } else {
                nilai -= 5;
            }
        }
    }
}