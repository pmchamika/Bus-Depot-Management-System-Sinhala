/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

/**
 *
 * @author sachin kumara
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Toast extends JFrame {
 
    //String of toast
    private String s;
 
    // JWindow
    private JWindow w;
    int wwww;
    private Toast()
    {
        
    }
 
    public  void create(String s, int x, int y){
        w = new JWindow();
 
        // make the background transparent
        w.setBackground(new Color(0, 0, 0, 0));
 
        // create a panel
        JPanel p = new JPanel() {
            public void paintComponent(Graphics g)
            {
                g.setFont(new Font("FMBindumathi", Font.BOLD, 18));
                int wid = g.getFontMetrics().stringWidth(s);
                //System.out.println("w"+wid);
                int hei = g.getFontMetrics().getHeight();
                wwww=wid;
                
                // draw the boundary of the toast and fill it
                g.setColor(Color.black);
                g.fillRect(10, 10, wid + 30, hei + 10);
                g.setColor(Color.black);
                g.drawRect(10, 10, wid + 30, hei + 10);
 
                // set the color of text
                g.setColor(new Color(255, 255, 255, 240));
                g.drawString(s, 25, 27);
                int t = 250;
 
                // draw the shadow of the toast
                for (int i = 0; i < 4; i++) {
                    t -= 60;
                    g.setColor(new Color(0, 0, 0, t));
                    g.drawRect(10 - i, 10 - i, wid + 30 + i * 2,
                               hei + 10 + i * 2);
                }
            }
        };
        //System.out.println("a"+x);
        for(int i=0;i<s.length();i++){
          x-=8;  
        }
        
         //System.out.println("b"+x);
        w.add(p);
        w.setLocation(x, y);
        w.setSize(500, 100);
    }
    // function to pop up the toast
    public static void showtoast(String si,Component com)
    {
       
        int xi= com.getLocation().x;
        int yi=com.getLocation().y;
        int q=com.getWidth()/2;
        int lk=com.getHeight()-90;
        xi+=q;
        yi+=lk;
        //System.out.println(xi +"   "+yi);
        Toast t=new Toast();
        t.create(si,xi,yi);
        try {
             t.w.setOpacity(1);
             t.w.setVisible(true);
 
            // wait for some time
            Thread.sleep(200);
 
            // make the message disappear  slowly
            for (double d = 1.0; d > 0.2; d -= 0.1) {
                Thread.sleep(50);
                t.w.setOpacity((float)d);
            }
 
            // set the visibility to false
            t.w.setVisible(false);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

