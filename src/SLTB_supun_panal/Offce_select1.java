/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_supun_panal;

import SLTB_sachin.Temp;
import com.ConnectionMysql.MysqlConnect;
import com.mysql.jdbc.Connection;
import com.sun.glass.events.KeyEvent;
import java.awt.Font;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author SUPUN
 */
public class Offce_select1 extends javax.swing.JPanel {
    private static Offce_select1 off1 = null;
    
  
    /**
     * Creates new form Offce_select1
     */
    private Offce_select1() {
        initComponents();
     
    }
    public static Offce_select1 getobj(){
        if(off1 == null){
            off1 = new Offce_select1();
        }
        return off1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        off_typ = new javax.swing.JLabel();
        off_cno = new javax.swing.JLabel();
        offc_type = new javax.swing.JComboBox<>();
        offc_no = new javax.swing.JTextField();
        offt_sub = new javax.swing.JButton();
        offt_rest = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        off_typ.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        off_typ.setText("j¾.h ");

        off_cno.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        off_cno.setText("wdh;k wxlh ");

        offc_type.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        offc_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ld¾hd,Sh Ndxv ", "m%fõY m;% hka;%  "}));
        offc_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offc_typeActionPerformed(evt);
            }
        });
        offc_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                offc_typeKeyReleased(evt);
            }
        });

        offc_no.setFont(new java.awt.Font("FMBindumathi", 0, 18)); // NOI18N
        offc_no.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                offc_noCaretUpdate(evt);
            }
        });
        offc_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                offc_noKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                offc_noKeyTyped(evt);
            }
        });

        offt_sub.setBackground(new java.awt.Color(239, 219, 88));
        offt_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ecorre.png"))); // NOI18N
        offt_sub.setText("Submit");
        offt_sub.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                offt_subMouseDragged(evt);
            }
        });
        offt_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offt_subMouseClicked(evt);
            }
        });
        offt_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offt_subActionPerformed(evt);
            }
        });

        offt_rest.setBackground(new java.awt.Color(255, 153, 153));
        offt_rest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arefresh.png"))); // NOI18N
        offt_rest.setText("Reset");
        offt_rest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offt_restMouseClicked(evt);
            }
        });
        offt_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offt_restActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(off_cno, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(off_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offt_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(offt_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(offc_type, 0, 425, Short.MAX_VALUE)
                            .addComponent(offc_no))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(off_cno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(off_typ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offc_type, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offt_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offt_rest, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void offt_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offt_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offt_subActionPerformed

    private void offt_restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offt_restActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offt_restActionPerformed

    private void offc_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offc_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offc_typeActionPerformed

    private void offc_typeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_offc_typeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_offc_typeKeyReleased

    private void offt_subMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offt_subMouseDragged
        // TODO add your handling code here:
     
    }//GEN-LAST:event_offt_subMouseDragged

    private void offt_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offt_subMouseClicked
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("FMBindumathi", Font.BOLD, 25)));
        
        String cid = offc_no.getText();
        if(offc_no.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "wdh;kfha wxlh mqrjd ke;  ");
            this.setVisible(true);
        
        }
        else if(offc_type.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "j¾.h mqrjd ke; ");
            this.setVisible(true);
            
        }
        else if(offc_type.getSelectedItem().equals("m%fõY m;% hka;%  ") ){
        SLTB_sachin.Temp te = Temp.temp1;
        tikcet_maching tik = tikcet_maching.getobj();
        
        tik.setVisible(true);
        te.mainsetpanel.add(tik,te.cmain);
        this.setVisible(false);    
        }
        else {
        
        JOptionPane.showMessageDialog(null, "id¾;lhs ");    
            
        SLTB_sachin.Temp te = Temp.temp1;
        Offce_item of = Offce_item.getobj();
        
        of.setVisible(true);
        te.mainsetpanel.add(of,te.cmain);
        this.setVisible(false); 
        }
    }//GEN-LAST:event_offt_subMouseClicked

    private void offt_restMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offt_restMouseClicked
        // TODO add your handling code here:
        offc_no.setText("");
        offc_type.setSelectedItem("ld¾hd,Sh Ndxv ");
        
    }//GEN-LAST:event_offt_restMouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        //off1_exit.setVisible(false);
    }//GEN-LAST:event_formPropertyChange

    private void offc_noCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_offc_noCaretUpdate
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_offc_noCaretUpdate

    private void offc_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_offc_noKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE) ){
            evt.consume();
        }
        String a = offc_no.getText();
        
        int i = a.length();
        if(i>=10){
        
            offc_no.setText(a.substring(0, i-1));
           
        }
       
        
    }//GEN-LAST:event_offc_noKeyTyped

    private void offc_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_offc_noKeyReleased
        // TODO add your handling code here:
        /*if(offc_no.getText().equals("")){
            offc_no.setEditable(true);
        
        }
        else{
           
            offc_no.setEditable(false);
        }*/
    }//GEN-LAST:event_offc_noKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel off_cno;
    private javax.swing.JLabel off_typ;
    public javax.swing.JTextField offc_no;
    private javax.swing.JComboBox<String> offc_type;
    private javax.swing.JButton offt_rest;
    private javax.swing.JButton offt_sub;
    // End of variables declaration//GEN-END:variables
}
