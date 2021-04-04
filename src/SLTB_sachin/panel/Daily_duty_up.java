/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.panel;

import SLTB_sachin.Class.Daily_duty;
import SLTB_sachin.Class.Toast;
import SLTB_sachin.Temp;
import java.awt.Window;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author sachin kumara
 */
public class Daily_duty_up extends javax.swing.JPanel {

    private static Daily_duty_up ddup = null;

    /**
     * Creates new form monthly_duty_up
     */
    private Daily_duty_up() {
        initComponents();
    }

    public static Daily_duty_up getobj() {
        if (ddup == null) {
            ddup = new Daily_duty_up();
        }
        return ddup;
    }

    public void ser() {
        int d = 0, s = 0;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate = df.format(Daily_duty_up.getobj().date_c.getDate());
        if (sal_no.getText().equalsIgnoreCase("")) {
            s = 0;
        } else {
            s = Integer.valueOf(sal_no.getText());
        }

        if (Duty_no.getText().equalsIgnoreCase("")) {
            d = 0;
        } else {
            d = Integer.valueOf(Duty_no.getText());
        }

        Daily_duty ddu = new Daily_duty();
        Daily_duty_main.getobj().setTable(ddu.searchta(d, s, reportDate));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        year = new javax.swing.JLabel();
        year2 = new javax.swing.JLabel();
        sal_no = new javax.swing.JTextField();
        year3 = new javax.swing.JLabel();
        Duty_no = new javax.swing.JTextField();
        date_c = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 60));

        year.setFont(new java.awt.Font("FMBindumathi", 1, 24)); // NOI18N
        year.setText("oji ");

        year2.setFont(new java.awt.Font("FMBindumathi", 1, 24)); // NOI18N
        year2.setText("fÉ;k wxlh ");

        sal_no.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sal_no.setAutoscrolls(false);
        sal_no.setMaximumSize(new java.awt.Dimension(14, 32));
        sal_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sal_noKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sal_noKeyTyped(evt);
            }
        });

        year3.setFont(new java.awt.Font("FMBindumathi", 1, 24)); // NOI18N
        year3.setText("ld¾h wxlh ");

        Duty_no.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Duty_no.setMaximumSize(new java.awt.Dimension(14, 32));
        Duty_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Duty_noKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Duty_noKeyTyped(evt);
            }
        });

        date_c.setDateFormatString("yyyy-MM-dd");
        date_c.setFocusable(false);
        date_c.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_cPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(year)
                .addGap(18, 18, 18)
                .addComponent(date_c, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(year2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sal_no, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(year3)
                .addGap(18, 18, 18)
                .addComponent(Duty_no, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year2)
                        .addComponent(sal_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(year3)
                        .addComponent(Duty_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(year)
                        .addComponent(date_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esearch.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void date_cPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_cPropertyChange
        if (Daily_duty_main.ch == 1) {
            Daily_duty_main.getobj().loadtable();
            Daily_duty_main.getobj().dut = 0;
            Daily_duty_main.getobj().asi = 0;
            Daily_duty_main.getobj().abs = 0;
            Daily_duty_main.getobj().tfclean();
            sal_no.setText("");
            Duty_no.setText("");
        }

    }//GEN-LAST:event_date_cPropertyChange

    private void sal_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sal_noKeyReleased
        checksalno(0);
    }//GEN-LAST:event_sal_noKeyReleased

    private void Duty_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Duty_noKeyReleased
        checkDutyno(0);
    }//GEN-LAST:event_Duty_noKeyReleased

    private void Duty_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Duty_noKeyTyped
        checkDutyno(1);
    }//GEN-LAST:event_Duty_noKeyTyped

    private void sal_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sal_noKeyTyped
        checksalno(1);
    }//GEN-LAST:event_sal_noKeyTyped

    public void checksalno(int tf) {
        //only INT numbes for duty number
        String val = sal_no.getText();
        int len = val.length();
        if (!isINT(val)) {
            if (len == 1 || len == 0) {
                sal_no.setText("");
            } else {
                sal_no.setText(val.substring(0, len - 1));
            }
            if(tf==0){
                
                Window w[]=Temp.getWindows();
                 Toast.showtoast("mQ¾K ixLHd muKla ndú;d lrkak",w[0]);
            }
        }

        ser();
    }

    public void checkDutyno(int tf) {
        //only INT numbes for duty number
        String val = Duty_no.getText();
        int len = val.length();
        if (!isINT(val)) {
            if (len == 1 || len == 0) {
                Duty_no.setText("");
            } else {
                Duty_no.setText(val.substring(0, len - 1));
            }
            if(tf==0){
                
                Window w[]=Temp.getWindows();
                 Toast.showtoast("mQ¾K ixLHd muKla ndú;d lrkak",w[0]);
            }
        }

        ser();
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
    private javax.swing.JTextField Duty_no;
    public com.toedter.calendar.JDateChooser date_c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sal_no;
    private javax.swing.JLabel year;
    private javax.swing.JLabel year2;
    private javax.swing.JLabel year3;
    // End of variables declaration//GEN-END:variables
}
