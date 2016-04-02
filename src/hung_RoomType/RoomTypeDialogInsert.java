/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung_RoomType;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JOptionPane;
import projectinterface.CentralInterface;

/**
 *
 * @author Admin
 */
public class RoomTypeDialogInsert extends javax.swing.JDialog {

    /**
     * Creates new form RoomTypeDialog
     */
    private int roomTypeID = -1;
    private String roomTypeName;
    private double roomTypeRate;
    private String roomTypeNote;
    RoomTypeEntity roomTypeEntity;
    RoomTypeDAO roomTypeDAO;
    
    public RoomTypeDialogInsert(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        roomTypeDAO = new RoomTypeDAO();
        
        formDisplayCentral();
    }
    
    private void getTextFromField() {

        this.roomTypeName = txtRoomTypeName.getText();
        this.roomTypeRate = Double.parseDouble(txtRoomTypeRate.getText());
        this.roomTypeNote = txaRoomTypeNote.getText();
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
        jLabel4 = new javax.swing.JLabel();
        txtRoomTypeName = new javax.swing.JTextField();
        txtRoomTypeRate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRoomTypeNote = new javax.swing.JTextArea();
        btnApply = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Room Type");

        jLabel2.setText("Name");

        jLabel3.setText("Rate: ");

        jLabel4.setText("Note");

        txtRoomTypeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomTypeNameActionPerformed(evt);
            }
        });

        txaRoomTypeNote.setColumns(20);
        txaRoomTypeNote.setRows(5);
        jScrollPane1.setViewportView(txaRoomTypeNote);

        btnApply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24/ok24.png"))); // NOI18N
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24/Iconic_26d4(0)_24.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24/cancel24.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        labelID.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnApply)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRoomTypeName)
                                            .addComponent(jScrollPane1)
                                            .addComponent(txtRoomTypeRate)))
                                    .addComponent(jSeparator2))))
                        .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRoomTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRoomTypeRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApply)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoomTypeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomTypeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomTypeNameActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        if(!checkEmptyField()) {
            return;
        }
        getTextFromField();
        RoomTypeEntity roomTypeToAdd = new RoomTypeEntity(roomTypeID, roomTypeName, roomTypeRate, roomTypeNote);
        roomTypeDAO.insert(roomTypeToAdd);
        this.setVisible(false);

    }//GEN-LAST:event_btnApplyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtRoomTypeName.setText("");
        txtRoomTypeRate.setText("");
        txaRoomTypeNote.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RoomTypeDialogInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomTypeDialogInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomTypeDialogInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomTypeDialogInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RoomTypeDialogInsert dialog = new RoomTypeDialogInsert(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelID;
    private javax.swing.JTextArea txaRoomTypeNote;
    private javax.swing.JTextField txtRoomTypeName;
    private javax.swing.JTextField txtRoomTypeRate;
    // End of variables declaration//GEN-END:variables

    public void formDisplayCentral() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        //setSize(screenSize.width,screenSize.height);
        if(this.getSize().width!= screenSize.width && this.getSize().height!=screenSize.height)
        setLocation((screenSize.width-w)/2, (screenSize.height-h)/2);
    }
    private boolean isNameExisted(String roomName) {
        roomTypeDAO = new RoomTypeDAO();
        Vector<RoomTypeEntity> vectorRoomType = roomTypeDAO.getRoomTypeCollection();
        for(RoomTypeEntity entity : vectorRoomType) {
            if(entity.getRoomTypeName().equals(roomName) ) {
                return true;
            }
        }
       return false; 
    }
    
    private boolean isNumber(String str) {
        String regex;
        regex = "^[-+]?[0-9]*.?[0-9]+$";
        return str.matches(regex);
    }
 
    public boolean checkEmptyField() {
        
        if(txtRoomTypeName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name can not be blank");
            txtRoomTypeName.grabFocus();
            return false;
        }
        if(isNameExisted(txtRoomTypeName.getText())) {
            JOptionPane.showMessageDialog(this, "This room type name exited");
            txtRoomTypeName.grabFocus();
            return false;
        }
        if(txtRoomTypeRate.getText().isEmpty()  ) {
            JOptionPane.showMessageDialog(this, "Rate can not be blank ");
            txtRoomTypeRate.grabFocus();
            return false;
        }
        if( isNumber(txtRoomTypeRate.getText()) == false ) {
            JOptionPane.showMessageDialog(this, "Rate can only be number");
            txtRoomTypeRate.grabFocus();
            return false;
        }
        if(txaRoomTypeNote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Note can not be blank");
            txaRoomTypeNote.grabFocus();
            return false;
        }
        return true;
    }

    public void showData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
