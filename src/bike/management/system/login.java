package bike.management.system;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    Connection con;
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        try
        {
                Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        //display icon in label
        scaleimage();
    }
    public void scaleimage()
    {
        ImageIcon icon = new ImageIcon("D:\\project\\bike management system\\src\\bike\\management\\system\\images\\loginform.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(login_logo.getWidth(), login_logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleicon = new ImageIcon(imgscale);
        login_logo.setIcon(scaleicon);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        login_logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        show_password = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        close_form = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 665));

        login_logo.setBackground(new java.awt.Color(102, 153, 255));
        login_logo.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 55)); // NOI18N
        jLabel2.setText("Login");

        un.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        un.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unFocusLost(evt);
            }
        });

        show_password.setText("Show Password");
        show_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passwordActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 153, 51));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });

        close_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bike/management/system/images/wrong1.png"))); // NOI18N
        close_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_formMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 51, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bike/management/system/images/icons8-unlock-30.png"))); // NOI18N
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 51, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bike/management/system/images/icons8-user-30 (1).png"))); // NOI18N
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_password)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(close_form))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(close_form)
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(show_password)
                        .addGap(80, 80, 80)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 142, Short.MAX_VALUE))
            .addComponent(login_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unFocusGained
        // TODO add your handling code here:
        if(un.getText().trim().toLowerCase().equals("username"))
        {
            un.setText("");
            un.setForeground(Color.black);
        }
    }//GEN-LAST:event_unFocusGained
    private void unFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unFocusLost
        // TODO add your handling code here:
        if(un.getText().trim().toLowerCase().equals("username") ||
           un.getText().trim().toLowerCase().equals(""))
        {
            un.setText("username");
            un.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_unFocusLost
    private void show_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passwordActionPerformed
        if(show_password.isSelected())
        {
            pass.setEchoChar((char)0);
        }
        else
        {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_show_passwordActionPerformed
    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        String ps=String.valueOf(pass.getPassword());
        if(ps.trim().toLowerCase().equals("password"))
        {
            pass.setText("");
            pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        String ps=String.valueOf(pass.getPassword());
        
        if(ps.trim().toLowerCase().equals("password") ||
           ps.trim().toLowerCase().equals(""))
        {
            pass.setText("**********");
            pass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passFocusLost
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try
        {
                String username = un.getText();
                String password = new String(pass.getPassword());

                if(username.trim().toLowerCase().equals("username") || password.trim().toLowerCase().equals("password"))
                {
                    JOptionPane.showMessageDialog(rootPane, "Enter a valid Username & Password", "Login", HEIGHT);
                }
                else
                {
                    PreparedStatement pst = con.prepareStatement("select * from user where username=? and password=?");
                    pst.setString(1, username);
                    pst.setString(2, password);
                    ResultSet rs =pst.executeQuery();
                    if(rs.next())
                    {
                        // Display the dashboard form
                        dashboard d=new dashboard();
                        d.setVisible(true);
                        d.adm.setText(rs.getString(3));
                        if(rs.getString("usertype").equals("User"))
                        {
                            d.dash_user.setText("Logout");
                            d.logout.setVisible(false);
                        }
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Login Failed", "Login", HEIGHT);
                    }
                }
            }
        catch(Exception ex)
        {
            System.out.println("Error"+ex.toString());
        }
    }//GEN-LAST:event_loginActionPerformed
    private void close_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_formMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_formMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_form;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JLabel login_logo;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox show_password;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
