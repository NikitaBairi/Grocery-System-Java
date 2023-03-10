/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nikita Bairi
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        
    }
Connection con=null;
    Statement St=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
  
   
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pID = new javax.swing.JTextField();
        PName = new javax.swing.JTextField();
        adbtn = new javax.swing.JButton();
        edbutn = new javax.swing.JButton();
        debtn = new javax.swing.JButton();
        cbtn = new javax.swing.JButton();
        clbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProTBL = new javax.swing.JTable();
        cmBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Category");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Add Products");

        pID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIDActionPerformed(evt);
            }
        });

        adbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adbtn.setText("Add");
        adbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbtnActionPerformed(evt);
            }
        });

        edbutn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        edbutn.setText("Update");
        edbutn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edbutnActionPerformed(evt);
            }
        });

        debtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        debtn.setText("Delete");
        debtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtnActionPerformed(evt);
            }
        });

        cbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbtn.setText("Clear");
        cbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnActionPerformed(evt);
            }
        });

        clbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clbtn.setText("Close");
        clbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Products List");

        ProTBL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ProTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category"
            }
        ));
        ProTBL.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProTBL);

        cmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staples", "Beverages", "packed food", "personal care", "household care", "Dairy" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(adbtn)
                                                        .addGap(28, 28, 28)
                                                        .addComponent(edbutn)
                                                        .addGap(32, 32, 32)
                                                        .addComponent(debtn)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cbtn))
                                                    .addComponent(jLabel7)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pID, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(PName))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(clbtn))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adbtn)
                    .addComponent(edbutn)
                    .addComponent(debtn)
                    .addComponent(cbtn))
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIDActionPerformed

    private void adbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbtnActionPerformed
      try{
          String sql="INSERT INTO `products`(`ID`, `Name`, `category`) VALUES (?,?,?);";
          con=DriverManager.getConnection("jdbc:mysql://localhost/grocery", "root", "");
         
          pst=con.prepareStatement(sql);
          pst.setString(1,pID.getText());
          pst.setString(2,PName.getText());
          pst.setString(3, (String) cmBox.getSelectedItem());
          pst.executeUpdate();
                if(pID.getText().equals("")||PName.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Please Enter All the Data!");
        
    }
    else{
        
       String data[]={pID.getText(),PName.getText(),cmBox.getSelectedItem().toString()};
        DefaultTableModel tblModel=(DefaultTableModel)ProTBL.getModel();
        tblModel.addRow(data); 
        pID.setText("");
        PName.setText("");
        cmBox.getSelectedItem();
       
    }     
          
          try{
               
                JOptionPane.showMessageDialog(null, " Category Added Succesfully");   
            }
            catch (HeadlessException ex){
                JOptionPane.showMessageDialog(null, "failed to add  Category"+ ex);
            }
            }
            catch (HeadlessException | SQLException e1){
                System.out.println("Error" );
            JOptionPane.showMessageDialog(null, e1.getMessage());
        
            }
    }//GEN-LAST:event_adbtnActionPerformed

    private void edbutnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edbutnActionPerformed
        // TODO add your handling code he
        int i =ProTBL.getSelectedRow();
        DefaultTableModel tblModel=(DefaultTableModel)ProTBL.getModel();
        
        if(i>=0)
        {
            tblModel.setValueAt(pID.getText(), i, 0);
            tblModel.setValueAt(PName.getText(), i, 1);
            tblModel.setValueAt(cmBox.getSelectedItem(), i, 2);
        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }
       
       
      
    }//GEN-LAST:event_edbutnActionPerformed

    private void debtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtnActionPerformed
        // TODO add your handling code here:
         try{
          String sql="delete from products where ID=?";
          con=DriverManager.getConnection("jdbc:mysql://localhost/grocery", "root", "");
          
          pst=con.prepareStatement(sql);
          pst.setString(1,pID.getText());
          pst.setString(2,PName.getText());
          pst.setString(3, (String) cmBox.getSelectedItem());
          pst.executeUpdate();
            
        }
         catch(Exception e){
             
         }
         DefaultTableModel tblModel=(DefaultTableModel)ProTBL.getModel();
        if (ProTBL.getSelectedRowCount()==1){
            tblModel.removeRow(ProTBL.getSelectedRow());
        }else{
            if(ProTBL.getSelectedRowCount()==0){
                 JOptionPane.showMessageDialog(this, "Table is Empty");
            }
         else{
                 JOptionPane.showMessageDialog(this, "Please Select Row for Delete..");
            }
            
        }
    
    }//GEN-LAST:event_debtnActionPerformed

    private void cbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnActionPerformed
        // TODO add your handling code here:
        pID.setText("");
        PName.setText(""); 
        cmBox.getSelectedItem().toString();
        
    }//GEN-LAST:event_cbtnActionPerformed

    private void clbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clbtnActionPerformed
        // TODO add your handling code here:
         new Home().setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_clbtnActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void ProTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProTBLMouseClicked
        // TODO add your handling code here:
        int selectedRow =ProTBL.getSelectedRow();
          DefaultTableModel tblModel=(DefaultTableModel)ProTBL.getModel();
        
        
        String tblID=tblModel.getValueAt(ProTBL.getSelectedRow(),0).toString();
        String tblName=tblModel.getValueAt(ProTBL.getSelectedRow(),1).toString();
        String tblCategory=tblModel.getValueAt(ProTBL.getSelectedRow(),2).toString();
        
               
        
        pID.setText(tblID);
        PName.setText(tblName);
        cmBox.getSelectedItem();
        
        
        
    }//GEN-LAST:event_ProTBLMouseClicked
      

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PName;
    private javax.swing.JTable ProTBL;
    private javax.swing.JButton adbtn;
    private javax.swing.JButton cbtn;
    private javax.swing.JButton clbtn;
    private javax.swing.JComboBox<String> cmBox;
    private javax.swing.JButton debtn;
    private javax.swing.JButton edbutn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pID;
    // End of variables declaration//GEN-END:variables
}
