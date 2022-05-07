/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshopmana;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Admin
 */
public class ProductForm extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public ProductForm() {
        initComponents();
//        show_product();
        reloadTable();
    }
    public void reset(){
        productNameTx.setText(null);
        priceTx.setText(null);
        unitTx.setText(null);
        quantityTx.setText(null);
        idTx.setText(null);
        CategoryTx.setSelectedIndex(0);
    }
    public void reloadTable(){
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("Select* from products");
        productTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void addRowToTable(Object[] rowData){
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.addRow(rowData);
    }
    public ArrayList<Product> datalist(){
        ArrayList<Product> data = new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
            String query = "SELECT * FROM products";
            java.sql.Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            Product sData;
            while(rs.next()){
                sData = new Product(rs.getString("productID"),rs.getString("productName"), rs.getString("productUnit"), rs.getString("productCategory")
                        ,rs.getInt("productPrice"),rs.getInt("productQuantity"));
                data.add(sData);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
    public void show_product(){
        ArrayList<Product> products = datalist();
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        Object[] row = new Object[6];
        for(int i= 0;i<products.size();i++){
            row[0] = products.get(i).getProductID();
            row[1] = products.get(i).getProductName();
            row[2] = products.get(i).getProductCategory();
            row[3] = products.get(i).getProductUnit();
            row[5] = products.get(i).getPrice();
            row[4] = products.get(i).getQuantity();
            model.addRow(row);
        }
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
        jPanel2 = new javax.swing.JPanel();
        unitTx = new javax.swing.JTextField();
        CategoryTx = new javax.swing.JComboBox<>();
        productNameTx = new javax.swing.JTextField();
        quantityTx = new javax.swing.JTextField();
        idTx = new javax.swing.JTextField();
        priceTx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        updateButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        addButton = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        reloadButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unitTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unitTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitTxActionPerformed(evt);
            }
        });
        jPanel2.add(unitTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 180, 30));

        CategoryTx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CategoryTx.setForeground(new java.awt.Color(24, 24, 24));
        CategoryTx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Fruits", "Fish & Shellfish", "Bread & Bakery", "Personal Care", "Vegetables", "Canned goods", "Frozen Foods", "Meat", "Sauce & Oils", "Snacks", "Beverages", "Rice", "Household", "Others" }));
        jPanel2.add(CategoryTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        productNameTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productNameTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTxActionPerformed(evt);
            }
        });
        jPanel2.add(productNameTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, 30));

        quantityTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quantityTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxActionPerformed(evt);
            }
        });
        jPanel2.add(quantityTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 30));

        idTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxActionPerformed(evt);
            }
        });
        jPanel2.add(idTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 180, 30));

        priceTx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        priceTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxActionPerformed(evt);
            }
        });
        jPanel2.add(priceTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Product Unit:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Product quantity:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Product ID: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Product name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Category:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Price:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 760, 230));

        jPanel5.setBackground(new java.awt.Color(224, 224, 242));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/kindpng_4059088.png"))); // NOI18N
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        jPanel5.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 70, 50));

        jPanel6.setBackground(new java.awt.Color(224, 224, 242));

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/deleteIcon.png"))); // NOI18N
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(deleteButton)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 70, 60));

        jPanel7.setBackground(new java.awt.Color(224, 224, 242));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/AddIcon.png"))); // NOI18N
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel7.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 70, 50));

        jPanel8.setBackground(new java.awt.Color(224, 224, 242));

        reloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images/reload.png"))); // NOI18N
        reloadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reloadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reloadButton))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 60, 50));

        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setText("<Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "productID", "productName", "productCategory", "productUnit", "productQuantity", "productPrice"
            }
        ));
        productTable.setGridColor(new java.awt.Color(51, 51, 51));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 760, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
            String query = "UPDATE products SET productName='"+productNameTx.getText()+"'"
                    + ",productUnit='"+unitTx.getText()+"',productPrice="+priceTx.getText()+",productQuantity="
                    + quantityTx.getText()+",productCategory='"+CategoryTx.getSelectedItem().toString()+"'where productID ='"
                    +idTx.getText()+"'";
            Statement Add = connection.createStatement();
            Add.executeUpdate(query);
            reloadTable();
            JOptionPane.showMessageDialog(this, "Updated successful");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)productTable.getModel();
        int row = productTable.getSelectedRow();
        String cell = productTable.getModel().getValueAt(row, 0).toString();
        String query = "DELETE FROM products where productID = ?";
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, cell);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
            defaultTableModel.removeRow(row); 
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void unitTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitTxActionPerformed

    private void productNameTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTxActionPerformed

    private void quantityTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxActionPerformed

    private void idTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxActionPerformed

    private void priceTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesmanager","root","");
            String query = "insert into products(productID,productName,productUnit,productPrice,productQuantity,productCategory)values(?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, idTx.getText());
            pst.setString(2, productNameTx.getText());
            pst.setString(3, unitTx.getText());
            pst.setString(6, String.valueOf(CategoryTx.getSelectedItem()));
            pst.setString(4,priceTx.getText());
            pst.setString(5, quantityTx.getText());
            int executeUpdate = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add successfully");
            addRowToTable(new Object[]{
                idTx.getText(),
                productNameTx.getText(),
                unitTx.getText(),
                priceTx.getText(),
                quantityTx.getText(),
                CategoryTx.getSelectedItem(),
            });
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addButtonMouseClicked

    private void reloadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadButtonMouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_reloadButtonMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel) productTable.getModel();
        int row = productTable.getSelectedRow();
        idTx.setText(model.getValueAt(row, 0).toString());
        productNameTx.setText(model.getValueAt(row, 1).toString());
        CategoryTx.setSelectedItem(model.getValueAt(row, 2));
        unitTx.setText(model.getValueAt(row, 3).toString());
        quantityTx.setText(model.getValueAt(row, 4).toString());
        priceTx.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_productTableMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        ManagerForm managerForm = new ManagerForm();
        managerForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryTx;
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel deleteButton;
    private javax.swing.JTextField idTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField priceTx;
    private javax.swing.JTextField productNameTx;
    private static javax.swing.JTable productTable;
    private javax.swing.JTextField quantityTx;
    private javax.swing.JLabel reloadButton;
    private javax.swing.JTextField unitTx;
    private javax.swing.JLabel updateButton;
    // End of variables declaration//GEN-END:variables
}