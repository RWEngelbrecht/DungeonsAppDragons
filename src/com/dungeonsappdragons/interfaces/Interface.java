package com.dungeonsappdragons.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dungeonsappdragons.character.Character;
import com.sun.tools.javac.comp.Flow;

public class Interface {

    String playerName;
    JFrame mainFrame = new JFrame();
    JPanel mainPanel = new JPanel();
    JLabel welcomeBanner = new JLabel("What is your name?");

    public Interface() {
        //set basic layout of frame

        mainPanel.setBounds(25, 15, 750, 700);
        mainPanel.setBackground(Color.cyan);

        JTextField nameField = new JTextField(8);
        nameField.setFont(nameField.getFont().deriveFont(16f));
//        nameField.setBounds(0, 0, 100, 40);

        JButton createCharacterBt = new JButton("Create Character");
        createCharacterBt.setBounds(320, 550, 150, 40);
        createCharacterBt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                playerName = nameField.getText();
                newCharacterInterface();
            }
        });

        mainPanel.add(welcomeBanner);
        mainPanel.add(nameField);
        mainPanel.add(createCharacterBt);

        mainFrame.add(mainPanel);
        mainFrame.setTitle("Dungeons App Dragons");
        mainFrame.setSize(800, 750);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }

    public void newCharacterInterface() {
        mainPanel.removeAll();
        welcomeBanner = new JLabel("Welcome, "+playerName);
        welcomeBanner.setBounds(0, 0, 250, 40);
        mainPanel.add(welcomeBanner);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

}
