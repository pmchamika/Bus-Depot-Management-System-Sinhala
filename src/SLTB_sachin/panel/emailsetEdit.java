/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.EmailController;
import SLTB_sachin.Class.Toast;
import SLTB_sachin.Temp;
import java.awt.Font;
import java.awt.Window;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sachin kumara
 */
public class emailsetEdit extends javax.swing.JPanel {

    EmailController emc = new EmailController();
    private static emailsetEdit es = null;

    /**
     * Creates new form emailsetEdit
     */
    private emailsetEdit() {
        initComponents();
        setnew();
    }

    public static emailsetEdit getobj() {
        if (es == null) {
            es = new emailsetEdit();

        }

        return es;
    }

    public void setnew() {
        emc.fill();
        host.setText(emc.getHost());
        user.setText(emc.getUser());
        port.setText(emc.getPort());
        pass.setText(emc.getPass());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edit_b = new javax.swing.JButton();
        host = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        port = new javax.swing.JTextField();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("User");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Host");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Port");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        edit_b.setBackground(new java.awt.Color(255, 255, 102));
        edit_b.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        edit_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eupdate.png"))); // NOI18N
        edit_b.setText("Edit");
        edit_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_bActionPerformed(evt);
            }
        });

        host.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        host.setMaximumSize(new java.awt.Dimension(14, 2147483647));

        user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        user.setMaximumSize(new java.awt.Dimension(14, 2147483647));

        pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pass.setMaximumSize(new java.awt.Dimension(14, 2147483647));

        port.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        port.setMaximumSize(new java.awt.Dimension(14, 2147483647));
        port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                portKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                portKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160)
                .addComponent(edit_b, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edit_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_bActionPerformed
        int ch = 0;
        if (host.getText().equalsIgnoreCase("")) {
            ch = 1;
        } else if (user.getText().equalsIgnoreCase("")) {
            ch = 1;
        } else if (port.getText().equalsIgnoreCase("")) {
            ch = 1;
        } else if (pass.getText().equalsIgnoreCase("")) {
            ch = 1;
        } else {
            String email = user.getText();
            try {
                InternetAddress emailAddr = new InternetAddress(email);
                emailAddr.validate();
            } catch (AddressException ex) {
                JOptionPane.showMessageDialog(this, "invalide user email check it", "ERROR: ", JOptionPane.ERROR_MESSAGE);
                setnew();
                return;
            }
        }
        if (ch == 1) {
            JLabel label = new JLabel("ish,a, mqrjd ;sìh hq;=hs ");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, label, "InfoBox: ", JOptionPane.ERROR_MESSAGE);
        } else {
            emc.edit(host.getText(), user.getText(), pass.getText(), port.getText());
        }
    }//GEN-LAST:event_edit_bActionPerformed

    private void portKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portKeyReleased
        checkport(0);
    }//GEN-LAST:event_portKeyReleased

    private void portKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_portKeyTyped
        checkport(1);
    }//GEN-LAST:event_portKeyTyped

    public void checkport(int tf) {
        //only INT numbes for duty number
        String val = port.getText();
        int len = val.length();
        if (!isINT(val)) {
            if (len == 1 || len == 0) {
                port.setText("");
            } else {
                port.setText(val.substring(0, len - 1));
            }
            if(tf==0){
                
                Window w[]=Temp.getWindows();
                 Toast.showtoast("mQ¾K ixLHd muKla ndú;d lrkak",w[0]);
            }
        }

    }

    public boolean isINT(String strNum) {
        boolean ret = true;
        try {

            Integer.valueOf(strNum);

        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit_b;
    private javax.swing.JTextField host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField port;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
