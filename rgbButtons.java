package buttonsAndColors;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class rgbButtons extends JFrame implements ActionListener{
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    JPanel jp4 = new JPanel();
    JButton green = new JButton();
    JButton red = new JButton();
    JButton blue = new JButton();
    JLabel label = new JLabel();

    public void GUI(){
        jp.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        jp.setLayout(new GridLayout(0,1));
        label.setText("Tryck på en knapp för att byta färg:");
        blue.setText("Blå");
        red.setText("Röd");
        green.setText("Grön");
        blue.addActionListener(this);
        green.addActionListener(this);
        red.addActionListener(this);
        jp.add(label);
        jp.add(green);
        jp.add(blue);
        jp.add(red);

        jf.add(jp, BorderLayout.CENTER);
        jf.add(jp1, BorderLayout.SOUTH);
        jf.add(jp2, BorderLayout.EAST);
        jf.add(jp3, BorderLayout.WEST);
        jf.add(jp4, BorderLayout.NORTH);

        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setTitle("RGB Color Clicker");
        jf.setLocationRelativeTo(null);
        jf.pack();
        jf.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == green && e.getSource() != red && e.getSource() != blue) {
            label.setText("Grön");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(0, 255, 0));
            jp2.setBackground(new Color(0, 255, 0));
            jp3.setBackground(new Color(0, 255, 0));
            jp4.setBackground(new Color(0, 255, 0));
        }
        if //(red.isSelected() && !(yellow.isSelected()) && !(blue.isSelected()))
        (e.getSource() == red && e.getSource() != green && e.getSource() != blue)
        {
            label.setText("Röd");
            jp1.setBackground(new Color(255, 0, 0));
            jp2.setBackground(new Color(255, 0, 0));
            jp3.setBackground(new Color(255, 0, 0));
            jp4.setBackground(new Color(255, 0, 0));
        }
        if //(blue.isSelected() && !(yellow.isSelected()) && !(red.isSelected()))
        (e.getSource() == blue && e.getSource() != red && e.getSource() != green)
        {
            label.setText("Blå");
            label.setForeground(Color.BLACK);
            jp1.setBackground(new Color(0, 0, 255));
            jp2.setBackground(new Color(0, 0, 255));
            jp3.setBackground(new Color(0, 0, 255));
            jp4.setBackground(new Color(0, 0, 255));
        }

    }


        public static void main (String[] args) {
        rgbButtons m = new rgbButtons();
        m.GUI();
        }

}
