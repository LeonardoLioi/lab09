package it.unibo.mvc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.File;
import java.awt.BorderLayout;

/**
 * A very simple program using a graphical interface.
 * 
 */
public final class SimpleGUI {

    private final JFrame frame = new JFrame();

    public SimpleGUI() {
        frame.setTitle("My first graphical interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JTextArea text = new JTextArea();
        JButton b = new JButton("Save");
        
        jp.add(text, BorderLayout.CENTER);
        jp.add(b, BorderLayout.SOUTH);
        b.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Controller ctr = new Controller();
                String content = text.getText();
                ctr.writeContent(content);
                System.out.println("The file was saved in: "+ctr.getFilePath());
                
            }

        });
        
	    frame.getContentPane().add(jp);
        frame.setVisible(true);

    }

    public void start(){
        // new SimpleGUI();

    }

    public static void main(final String ...args){

        new SimpleGUI();

    }


}

