package com.javaswingproject;

import javax.swing.*;

public class MainForm {
    public JPanel mainView;
    private JButton button1;
    static JFrame frame;

    public MainForm() {

      // add the listener to the jbutton to handle the "pressed" event
        button1.addActionListener(e -> {
            // display/center the jdialog when the button is pressed
            JDialog d = new JDialog(frame, "Hello", true);
            d.setLocationRelativeTo(frame);
            d.setVisible(true);
        });
    }




}
