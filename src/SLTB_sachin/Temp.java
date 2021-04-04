/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin;

import SLTB_Bimsara.Oparation.AddNewOparation;
import SLTB_Bimsara.Oparation.EditOparation;
import SLTB_Bimsara.Oparation.OparationMain;
import SLTB_Bimsara.Oparation.OparationSide;
import SLTB_Bimsara.Oparation.OparationTop;
import SLTB_Bimsara.Panel.BusRegistation.AddNewBus;
import SLTB_Bimsara.Panel.BusRegistation.BusRegistationMain;
import SLTB_Bimsara.Panel.BusRegistation.BusRegistationSide;
import SLTB_Bimsara.Panel.BusRegistation.BusRegistationTop;
import SLTB_Bimsara.Panel.BusRegistation.EditBus;
import SLTB_Bimsara.Report.BusReport;
import SLTB_Bimsara.Report.OparationReport;
import SLTB_Bimsara.Route.AddNewRouteId;
import SLTB_Bimsara.Route.EditRoute;
import SLTB_Bimsara.Route.RouteIdMain;
import SLTB_Bimsara.Route.RouteIdSide;
import SLTB_Bimsara.Route.RouteIdTop;
import SLTB_chamika.Class.Employee;
import SLTB_chamika.employee.EmployeeID;
import SLTB_chamika.employee.ManageAttendance;
import SLTB_chamika.employee.ManageAttendanceUp;
import SLTB_chamika.employee.ManageEmployee;
import SLTB_chamika.employee.ManageEmployeeSide;
import SLTB_chamika.employee.ManageEmployeeUp;
import SLTB_chamika.employee.ManageLeave;
import SLTB_chamika.employee.ManageLeaveSide;
import SLTB_chamika.employee.ManageLeaveUp;
import SLTB_chamika.employee.Webcam;
import SLTB_ghost.security.button1;
import SLTB_ghost.security.button2;
import SLTB_ghost.security.button3;
import SLTB_ghost.security.button4;
import SLTB_ghost.security.depot_vehicle;
import SLTB_ghost.security.guest;
import SLTB_ghost.security.other_vehicle;
import SLTB_ghost.security.ticket_book;
import SLTB_isuru.Class.Finance;
import SLTB_isuru.finance.Income;
import SLTB_isuru.finance.IncomeUp;
import SLTB_isuru.finance.RouteReport;
import SLTB_isuru.finance.RouteReportSide;
import SLTB_isuru.finance.RouteReportUp;
import SLTB_isuru.finance.Salaries;
import SLTB_isuru.finance.SalariesSide;
import SLTB_isuru.finance.SalariesUp;
import SLTB_login.Login;
import SLTB_login.MainPanels.AdminMain;
import SLTB_login.MainPanels.DutyOperationMain;
import SLTB_login.MainPanels.EmployeeMain;
import SLTB_login.MainPanels.FinancialMain;
import SLTB_login.MainPanels.FuelRepairMain;
import SLTB_login.MainPanels.SecurityMain;
import SLTB_login.MainPanels.SupplierMain;
import SLTB_sachin.panel.Daily_duty_main;
import SLTB_sachin.panel.Daily_duty_side;
import SLTB_sachin.panel.Daily_duty_up;
import SLTB_sachin.panel.Duty_list;
import SLTB_sachin.panel.Duty_list_side;
import SLTB_sachin.panel.Duty_list_up;

import SLTB_sachin.panel.Monthly_duty_edit_main;
import SLTB_sachin.panel.Monthly_duty_main;
import SLTB_sachin.panel.Monthly_duty_side;
import SLTB_sachin.panel.Monthly_duty_side_up;
import SLTB_sachin.panel.Monthly_duty_up;
import SLTB_sachin.panel.emailsetEdit;
import SLTB_sachin.panel.sendingemail;
import SLTB_sandu.fuel.fueL1;
import SLTB_sandu.fuel.stock;
import SLTB_sandu.fuel.waste;
import SLTB_supun_panal.Offce_item;
import SLTB_supun_panal.Service;
import SLTB_supun_panal.chooce_comp;
import SLTB_supun_panal.com_serch;
import SLTB_supun_panal.company_item;
import SLTB_supun_panal.fuel_order;
import SLTB_supun_panal.item_serch;
import SLTB_supun_panal.show_t;
import SLTB_supun_panal.tender;
import SLTB_supun_panal.tikcet_maching;
import SLTB_wishva.repair.S_stock;
import SLTB_wishva.repair.Stock_up;
import SLTB_wishva.repair.avil;
import SLTB_wishva.repair.avil_up;
import SLTB_wishva.repair.busrepair;
import SLTB_wishva.repair.part_up;
import SLTB_wishva.repair.parts;
import SLTB_wishva.repair.rep_up;


import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author sachin kumara
 */
public class Temp extends javax.swing.JFrame {

    GridBagLayout lemain = new GridBagLayout();
    GridBagLayout leup = new GridBagLayout();
    GridBagLayout leside = new GridBagLayout();
    GridBagLayout lesideup = new GridBagLayout();
    int mondays[][];
    clockThread ct;

    public static Temp temp1 = null;
    public GridBagConstraints cmain;
    public GridBagConstraints cup;
    public GridBagConstraints cside;
    public GridBagConstraints csideup;

    /**
     * Creates new form Temp
     */
    private Temp() {
        initComponents();
        setcalander();
        ct = new clockThread(this);

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo2.png")));

        Login log=Login.getobj();
        upsetpanel.setLayout(leup);
        sidesetpanelup.setLayout(leside);
        mainsetpanel.setLayout(lemain);
        sidesetpanel.setLayout(lesideup);
        cmain = new GridBagConstraints();
        cmain.gridx = 0;
        cmain.gridy = 0;
        cup = new GridBagConstraints();
        cup.gridx = 0;
        cup.gridy = 0;
        cside = new GridBagConstraints();
        cside.gridx = 0;
        cside.gridy = 0;
        csideup = new GridBagConstraints();
        csideup.gridx = 0;
        csideup.gridy = 0;
       log.setVisible(true);
        mainsetpanel.add(log, cmain);

        /*Duty_list_up du=Duty_list_up.getobj();
        
        du.setVisible(true);
        upsetpanel.add(du,cup);*/
    }

    //---------------------------------------------------------------------------------
    public void setcalander() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY");
        LocalDateTime now = LocalDateTime.now();

        year.setText(dtf.format(now));
        dtf = DateTimeFormatter.ofPattern("MMMM");
        mon.setText(dtf.format(now));
        setmondays();
        //days.setValueAt("4", 1, 5);
        //pnlCalendar.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE);
        //days.setValueAt(calday, 0, 2);
        //calday.setBackground( new Color( 242, 1, 1, 200 ) );
        //calday.
        //days.setCell
    }

    public void setmondays() {
        mondays = new int[6][7];
        int cold, rowd, scold = 0, last, lastday, dodat = 0, today;

        LocalDate todaydat = LocalDate.now();
        Date date = java.sql.Date.valueOf(todaydat);

        Calendar cal = Calendar.getInstance();
        //cal.set(Calendar.DATE, 25);
        //cal.set(Calendar.MONTH,9 );
        //cal.set(Calendar.YEAR, 2018);
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDayOfMonth = cal.getTime();
        //System.out.println(firstDayOfMonth);
        DateFormat sdf = new SimpleDateFormat("EEE");

        String fday = String.valueOf(sdf.format(firstDayOfMonth));

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        lastday = Integer.valueOf(c.getActualMaximum(Calendar.DAY_OF_MONTH));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        today = Integer.valueOf(dtf.format(now));

        switch (fday) {
            case "Sun":
                scold = 0;
                break;
            case "Mon":
                scold = 1;
                break;
            case "Tue":
                scold = 2;
                break;
            case "Wed":
                scold = 3;
                break;
            case "Thu":
                scold = 4;
                break;
            case "Fri":
                scold = 5;
                break;
            case "Sat":
                scold = 6;
                break;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    if (j >= scold) {
                        dodat++;
                        mondays[i][j] = dodat;
                        days.setValueAt(String.valueOf(dodat), i, j);

                    }
                } else {
                    dodat++;
                    mondays[i][j] = dodat;
                    days.setValueAt(String.valueOf(dodat), i, j);

                }
                if (dodat == today) {
                    cold = j;
                    rowd = i;
                }
                if (dodat == lastday) {
                    break;
                }

            }
            if (dodat == lastday) {
                break;
            }
        }

    }

    //----------------------------------------------------------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        sidesetpanel = new javax.swing.JPanel();
        upsetpanel = new javax.swing.JPanel();
        sidesetpanelup = new javax.swing.JPanel();
        mainsetpanel = new javax.swing.JPanel();
        clock123 = new javax.swing.JLabel();
        pnlCalendar = new javax.swing.JPanel();
        year = new javax.swing.JLabel();
        mon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        days = new javax.swing.JTable(){
            public Component prepareRenderer(TableCellRenderer r,int ro,int co){
                Component cas=super.prepareRenderer(r,ro,co);
                cas.setBackground(Color.WHITE);

                mondays = new int[6][7];
                int cold=0, rowd=0, scold = 0, last, lastday, dodat = 0,today;

                LocalDate todaydat = LocalDate.now();
                Date date = java.sql.Date.valueOf(todaydat);

                Calendar cal = Calendar.getInstance();
                //cal.set(Calendar.DATE, 25);
                //cal.set(Calendar.MONTH, Calendar.JANUARY);
                //cal.set(Calendar.YEAR, 2012);

                cal.setTime(date);

                cal.set(Calendar.DAY_OF_MONTH, 1);
                Date firstDayOfMonth = cal.getTime();

                DateFormat sdf = new SimpleDateFormat("EEE");

                String fday = String.valueOf(sdf.format(firstDayOfMonth));

                //LocalDate todaydat = LocalDate.now();
                //Date date = java.sql.Date.valueOf(todaydat);
                Calendar c = Calendar.getInstance();
                c.setTime(date);
                lastday = Integer.valueOf(c.getActualMaximum(Calendar.DAY_OF_MONTH));

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd" );
                LocalDateTime now = LocalDateTime.now();
                today=Integer.valueOf(dtf.format(now));

                switch (fday) {
                    case "Sun":
                    scold = 0;
                    break;
                    case "Mon":
                    scold = 1;
                    break;
                    case "Tue":
                    scold = 2;
                    break;
                    case "Wed":
                    scold = 3;
                    break;
                    case "Thu":
                    scold = 4;
                    break;
                    case "Fri":
                    scold = 5;
                    break;
                    case "Sat":
                    scold = 6;
                    break;
                }

                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0) {
                            if (j >= scold) {
                                dodat++;
                                mondays[i][j] = dodat;

                            }
                        } else {
                            dodat++;
                            mondays[i][j] = dodat;

                        }
                        if(dodat==today){
                            cold=j;
                            rowd=i;
                        }
                        if (dodat == lastday) {
                            break;
                        }

                    }
                    if (dodat == lastday) {
                        break;
                    }
                }

                if(ro==rowd&&co==cold){
                    cas.setBackground(Color.RED);
                }

                return cas;
            }
        };
        user = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SLTB HOROWPATHANA");
        setBackground(new java.awt.Color(156, 156, 156));
        setResizable(false);

        back.setLayout(null);

        sidesetpanel.setOpaque(false);

        javax.swing.GroupLayout sidesetpanelLayout = new javax.swing.GroupLayout(sidesetpanel);
        sidesetpanel.setLayout(sidesetpanelLayout);
        sidesetpanelLayout.setHorizontalGroup(
            sidesetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        sidesetpanelLayout.setVerticalGroup(
            sidesetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        back.add(sidesetpanel);
        sidesetpanel.setBounds(1150, 490, 220, 280);

        upsetpanel.setOpaque(false);

        javax.swing.GroupLayout upsetpanelLayout = new javax.swing.GroupLayout(upsetpanel);
        upsetpanel.setLayout(upsetpanelLayout);
        upsetpanelLayout.setHorizontalGroup(
            upsetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        upsetpanelLayout.setVerticalGroup(
            upsetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        back.add(upsetpanel);
        upsetpanel.setBounds(80, 0, 1200, 60);

        sidesetpanelup.setOpaque(false);

        javax.swing.GroupLayout sidesetpanelupLayout = new javax.swing.GroupLayout(sidesetpanelup);
        sidesetpanelup.setLayout(sidesetpanelupLayout);
        sidesetpanelupLayout.setHorizontalGroup(
            sidesetpanelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        sidesetpanelupLayout.setVerticalGroup(
            sidesetpanelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        back.add(sidesetpanelup);
        sidesetpanelup.setBounds(1150, 70, 220, 110);

        mainsetpanel.setOpaque(false);
        mainsetpanel.setPreferredSize(new java.awt.Dimension(1149, 710));

        javax.swing.GroupLayout mainsetpanelLayout = new javax.swing.GroupLayout(mainsetpanel);
        mainsetpanel.setLayout(mainsetpanelLayout);
        mainsetpanelLayout.setHorizontalGroup(
            mainsetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1149, Short.MAX_VALUE)
        );
        mainsetpanelLayout.setVerticalGroup(
            mainsetpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        back.add(mainsetpanel);
        mainsetpanel.setBounds(0, 60, 1149, 710);

        clock123.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        clock123.setForeground(new java.awt.Color(204, 204, 204));
        clock123.setText("20:56:00");
        back.add(clock123);
        clock123.setBounds(1180, 370, 170, 80);

        pnlCalendar.setBackground(new java.awt.Color(204, 0, 51));

        year.setBackground(new java.awt.Color(204, 0, 51));
        year.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("2012");
        year.setToolTipText("");

        mon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mon.setForeground(new java.awt.Color(255, 255, 255));
        mon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mon.setText("Desember");

        days.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "S", "M", "Tu", "W", "Th", "F", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        days.setEnabled(false);
        jScrollPane1.setViewportView(days);

        javax.swing.GroupLayout pnlCalendarLayout = new javax.swing.GroupLayout(pnlCalendar);
        pnlCalendar.setLayout(pnlCalendarLayout);
        pnlCalendarLayout.setHorizontalGroup(
            pnlCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalendarLayout.createSequentialGroup()
                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlCalendarLayout.setVerticalGroup(
            pnlCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalendarLayout.createSequentialGroup()
                .addGroup(pnlCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        back.add(pnlCalendar);
        pnlCalendar.setBounds(1160, 200, 190, 165);

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log_1.png"))); // NOI18N
        user.setToolTipText("Logout");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        back.add(user);
        user.setBounds(1300, 10, 50, 50);

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home2.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        back.add(Home);
        Home.setBounds(10, 10, 50, 50);

        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back4.jpg"))); // NOI18N
        back.add(jLabel1);
        jLabel1.setBounds(0, -10, 1370, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home2.png")));
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home2_h.png")));
    }//GEN-LAST:event_HomeMouseEntered

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log_h.png")));
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log.png")));
    }//GEN-LAST:event_userMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked

        //sachin
        DutyOperationMain.getobj().setVisible(false);
        emailsetEdit.getobj().setVisible(false);
        sendingemail.getobj().setVisible(false);
        Duty_list.getobj().setVisible(false);
        Duty_list_up.getobj().setVisible(false);
        Duty_list_side.getobj().setVisible(false);
        Monthly_duty_up.getobj().setVisible(false);
        Monthly_duty_side.getobj().setVisible(false);
        Monthly_duty_side_up.getobj().setVisible(false);
        Daily_duty_main.getobj().setVisible(false);
        Daily_duty_side.getobj().setVisible(false);
        Monthly_duty_edit_main.getobj().setVisible(false);
        Daily_duty_up.getobj().setVisible(false);
        if (Duty_list_side.getobj().viewer != null) {
            Duty_list_side.getobj().viewer.setVisible(false);
        }
        if (Monthly_duty_side.getobj().viewer != null) {
            Monthly_duty_side.getobj().viewer.setVisible(false);
        }
        if (Daily_duty_side.getobj().viewer != null) {
            Daily_duty_side.getobj().viewer.setVisible(false);
        }
        Monthly_duty_main.getobj().setVisible(false);
  
        
        //chamika prabath
        Login log=Login.getobj();
        Employee e1=new Employee();
        ManageEmployee manageE=ManageEmployee.getobj();
        ManageEmployeeUp manageEup=ManageEmployeeUp.getobj();
        ManageEmployeeSide manageEside=ManageEmployeeSide.getobj();
        EmployeeID empid =EmployeeID.getobj();
        EmployeeMain emMain=EmployeeMain .getobj();
        ManageLeave manageL=ManageLeave.getobj();
        ManageLeaveUp manageLup=ManageLeaveUp.getobj();
        ManageLeaveSide manageLside=ManageLeaveSide.getobj();
        Webcam wc=Webcam.getobj();
        ManageAttendance manageA=ManageAttendance.getobj();
        ManageAttendanceUp manageAup=ManageAttendanceUp.getobj();
            manageLside.setVisible(false);
            manageE.setVisible(false);
            manageEup.setVisible(false);
            manageEside.setVisible(false);
            manageL.setVisible(false);
            manageLup.setVisible(false);
            wc.setVisible(false);
            empid.setVisible(false);
            manageA.setVisible(false);
            manageAup.setVisible(false);
            if(e1.viewer!=null){
            e1.viewer.setVisible(false);
            }
            
            //sandu
            fueL1.getobj().setVisible(false);
            stock.getobj().setVisible(false);
            waste.getobj().setVisible(false);
            if (fueL1.getobj().viewer != null) {
            fueL1.getobj().viewer.setVisible(false);
            }
            if (stock.getobj().viewer != null) {
            stock.getobj().viewer.setVisible(false);
            }
            if (waste.getobj().viewer != null) {
            waste.getobj().viewer.setVisible(false);
            }
            
            //wishwa
            S_stock.getobj().setVisible(false);
            Stock_up.getobj().setVisible(false);
            avil.getobj().setVisible(false);
            avil_up.getobj().setVisible(false);
            busrepair.getobj().setVisible(false);
            part_up.getobj().setVisible(false);
            parts.getobj().setVisible(false);
            rep_up.getobj().setVisible(false);
            if (S_stock.getobj().viewer != null) {
            S_stock.getobj().viewer.setVisible(false);
            }
            if (avil.getobj().viewer != null) {
            avil.getobj().viewer.setVisible(false);
            }
            if (busrepair.getobj().viewer != null) {
            busrepair.getobj().viewer.setVisible(false);
            }
            if (parts.getobj().viewer != null) {
            parts.getobj().viewer.setVisible(false);
            }
            
            
              //chamika pathiraja
            button1.getobj().setVisible(false);
            button2.getobj().setVisible(false);
            button3.getobj().setVisible(false);
            button4.getobj().setVisible(false);
            depot_vehicle.getobj().setVisible(false);
            guest.getobj().setVisible(false);
            other_vehicle.getobj().setVisible(false);
            ticket_book.getobj().setVisible(false);
             if (button1.getobj().viewer != null) {
            button1.getobj().viewer.setVisible(false);
            }
              if (button2.getobj().viewer != null) {
            button2.getobj().viewer.setVisible(false);
            }
              if (button3.getobj().viewer != null) {
            button3.getobj().viewer.setVisible(false);
            }
              if (button4.getobj().viewer != null) {
            button4.getobj().viewer.setVisible(false);
            }
            
              //Bimsara
            
               
           OparationSide os = OparationSide.getobj();
           OparationTop ot = OparationTop.getobj();
           OparationMain om = OparationMain.getobj();
           AddNewOparation addNewOparation = AddNewOparation.getobj();
           EditOparation eo = EditOparation.getobj();
           OparationReport opre=OparationReport.getobj();

           
           BusRegistationSide brs = BusRegistationSide.getobj();
           BusRegistationTop brt = BusRegistationTop.getobj();
           BusRegistationMain brm = BusRegistationMain.getobj();
           AddNewBus addNewBus = AddNewBus.getobj();
           EditBus editbus = EditBus.getobj();
           BusReport busreport=BusReport.geobj();

           
           RouteIdSide rs = RouteIdSide.getobj();
           RouteIdTop rt = RouteIdTop.getobj();
           RouteIdMain rm = RouteIdMain.getobj();
           AddNewRouteId ar = AddNewRouteId.getobj();
           EditRoute er = EditRoute.getobj();

           
           os.setVisible(false);
           ot.setVisible(false);
           om.setVisible(false);
           addNewOparation.setVisible(false);
           eo.setVisible(false);
           opre.setVisible(false);

           brs.setVisible(false);
           brt.setVisible(false);
           brm.setVisible(false);
           addNewBus.setVisible(false);
           editbus.setVisible(false);
           busreport.setVisible(false);

           rs.setVisible(false);
           rt.setVisible(false);
           rm.setVisible(false);
           ar.setVisible(false);
           er.setVisible(false);     
           
           //Supun
           
            //emailsetEdit.getobj().setVisible(false);
            Offce_item.getobj().setVisible(false);
            chooce_comp.getobj().setVisible(false);
            com_serch.getobj().setVisible(false);
            company_item.getobj().setVisible(false);
            fuel_order.getobj().setVisible(false);
            item_serch.getobj().setVisible(false);
            show_t.getobj().setVisible(false);
            tender.getobj().setVisible(false);
            tikcet_maching.getobj().setVisible(false);
            Service.getobj().setVisible(false);
            if(SupplierMain.getobj().viewer!=null){
            SupplierMain.getobj().viewer.setVisible(false);
            }
            
            //Isuru
               
            SalariesSide.getobj().setVisible(false);
            Income.getobj().setVisible(false);
            IncomeUp.getobj().setVisible(false);
            RouteReport.getobj().setVisible(false);
            RouteReportUp.getobj().setVisible(false);
            RouteReportSide.getobj().setVisible(false);
            Salaries.getobj().setVisible(false);
            SalariesUp.getobj().setVisible(false);
            
            if (Finance.viewer != null) {
             Finance.viewer.setVisible(false);
             }
        
            
        
        if("HR Clerk".equals(log.logGrade)){
        
            emMain.setVisible(true);
             mainsetpanel.add(emMain, cmain);
            
            }else if("A.M Operarion".equals(log.logGrade)){
                
            DutyOperationMain.getobj().setVisible(true);
             mainsetpanel.add(DutyOperationMain.getobj(), cmain);
                
            } else if("A.M Engineering".equals(log.logGrade)){
                
            FuelRepairMain.getobj().setVisible(true);
             mainsetpanel.add(FuelRepairMain.getobj(), cmain);
                
            } else if("A.M Security".equals(log.logGrade)){
                
            SecurityMain.getobj().setVisible(true);
             mainsetpanel.add(SecurityMain.getobj(), cmain);
                
            } else if("Manager".equals(log.logGrade)){
                
            AdminMain.getobj().setVisible(true);
             mainsetpanel.add(AdminMain.getobj(), cmain);
                
            } else if("Inventory Clerk".equals(log.logGrade)){
                
            SupplierMain.getobj().setVisible(true);
             mainsetpanel.add(SupplierMain.getobj(), cmain);
            }
            else if("A.M Financial".equals(log.logGrade)){
                
            FinancialMain.getobj().setVisible(true);
             mainsetpanel.add(FinancialMain.getobj(), cmain);
                
            }
        
           
            
           
            
    }//GEN-LAST:event_HomeMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        // TODO add your handling code here:
        Login log=Login.getobj();
        log.setVisible(true);
        log.nic.setText("");
        log.password.setText("");
        log.logGrade="";
        log.c1.setVisible(false);
        log.c2.setVisible(false);
        
        //sachin
        DutyOperationMain.getobj().setVisible(false);
        emailsetEdit.getobj().setVisible(false);
        sendingemail.getobj().setVisible(false);
        Duty_list.getobj().setVisible(false);
        Duty_list_up.getobj().setVisible(false);
        Duty_list_side.getobj().setVisible(false);
        Monthly_duty_up.getobj().setVisible(false);
        Monthly_duty_side.getobj().setVisible(false);
        Monthly_duty_side_up.getobj().setVisible(false);
        Daily_duty_main.getobj().setVisible(false);
        Daily_duty_side.getobj().setVisible(false);
        Monthly_duty_edit_main.getobj().setVisible(false);
        Daily_duty_up.getobj().setVisible(false);
        if (Duty_list_side.getobj().viewer != null) {
            Duty_list_side.getobj().viewer.setVisible(false);
        }
        if (Monthly_duty_side.getobj().viewer != null) {
            Monthly_duty_side.getobj().viewer.setVisible(false);
        }
        if (Daily_duty_side.getobj().viewer != null) {
            Daily_duty_side.getobj().viewer.setVisible(false);
        }
        Monthly_duty_main.getobj().setVisible(false);
        DutyOperationMain.getobj().setVisible(false);
        
        //chamika prabath
         Employee e1=new Employee();
        ManageEmployee manageE=ManageEmployee.getobj();
        ManageEmployeeUp manageEup=ManageEmployeeUp.getobj();
        ManageEmployeeSide manageEside=ManageEmployeeSide.getobj();
        EmployeeID empid =EmployeeID.getobj();
        EmployeeMain emMain=EmployeeMain .getobj();
        ManageLeave manageL=ManageLeave.getobj();
        ManageLeaveUp manageLup=ManageLeaveUp.getobj();
        ManageLeaveSide manageLside=ManageLeaveSide.getobj();
        Webcam wc=Webcam.getobj();
        ManageAttendance manageA=ManageAttendance.getobj();
        ManageAttendanceUp manageAup=ManageAttendanceUp.getobj();
        
        
            manageLside.setVisible(false);
            manageE.setVisible(false);
            manageEup.setVisible(false);
            manageEside.setVisible(false);
            manageL.setVisible(false);
            manageLup.setVisible(false);
            wc.setVisible(false);
            empid.setVisible(false);
            manageA.setVisible(false);
            manageAup.setVisible(false);
            EmployeeMain.getobj().setVisible(false);
            if(e1.viewer!=null){
            e1.viewer.setVisible(false);
            }
         
            //sandu
            fueL1.getobj().setVisible(false);
            stock.getobj().setVisible(false);
            waste.getobj().setVisible(false);
            if (fueL1.getobj().viewer != null) {
            fueL1.getobj().viewer.setVisible(false);
            }
            if (stock.getobj().viewer != null) {
            stock.getobj().viewer.setVisible(false);
            }
            if (waste.getobj().viewer != null) {
            waste.getobj().viewer.setVisible(false);
            }
            FuelRepairMain.getobj().setVisible(false);
            
            //wishwa
            S_stock.getobj().setVisible(false);
            Stock_up.getobj().setVisible(false);
            avil.getobj().setVisible(false);
            avil_up.getobj().setVisible(false);
            busrepair.getobj().setVisible(false);
            part_up.getobj().setVisible(false);
            parts.getobj().setVisible(false);
            rep_up.getobj().setVisible(false);
            if (S_stock.getobj().viewer != null) {
            S_stock.getobj().viewer.setVisible(false);
            }
            if (avil.getobj().viewer != null) {
            avil.getobj().viewer.setVisible(false);
            }
            if (busrepair.getobj().viewer != null) {
            busrepair.getobj().viewer.setVisible(false);
            }
            if (parts.getobj().viewer != null) {
            parts.getobj().viewer.setVisible(false);
            }
          
            
            //chamika pathiraja
            button1.getobj().setVisible(false);
            button2.getobj().setVisible(false);
            button3.getobj().setVisible(false);
            button4.getobj().setVisible(false);
            depot_vehicle.getobj().setVisible(false);
            guest.getobj().setVisible(false);
            other_vehicle.getobj().setVisible(false);
            ticket_book.getobj().setVisible(false);
            SecurityMain.getobj().setVisible(false);
            
            //Bimsara
            
               
           OparationSide os = OparationSide.getobj();
           OparationTop ot = OparationTop.getobj();
           OparationMain om = OparationMain.getobj();
           AddNewOparation addNewOparation = AddNewOparation.getobj();
           EditOparation eo = EditOparation.getobj();
           OparationReport opre=OparationReport.getobj();

           
           BusRegistationSide brs = BusRegistationSide.getobj();
           BusRegistationTop brt = BusRegistationTop.getobj();
           BusRegistationMain brm = BusRegistationMain.getobj();
           AddNewBus addNewBus = AddNewBus.getobj();
           EditBus editbus = EditBus.getobj();
           BusReport busreport=BusReport.geobj();

           
           RouteIdSide rs = RouteIdSide.getobj();
           RouteIdTop rt = RouteIdTop.getobj();
           RouteIdMain rm = RouteIdMain.getobj();
           AddNewRouteId ar = AddNewRouteId.getobj();
           EditRoute er = EditRoute.getobj();

           
           os.setVisible(false);
           ot.setVisible(false);
           om.setVisible(false);
           addNewOparation.setVisible(false);
           eo.setVisible(false);
           opre.setVisible(false);

           brs.setVisible(false);
           brt.setVisible(false);
           brm.setVisible(false);
           addNewBus.setVisible(false);
           editbus.setVisible(false);
           busreport.setVisible(false);

           rs.setVisible(false);
           rt.setVisible(false);
           rm.setVisible(false);
           ar.setVisible(false);
           er.setVisible(false);   
           
             //Supun
           
            //emailsetEdit.getobj().setVisible(false);
            Offce_item.getobj().setVisible(false);
            chooce_comp.getobj().setVisible(false);
            com_serch.getobj().setVisible(false);
            company_item.getobj().setVisible(false);
            fuel_order.getobj().setVisible(false);
            item_serch.getobj().setVisible(false);
            show_t.getobj().setVisible(false);
            tender.getobj().setVisible(false);
            tikcet_maching.getobj().setVisible(false);
            Service.getobj().setVisible(false);
            SupplierMain.getobj().setVisible(false);
            if(SupplierMain.getobj().viewer!=null){
            SupplierMain.getobj().viewer.setVisible(false);
            }
            
            //Isuru
            
            FinancialMain finance = FinancialMain.getobj();
   
            SalariesSide.getobj().setVisible(false);
            Income.getobj().setVisible(false);
            IncomeUp.getobj().setVisible(false);
            RouteReport.getobj().setVisible(false);
            RouteReportUp.getobj().setVisible(false);
            RouteReportSide.getobj().setVisible(false);
            Salaries.getobj().setVisible(false);
            SalariesUp.getobj().setVisible(false);
            finance.setVisible(true);
            FinancialMain.getobj().setVisible(false);
            if (Finance.viewer != null) {
             Finance.viewer.setVisible(false);
             }
            
            //Admin Page
            AdminMain.getobj().setVisible(false);
            
    }//GEN-LAST:event_userMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                Thread.sleep(1600);
            } catch (InterruptedException e) {

            }
            temp1 = new Temp();
            temp1.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Home;
    private static javax.swing.JPanel back;
    public javax.swing.JLabel clock123;
    private javax.swing.JTable days;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel mainsetpanel;
    private javax.swing.JLabel mon;
    private static javax.swing.JPanel pnlCalendar;
    public javax.swing.JPanel sidesetpanel;
    public javax.swing.JPanel sidesetpanelup;
    public javax.swing.JPanel upsetpanel;
    private static javax.swing.JLabel user;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
