/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paparon;

import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setResizable(false);
        
        

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jMenuItem1 = new javax.swing.JMenuItem();
        use = new javax.swing.JTextField();
        fin = new javax.swing.JTextField();
        lan = new javax.swing.JTextField();
        can = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        ps = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        emai = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        lasn = new javax.swing.JLabel();
        firn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        occ1 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        occ = new javax.swing.JComboBox<>();
        security = new javax.swing.JComboBox<>();
        answer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        use.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        use.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });
        getContentPane().add(use, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 180, 30));

        fin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });
        getContentPane().add(fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, 30));

        lan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanActionPerformed(evt);
            }
        });
        getContentPane().add(lan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 30));

        can.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        can.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });
        getContentPane().add(can, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, 30));

        em.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 180, 30));

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/012-hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        getContentPane().add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 30, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/013-view.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 30, 30));

        pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 180, 30));

        ps.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ps.setForeground(new java.awt.Color(240, 240, 240));
        ps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ps.setText("Password:");
        getContentPane().add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, -1));

        un.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        un.setForeground(new java.awt.Color(240, 240, 240));
        un.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        un.setText("Username:");
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, 20));

        emai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emai.setForeground(new java.awt.Color(240, 240, 240));
        emai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emai.setText("Email:");
        getContentPane().add(emai, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 100, -1));

        cn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cn.setForeground(new java.awt.Color(240, 240, 240));
        cn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cn.setText("Contact Number:");
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 20));

        lasn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lasn.setForeground(new java.awt.Color(240, 240, 240));
        lasn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lasn.setText("Last Name: ");
        getContentPane().add(lasn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, -1));

        firn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firn.setForeground(new java.awt.Color(240, 240, 240));
        firn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firn.setText("First Name:");
        getContentPane().add(firn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register Here!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 280, 40));

        occ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        occ1.setForeground(new java.awt.Color(240, 240, 240));
        occ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occ1.setText("Occupation:");
        getContentPane().add(occ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        Register.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Register.setText("REGISTER");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/021-undo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 40, 40));

        Clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 110, 30));

        occ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Manager", "Cashier"}));
        occ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occActionPerformed(evt);
            }
        });
        getContentPane().add(occ, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 30));

        security.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        security.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's the name of your first pet?", "What is your mother's last name?", "What's your favorite food?", "What's your favorite color?" }));
        getContentPane().add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 240, 30));

        answer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });
        getContentPane().add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 240, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nm.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 630, 410));

        setSize(new java.awt.Dimension(628, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useActionPerformed

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finActionPerformed

    private void lanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        
        
        
        
         

    

 
    if (fin.getText().isEmpty() || lan.getText().isEmpty() ||  can.getText().isEmpty() ||  em.getText().isEmpty() ||  use.getText().isEmpty() ||  pass.getPassword().length == 0 || answer.getText().isEmpty()  ) {
        JOptionPane.showMessageDialog(null, "All Fields Are Required");
     


    } 
    
    
    else if (fin.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "First Name is required");
    fin.setText("");
    }
     else if (lan.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "First Name is required");
    lan.setText("");
     }
     else if (can.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Contact Number is required");
    can.setText("");
} else {
    String input = can.getText();
    if (!input.matches("[0-9]{11}")) {  
        JOptionPane.showMessageDialog(null, "Please enter a valid contact number (11 digits only)");
        can.setText("");
    }

    
    else if (em.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Email is required");
    em.setText(""); 
      
     
}
      else {
            String email = em.getText();
            
           
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);

            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid email with @yahoo.com or @gmail.com");
                em.setText("");
            }
      
              
   else if (use.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Username is required");
    use.setText(""); 
} 
else if (pass.getPassword().length == 0) {
    
    JOptionPane.showMessageDialog(null, "Password is required");
    pass.setText(""); 
} 
else if (pass.getPassword().length < 8) {
    JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
    pass.setText("");
} 

if (answer.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Security answer is required");
        answer.setText("");
       
    }



   

 dbConnect dbc = new dbConnect();
    Connection con = null;
    PreparedStatement pstmt = null;

    try{
        String ps = passwordHasher.hashPassword(new String(pass.getPassword()));
        con = dbc.getConnection();

       
        String checkUsernameQuery = "SELECT COUNT(*) FROM tbl_user WHERE u_user = '" + use.getText() + "'";
        int usernameCount = dbc.executeQueryForCount(checkUsernameQuery);
        if (usernameCount > 0) {
            JOptionPane.showMessageDialog(null, "Username is already taken");
            return;
        }

        String checkEmailQuery = "SELECT COUNT(*) FROM tbl_user WHERE u_em = '" + em.getText() + "'";
        int emailCount = dbc.executeQueryForCount(checkEmailQuery);
        if (emailCount > 0) {
            JOptionPane.showMessageDialog(null, "Email is already registered");
            return;
        }

        
        String insertQuery = "INSERT INTO tbl_user(u_fname, u_lname, u_occ, u_cn, u_em, u_user, u_pass, u_status, u_image, security_question, security_answer)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, 'Pending', 'Null', ?, ?)";
        pstmt = con.prepareStatement(insertQuery);
        pstmt.setString(1, fin.getText());
        pstmt.setString(2, lan.getText());
        pstmt.setString(3, (String) occ.getSelectedItem());
        pstmt.setString(4, can.getText());
        pstmt.setString(5, em.getText());
        pstmt.setString(6, use.getText());
        pstmt.setString(7, ps);
        pstmt.setString(8, (String) security.getSelectedItem());
        pstmt.setString(9, answer.getText());

        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Registration Successful!");
            new LoginPage().setVisible(true);
            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Registration Failed.");
        }

    } catch (NoSuchAlgorithmException ex) {
        System.err.println("" + ex);
        JOptionPane.showMessageDialog(null, "Error: Password hashing algorithm not found.");
    } catch (SQLException ex) {
        System.err.println("SQL Error during registration: " + ex.getMessage());
        JOptionPane.showMessageDialog(null, "Database error during registration.");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) dbc.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        
        }
    

    }//GEN-LAST:event_RegisterActionPerformed
     
     
    }
    }
     }
    
    
    
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
    use.setText("");  
    fin.setText(""); 
    lan.setText("");  
    can.setText("");  
    em.setText("");  
    pass.setText(""); 
    answer.setText("");

    }//GEN-LAST:event_ClearActionPerformed

    private void occActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_occActionPerformed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        // TODO add your handling code here:

        show.setVisible(true);
        hide.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_hideMouseReleased

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        // TODO add your handling code here:
        show.setVisible(false);
        hide.setVisible(true);
        pass.setEchoChar('*');

    }//GEN-LAST:event_showMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         
    }//GEN-LAST:event_formWindowActivated

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Register;
    private javax.swing.JTextField answer;
    private javax.swing.JTextField can;
    private javax.swing.JLabel cn;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emai;
    private javax.swing.JTextField fin;
    private javax.swing.JLabel firn;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField lan;
    private javax.swing.JLabel lasn;
    private javax.swing.JComboBox<String> occ;
    private javax.swing.JLabel occ1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel ps;
    private javax.swing.JComboBox<String> security;
    private javax.swing.JLabel show;
    private javax.swing.JLabel un;
    private javax.swing.JTextField use;
    // End of variables declaration//GEN-END:variables
}
