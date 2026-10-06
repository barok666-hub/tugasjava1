public class Soal34 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Animasi: atas kiri -> kanan -> kiri");
        for (int ulang = 0; ulang < 2; ulang++) {
            for (int i = 0; i < 30; i++) {
                System.out.print("\r" + " ".repeat(i) + "0");
                Thread.sleep(50);
            }
            for (int i = 29; i >= 0; i--) {
                System.out.print("\r" + " ".repeat(i) + "0");
                Thread.sleep(50);
            }
        }
        System.out.println();
    }
}