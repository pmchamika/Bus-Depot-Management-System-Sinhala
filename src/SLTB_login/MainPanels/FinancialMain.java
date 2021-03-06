/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_login.MainPanels;

import SLTB_isuru.finance.Income;
import SLTB_isuru.finance.IncomeUp;
import SLTB_isuru.finance.RouteReport;
import SLTB_isuru.finance.RouteReportSide;
import SLTB_isuru.finance.RouteReportUp;
import SLTB_isuru.finance.Salaries;
import SLTB_isuru.finance.SalariesSide;
import SLTB_isuru.finance.SalariesUp;
import SLTB_sachin.Temp;

/**
 *
 * @author Chamika Prabath
 */
public class FinancialMain extends javax.swing.JPanel {
private static FinancialMain finM=null;
    /**
     * Creates new form FinancialMain
     */
    public FinancialMain() {
        initComponents();
    }

      
 public static FinancialMain getobj(){
        if(finM==null){
            finM=new FinancialMain();
        }
        return finM;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1149, 710));
        setMinimumSize(new java.awt.Dimension(1149, 710));
        setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dailyIn.png"))); // NOI18N
        jLabel1.setToolTipText("Daily Records");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empSal.png"))); // NOI18N
        jLabel2.setToolTipText("Employee Salary");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/InOut.png"))); // NOI18N
        jLabel3.setToolTipText("Income And Outcome");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel6.setText("fiajl udisl jegqma ");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel7.setText("ffoksl ud??. igyka ");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("FMBindumathi", 1, 18)); // NOI18N
        jLabel8.setText("wdodh?? y ??ho?? ");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(112, 112, 112)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(415, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        RouteReport routeR = RouteReport.getobj();
        RouteReportUp routeRUP = RouteReportUp.getobj();
        RouteReportSide routeRSIDE= RouteReportSide.getobj();
        
        this.setVisible(false);
        routeR.setVisible(true);
        routeRUP.setVisible(true);
        routeRSIDE.setVisible(true);

        Temp tmp = Temp.temp1;
        tmp.mainsetpanel.add(routeR, tmp.cmain);
        tmp.upsetpanel.add(routeRUP, tmp.cup);
        tmp.sidesetpanel.add(routeRSIDE, tmp.cside);
        routeR.TableLoad1();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         Salaries Sal = Salaries.getobj();
        
        SalariesUp SalUp = SalariesUp.getobj();
        SalariesSide SalSide = SalariesSide.getobj();
     
        this.setVisible(false);
        Sal.setVisible(true);
        SalUp.setVisible(true);
        SalSide.setVisible(true);
        Temp tmp = Temp.temp1;
        tmp.mainsetpanel.add(Sal, tmp.cmain);
        tmp.upsetpanel.add(SalUp, tmp.cup);
        tmp.sidesetpanel.add(SalSide, tmp.cside);
        Sal.TableLoad1();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Income Sal = Income.getobj();
        
        IncomeUp SalUp = IncomeUp.getobj();
        
        this.setVisible(false);
        Sal.setVisible(true);
        SalUp.setVisible(true);
        Temp tmp = Temp.temp1;
        tmp.mainsetpanel.add(Sal, tmp.cmain);
        tmp.upsetpanel.add(SalUp, tmp.cup);
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
