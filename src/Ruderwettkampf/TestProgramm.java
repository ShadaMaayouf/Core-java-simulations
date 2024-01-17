package Ruderwettkampf;

public class TestProgramm {
    public static void main(String[] args) throws InterruptedException {
        
        test_rennen_3_doppelzweier_distanz1000();
        //test_rennen_4_Vierer_distanz15000();

    }

    private static void test_rennen_3_doppelzweier_distanz1000() {
        Rennen rennen1 = new Rennen(3, "Doppelzweier", 10000);
        try {
            rennen1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void test_rennen_4_Vierer_distanz15000() {
        Rennen rennen2 = new Rennen(4, "Vierer", 15000);
        try {
            rennen2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
