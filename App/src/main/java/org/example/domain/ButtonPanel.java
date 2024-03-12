package org.example.domain;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JButton addTask;
    private JButton delete;

    Border empty = BorderFactory.createEmptyBorder();
    public ButtonPanel(){
        this.setPreferredSize(new Dimension(400, 60));
        //this.setBackground(Color.red);

        addTask = new JButton("Add Task");
        addTask.setBorder(empty);
        addTask.setFont(new Font("Ink Free", Font.PLAIN, 20));

        this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        delete = new JButton("Delete Completed Tasks");
        delete.setBorder(empty);
        delete.setFont(new Font("Ink Free", Font.PLAIN, 20));

        this.add(delete);
    }

    public JButton getAddTask(){
        return addTask;
    }

    public JButton getDelete(){
        return delete;
    }

}
