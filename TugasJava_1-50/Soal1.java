public class Soal1 {
    public static void main(String[] args) {
        String kalimat = "Hallo";
        String hasil = "";

        for (int i = kalimat.length() - 1; i >= 0; i--) {
            hasil += kalimat.charAt(i);
        }

        System.out.println("Kalimat awal    : " + kalimat);
        System.out.println("Kalimat terbalik: " + hasil);
    }
}