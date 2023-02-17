package br.model;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class MyButton extends JButton {
    public MyButton() {
        Border border = BorderFactory.createLineBorder(Color.black, 3);

        //this.setBackground(Color.white);
        this.setFont(new Font("MV Boli",Font.PLAIN,80));
        this.setFocusable(false);
        //this.addActionListener(this);
        this.setContentAreaFilled(false);
        this.setBorder(border);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
