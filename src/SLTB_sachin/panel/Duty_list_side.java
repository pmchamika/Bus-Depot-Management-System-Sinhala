/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Temp;
import SLTB_sachin.Class.Duty;
import SLTB_sachin.Temp;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author sachin kumara
 */
public class Duty_list_side extends javax.swing.JPanel {

    private Duty_list_up du = null;
    private Duty_list_side ds = null;
    private Duty_list dl = null;
    private Duty d = new Duty();
    public static JRViewer viewer = null;

    private static Duty_list_side dls = null;

    /**
     * Creates new form Duty_list_side
     */
    private Duty_list_side() {
        initComponents();
    }

    public static Duty_list_side getobj() {
        if (dls == null) {
            dls = new Duty_list_side();
        }
        return dls;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        repo = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(220, 280));

        repo.setBackground(new java.awt.Color(102, 153, 255));
        repo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        repo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/re.png"))); // NOI18N
        repo.setText("Report");
        repo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        repo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(repo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(repo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void repoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repoActionPerformed
        du = Duty_list_up.getobj();
        SLTB_sachin.Temp te = Temp.temp1;
        dl = Duty_list.getobj();

        if (repo.getText().equalsIgnoreCase("Report")) {
            repo.setBackground(new java.awt.Color(255, 51, 51));
            repo.setText("Cancel");
            du.setVisible(false);

            d.report();
            dl.setVisible(false);
        } else if (repo.getText().equalsIgnoreCase("Cancel")) {
            repo.setBackground(new java.awt.Color(102, 153, 255));
            repo.setText("Report");
            du.setVisible(true);
            viewer.setVisible(false);
            dl.setVisible(true);
            te.mainsetpanel.add(dl, te.cmain);
        }


    }//GEN-LAST:event_repoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton repo;
    // End of variables declaration//GEN-END:variables
}
