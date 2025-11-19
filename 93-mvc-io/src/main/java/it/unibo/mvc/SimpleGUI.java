package it.unibo.mvc;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;


/**
 * A very simple program using a graphical interface.
 *
 */
public final class SimpleGUI {

    private final JFrame frame = new JFrame();

    public SimpleGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();
        JButton print = new JButton("Print");
        JButton showHistory= new JButton("Show History");
        jp.add(textField,BorderLayout.NORTH);
        jp.add(textArea,BorderLayout.CENTER);

        JPanel jp2 = new JPanel();
        jp2.add(print);
        jp2.add(showHistory);
        SimpleController ctr = new SimpleController();
        print.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ctr.setStringToPrint(textField.getText());
                System.out.println(ctr.getStringToPrint());
            }
            
        });
        showHistory.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("sono qui");
                for (var x : ctr.getHistoryStringsPrinted() ) {
                    textArea.append(x+"\n");
                }
                
            }
            
        });

        
        
	    frame.getContentPane().add(jp);
        frame.getContentPane().add(jp2, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public static void main(String ...args){
        new SimpleGUI();
    }

}
