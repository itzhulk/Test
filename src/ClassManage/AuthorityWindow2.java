/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManage;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Muiz
 */
public class AuthorityWindow2 extends javax.swing.JFrame {

    private String userName;
    private String companyID;
    private String Busname;
    private String busID;
    private String assistantID;
    private String driverID;
    
    Date date = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
    DateFormat dateFormat2 = new SimpleDateFormat("hh:mm:ss");  
    String strDate = dateFormat.format(date);
    String strtime = dateFormat2.format(date);

    private String time;
    private Connection con;

    
  
    public AuthorityWindow2(String name,String bname, String cid) {
        this.userName = name;
        this.Busname =  bname;
        this.companyID = cid;
        
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/photo/bus-icon-17.png")));
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
        jLabel4 = new javax.swing.JLabel();
        username_txt = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NewDriver_btn = new javax.swing.JButton();
        NewBus_btn = new javax.swing.JButton();
        NewAss_btn = new javax.swing.JButton();
        DriverEdit_btn = new javax.swing.JButton();
        DriverDelete_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        driverIDText = new javax.swing.JTextField();
        assistantIDText = new javax.swing.JTextField();
        AssEdit_btn = new javax.swing.JButton();
        AssDelete_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        busIDText = new javax.swing.JTextField();
        BusEdit_btn = new javax.swing.JButton();
        BusDelete_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Buses");

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 0, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/bus-icon-26.png"))); // NOI18N
        jLabel4.setOpaque(true);

        username_txt.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        username_txt.setForeground(new java.awt.Color(204, 0, 0));
        username_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_txt.setText(Busname);

        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date: " + strDate);

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Login time: "+strtime);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_btn)
                .addContainerGap())
        );

        NewDriver_btn.setText(" New Driver");
        NewDriver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDriver_btnActionPerformed(evt);
            }
        });

        NewBus_btn.setText("New Bus");
        NewBus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBus_btnActionPerformed(evt);
            }
        });

        NewAss_btn.setText(" New Assistant");
        NewAss_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAss_btnActionPerformed(evt);
            }
        });

        DriverEdit_btn.setText("Edit ");
        DriverEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverEdit_btnActionPerformed(evt);
            }
        });

        DriverDelete_btn.setText("Delete");
        DriverDelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverDelete_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Driver's ID: ");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter Driver/Assistant ID number to delete/Edit ");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Assistant's ID: ");

        AssEdit_btn.setText("Edit ");
        AssEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssEdit_btnActionPerformed(evt);
            }
        });

        AssDelete_btn.setText("Delete");
        AssDelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssDelete_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bus's ID: ");

        BusEdit_btn.setText("Edit ");
        BusEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusEdit_btnActionPerformed(evt);
            }
        });

        BusDelete_btn.setText("Delete");
        BusDelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusDelete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NewAss_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewDriver_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewBus_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(driverIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(assistantIDText)
                            .addComponent(busIDText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DriverEdit_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DriverDelete_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AssEdit_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AssDelete_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BusEdit_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BusDelete_btn)))
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDriver_btn)
                    .addComponent(DriverEdit_btn)
                    .addComponent(DriverDelete_btn)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driverIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewAss_btn)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewBus_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AssEdit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(assistantIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AssDelete_btn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BusDelete_btn)
                            .addComponent(BusEdit_btn)
                            .addComponent(busIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(197, 197, 197))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        super.dispose();
        LoginWindow2 lw = new LoginWindow2();
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_logout_btnActionPerformed

    private void NewDriver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDriver_btnActionPerformed
        super.dispose();
        DriverEntry2 lw = new DriverEntry2(userName, Busname, companyID);
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_NewDriver_btnActionPerformed

    private void NewAss_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAss_btnActionPerformed
        super.dispose();
        AssistantEntry2 lw = new AssistantEntry2(userName, Busname, companyID);
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_NewAss_btnActionPerformed

    private void NewBus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBus_btnActionPerformed
        super.dispose();
        BusEntry2 lw = new BusEntry2(userName, Busname, companyID);
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_NewBus_btnActionPerformed

    private void DriverEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverEdit_btnActionPerformed
        driverID = driverIDText.getText();
        super.dispose();
        DriverEdit lw = new DriverEdit(userName, Busname, companyID, driverID);
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_DriverEdit_btnActionPerformed

    private void DriverDelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverDelete_btnActionPerformed
        String url = "jdbc:mysql://localhost/citybusmgnt";
			String userName = "root";
			String pass = "";
			String empID;
			
			driverID = driverIDText.getText();
			//System.out.println(driverID);
			
			String query ;
			String query1 = "select employee_id from driver where id = " + driverID;
			String query2;
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url,userName,pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query1); //retrive driver id
				rs.next();
				empID = rs.getString(1);
				
				//System.out.println(empID);
				query = "delete from employee where id = " + empID; //delete employee from employee table
				st.executeUpdate(query);
								
				query2 = "delete from driver where employee_id = " + empID; // delete from driver
				st.executeUpdate(query2);
				
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
    }//GEN-LAST:event_DriverDelete_btnActionPerformed

    private void BusDelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusDelete_btnActionPerformed
                        String url = "jdbc:mysql://localhost/citybusmgnt";
			String userName = "root";
			String pass = "";
			
			busID = busIDText.getText();
			
			String query = "delete from bus where id = " + busID;
			
			System.out.println(busID);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url,userName,pass);
				Statement st = con.createStatement();
				st.executeUpdate(query);
				
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
    }//GEN-LAST:event_BusDelete_btnActionPerformed

    private void AssDelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssDelete_btnActionPerformed
                        String url = "jdbc:mysql://localhost/citybusmgnt";
			String userName = "root";
			String pass = "";
			String empID;
			
			assistantID = assistantIDText.getText();
			//System.out.println(driverID);
			
			String query ;
			String query1 = "select employee_id from assistant where id = " + assistantID;
			String query2;
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url,userName,pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query1); //retrive driver id
				rs.next();
				empID = rs.getString(1);
				
				query = "delete from employee where id = " + empID; //delete employee from employee table
				st.executeUpdate(query);
								
				query2 = "delete from assistant where employee_id = " + empID; // delete from driver
				st.executeUpdate(query2);
				
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
    }//GEN-LAST:event_AssDelete_btnActionPerformed

    private void BusEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusEdit_btnActionPerformed
        busID = busIDText.getText();
        super.dispose();
        BusEdit lw = new BusEdit(userName, Busname, companyID, busID);
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_BusEdit_btnActionPerformed

    private void AssEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssEdit_btnActionPerformed
        assistantID = assistantIDText.getText();
        super.dispose();
        AssistantEdit lw = new AssistantEdit(userName, Busname, companyID, assistantID);
        lw.setLocationRelativeTo(null);
        lw.setVisible(true);
    }//GEN-LAST:event_AssEdit_btnActionPerformed

    
    public void getConnection() //with data processing
	{
		
	}
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
                java.util.logging.Logger.getLogger(AuthorityWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(AuthorityWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(AuthorityWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(AuthorityWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            //</editor-fold>

            /* Create and display the form */


            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    //new srcDesDecide2("aa","").setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssDelete_btn;
    private javax.swing.JButton AssEdit_btn;
    private javax.swing.JButton BusDelete_btn;
    private javax.swing.JButton BusEdit_btn;
    private javax.swing.JButton DriverDelete_btn;
    private javax.swing.JButton DriverEdit_btn;
    private javax.swing.JButton NewAss_btn;
    private javax.swing.JButton NewBus_btn;
    private javax.swing.JButton NewDriver_btn;
    private javax.swing.JTextField assistantIDText;
    private javax.swing.JTextField busIDText;
    private javax.swing.JTextField driverIDText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JLabel username_txt;
    // End of variables declaration//GEN-END:variables
}
