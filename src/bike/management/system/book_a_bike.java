package bike.management.system;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

public class book_a_bike extends javax.swing.JFrame {
    brand_cls bc=new brand_cls();
    location_cls location = new location_cls();
    bike_cls bike=new bike_cls();
    HashMap <Integer, String> map = bc.BrandsHashMap();
    HashMap <String, Integer> mapp = location.citysHashMap();
    MatteBorder border=BorderFactory.createMatteBorder(0, 0, 2,0,new Color(0,0,153));
    MatteBorder panel_border=BorderFactory.createMatteBorder(3, 3, 3,3,Color.darkGray);
    Connection con;
    public book_a_bike() {
        initComponents();        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString()); 
        }
        this.setLocationRelativeTo(null);        
        // populatecombobox with brand
        populatecomboboxbrand();        
        // populatecombobox with city
        populatecomboboxcity();        
        sbike.setBorder(border);
        scus.setBorder(border);
        puld.setBorder(border);
        dold.setBorder(border);        
        sel_bike.setBorder(panel_border);
        sc.setBorder(panel_border);
        puldate.setBorder(panel_border);
        doldate.setBorder(panel_border);        
        //display icon in label
        scaleimage(); 
    }
    public void scaleimage()
    {
        ImageIcon icon = new ImageIcon("D:\\project\\bike management system\\src\\bike\\management\\system\\images\\calendar1.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(book_logo.getWidth(), book_logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleicon = new ImageIcon(imgscale);
        book_logo.setIcon(scaleicon);        
    }    
    //Create a static function Display Customer Id and Name
    public static void displaycustomer(String id,String name)
    {
        cus.setText(name);
        idd.setText(id);
    }    
    public static void displaybike(String id,String model,String price)
    {
        bike_id.setText(id);
        bike_model.setText(model);
        bike_price.setText(price);   
    }    
    public void populatecomboboxbrand()
    {
        for (String s:map.values()) 
        {
            sbrand.addItem(s);
        }
    }
    public void populatecomboboxcity()
    {
        for (String s:mapp.keySet()) 
        {
            pucity.addItem(s);
            dropcity.addItem(s);
        }
    }    
    public void populatecomboboxcity(String address,String city)
    {
        if(address.equals("pickup"))
        {
            puadd.removeAllItems();
            for(location_cls l:location.locationListByCity(city))
            {
                puadd.addItem(l.getAddress());
            }
        }
        else if(address.equals("dropoff"))
        {
            dropadd.removeAllItems();
            for(location_cls l:location.locationListByCity(city))
            {
                dropadd.addItem(l.getAddress());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        book_logo = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        sel_bike = new javax.swing.JPanel();
        sbike = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sbrand = new javax.swing.JComboBox<>();
        brand_id = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bike_id = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        select_bike = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        bike_model = new javax.swing.JLabel();
        sc = new javax.swing.JPanel();
        scus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idd = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        puldate = new javax.swing.JPanel();
        puld = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pucity = new javax.swing.JComboBox<>();
        puadd = new javax.swing.JComboBox<>();
        pudate = new com.toedter.calendar.JDateChooser();
        putime = new javax.swing.JTextField();
        doldate = new javax.swing.JPanel();
        dold = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dropcity = new javax.swing.JComboBox<>();
        dropadd = new javax.swing.JComboBox<>();
        dropdate = new com.toedter.calendar.JDateChooser();
        droptime = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bike_price = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bookinglist = new javax.swing.JButton();
        booking_edit = new javax.swing.JButton();
        book_the_bike = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1340, 870));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(61, 61, 61));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book a Bike");

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
                .addGap(21, 21, 21)
                .addComponent(book_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(book_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        path.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        sel_bike.setBackground(new java.awt.Color(204, 204, 204));
        sel_bike.setPreferredSize(new java.awt.Dimension(609, 234));

        sbike.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sbike.setForeground(new java.awt.Color(0, 0, 155));
        sbike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sbike.setText("Select a Bike");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Brand:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Bike:");

        sbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbrandActionPerformed(evt);
            }
        });

        brand_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        brand_id.setText("000");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("ID:");

        bike_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bike_id.setText("000");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("ID:");

        select_bike.setBackground(new java.awt.Color(44, 62, 80));
        select_bike.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        select_bike.setForeground(new java.awt.Color(255, 255, 255));
        select_bike.setText("Select Bike");
        select_bike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_bikeActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("MODEL:");

        bike_model.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bike_model.setText("000");

        javax.swing.GroupLayout sel_bikeLayout = new javax.swing.GroupLayout(sel_bike);
        sel_bike.setLayout(sel_bikeLayout);
        sel_bikeLayout.setHorizontalGroup(
            sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sbike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sel_bikeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sel_bikeLayout.createSequentialGroup()
                        .addComponent(sbrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brand_id))
                    .addGroup(sel_bikeLayout.createSequentialGroup()
                        .addComponent(select_bike, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sel_bikeLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bike_model))
                            .addGroup(sel_bikeLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bike_id)))
                        .addGap(0, 101, Short.MAX_VALUE)))
                .addGap(96, 96, 96))
        );
        sel_bikeLayout.setVerticalGroup(
            sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sel_bikeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sbike)
                .addGap(29, 29, 29)
                .addGroup(sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand_id)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(select_bike, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bike_id)
                    .addComponent(jLabel18))
                .addGap(21, 21, 21)
                .addGroup(sel_bikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bike_model)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sc.setBackground(new java.awt.Color(204, 204, 204));

        scus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        scus.setForeground(new java.awt.Color(0, 0, 155));
        scus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scus.setText("Select Customer");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Customer:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("ID:");

        idd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idd.setText("000");

        jButton1.setBackground(new java.awt.Color(44, 62, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scLayout = new javax.swing.GroupLayout(sc);
        sc.setLayout(scLayout);
        scLayout.setHorizontalGroup(
            scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(scLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idd))
                    .addGroup(scLayout.createSequentialGroup()
                        .addComponent(cus, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        scLayout.setVerticalGroup(
            scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scus)
                .addGroup(scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idd)
                    .addComponent(jLabel8))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        puldate.setBackground(new java.awt.Color(204, 204, 204));

        puld.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        puld.setForeground(new java.awt.Color(0, 0, 155));
        puld.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puld.setText("Pick Up Location & Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("City:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Address:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Date:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Time:");

        pucity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pucityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout puldateLayout = new javax.swing.GroupLayout(puldate);
        puldate.setLayout(puldateLayout);
        puldateLayout.setHorizontalGroup(
            puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(puld, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
            .addGroup(puldateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(puadd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pucity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pudate, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(putime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        puldateLayout.setVerticalGroup(
            puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puldateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puld)
                .addGap(25, 25, 25)
                .addGroup(puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(pucity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(puadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(pudate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(puldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(putime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        doldate.setBackground(new java.awt.Color(204, 204, 204));

        dold.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dold.setForeground(new java.awt.Color(0, 0, 155));
        dold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dold.setText("Drop Off Location & Date");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("City:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Address:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Date:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Time:");

        dropcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropcityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doldateLayout = new javax.swing.GroupLayout(doldate);
        doldate.setLayout(doldateLayout);
        doldateLayout.setHorizontalGroup(
            doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dold, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
            .addGroup(doldateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(doldateLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(47, 47, 47)
                        .addComponent(droptime))
                    .addGroup(doldateLayout.createSequentialGroup()
                        .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(20, 20, 20)
                        .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dropadd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dropcity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dropdate, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doldateLayout.setVerticalGroup(
            doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doldateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dold)
                .addGap(25, 25, 25)
                .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(dropcity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dropadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(dropdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doldateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(droptime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        bike_price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bike_price.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Total Price:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(12, 12, 12)
                .addComponent(bike_price, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bike_price)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bookinglist.setBackground(new java.awt.Color(155, 38, 182));
        bookinglist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bookinglist.setForeground(new java.awt.Color(255, 255, 255));
        bookinglist.setText("Booking List");
        bookinglist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookinglistActionPerformed(evt);
            }
        });

        booking_edit.setBackground(java.awt.Color.orange);
        booking_edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        booking_edit.setForeground(new java.awt.Color(255, 255, 255));
        booking_edit.setText("Edit / Remove Booking ");
        booking_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_editActionPerformed(evt);
            }
        });

        book_the_bike.setBackground(new java.awt.Color(25, 189, 255));
        book_the_bike.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        book_the_bike.setForeground(new java.awt.Color(255, 255, 255));
        book_the_bike.setText("Book The Bike");
        book_the_bike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_the_bikeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sel_bike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(book_the_bike, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookinglist, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(booking_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(puldate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doldate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(puldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sel_bike, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(doldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookinglist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book_the_bike, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(booking_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(path)
                .addGap(0, 8, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        customer_list cl = new customer_list("add");
        cl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void select_bikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_bikeActionPerformed
        //Get the brand id
        int brand_idd=Integer.valueOf(brand_id.getText());
        // show bike list form:
        bikelist_bybrand bb=new bikelist_bybrand(brand_idd,"add");
        bb.setVisible(true);
    }//GEN-LAST:event_select_bikeActionPerformed
    private void sbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbrandActionPerformed
        int brandid=0;
        for(Map.Entry<Integer, String> entry:map.entrySet())
        {
            if(entry.getValue().equals(sbrand.getSelectedItem().toString()))
            {
                brandid=entry.getKey();
            }
        }
        brand_id.setText(String.valueOf(brandid));
    }//GEN-LAST:event_sbrandActionPerformed
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        dashboard uh=new dashboard();
        uh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked
    private void pucityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pucityActionPerformed
        //populate jCombobox address depending on the citycombobox
        populatecomboboxcity("pickup",pucity.getSelectedItem().toString());
    }//GEN-LAST:event_pucityActionPerformed
    private void bookinglistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookinglistActionPerformed
        //Display The booking_list Form
        booking_list blist = new booking_list("add");
        blist.setVisible(true);
    }//GEN-LAST:event_bookinglistActionPerformed
    private void dropcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropcityActionPerformed
        //populate jCombobox address depending on the citycombobox
        populatecomboboxcity("dropoff",dropcity.getSelectedItem().toString());
    }//GEN-LAST:event_dropcityActionPerformed
    private void book_the_bikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_the_bikeActionPerformed
        // Add the records in Reservation table:
        String pattern="^(0[0-9]| 1[0-9]| 2[0-3]):[0-5][0-9]";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(putime.getText());        
        Matcher mp=p.matcher(droptime.getText());
        //Validation for All control
        if(sbrand.getSelectedItem()==null && cus.getText().trim().isEmpty() && pucity.getSelectedItem()==null && puadd.getSelectedItem()==null 
           && pudate.getDate()==null && putime.getText().trim().isEmpty()
           && dropcity.getSelectedItem()==null && dropadd.getSelectedItem()==null 
           && dropdate.getDate()==null && droptime.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Enter Valid Data Book Bike Data", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                String query="insert into reservation (bike_id, customer_id, pickup_city, pickup_address, pickup_date, pickup_time, drop_city, drop_address, drop_date, drop_time, total_price) values (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1,Integer.valueOf(bike_id.getText()));
                pst.setInt(2,Integer.valueOf(idd.getText()));
                pst.setString(3,pucity.getSelectedItem().toString());
                pst.setString(4,puadd.getSelectedItem().toString());
                java.util.Date sqlDate = (java.util.Date) pudate.getDate();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                String d=sdf.format(sqlDate);
                pst.setString(5,d);
                pst.setString(6,putime.getText());
                pst.setString(7,dropcity.getSelectedItem().toString());
                pst.setString(8,dropadd.getSelectedItem().toString());
                java.util.Date sqlD = (java.util.Date) dropdate.getDate();
                SimpleDateFormat simpledate=new SimpleDateFormat("yyyy-MM-dd");
                String date=simpledate.format(sqlD);
                pst.setString(9,date);
                pst.setString(10,droptime.getText());
                pst.setString(11,bike_price.getText());
                
                // check if the drop off date is before pickup date
                if(sqlDate.after(sqlD))
                {
                    JOptionPane.showMessageDialog(rootPane,"The Drop off date Must be After Pickup date","", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if(pst.executeUpdate()!=0)
                    {
                        JOptionPane.showMessageDialog(rootPane, "This Bike Has Been Booked", "Booking", JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Bike Not Booked", "Booking", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
                catch(Exception e)
                {
                    System.out.println("Error"+e.toString());
                }
        }
    }//GEN-LAST:event_book_the_bikeActionPerformed
    private void booking_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_editActionPerformed
        // TODO add your handling code here:
        booking_edit bedit = new booking_edit();
        bedit.setVisible(true);
    }//GEN-LAST:event_booking_editActionPerformed
    public static void main(String args[]) {
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book_a_bike().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel bike_id;
    private static javax.swing.JLabel bike_model;
    private static javax.swing.JLabel bike_price;
    private javax.swing.JLabel book_logo;
    private javax.swing.JButton book_the_bike;
    private javax.swing.JButton booking_edit;
    private javax.swing.JButton bookinglist;
    private static javax.swing.JLabel brand_id;
    private static javax.swing.JTextField cus;
    private javax.swing.JLabel dold;
    private javax.swing.JPanel doldate;
    private javax.swing.JComboBox<String> dropadd;
    private javax.swing.JComboBox<String> dropcity;
    private com.toedter.calendar.JDateChooser dropdate;
    private javax.swing.JTextField droptime;
    private static javax.swing.JLabel idd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel path;
    private javax.swing.JComboBox<String> puadd;
    private static javax.swing.JComboBox<String> pucity;
    private com.toedter.calendar.JDateChooser pudate;
    private javax.swing.JLabel puld;
    private javax.swing.JPanel puldate;
    private javax.swing.JTextField putime;
    private javax.swing.JLabel sbike;
    private javax.swing.JComboBox<String> sbrand;
    private javax.swing.JPanel sc;
    private javax.swing.JLabel scus;
    private javax.swing.JPanel sel_bike;
    private javax.swing.JButton select_bike;
    // End of variables declaration//GEN-END:variables
}
