package myshopmana;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.net.IDN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ManagerForm extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public ManagerForm() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        viewprofile1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        categoryBut = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        reportBut = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        salaryBut = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        staffBut = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        productBut = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/sda.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 5, 170, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("ID: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 60, -1));

        logOut.setBackground(new java.awt.Color(0, 0, 0));
        logOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Log out");
        logOut.setToolTipText("");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        jPanel1.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 40));

        viewprofile1.setBackground(new java.awt.Color(0, 0, 0));
        viewprofile1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewprofile1.setForeground(new java.awt.Color(255, 255, 255));
        viewprofile1.setText("View Profile");
        viewprofile1.setToolTipText("");
        viewprofile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewprofile1MouseClicked(evt);
            }
        });
        jPanel1.add(viewprofile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/category.png"))); // NOI18N
        categoryBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoryBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryButMouseClicked(evt);
            }
        });
        jPanel3.add(categoryBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Category");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/report.png"))); // NOI18N
        reportBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportButMouseClicked(evt);
            }
        });
        jPanel4.add(reportBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Report");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salaryBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/salary.png"))); // NOI18N
        salaryBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaryButMouseClicked(evt);
            }
        });
        jPanel5.add(salaryBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Salary");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/staff.png"))); // NOI18N
        staffBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffButMouseClicked(evt);
            }
        });
        jPanel6.add(staffBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Staff");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/product.png"))); // NOI18N
        productBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productButMouseClicked(evt);
            }
        });
        jPanel7.add(productBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel8)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel9)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 630, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<DataUser> datalist(){
        ArrayList<DataUser> data = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
            String query = "SELECT * FROM user";
            java.sql.Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            DataUser user;
            while(rs.next()){
                user = new DataUser(rs.getString("userId"),rs.getString("username"), rs.getString("password"), rs.getString("usertype")
                        ,rs.getString("dateOfBirth"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("phoneNum"),rs.getString("email"),rs.getDouble("basicSalary"));
                data.add(user);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
    public void display(){
        ArrayList<DataUser> users = datalist();
        String s = null;
        try{
            Scanner sc = new Scanner(new File("F:\\PROGRAMMING\\myShopMana\\src\\resource\\user.txt"));
            while(sc.hasNext()){
                s = sc.nextLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        for(int i=0;i<users.size();i++){
            if(s.equals(users.get(i).getUserName())){
                jLabel2.setText("ID: "+users.get(i).getId());
            }
        }
    }
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutActionPerformed

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
          // TODO add your handling code here:
           LoginForm login = new LoginForm();
           login.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_logOutMouseClicked

    private void staffButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffButMouseClicked
        // TODO add your handling code here:
        StaffForm staff = new StaffForm();
        staff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_staffButMouseClicked

    private void productButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productButMouseClicked
        // TODO add your handling code here:
        ProductForm pf = new ProductForm();
        pf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_productButMouseClicked

    private void viewprofile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewprofile1MouseClicked
        // TODO add your handling code here:
        ProfileForm pf = new ProfileForm();
        pf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewprofile1MouseClicked

    private void categoryButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryButMouseClicked
        // TODO add your handling code here:
        CategoryForm cf = new CategoryForm();
        cf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_categoryButMouseClicked

    private void reportButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButMouseClicked
        // TODO add your handling code here:
        Report report = new Report();
        report.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reportButMouseClicked

    private void salaryButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryButMouseClicked
        // TODO add your handling code here:
        SalaryFormy sf = new SalaryFormy();
        sf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salaryButMouseClicked

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
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton logOut;
    private javax.swing.JPanel main;
    private javax.swing.JLabel productBut;
    private javax.swing.JLabel reportBut;
    private javax.swing.JLabel salaryBut;
    private javax.swing.JLabel staffBut;
    private javax.swing.JButton viewprofile1;
    // End of variables declaration//GEN-END:variables
}
