package bike.management.system;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class bikes extends javax.swing.JFrame {
    Connection con;
    brand_cls bc=new brand_cls();
    bike_cls bikecls = new bike_cls();
    HashMap <Integer, String> map = bc.BrandsHashMap();
    public bikes() {    
        initComponents();
        this.setLocationRelativeTo(null);        
        // populatecombobox with brand
        populatecomboboxbrand();
        path.setVisible(false);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");   
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
        ImageIcon icon = new ImageIcon("D:\\project\\bike management system\\src\\bike\\management\\system\\images\\bike.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(bike_logo.getWidth(), bike_logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleicon = new ImageIcon(imgscale);
        bike_logo.setIcon(scaleicon);        
    }
    //Create a function to populate the Jcombobox_brand with brands
    // and to do that we will use a hashmap
    public void populatecomboboxbrand()
    {
        for (String s:map.values())
        {
            bbrand.addItem(s);
        }
    }
    // the function will return the image path
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
    
    public boolean validation()
    {
        if(bid.getText().trim().isEmpty() || bbrand.getSelectedItem()==null || bmodel.getText().trim().isEmpty() || bfuel.getSelectedItem()==null || bcolor.getSelectedItem()==null || bprice.getText().trim().isEmpty() || path.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Enter Valid Data", "Error!",JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bike_logo = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ad = new javax.swing.JCheckBox();
        da = new javax.swing.JCheckBox();
        led = new javax.swing.JCheckBox();
        lc = new javax.swing.JCheckBox();
        pt = new javax.swing.JCheckBox();
        aw = new javax.swing.JCheckBox();
        dc = new javax.swing.JCheckBox();
        mc = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bbrand = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bmodel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bfuel = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        bcolor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        bprice = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        brandlist = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        logoo = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        brand_id = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1090, 860));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(87, 96, 111));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bikes");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bike/management/system/images/icons8-cross-30.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(bike_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bike_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );

        path.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        ad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad.setText("Aerodynamics");

        da.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        da.setText("Dual ABS");

        led.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        led.setText("LED Lights");

        lc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lc.setText("Liquid Cooling");

        pt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pt.setText("Performance Tyres");

        aw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aw.setText("alloy wheels");

        dc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dc.setText("Digital console");

        mc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mc.setText("Modern Chassis");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lc)
                    .addComponent(da))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ad)
                    .addComponent(aw))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mc)
                    .addComponent(dc))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pt)
                    .addComponent(led))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(da)
                    .addComponent(ad)
                    .addComponent(mc)
                    .addComponent(led))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lc)
                    .addComponent(aw)
                    .addComponent(dc)
                    .addComponent(pt))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Features:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ID:");

        bid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Brand:");

        bbrand.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbrandActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Model:");

        bmodel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Fuel:");

        bfuel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bfuel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Color:");

        bcolor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bcolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Black", "Red", "Yellow", "Green", "Blue", "Gray", "Brown", "Orange" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Price/day:");

        bprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        add.setBackground(new java.awt.Color(25, 189, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        brandlist.setBackground(new java.awt.Color(155, 38, 182));
        brandlist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        brandlist.setForeground(new java.awt.Color(255, 255, 255));
        brandlist.setText("Brand List");
        brandlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandlistActionPerformed(evt);
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

        jButton4.setBackground(new java.awt.Color(155, 38, 182));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Bike List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(31, 68, 222));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Image:");

        logoo.setBackground(new java.awt.Color(102, 255, 102));
        logoo.setOpaque(true);

        browse.setBackground(new java.awt.Color(44, 62, 80));
        browse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setText("browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        brand_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        brand_id.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(brandlist, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(bbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(search)
                                            .addComponent(brand_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(logoo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(bprice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(bfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(brand_id))
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(bcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(bmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(bprice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browse)
                    .addComponent(logoo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(path)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandlist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked
    
    private void brandlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandlistActionPerformed
        // TODO add your handling code here:
        
        brand_list bl = new brand_list();
        bl.setVisible(true);
    }//GEN-LAST:event_brandlistActionPerformed
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
            if(validation())
            {
                int id=Integer.valueOf(bid.getText());
            int brand=Integer.valueOf(brand_id.getText());
            String model=bmodel.getText();
            String fuel=bfuel.getSelectedItem().toString();
            String color=bcolor.getSelectedItem().toString();
            int price=Integer.valueOf(bprice.getText());
            String img=path.getText();

            //Bike Features

            String daa="no";
            String add="no";
            String mcc="no";
            String ll="no";
            String lcc="no";
            String aww="no";
            String dcc="no";
            String ptt="no";

            if(da.isSelected())
            {
                daa="yes";
            }
            if(ad.isSelected())
            {
                add="yes";
            }
            if(mc.isSelected())
            {
                mcc="yes";
            }
            if(led.isSelected())
            {
                ll="yes";
            }
            if(lc.isSelected())
            {
                lcc="yes";
            }
            if(aw.isSelected())
            {
                aww="yes";
            }
            if(dc.isSelected())
            {
                dcc="yes";
            }
            if(pt.isSelected())
            {
                ptt="yes";
            }

            try
            {
                String query="insert into bikes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1,id);
                pst.setInt(2,brand);
                pst.setString(3,model);
                pst.setString(4,fuel);
                pst.setString(5,color);
                pst.setInt(6,price);
                pst.setString(7,daa);
                pst.setString(8,add);
                pst.setString(9,mcc);
                pst.setString(10,ll);
                pst.setString(11,lcc);
                pst.setString(12,aww);
                pst.setString(13,dcc);
                pst.setString(14,ptt);
                pst.setString(15,img);

                if(pst.executeUpdate() !=0)
                {
                    JOptionPane.showMessageDialog(rootPane, "The New Bike Has Been Added", "Bike Add", JOptionPane.INFORMATION_MESSAGE);
                    bid.setText("");
                    bmodel.setText("");
                    bprice.setText("");
                    path.setText("");
                    logoo.setIcon(null);
                    da.setSelected(false);
                    ad.setSelected(false);
                    mc.setSelected(false);
                    led.setSelected(false);
                    lc.setSelected(false);
                    aw.setSelected(false);
                    dc.setSelected(false);
                    pt.setSelected(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "The New Bike Has Been Not Added", "Bike Add", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error"+ex.toString());
            }
            }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        if(validation())
        {
            try
            {
                int id=Integer.valueOf(bid.getText());
                int brand=Integer.valueOf(brand_id.getText());
                String model=bmodel.getText();
                String fuel=bfuel.getSelectedItem().toString();
                String color=bcolor.getSelectedItem().toString();
                int price=Integer.valueOf(bprice.getText());
                String img=path.getText();
                
                //Bike Features

                String daa="no";
                String add="no";
                String mcc="no";
                String ll="no";
                String lcc="no";
                String aww="no";
                String dcc="no";
                String ptt="no";

                if(da.isSelected())
                {
                    daa="yes";
                }
                if(ad.isSelected())
                {
                    add="yes";
                }
                if(mc.isSelected())
                {
                    mcc="yes";
                }
                if(led.isSelected())
                {   
                    ll="yes";
                }
                if(lc.isSelected())
                {
                    lcc="yes";
                }
                if(aw.isSelected())
                {
                    aww="yes";
                }
                if(dc.isSelected())
                {
                    dcc="yes";
                }
                if(pt.isSelected())
                {
                    ptt="yes";
                }

                String query="UPDATE bikes SET brandid=?,model=?,fuel=?,color=?,price=?,dual_abs=?,aerodynamics=?,modern_chassis=?,led_lights=?,liquid_cooling=?,alloy_wheels=?,digital_console=?,performance_tyres=?,img=? WHERE id=?";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1,brand);
                pst.setString(2,model);
                pst.setString(3,fuel);
                pst.setString(4,color);
                pst.setInt(5,price);
                pst.setString(6,daa);
                pst.setString(7,add);
                pst.setString(8,mcc);
                pst.setString(9,ll);
                pst.setString(10,lcc);
                pst.setString(11,aww);
                pst.setString(12,dcc);
                pst.setString(13,ptt);
                pst.setString(14,img);
                pst.setInt(15,id);

                if(pst.executeUpdate() !=0)
                {
                    JOptionPane.showMessageDialog(rootPane, "The Bike Has Been Edited", "Bike Edit", JOptionPane.INFORMATION_MESSAGE);
                    bid.setText("");
                    bmodel.setText("");
                    bprice.setText("");
                    logoo.setIcon(null);
                    path.setText("");
                    da.setSelected(false);
                    ad.setSelected(false);
                    mc.setSelected(false);
                    led.setSelected(false);
                    lc.setSelected(false);
                    aw.setSelected(false);
                    dc.setSelected(false);
                    pt.setSelected(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "The Bike Has Been Not Edited", "Bike Edit", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error"+ex.toString());
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        if(bid.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Enter ID", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                int id=Integer.valueOf(bid.getText());

                String query="delete from bikes WHERE id=?";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1,id);

                int confirm=JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Delete This Bike","Confirm",JOptionPane.YES_NO_OPTION);
            
                if(confirm==JOptionPane.YES_OPTION)
                {
                    pst.executeUpdate();
                    bid.setText("");
                    bmodel.setText("");
                    bprice.setText("");
                    path.setText("");
                    logoo.setIcon(null);
                    da.setSelected(false);
                    ad.setSelected(false);
                    mc.setSelected(false);
                    led.setSelected(false);
                    lc.setSelected(false);
                    aw.setSelected(false);
                    dc.setSelected(false);
                    pt.setSelected(false);
                }
            }
            catch(Exception e)
            {
                System.out.println("Error"+e.toString());
            }
        }
    }//GEN-LAST:event_removeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // Search a id to display all control:
        if(bid.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Please Enter ID for Search", "", HEIGHT);
        }
        else
        {
            int bikeid=Integer.valueOf(bid.getText());
            bike_cls bike_id =bikecls.getBikeById(bikeid);
            if(bike_id==null)
            {
                JOptionPane.showMessageDialog(rootPane, "No Bike With This ID", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                bid.setText(String.valueOf(bike_id.getBid()));
                bbrand.setSelectedItem(map.get(bike_id.getBrand_id()));
                brand_id.setText(String.valueOf(bike_id.getBrand_id()));
                bmodel.setText(bike_id.getBmodel());
                bfuel.setSelectedItem(bike_id.getBfuel());
                bcolor.setSelectedItem(bike_id.getBcolor());
                bprice.setText(String.valueOf(bike_id.getBprice()));
                Object value=String.valueOf(bike_id.getPath());
                String photoname=value.toString();
                ImageIcon icon=new ImageIcon(
                new ImageIcon(photoname).getImage().getScaledInstance(110,110,Image.SCALE_DEFAULT));
                logoo.setIcon(icon);
                path.setText(String.valueOf(bike_id.getPath()));
                if(bike_id.getDa().equals("yes")){da.setSelected(true);}
                if(bike_id.getAd().equals("yes")){ad.setSelected(true);}
                if(bike_id.getMc().equals("yes")){mc.setSelected(true);}
                if(bike_id.getLed().equals("yes")){led.setSelected(true);}
                if(bike_id.getLc().equals("yes")){lc.setSelected(true);}
                if(bike_id.getAw().equals("yes")){aw.setSelected(true);}
                if(bike_id.getDc().equals("yes")){dc.setSelected(true);}
                if(bike_id.getPt().equals("yes")){pt.setSelected(true);}
            }    
        }
    }//GEN-LAST:event_searchActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        //browse and display image
        String imagePath=selectImage();
        displayimage(logoo.getWidth(),logoo.getHeight(),imagePath,logoo);
        //display the image path
        path.setText(imagePath);
    }//GEN-LAST:event_browseActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        bike_list bl=new bike_list();
        bl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    private void bbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbrandActionPerformed
        // Get the selected brand Id:
        int brandid=0;
        for(Map.Entry<Integer, String> entry:map.entrySet())
        {
            if(entry.getValue().equals(bbrand.getSelectedItem().toString()))
            {
                brandid=entry.getKey();
            }
        }
        brand_id.setText(String.valueOf(brandid));
    }//GEN-LAST:event_bbrandActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bikes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ad;
    private javax.swing.JButton add;
    private javax.swing.JCheckBox aw;
    private javax.swing.JComboBox<String> bbrand;
    private javax.swing.JComboBox<String> bcolor;
    private javax.swing.JComboBox<String> bfuel;
    private javax.swing.JTextField bid;
    private javax.swing.JLabel bike_logo;
    private javax.swing.JTextField bmodel;
    private javax.swing.JTextField bprice;
    private static javax.swing.JLabel brand_id;
    private javax.swing.JButton brandlist;
    private javax.swing.JButton browse;
    private javax.swing.JCheckBox da;
    private javax.swing.JCheckBox dc;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox lc;
    private javax.swing.JCheckBox led;
    private javax.swing.JLabel logoo;
    private javax.swing.JCheckBox mc;
    private javax.swing.JLabel path;
    private javax.swing.JCheckBox pt;
    private javax.swing.JButton remove;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
