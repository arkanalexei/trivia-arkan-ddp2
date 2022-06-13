import javax.swing.*;


public class SistakaNGUI {
    public static void main(String[] args) {
        // Membuat Frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Trivia Arkan");
        // show homeGUI
        new HomeGUI(frame);
        frame.setVisible(true);
        
        /**
         * README
         * 
         * Kalau misalnya program error karena:
         * Exception in thread "main" java.lang.NullPointerException:
         * Cannot invoke "java.net.URL.toExternalForm()" because "location" is null
         * 
         * Ini terjadi karena di directory belum ada images nya, sedangkan di komputer saya (locally) sudah ada
         */
    }

}
