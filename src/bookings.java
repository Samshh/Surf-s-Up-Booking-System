
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.swing.event.DocumentEvent;

/**
 *
 * @author User
 */
public class bookings extends javax.swing.JFrame {

        private String url = "jdbc:mysql://localhost:3306/client";
        private String username = "root";
        private String password = "";

        /**
         * Creates new form test
         */
        public bookings() {
                initComponents();

                search.getDocument().addDocumentListener(new DocumentListener() {
                        public void changedUpdate(DocumentEvent e) {
                                filter();
                        }

                        public void removeUpdate(DocumentEvent e) {
                                filter();
                        }

                        public void insertUpdate(DocumentEvent e) {
                                filter();
                        }
                });
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton add = new javax.swing.JButton();
        javax.swing.JButton update = new javax.swing.JButton();
        javax.swing.JButton delete = new javax.swing.JButton();
        javax.swing.JButton logout = new javax.swing.JButton();
        javax.swing.JButton checkout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        stats = new javax.swing.JTable();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 145, 194));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1 (2).png"))); // NOI18N
        jLabel1.setText("List of Clients:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Main Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        jPanel2.setOpaque(false);

        add.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        checkout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        checkout.setText("Check-out");
        checkout.setMaximumSize(new java.awt.Dimension(79, 26));
        checkout.setMinimumSize(new java.awt.Dimension(79, 26));
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        stats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bookings", "Head Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(stats);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        tableClient.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Name", "Room Type", "Email", "Phone", "Check-In", "Check-Out", "Head Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableClient);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Search:");

        search.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(103, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void displayStats() {
                DefaultTableModel statsModel = (DefaultTableModel) stats.getModel();
                statsModel.setRowCount(0); // Clear the table

                int totalHeadcount = 0;
                int totalRows = 0;

                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                        // Query to get the total headcount
                        String sqlHeadcount = "SELECT SUM(HEADCOUNT) AS TotalHeadcount FROM clients";
                        try (PreparedStatement statementHeadcount = connection.prepareStatement(sqlHeadcount)) {
                                try (ResultSet resultsHeadcount = statementHeadcount.executeQuery()) {
                                        if (resultsHeadcount.next()) {
                                                totalHeadcount = resultsHeadcount.getInt("TotalHeadcount");
                                        }
                                }
                        }

                        // Query to count all rows
                        String sqlRowCount = "SELECT COUNT(*) AS TotalRows FROM clients";
                        try (PreparedStatement statementRowCount = connection.prepareStatement(sqlRowCount)) {
                                try (ResultSet resultsRowCount = statementRowCount.executeQuery()) {
                                        if (resultsRowCount.next()) {
                                                totalRows = resultsRowCount.getInt("TotalRows");
                                        }
                                }
                        }

                        // Add the results to the table in one row
                        statsModel.addRow(new Object[] {totalRows, totalHeadcount});

                } catch (SQLException e) {
                        System.err.println("Failed to retrieve stats from the database!");
                        e.printStackTrace();
                }
        }

        private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
                int response = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Confirm",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                        main newForm = new main();
                        newForm.setVisible(true);
                        this.dispose();
                }
        }// GEN-LAST:event_logoutActionPerformed

        private void updateActionPerformed(java.awt.event.ActionEvent evt) {
                update newForm = new update();
                newForm.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_updateActionPerformed

        private void addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addActionPerformed
                add newForm = new add();
                newForm.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_addActionPerformed

        private void displayInfo() {
                DefaultTableModel model = (DefaultTableModel) tableClient.getModel();
                model.setRowCount(0);
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                        String sql = "SELECT * FROM clients";
                        try (PreparedStatement statement = connection.prepareStatement(sql)) {
                                try (ResultSet results = statement.executeQuery()) {
                                        while (results.next()) {
                                                model.addRow(new Object[] { results.getInt("ID"),
                                                                results.getDate("BOOKING_DATE"),
                                                                results.getString("NAME"),
                                                                results.getString("ROOMTYPE"),
                                                                results.getString("EMAIL"), results.getString("PHONE"),
                                                                results.getString("CHECKIN"),
                                                                results.getString("CHECKOUT"),
                                                                results.getString("HEADCOUNT") });
                                        }
                                }
                        }
                } catch (SQLException e) {
                        System.err.println("Failed to retrieve data from the database!");
                        e.printStackTrace();
                }

                displayStats();
        };

        private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
                delete newForm = new delete();
                newForm.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_deleteActionPerformed

        private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {
                int selectedRowIndex = tableClient.getSelectedRow();

                if (selectedRowIndex != -1) { // Ensure a row is actually selected
                        // Get the ID of the selected row
                        int selectedID = (int) tableClient.getValueAt(selectedRowIndex, 0);

                        // Prompt the user with a confirmation dialog
                        int response = JOptionPane.showConfirmDialog(null, "Do you want to Check-out this row?",
                                        "Confirm",
                                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (response == JOptionPane.YES_OPTION) {
                                LocalTime checkoutTime = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);

                                // Update the row in the database
                                updateCheckout(selectedID, checkoutTime);

                                displayInfo();
                        }
                } else {
                        JOptionPane.showMessageDialog(null, "Please select a row to Check-out.");
                }
        }// GEN-LAST:event_updateActionPerformed

        private void updateCheckout(int selectedID, LocalTime checkoutTime) {
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                        String sql = "UPDATE clients SET CHECKOUT=? WHERE ID=?";
                        try (PreparedStatement statement = connection.prepareStatement(sql)) {
                                statement.setString(1, checkoutTime.toString());
                                statement.setInt(2, selectedID);
                                int rowsUpdated = statement.executeUpdate();
                                if (rowsUpdated > 0) {
                                        System.out.println("Checked-out successfully!");
                                }
                        }
                } catch (SQLException e) {
                        System.err.println("Failed to update Check-out in the database!");
                        e.printStackTrace();
                }
        }

        private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

        }// GEN-LAST:event_formWindowClosing

        private void formWindowOpened(java.awt.event.WindowEvent evt) {
                displayInfo();

        }// GEN-LAST:event_formWindowOpened

        private void filter() {
                String filterText = search.getText();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(
                                (DefaultTableModel) tableClient.getModel());
                tableClient.setRowSorter(sorter);

                if (filterText.trim().length() == 0) {
                        sorter.setRowFilter(null);
                } else {
                        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filterText));
                }
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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(bookings.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(bookings.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(bookings.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(bookings.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new bookings().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField search;
    public javax.swing.JTable stats;
    public javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables
}