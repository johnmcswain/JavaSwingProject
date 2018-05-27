package com.javaswingproject;

import javax.swing.*;
import com.javaswingproject.MainForm;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Launching GUI");

        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().mainView);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);

    }
}
