package Forms;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author paps
 */
public class CheckOutForm extends javax.swing.JFrame {

    /**
     * Creates new form CheckOutForm
     */
    public CheckOutForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchCustomerName = new javax.swing.JTextField();
        comboBoxNames = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkOutDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        checkInDate = new javax.swing.JTextField();
        checkOutButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        showCustomerNames();

        searchCustomerName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchCustomerNameActionPerformed(e);
            }
        });

        searchCustomerName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                showCustomerNames();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                showCustomerNames();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                showCustomerNames();
            }
        });

        comboBoxNames.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String customerData = comboBoxNames.getSelectedItem().toString();
                    String customerId = customerData.split(" ")[2];
                    showCheckInCheckOutDates(customerId);
                }
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CheckOut");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Check in date :");

        checkOutDate.setEditable(false);
        checkOutDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("Check out date :");

        checkInDate.setEditable(false);
        checkInDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRoomStatus();
                updateCustomerId();
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81,
                                                        Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(searchCustomerName)
                                                        .addComponent(comboBoxNames, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jLabel1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 218,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addGap(87, 87, 87)
                                                                        .addComponent(checkInDate,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                176, Short.MAX_VALUE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxNames, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(checkInDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(checkOutDate, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkOutButton)
                                        .addComponent(cancelButton))
                                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(CheckOutForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutForm().setVisible(true);
            }
        });
    }

    private void showCustomerNames() {
        String searchText = searchCustomerName.getText();
        comboBoxNames.removeAllItems();
        try (BufferedReader br = new BufferedReader(new FileReader("Data/Customers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 1 && !parts[3].equals("0")) {
                    if (line.contains(searchText)) {
                        comboBoxNames.addItem(parts[0] + " " + parts[1] + " " + parts[2] + " " + parts[3]);
                        showCheckInCheckOutDates(parts[2]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {
        showCustomerNames();
    }

    private void showCheckInCheckOutDates(String customerId) {
        try (BufferedReader br = new BufferedReader(new FileReader("Data/Customers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length > 1 && parts[2].equals(customerId)) {
                    String[] customerData = line.split(" ");
                    checkInDate.setText(customerData[4]);
                    checkOutDate.setText(LocalDate.now().toString());
                    break; // Add break statement to exit the loop after finding the room data
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private void showCheckInCheckOutDate() {
    // String customerName = comboBoxNames.getSelectedItem().toString();
    // String[] data = customerName.split(" ");
    // String roomID = data[3];
    // try (BufferedReader br = new BufferedReader(new
    // FileReader("Data/Rooms.txt"))) {
    // String line;
    // while ((line = br.readLine()) != null) {
    // String[] parts = line.split(" ");
    // if (roomID.equals(parts[0])) {
    // String[] roomData = line.split(" ");
    // checkInDate.setText(roomData[4]);
    // checkOutDate.setText(LocalDate.now().toString());
    // break; // Add break statement to exit the loop after finding the room data
    // }
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    private void updateRoomStatus() {
        String[] customerData = comboBoxNames.getSelectedItem().toString().split(" ");
        String roomID = customerData[3];

        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Data/Rooms.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/Rooms.txt"))) {
            for (String line : lines) {
                String[] parts = line.split(" ");
                if (roomID.equals(parts[0])) {
                    String[] roomData = line.split(" ");
                    // Update room status
                    roomData[3] = "0";
                    line = String.join(" ", roomData);
                    JOptionPane.showMessageDialog(null, "Successfully updated room status");
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateCustomerId() {
        String customerData = comboBoxNames.getSelectedItem().toString();
        String[] data = customerData.split(" ");

        String roomID = data[3];

        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Data/Customers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/Customers.txt"))) {
            for (String line : lines) {
                String[] parts = line.split(" ");
                if (roomID.equals(parts[3])) {
                    String[] customer = line.split(" ");
                    customer[3] = "0";
                    customer[4] = "0";// set checkin and checkout dates after customers leave
                    customer[5] = "0";
                    line = String.join(" ", customer);
                    JOptionPane.showMessageDialog(null, "customer succesfully checked out");
                    dispose();
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField checkInDate;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JTextField checkOutDate;
    private javax.swing.JComboBox<String> comboBoxNames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField searchCustomerName;
    // End of variables declaration
}
