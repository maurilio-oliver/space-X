package main.java.spacex.view.indexs;


import java.awt.event.ActionListener;

import javax.swing.*;

public class Home extends JFrame {
    private static final long serialVersionUID = 1L;
    JButton start;
    JButton records;

    public Home() {
        setConfigurations();
        loandComponents();
    }

    public void loandComponents() {
        this.start = new JButton("start");
        this.records = new JButton("records");
        start.setBounds(390, 290, 100, 30);
        records.setBounds(390, 330, 100, 30);

        start.addActionListener(e->{
            System.out.println("test");
        });
        
        add(start);
        add(records);

    }
    
   
    private void setConfigurations(){
        this.setSize(800, 800);
        this.setLayout(null);
        this.setName("Home");
        this.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        this.setTitle("Space X");
        this.setVisible(true);
    }



}
