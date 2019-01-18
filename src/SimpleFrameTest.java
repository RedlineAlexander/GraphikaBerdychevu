import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrameTest {

    private JButton SchotytytsaeshJButton;
    private JPanel JPanelPodzemliBerdycheva;
    private JButton BerdychevaDliaNegoButton;
    private JButton stantsiaUniversytetButton;
    private JButton lubimoeMestoBerdychevaButton;

    public SimpleFrameTest() {
        SchotytytsaeshJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "My voobzche to edem podzemlu! O Gunsel v Koshalin");

            }
        });
        BerdychevaDliaNegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Ya govoru schto my podzemlya");
            }
        });
        stantsiaUniversytetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Vyhid na Verhnu Pidzemlu! VYHID NA PRAVU PIDZEMLYA");
            }
        });
        lubimoeMestoBerdychevaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"SOLNEHARD ZA POLYARMYM KRUGOM V ROSII");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Eto Podzemlia i Doublestar");
        frame.setContentPane(new SimpleFrameTest().JPanelPodzemliBerdycheva);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}

