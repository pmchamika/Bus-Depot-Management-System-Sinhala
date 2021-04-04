/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

import SLTB_sachin.panel.emailsetEdit;
import com.mysql.jdbc.Connection;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sachin kumara
 */
public class EmailController {

    private int num = 0;
    private ResultSet re = null;
    private PreparedStatement pst = null;
    private Connection con = com.ConnectionMysql.MysqlConnect.getDbCon();
    private SqlQueryCreater sql = new SqlQueryCreater();
    private String host = null;
    private String user = null;
    private String pass = null;

    private String from = null;

    private String port = null;

    private Transport tra = null;

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getPort() {
        return port;
    }

    public void fill() {
        try {
            pst = con.prepareStatement(sql.CreateSelect("email_se", null, null));
            re = pst.executeQuery();
            if (re.next()) {
                host = re.getString("host");
                user = re.getString("user");
                from = user;
                pass = re.getString("password");
                port = re.getString("port");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sentemail(String to[], String sub, String masage, String filepath, String filename) {
        System.out.println("filling");
        fill();
        System.out.println("sending email");
        try {

            String email = masage;
            boolean se = false;
            System.out.println("sending email 1");
            Properties pro = System.getProperties();

            pro.put("mail.smtp.starttls.enable", "true");
            pro.put("mail.smtp.host", host);
            pro.put("mail.smtp.port", port);
            pro.put("mail.smtp.auth", "true");
            pro.put("mail.smtp.starttls.required", "true");

            System.out.println("sending email 2");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            System.out.println("sending email 3");

            Session mailse = Session.getDefaultInstance(pro, null);
            mailse.setDebug(se);

            System.out.println("sending email 4");
            Message msg = new MimeMessage(mailse);
            msg.setFrom(new InternetAddress(from));
            InternetAddress add[] = new InternetAddress[to.length];
            for (int p = 0; p < to.length; p++) {
                add[p] = new InternetAddress(to[p]);
            }
            //InternetAddress add[] = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, add);
            msg.setSubject(sub);
            msg.setSentDate(new Date());
            msg.setText(email);

            System.out.println("sending email 5");

            MimeBodyPart messageBodyPart = new MimeBodyPart();

            Multipart multipart = new MimeMultipart();

            messageBodyPart = new MimeBodyPart();
            String file = filepath;
            String fileName = filename;
            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);

            msg.setContent(multipart);
            // if(tra==null){
            System.out.println("sending email 6");
            Transport tra = mailse.getTransport("smtp");
            System.out.println("sending email 7");

            tra.connect(host, user, pass);
            //}

            System.out.println("sending email 8");
            tra.sendMessage(msg, msg.getAllRecipients());

            System.out.println("sending email 9");
            tra.close();
            num++;
            System.out.println(num + " massage send");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void edit(String ho, String un, String pass, String port) {
        try {
            pst = con.prepareStatement("update email_se set host=?,user=?,password=?,port=?");
            pst.setString(1, ho);
            pst.setString(2, un);
            pst.setString(3, pass);
            pst.setString(4, port);
            pst.executeUpdate();
            JLabel label = new JLabel("fjkia lsÍu id¾:lhs");
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(emailsetEdit.getobj(), label, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {

            e.printStackTrace();
            JLabel label = new JLabel("fjkia lsÍu wid¾:lhs");
            JLabel label2 = new JLabel(e.toString());
            label.setFont(new Font("FMBindumathi", Font.BOLD, 18));
            JOptionPane.showMessageDialog(emailsetEdit.getobj(), label + " " + label2, "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        }

        emailsetEdit.getobj().setnew();
    }
}
