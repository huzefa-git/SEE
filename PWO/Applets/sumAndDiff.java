//This code cannot be executed as the Applet in java.applet has been marked for removal

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.swing.JOptionPane;

public class sumAndDiff extends Applet implements ActionListener {
    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    Button b = new Button("Find sum and difference");

    public void init() {
        tf1.setBounds(100, 100, 200, 40);
        tf2.setBounds(100, 100, 200, 40);
        b.setBounds(100, 300, 200, 40);
        add(tf1);
        add(tf2);
        add(b);
        b.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(600, 600);
    }

    public void ActionPerformed(swing.ActionEvent ae) {
        int n1 = Integer.parseInt(tf1.getText());
        int n2 = Integer.parseInt(tf2.getText());
        javax.swing.JOptionPane.showMessageDialog(this, "Sum is:" + String.valueOf(n1 + n2));
        javax.swing.JOptionPane.showMessageDialog(this, "Diff is" + String.valueOf(n1-n2));
    }
}
