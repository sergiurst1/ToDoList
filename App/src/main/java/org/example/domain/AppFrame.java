package org.example.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    private TitleBar titleBar;
    private List list;
    private ButtonPanel buttonPanel;
    private JButton addTask;
    private JButton delete;

    public AppFrame(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        titleBar = new TitleBar();
        list = new List();
        buttonPanel = new ButtonPanel();

        this.add(titleBar, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        addTask = buttonPanel.getAddTask();
        delete = buttonPanel.getDelete();

        addListener();
    }

    public void addListener(){
        addTask.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                Task task = new Task();
                list.add(task);
                list.updateNumber();
                task.getDone().addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e){
                        task.changeState();
                        list.revalidate();
                    }
                });
                revalidate();
            }
        });

        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e)
            {
                list.removeCompletedTasks();
                repaint();
            }
        });
    }
}
