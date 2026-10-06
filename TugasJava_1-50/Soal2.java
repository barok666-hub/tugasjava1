public class Soal2 {
    public static void main(String[] args) {
        String kalimat = "Hallo";
        char dicari = 'l';
        int jumlah = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == dicari) {
                jumlah++;
            }
        }

        System.out.println("Kalimat : " + kalimat);
        System.out.println("Huruf   : " + dicari);
        System.out.println("Jumlah  : " + jumlah);
    }
}