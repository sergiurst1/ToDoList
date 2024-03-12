package org.example.domain;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    public TitleBar(){
        this.setPreferredSize(new Dimension(400, 50));
        //this.setBackground(Color.red);
        JLabel titleText = new JLabel("To Do List");
        titleText.setFont(new Font("Ink Free", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);

    }
}
