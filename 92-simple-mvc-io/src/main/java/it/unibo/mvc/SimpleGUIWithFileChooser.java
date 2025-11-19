package it.unibo.mvc;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.*;

import java.awt.BorderLayout;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUIWithFileChooser {

    private final JFrame frame = new JFrame();
    public SimpleGUIWithFileChooser() {
        
        frame.setTitle("My second graphical interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JTextArea text = new JTextArea();
        JButton b = new JButton("Save");
        
        jp.add(text, BorderLayout.CENTER);
        jp.add(b, BorderLayout.SOUTH);

        JPanel jp2 = new JPanel(new BorderLayout());
        JTextField field = new JTextField();
        field.setEditable(false);
        JButton b3 = new JButton("Browse");
        jp2.add(field, BorderLayout.CENTER);
        jp2.add(b3, BorderLayout.LINE_END);
        b3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFileChooser chooser = new JFileChooser();
                chooser.setSize(300,300);
                chooser.showSaveDialog(new JFileChooser());
                
                chooser.setVisible(true);
                
            }

        });
	    frame.getContentPane().add(jp);
        frame.getContentPane().add(jp2, BorderLayout.NORTH);
        frame.setVisible(true);    
    }

    public static void main(String ...args){
        new SimpleGUIWithFileChooser();
    }

}
