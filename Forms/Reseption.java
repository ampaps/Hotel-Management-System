package Forms;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Label;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author paps
 */
public class Reseption extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public Reseption() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        String photoPath = "Images/receptionPhoto1.jpg";

        reseptionButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newCustomerButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        avaibleRoomsButton = new javax.swing.JButton();
        cancelReservationButton = new javax.swing.JButton();
        roomsButton = new javax.swing.JButton();
        CheckReservationButton = new javax.swing.JButton();
        makeReservationButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        reseptionPhotoPanel = new ContentPanel(photoPath);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        reseptionButtonPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESEPTION");

        newCustomerButton.setText("New Customer");
        newCustomerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NewCustomer newCustomerForm = new NewCustomer();
                newCustomerForm.setVisible(true);
                centerFrame(newCustomerForm);
                dispose();
                newCustomerForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        checkInButton.setText("Check In");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInForm checkInForm = new CheckInForm();
                checkInForm.setVisible(true);
                checkInForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                checkInForm.setResizable(false);
                centerFrame(checkInForm);
                dispose();
            }
        });

        avaibleRoomsButton.setText("Avaible Rooms");
        avaibleRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaibleRoomsButtonActionPerformed(evt);
            }
        });

        cancelReservationButton.setText("Cancel Reservation");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        roomsButton.setText("Rooms");
        roomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsButtonActionPerformed(evt);
            }
        });

        CheckReservationButton.setText("Check  Reservation");
        CheckReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckReservationButtonActionPerformed(evt);
            }
        });

        makeReservationButton.setText("Make Reservation");
        makeReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeReservationButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Exit");
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logoutButtonActionPerformed(e);
            }
        });

        adminButton.setText("Admin");
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminForm adminForm = new AdminForm();
                adminForm.setVisible(true);
                centerFrame(adminForm);
                dispose();
                adminForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }

        });

        javax.swing.GroupLayout reseptionButtonPanelLayout = new javax.swing.GroupLayout(reseptionButtonPanel);
        reseptionButtonPanel.setLayout(reseptionButtonPanelLayout);
        reseptionButtonPanelLayout.setHorizontalGroup(
                reseptionButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reseptionButtonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(reseptionButtonPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkInButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(avaibleRoomsButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelReservationButton,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(roomsButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CheckReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(makeReservationButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkOutButton, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(adminButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        reseptionButtonPanelLayout.setVerticalGroup(
                reseptionButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reseptionButtonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avaibleRoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(makeReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184,
                                        Short.MAX_VALUE)
                                .addComponent(adminButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutButton)
                                .addContainerGap()));

        javax.swing.GroupLayout reseptionPhotoPanelLayout = new javax.swing.GroupLayout(reseptionPhotoPanel);
        reseptionPhotoPanel.setLayout(reseptionPhotoPanelLayout);
        reseptionPhotoPanelLayout.setHorizontalGroup(
                reseptionPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 662, Short.MAX_VALUE));
        reseptionPhotoPanelLayout.setVerticalGroup(
                reseptionPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(reseptionButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reseptionPhotoPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(reseptionButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reseptionPhotoPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void avaibleRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder rooms = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("Data/Rooms.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 1) {
                    if (parts[3].equals("0")) {
                        rooms.append("").append(parts[0]).append("  ").append(parts[1])
                                .append("    Room Price: ").append(parts[2]).append("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, rooms.toString(), "Avaible Rooms", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder rooms = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("Data/Rooms.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 1) {
                    rooms.append("").append(parts[0]).append("  ").append(parts[1])
                            .append("    Room Price: ").append(parts[2]).append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, rooms.toString(), "Rooms", JOptionPane.INFORMATION_MESSAGE);
    }

    private void CheckReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void makeReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ReservationForm makeReservationForm = new ReservationForm();
        makeReservationForm.setVisible(true);
        makeReservationForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
        centerFrame(makeReservationForm);
    }

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CheckOutForm checkOutForm = new CheckOutForm();
        checkOutForm.setVisible(true);
        checkOutForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        centerFrame(checkOutForm);
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
            java.util.logging.Logger.getLogger(Reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reseption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reseption reseption = new Reseption();
                reseption.setVisible(true);
                reseption.centerFrame(reseption);
            }
        });
    }

    private void centerFrame(JFrame fr) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = fr.getSize().width;
        int h = fr.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        fr.setLocation(x, y);
    }

    // changed to exit button instead of logout
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit",
                dialogButton);
        if (dialogResult == 0) {
            disposeAll();
        }
    }

    private void disposeAll() {
        for (Window window : Window.getWindows()) {
            window.dispose();
        }
    }

    // if the time of the reservation is passed, the room is set to avaible
    // automatically
    private void checkRoomStatus() {

    }

    // Variables declaration - do not modify
    private javax.swing.JButton CheckReservationButton;
    private javax.swing.JButton adminButton;
    private javax.swing.JButton avaibleRoomsButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton makeReservationButton;
    private javax.swing.JButton newCustomerButton;
    private javax.swing.JPanel reseptionButtonPanel;
    private ContentPanel reseptionPhotoPanel;
    private javax.swing.JButton roomsButton;
    // End of variables declaration
}
