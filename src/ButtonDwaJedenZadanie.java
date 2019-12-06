import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDwaJedenZadanie extends JFrame implements ActionListener {

    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 1");

    public ButtonDwaJedenZadanie() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        buttonPanel = new JPanel();

        button1.setActionCommand("Left button 1");
        button3.setActionCommand("Right button 1");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        AllButtAction allButtAction = new AllButtAction();

        button1.addActionListener(allButtAction);
        button2.addActionListener(allButtAction);
        button3.addActionListener(allButtAction);

        LeftRightAction leftRightAction = new LeftRightAction();

        button1.addActionListener(leftRightAction);
        button3.addActionListener(leftRightAction);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        add(buttonPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println("Naciśnieto przycisk " + e.getActionCommand());
    }

    //Klasa implementująca nasłuchiwacz słuchający wszystkich guzików
    private class AllButtAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("AllButtAction: Naciśnieto jakiś przycisk");
        }
    }

    private class LeftRightAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent leftRightEven) {
            System.out.println("LeftRightAction " + leftRightEven.getActionCommand());
        }
    }

}



