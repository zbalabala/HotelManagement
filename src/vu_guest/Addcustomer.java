/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu_guest;


import com.toedter.calendar.JDateChooser;
import connection.DbConnect;
import hotelmanagement.Main_menu;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import vu_guest.CustomerEnity;



import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import projectinterface.CentralInterface;
import projectinterface.DAOConnection;

/**
 *
 * @author KeVin
 */
public class Addcustomer extends javax.swing.JDialog implements CentralInterface{

    /**
     * Creates new form Addcustomer
     */
        CustomerEnity cusenity;
        CustomerDao cusDao;
        DefaultComboBoxModel cmModel;
        String fullname,gen,address,company,phone,email,status,identifier;
        Date dob;
        int pphone,iidentifier;
        String cusid; int id;
        public Addcustomer(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
            setTitle("Add Customer");
            cmModel = new DefaultComboBoxModel(new Object[] {"New","Old"});
            cmStatus.setModel(cmModel);
            formDisplayCentral();
            txtID.setEnabled(false);
            
            
//            showData();
            
            
        }

        public void showupdate(Object obj,boolean update){
            
            if(!update) btnAddPay.setEnabled(false);
            CustomerEnity cusObj = (CustomerEnity) obj;
            if(cusObj !=null){
                id = cusObj.getCusID();
                txtID.setText(String.valueOf(id));
                tname.setText(cusObj.getFullname());
                tidentifier.setText(cusObj.getIdentifier());
                tage.setDate(cusObj.getAge());
                taAdrress.setText(cusObj.getAddress());
                cmStatus.setSelectedItem(cusObj.getStatus());
                tphone.setText(cusObj.getPhone());
                temail1.setText(cusObj.getEmail());
                tcompany.setText(cusObj.getCompany());
                if(cusObj.getGender().equalsIgnoreCase("M")){
                    tmale.setSelected(true);
                }else{
                    tfemale.setSelected(true);
                }
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        tphone = new javax.swing.JTextField();
        tage = new com.toedter.calendar.JDateChooser();
        taddress = new javax.swing.JScrollPane();
        taAdrress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tidentifier = new javax.swing.JTextField();
        tmale = new javax.swing.JRadioButton();
        tfemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tcompany = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmStatus = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnAddPay = new javax.swing.JButton();
        bup = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        temail1 = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Full Name *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Date Of Birth *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Phone *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel6, gridBagConstraints);

        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(tname, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(tphone, gridBagConstraints);

        tage.setAlignmentX(0.0F);
        tage.setAlignmentY(0.0F);
        tage.setAutoscrolls(true);
        tage.setDateFormatString("yyyy.MMMMM.dd");
        tage.setDoubleBuffered(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(tage, gridBagConstraints);

        taAdrress.setColumns(20);
        taAdrress.setRows(5);
        taddress.setViewportView(taAdrress);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(taddress, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Person Indentifier *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(tidentifier, gridBagConstraints);

        buttonGroup1.add(tmale);
        tmale.setText("Male");
        tmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmaleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 0);
        jPanel3.add(tmale, gridBagConstraints);

        buttonGroup1.add(tfemale);
        tfemale.setText("Female");
        tfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemaleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(tfemale, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(tcompany, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel9, gridBagConstraints);

        cmStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(cmStatus, gridBagConstraints);

        btnAddPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24/add24.png"))); // NOI18N
        btnAddPay.setText("Add");
        btnAddPay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddPay.setMaximumSize(new java.awt.Dimension(93, 33));
        btnAddPay.setMinimumSize(new java.awt.Dimension(93, 33));
        btnAddPay.setPreferredSize(new java.awt.Dimension(93, 33));
        btnAddPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPayActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddPay);

        bup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24/edit.png"))); // NOI18N
        bup.setText("Edit");
        bup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bup.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bup.setMaximumSize(new java.awt.Dimension(93, 33));
        bup.setMinimumSize(new java.awt.Dimension(93, 33));
        bup.setPreferredSize(new java.awt.Dimension(93, 33));
        bup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupActionPerformed(evt);
            }
        });
        jPanel1.add(bup);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24/cancel24.png"))); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        jPanel3.add(jPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(temail1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(txtID, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("CustomerID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 31, 9, 31);
        jPanel3.add(jLabel10, gridBagConstraints);

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void btnAddPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPayActionPerformed
        //identifier,fullname,gender,company,address,phone,email,status;
        fullname = tname.getText();
        identifier= tidentifier.getText();
        dob=new java.util.Date();
        java.sql.Date age = new java.sql.Date(dob.getTime());
        gen = (tmale.isSelected())?"M": "F";
        address = taAdrress.getText();
        company = tcompany.getText();
        phone = tphone.getText();
        email = txtID.getText();
        status = cmStatus.getSelectedItem().toString();
        if(!checkEmptyField())return;
        //Date age = tage.getDateFormatString();
        
        cusenity = new CustomerEnity(identifier, fullname, gen, company, address, phone, email, status, age);
        cusDao = new CustomerDao();
        cusDao.insert((Object) cusenity);
        JOptionPane.showMessageDialog(this,"Add succesfully");
        setVisible(false);
    }//GEN-LAST:event_btnAddPayActionPerformed

    private void tmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmaleActionPerformed
        
    }//GEN-LAST:event_tmaleActionPerformed

    private void tfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemaleActionPerformed
        
    }//GEN-LAST:event_tfemaleActionPerformed

    private void bupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupActionPerformed
        fullname = tname.getText();
        identifier= tidentifier.getText();
        cusid=txtID.getText();
        dob=new java.util.Date();
        java.sql.Date age = new java.sql.Date(dob.getTime());
        gen = (tmale.isSelected())?"M": "F";
        address = taAdrress.getText();
        company = tcompany.getText();
        phone = tphone.getText();
        email = temail1.getText();
        status = cmStatus.getSelectedItem().toString();
        if(!checkEmptyField())return;
        //Date age = tage.getDateFormatString();
        
        cusenity = new CustomerEnity(identifier, fullname, gen, company, address, phone, email, status, age,Integer.parseInt(cusid));
        cusDao = new CustomerDao();
        cusDao.update((Object) cusenity);
        JOptionPane.showMessageDialog(this,"Update successfull");
        
        setVisible(false);
    }//GEN-LAST:event_bupActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
    
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Addcustomer dialog = new Addcustomer(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddPay;
    private javax.swing.JButton bup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmStatus;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea taAdrress;
    private javax.swing.JScrollPane taddress;
    private com.toedter.calendar.JDateChooser tage;
    private javax.swing.JTextField tcompany;
    private javax.swing.JTextField temail1;
    private javax.swing.JRadioButton tfemale;
    private javax.swing.JTextField tidentifier;
    private javax.swing.JRadioButton tmale;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tphone;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formDisplayCentral() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        //setSize(screenSize.width,screenSize.height);
        if(this.getSize().width!= screenSize.width && this.getSize().height!=screenSize.height)
        setLocation((screenSize.width-w)/2, (screenSize.height-h)/2);
    }
    
    

    @Override
    public void showData() {
        
    }

    @Override
    public boolean checkEmptyField() {
        if(fullname.isEmpty()){
            JOptionPane.showMessageDialog(this, "Name cannot blank");
            tname.grabFocus();
            return false;
                    
        }
        
        if(tage.getDate()==null)
        {
            JOptionPane.showMessageDialog(this, "Date of Birth must select");
            
            return false;
        }
        if(identifier.isEmpty()){
            JOptionPane.showMessageDialog(this, "Identifier cannot blank");
            tidentifier.grabFocus();
            return false;
        }
        if(identifier.length()>10){
            JOptionPane.showMessageDialog(this, "Person Identifier must < 10 number");
            tidentifier.setText("");
            tidentifier.grabFocus();
            return false;
        }
        try {
                iidentifier=Integer.parseInt(identifier);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Person Identifier is must number");
                tidentifier.setText("");
                tidentifier.grabFocus();
                return false;
            }
        
        
        if(phone.isEmpty()){
            JOptionPane.showMessageDialog(this, "Phone cannot blank");
            tphone.grabFocus();
            return false;
        }
        if(phone.length()>10){
            JOptionPane.showMessageDialog(this, "Phone must < 10 digit");
            tphone.setText("");
            tphone.grabFocus();
            return false;
        }
        try {
                pphone=Integer.parseInt(phone);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Phone is must digit");
                tphone.setText("");
                tphone.grabFocus();
                return false;
            }
        if(!tmale.isSelected()&&!tfemale.isSelected()){
            JOptionPane.showMessageDialog(this, "Gender must select");
            return false;
        }
        
        return true;
    }

    


}
