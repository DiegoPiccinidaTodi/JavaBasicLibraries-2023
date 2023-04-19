/*
 * Basic Script
 * Author: Diego Piccini da Todi, contact@diegopiccinidatodi.com
 * April, 2023
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture {

    public static void main(String[] args) {
        var frame = new JFrame();
        var icon = new ImageIcon("Picture1.jpg");
        var label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
