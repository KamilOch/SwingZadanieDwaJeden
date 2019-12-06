import javax.swing.*;
import java.awt.*;

public class MainDwaJedenZadanie {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ButtonDwaJedenZadanie();

                frame.setTitle("DwaJedenZadanie");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

