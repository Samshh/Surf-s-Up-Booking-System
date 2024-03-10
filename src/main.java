import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {

    private String url = "jdbc:mysql://localhost:3306/client";
    private String username = "root";
    private String password = "";
    private javax.swing.JTable tableClient;

    public main() {
        initComponents();
        displayTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        javax.swing.JButton login = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 145, 194));

        tableClient.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tableClient.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Date", "Name", "Room Type", "Email", "Phone", "Check-In", "Check-Out", "Head Count"
                }));
        tableClient.setEnabled(false);
        jScrollPane1.setViewportView(tableClient);

        login.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        login.setText("Log In");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1 (2).png"))); // NOI18N
        jLabel1.setText("Surf's Up! Booking System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563,
                                        Short.MAX_VALUE)
                                .addComponent(login)
                                .addGap(24, 24, 24))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945,
                                                Short.MAX_VALUE)
                                        .addContainerGap())));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(login)
                                        .addComponent(jLabel1))
                                .addContainerGap(539, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514,
                                                Short.MAX_VALUE)
                                        .addContainerGap())));

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
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        // Store the password in a String
        String correctPassword = "yourPassword";

        // Initialize the input password to an empty string
        String inputPassword = "";

        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.OK_OPTION;
        while (inputPassword != null && !inputPassword.equals(correctPassword) && option == JOptionPane.OK_OPTION) {
            option = JOptionPane.showConfirmDialog(null, passwordField, "Enter the password:",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            inputPassword = new String(passwordField.getPassword());

            if (inputPassword != null && !inputPassword.equals(correctPassword) && option == JOptionPane.OK_OPTION) {
                // If the password is incorrect, show a message
                JOptionPane.showMessageDialog(null, "Incorrect password! Please try again.");
            }
        }

        // Check if the input password is correct
        if (inputPassword != null && inputPassword.equals(correctPassword)) {
            // If the password is correct, initialize the form
            archives newForm = new archives();
            newForm.setVisible(true);
            this.dispose();
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        displayTable();
    }

    private void displayTable() {
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

    }

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
