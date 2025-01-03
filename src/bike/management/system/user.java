package bike.management.system;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class user extends javax.swing.JFrame {
    Connection con;
    user_cls u_cls = new user_cls();
    ArrayList<user_cls> userlist = u_cls.userList();
    public user() {
        initComponents();
        this.setLocationRelativeTo(null);
        path1.setVisible(true);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        //Button group for radiobutton
        buttonGroupRadioButtons.add(uuser);
        buttonGroupRadioButtons.add(uadmin);
        uuser.setSelected(true);
        //display icon in label
        scaleimage();
    }
    public void scaleimage()
    {
        ImageIcon icon = new ImageIcon("D:\\project\\bike management system\\src\\bike\\management\\system\\images\\user.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(user_logo.getWidth(), user_logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleicon = new ImageIcon(imgscale);
        user_logo.setIcon(scaleicon);        
    }
    public boolean validation()
    {
       String pattern="[a-z0-9_+@*-]+(?:\\.[a-z0-9_+@*-])*@(?:[a-z0-9-]+\\.)+[a-z]{2,7}$";
       Pattern p=Pattern.compile(pattern);
       Matcher m=p.matcher(em.getText());
       String mobile="^((\\+[1-9]?[0-9])|0)?[6-9][0-9]{9}$";
       Pattern pt=Pattern.compile(mobile);
       Matcher mt=pt.matcher(phn.getText());
       if(uid.getText().trim().isEmpty() || ufn.getText().trim().isEmpty() || uun.getText().trim().isEmpty() || upass.getPassword().length==0 || ucpass.getPassword().length==0
            || path1.getText().trim().isEmpty() || phn.getText().trim().isEmpty() || em.getText().trim().isEmpty()
               || !mt.matches() || !m.matches())
       {
           JOptionPane.showMessageDialog(rootPane, "Enter Valid User Data", "Validation", HEIGHT);
           return false;
       }
       else
       {
           return true;
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRadioButtons = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        user_logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ufn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        uun = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        upass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uuser = new javax.swing.JRadioButton();
        uadmin = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        path1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_jtable = new javax.swing.JTable();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        ucpass = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(205, 97, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Users");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bike/management/system/images/icons8-cross-30.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(user_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Full Name:");

        ufn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Username:");

        uun.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Password:");

        upass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Confirm Pass:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("User Type:");

        uuser.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupRadioButtons.add(uuser);
        uuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uuser.setForeground(new java.awt.Color(102, 0, 0));
        uuser.setText("User");

        uadmin.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupRadioButtons.add(uadmin);
        uadmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uadmin.setForeground(new java.awt.Color(102, 0, 0));
        uadmin.setText("Admin");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Image:");

        logo.setBackground(new java.awt.Color(102, 255, 102));
        logo.setOpaque(true);

        browse.setBackground(new java.awt.Color(44, 62, 80));
        browse.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setText("browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        path1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Phone:");

        phn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Email:");

        em.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        user_jtable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FULL NAME", "USER NAME", "USER TYPE", "PHONE", "EMAIL", "URL"
            }
        ));
        user_jtable.setRowHeight(50);
        user_jtable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        user_jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(user_jtable);

        add.setBackground(new java.awt.Color(25, 189, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(java.awt.Color.green);
        edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        remove.setBackground(java.awt.Color.red);
        remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        ucpass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("ID:");

        uid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(path1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ufn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(phn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ucpass, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(upass, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(uuser)
                                                .addGap(28, 28, 28)
                                                .addComponent(uadmin)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ufn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uun, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(ucpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(uadmin)
                                .addComponent(uuser)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(path1)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(phn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String selectImage()
    {
        JFileChooser jfc=new JFileChooser();
        jfc.setDialogTitle("Select Picture");
        jfc.setCurrentDirectory(new File("D:\\project\\bike management system\\src\\bike\\management\\system\\images"));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("image", ".png",".jpg");
        jfc.addChoosableFileFilter(filter);
        int state=jfc.showSaveDialog(null);
        String path="";
        if(state==JFileChooser.APPROVE_OPTION)
        {
            path=jfc.getSelectedFile().getAbsolutePath();
        }
        return path;
    }
    public void displayimage(int width,int height,String image_path,JLabel label)
    {
        ImageIcon imageIco=new ImageIcon(image_path);
        Image image=imageIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }
    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        //browse and display image
        String imagePath=selectImage();
        displayimage(logo.getWidth(),logo.getHeight(),imagePath,logo);
        //display the image path
        path1.setText(imagePath);
    }//GEN-LAST:event_browseActionPerformed
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       // Add the record in Database:        
       if(validation())
       {
           try
           {
               String rd="";
               if(uuser.isSelected()==true)
               {
                   rd=uuser.getText();
               }
               else
               {
                   rd=uadmin.getText();
               }
               if((new String(upass.getPassword()).equals(new String(ucpass.getPassword()))))
               {
                   String uname=uun.getText();
                   char[] password = upass.getPassword();
                   String passwordText = new String(password);
            
                   PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
                   pst.setInt(1,Integer.valueOf(uid.getText()));
                   pst.setString(2,ufn.getText());
                   pst.setString(3,uname);
                   pst.setString(4,passwordText);
                   pst.setString(5,rd);
                   pst.setString(6,path1.getText());
                   pst.setString(7,phn.getText());
                   pst.setString(8,em.getText());
            
                   if(pst.executeUpdate()!=0)
                   {
                       JOptionPane.showMessageDialog(rootPane, "User Added", "User Add", JOptionPane.INFORMATION_MESSAGE);
                        uid.setText("");
                        ufn.setText("");
                        uun.setText("");
                        upass.setText("");
                        ucpass.setText("");
                        logo.setIcon(null);
                        path1.setText("");
                        phn.setText("");
                        em.setText("");
                       formWindowOpened(null);
                   }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Password is not Matched", "Error!",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error"+ex.toString());
            }
       }
        
    }//GEN-LAST:event_addActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        user_jtable.setRowHeight(50);
        try
        {
            PreparedStatement pst = con.prepareStatement("select * from user order by id");
            ResultSet rs=pst.executeQuery();
            DefaultTableModel dtm=(DefaultTableModel) user_jtable.getModel();
            dtm.setRowCount(0);
            while(rs.next())
            {
                dtm.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(7),rs.getString(8),rs.getString(6)});
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error"+ex.toString());
        }    }//GEN-LAST:event_formWindowOpened
    private void user_jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_jtableMouseClicked
        // Display Selected Row values from Jtable into jTextFeild
        try {
            PreparedStatement pst = con.prepareStatement("select * from user order by id");
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                String passwordText = new String(rs.getString(4));
                char[] password = upass.getPassword();
                upass.setText(password.toString());
                ucpass.setText(password.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableModel  model = user_jtable.getModel();
        int i = user_jtable.getSelectedRow();
        uid.setText(model.getValueAt(i,0).toString());
        ufn.setText(model.getValueAt(i,1).toString());
        uun.setText(model.getValueAt(i,2).toString());
        String ua=model.getValueAt(i,3).toString();
        if(ua.equals("User"))
        {
            uuser.setSelected(true);
        }
        else
        {
            uadmin.setSelected(true);
        }
        phn.setText(model.getValueAt(i,4).toString());
        em.setText(model.getValueAt(i,5).toString());
        int row=user_jtable.getSelectedRow();
        Object value=user_jtable.getValueAt(row,6);
        String photoname=value.toString();
        ImageIcon icon=new ImageIcon(
        new ImageIcon(photoname).getImage().getScaledInstance(124,60,Image.SCALE_DEFAULT));
        logo.setIcon(icon);
        path1.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_user_jtableMouseClicked
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // Update the Code in database:
       if(validation())
       {
           try
            {
                String rd="";
                if(uuser.isSelected()==true)
                {
                    rd=uuser.getText();
                }
                else
                {
                    rd=uadmin.getText();
                }
            
                if((new String(upass.getPassword()).equals(new String(ucpass.getPassword()))))
                {
                    char[] password = upass.getPassword();
                    String passwordText = new String(password);
                    PreparedStatement pst = con.prepareStatement("UPDATE user SET fullname=?,username=?,password=?,usertype=?,image=?,phone=?,email=? WHERE id=?");
                    pst.setString(1,ufn.getText());
                    pst.setString(2,uun.getText());
                    pst.setString(3,passwordText);
                    pst.setString(4,rd);
                    pst.setString(5,path1.getText());
                    pst.setString(6,phn.getText());
                    pst.setString(7,em.getText());
                    pst.setInt(8,Integer.valueOf(uid.getText()));
                    if(pst.executeUpdate()!=0)
                    {
                        JOptionPane.showMessageDialog(rootPane, "User Edited", "User Edit", JOptionPane.INFORMATION_MESSAGE);
                        uid.setText("");
                        ufn.setText("");
                        uun.setText("");
                        upass.setText("");
                        ucpass.setText("");
                        logo.setIcon(null);
                        path1.setText("");
                        phn.setText("");
                        em.setText("");
                        formWindowOpened(null);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Password is not Matched", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
                System.out.println("Error"+e.toString());
            }
       }
    }//GEN-LAST:event_editActionPerformed
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // Remove the record in database:
        if(uid.getText().trim().isEmpty())
       {
            JOptionPane.showMessageDialog(rootPane, "Please Enter ID", "Error!", JOptionPane.ERROR_MESSAGE);
       }
       else
       {
            try
            {
                String rd="";
                if(uuser.isSelected()==true)
                {
                    rd=uuser.getText();
                }
                else
                {
                    rd=uadmin.getText();
                }
                String pass="";
                if((new String(upass.getPassword()).equals(new String(ucpass.getPassword()))))
                {
                pass=upass.getPassword().toString();    
                PreparedStatement pst = con.prepareStatement("delete from user where id=?");
                pst.setInt(1,Integer.valueOf(uid.getText()));
                int confirm=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Delete This User","Confirm",JOptionPane.YES_NO_OPTION);
                if(confirm==JOptionPane.YES_OPTION)
                {
                    pst.executeUpdate();
                    uid.setText("");
                    ufn.setText("");
                    uun.setText("");
                    upass.setText("");
                    ucpass.setText("");
                    logo.setIcon(null);
                    path1.setText("");
                    phn.setText("");
                    em.setText("");
                    formWindowOpened(null);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Password is not Matched", "Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
            catch(Exception e)
            {
                System.out.println("Error"+e.toString());
            }
        }
    }//GEN-LAST:event_removeActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dashboard u=new dashboard();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // Show and Hide Password
        if(show.isSelected())
        {
            upass.setEchoChar((char)0);
            ucpass.setEchoChar((char)0);
        }
        else
        {
            upass.setEchoChar('*');
            ucpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton browse;
    private javax.swing.ButtonGroup buttonGroupRadioButtons;
    private javax.swing.JButton edit;
    private javax.swing.JTextField em;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel path1;
    private javax.swing.JTextField phn;
    private javax.swing.JButton remove;
    private javax.swing.JCheckBox show;
    private javax.swing.JRadioButton uadmin;
    private javax.swing.JPasswordField ucpass;
    private javax.swing.JTextField ufn;
    private javax.swing.JTextField uid;
    private javax.swing.JPasswordField upass;
    private javax.swing.JTable user_jtable;
    private javax.swing.JLabel user_logo;
    private javax.swing.JTextField uun;
    private javax.swing.JRadioButton uuser;
    // End of variables declaration//GEN-END:variables
}
