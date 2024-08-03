/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aac.zaa;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author karabo
 */
public class MyFirstFrame extends JFrame {

    public MyFirstFrame() throws HeadlessException {
        getContentPane().setBackground(Color.red);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 600);
        setDefaultLookAndFeelDecorated(true);
        setTitle("My first GUI application");
        setResizable(true);
        setVisible(true);
    }
    
    
}
