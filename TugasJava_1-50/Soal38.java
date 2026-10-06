public class Soal38 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Animasi: kiri atas -> bawah -> atas");
        for (int ulang = 0; ulang < 2; ulang++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("\033[2J\033[H");
                System.out.println("\n".repeat(i) + "0");
                Thread.sleep(100);
            }
            for (int i = 9; i >= 0; i--) {
                System.out.print("\033[2J\033[H");
                System.out.println("\n".repeat(i) + "0");
                Thread.sleep(100);
            }
        }
    }
}