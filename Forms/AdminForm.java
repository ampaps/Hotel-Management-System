package Forms;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author paps
 */
public class AdminForm extends javax.swing.JFrame {

    private void centerFrame(JFrame fr) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = fr.getSize().width;
        int h = fr.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        fr.setLocation(x, y);
    }

    /**
     * Creates new form AdminForm
     */
    public AdminForm() {
        initComponents();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Reseption reseption = new Reseption();
                reseption.setVisible(true);
                centerFrame(reseption);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        this.setTitle("ADMIN PANEL");
        String photoPath = "Images/adminFormPhoto.jpg";
        adminFormMainPanel = new ContentPanel(photoPath);
        addRoomButton = new javax.swing.JButton();
        removeRoomButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addRoomButton.setText("Add Room");
        addRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomButtonActionPerformed(evt);
            }
        });

        removeRoomButton.setText("Remove Room");
        removeRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRoomButtonActionPerformed(evt);
            }
        });

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PANEL");

        javax.swing.GroupLayout adminFormMainPanelLayout = new javax.swing.GroupLayout(adminFormMainPanel);
        adminFormMainPanel.setLayout(adminFormMainPanelLayout);
        adminFormMainPanelLayout.setHorizontalGroup(
                adminFormMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminFormMainPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(adminFormMainPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminFormMainPanelLayout.createSequentialGroup()
                                                .addComponent(addRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(adminFormMainPanelLayout.createSequentialGroup()
                                                .addComponent(removeRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(adminFormMainPanelLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(49, Short.MAX_VALUE)));
        adminFormMainPanelLayout.setVerticalGroup(
                adminFormMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminFormMainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(adminFormMainPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(adminFormMainPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adminFormMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adminFormMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // AddRoomFrom addRoomFrom = new AddRoomFrom();
    }

    private void removeRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // RemvoeRoomForm removeRoomForm = new RemvoeRoomForm();
    }

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // RemoveUserForm removeUserForm = new removeUserForm();
    }

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        AddUserForm addUserForm = new AddUserForm();
        addUserForm.setVisible(true);
        centerFrame(addUserForm);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminForm adminForm = new AdminForm();
                adminForm.setVisible(true);
                adminForm.centerFrame(adminForm);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addRoomButton;
    private javax.swing.JButton addUserButton;
    private ContentPanel adminFormMainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeRoomButton;
    private javax.swing.JButton removeUserButton;
    // End of variables declaration
}
