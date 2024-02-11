import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class swingSumDiff extends JFrame implements ActionListener {
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JButton b = new JButton("Find sum and Diff");

    public swingSumDiff() {
        setTitle("Sum and diff calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Number 1");
        JLabel label2 = new JLabel("Number 2");
        JLabel label3 = new JLabel();
        add(label1);
        add(tf1);
        add(label2);
        add(tf2);
        add(b);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            int sum = n1 + n2;
            int diff = n1 - n2;
            String message = "Sum is" + sum + "\nDiff is" + diff;
            JOptionPane.showMessageDialog(this, message);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            swingSumDiff app = new swingSumDiff();
            app.setVisible(true);
        });
    }
}