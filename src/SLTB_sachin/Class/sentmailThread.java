/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

import SLTB_sachin.Temp;
import SLTB_sachin.panel.Monthly_duty_main;
import SLTB_sachin.panel.sendingemail;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sachin kumara
 */
public class sentmailThread extends Thread {

    Monthly_duty md = new Monthly_duty();
    SLTB_sachin.Temp te = Temp.temp1;
    JLabel label = new JLabel();
    JOptionPane jp = new JOptionPane();

    public sentmailThread() {

        //System.out.println("thread start");
        label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
        start();
    }

    public void run() {
        boolean a = md.send();
        if (a) {
            Monthly_duty_main.getobj().setVisible(true);
            sendingemail.getobj().setVisible(false);
            te.mainsetpanel.add(Monthly_duty_main.getobj(), te.cmain);
            label.setText("úoHq;a ;eme,a m;a fhduq lsÍu id¾:lhs ");
            jp.showMessageDialog(Monthly_duty_main.getobj(), label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
