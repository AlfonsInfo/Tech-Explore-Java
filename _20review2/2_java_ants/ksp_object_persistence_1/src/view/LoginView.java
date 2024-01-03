/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserController;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;


public class LoginView extends javax.swing.JFrame {
    
    //Define variable
    UserController userController = new UserController();
    
    //constructor
    public LoginView() {
        initComponents();
        scaleIcon("/assets/icon_user.png", iconAdmin,400,400);
    }
    
    private void resetLoginForm(){
        inputUsername.setText("");
        inputPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        iconAdmin = new javax.swing.JLabel();
        textAdmin = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        inputUsername = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        labelUsername1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(0, 153, 255));
        leftPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        leftPanel.setFocusCycleRoot(true);
        leftPanel.setName(""); // NOI18N
        leftPanel.setPreferredSize(new java.awt.Dimension(500, 800));

        iconAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textAdmin.setBackground(new java.awt.Color(51, 51, 51));
        textAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textAdmin.setForeground(new java.awt.Color(255, 255, 255));
        textAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAdmin.setText("ADMIN");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(iconAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(iconAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textAdmin)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 800));

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        loginTitle.setBackground(new java.awt.Color(255, 255, 255));
        loginTitle.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(0, 0, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("LOGIN");

        inputPassword.setBackground(new java.awt.Color(153, 204, 255));
        inputPassword.setForeground(new java.awt.Color(0, 0, 0));
        inputPassword.setCaretColor(new java.awt.Color(204, 204, 204));
        inputPassword.setDisabledTextColor(new java.awt.Color(0, 153, 255));
        inputPassword.setDoubleBuffered(true);
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        inputUsername.setBackground(new java.awt.Color(153, 204, 255));
        inputUsername.setForeground(new java.awt.Color(0, 0, 0));
        inputUsername.setCaretColor(new java.awt.Color(204, 204, 204));
        inputUsername.setDisabledTextColor(new java.awt.Color(0, 153, 255));
        inputUsername.setDoubleBuffered(true);
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(0, 153, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        labelUsername.setForeground(new java.awt.Color(0, 102, 204));
        labelUsername.setText("Username");

        labelUsername1.setForeground(new java.awt.Color(0, 102, 204));
        labelUsername1.setText("Password");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelUsername)
                .addGap(18, 18, 18)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(loginButton)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 550, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
       User user = new User();
       user.setUsername(inputUsername.getText());
       user.setPassword(inputPassword.getText());
       boolean isSuccessLogin =  userController.loginUser(user);
       
       if(isSuccessLogin){
           //Ketika login berhasil, tampilan saat ini disembunyikan dan tampilkan homeview.
           HomeView homeview = new HomeView();
           this.dispose();
           homeview.setVisible(true);
       }else{
           javax.swing.JOptionPane.showConfirmDialog(this.rootPane, "Login Gagal", "Pesan Eror", JOptionPane.YES_OPTION);
           resetLoginForm();
       }
    }//GEN-LAST:event_loginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    
    public void scaleIcon(String assets, javax.swing.JLabel c, int width, int height) 
    {
        ImageIcon icon  = new ImageIcon(getClass().getResource(assets)); // alamatnya dependen atau independen
        
        Image img  = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height,Image.SCALE_FAST );
        ImageIcon ScaledIcon = new ImageIcon(imgScale);
        c.setIcon(ScaledIcon);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel textAdmin;
    // End of variables declaration//GEN-END:variables
}
