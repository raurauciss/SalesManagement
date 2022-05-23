/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshopmana;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ChangePassW extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassW
     */
    public ChangePassW() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
    public void reset(){
        currentPassTX.setText(null);
        newPassTX.setText(null);
        confirmPassTX.setText(null);
    }
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
                        ,rs.getString("dateOfBirth"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("phoneNum"),rs.getString("email"));
                data.add(user);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
    public String getPass(){
        ArrayList<DataUser> users = datalist();
        String pass = null;
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
               pass = users.get(i).getPassword();
        }
    }
        return pass;
    }
    public String getID(){
        ArrayList<DataUser> users = datalist();
        String id = null;
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
               id = users.get(i).getId();
        }
    }
        return id;
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
        confirmPassTX = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        currentPassTX = new javax.swing.JPasswordField();
        newPassTX = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateButton = new javax.swing.JLabel();
        reloadButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmPassTX.setBackground(new java.awt.Color(204, 255, 204));
        confirmPassTX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(confirmPassTX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Confirm New Password: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        currentPassTX.setBackground(new java.awt.Color(204, 255, 204));
        currentPassTX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(currentPassTX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, 30));

        newPassTX.setBackground(new java.awt.Color(204, 255, 204));
        newPassTX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(newPassTX, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Current Password: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("New Password: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/kindpng_4059088.png"))); // NOI18N
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 50));

        reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/reload.png"))); // NOI18N
        reloadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadButtonMouseClicked(evt);
            }
        });
        jPanel1.add(reloadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void update(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
            String query = "UPDATE user SET password ='"+newPassTX.getText()
                    + "' where userId ='" +getID()+"'";
            Statement Add = connection.createStatement();
            Add.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Updated successful");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println(e);
        }   
    }
    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
       if(newPassTX.getText().isEmpty() || confirmPassTX.getText().isEmpty() || currentPassTX.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Missing information!");
       }
       else if (!newPassTX.getText().equals(confirmPassTX.getText())){
           JOptionPane.showMessageDialog(this, "Password not match!");
       }
       else if(!currentPassTX.getText().equals(getPass())){
           JOptionPane.showMessageDialog(this, "Wrong current password!");
       }
       else {
           update();
       }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void reloadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadButtonMouseClicked
        // TODO add your handling code here:
       reset();
    }//GEN-LAST:event_reloadButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ChangePassW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassTX;
    private javax.swing.JPasswordField currentPassTX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newPassTX;
    private javax.swing.JLabel reloadButton;
    private javax.swing.JLabel updateButton;
    // End of variables declaration//GEN-END:variables
}