package bike.management.system;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class booking_list extends javax.swing.JFrame {
    Connection con;
    String add_edit;
    public booking_list(String add_or_edit) {
        initComponents();
        this.setLocationRelativeTo(null);
        add_edit=add_or_edit;
        if(add_edit.equals("add"))
        {
            sel_booking.setEnabled(false);
        }
        //Connection with database
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
        ImageIcon icon = new ImageIcon("D:\\project\\bike management system\\src\\bike\\management\\system\\images\\list.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(booking_logo.getWidth(), booking_logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleicon = new ImageIcon(imgscale);
        booking_logo.setIcon(scaleicon);        
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        booking_logo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        booking_list = new javax.swing.JTable();
        sel_booking = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Booking List");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bike/management/system/images/icons8-cross-30.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(booking_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(booking_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        booking_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        booking_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BIKE_ID", "CUSTOMER_ID", "PICKUP_CITY", "PICKUP_ADDRESS", "PICKUP_DATE", "PICKUP_TIME", "DROPOFF_CITY", "DROPOFF_ADDRESS", "DROPOFF_DATE", "DROPOFF_TIME", "TOTAL_PRICE"
            }
        ));
        booking_list.setRowHeight(50);
        booking_list.setSelectionBackground(new java.awt.Color(0, 153, 153));
        booking_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booking_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(booking_list);
        if (booking_list.getColumnModel().getColumnCount() > 0) {
            booking_list.getColumnModel().getColumn(0).setResizable(false);
        }

        sel_booking.setBackground(new java.awt.Color(44, 62, 80));
        sel_booking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sel_booking.setForeground(new java.awt.Color(255, 255, 255));
        sel_booking.setText("Select Booking");
        sel_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel_bookingActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(235, 173, 33));
        print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sel_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sel_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked
    private void booking_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_listMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_booking_listMouseClicked
    private void sel_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel_bookingActionPerformed
        // Get the Selected Booking
        try
        {
            int i=booking_list.getSelectedRow();
            String id=booking_list.getValueAt(i,0).toString();
            String bikeeid=booking_list.getValueAt(i,1).toString();
            String cusid=booking_list.getValueAt(i,2).toString();
            String ppucity=booking_list.getValueAt(i,3).toString();
            String ppuadd=booking_list.getValueAt(i,4).toString();
            String ppudate=booking_list.getValueAt(i,5).toString();
            String pputime=booking_list.getValueAt(i,6).toString();
            String ddropcity=booking_list.getValueAt(i,7).toString();
            String ddropadd=booking_list.getValueAt(i,8).toString();
            String ddropdate=booking_list.getValueAt(i,9).toString();
            String ddroptime=booking_list.getValueAt(i,10).toString();
            String pprice=booking_list.getValueAt(i,11).toString();
            //Set the customer id & name in the book a bike form
            //booking_edit.displaybooking(id,bikeid,cusid,ppucity,ppuadd,ppudate,pputime,ddropcity,ddropadd,ddropdate,ddroptime,pprice);
            booking_edit.displaybooking(id, bikeeid, cusid, ppucity, ppuadd, ppudate, pputime, ddropcity, ddropadd, ddropdate, ddroptime, pprice);
            this.dispose();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
           // JOptionPane.showMessageDialog(rootPane, "No Booking Selected", "Error!", HEIGHT);
        }
    }//GEN-LAST:event_sel_bookingActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Display records in Jtable:
        booking_list.setRowHeight(50);
        try
        {
            PreparedStatement pst=con.prepareStatement("select * from reservation");
            ResultSet rs=pst.executeQuery();
            DefaultTableModel dtm=(DefaultTableModel) booking_list.getModel();
            dtm.setRowCount(0);
            while(rs.next())
            {
                dtm.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
    }//GEN-LAST:event_formWindowOpened
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // Print The Selected Booking
        try
        {
            File file = new File("D:\\project\\Bill Print\\booking.txt");
            if(!file.exists())
            {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsolutePath());
            BufferedWriter bw = new BufferedWriter(fw);
            int i=booking_list.getSelectedRow();
            String id=booking_list.getValueAt(i,0).toString();
            String bikeid=booking_list.getValueAt(i,1).toString();
            String cusid=booking_list.getValueAt(i,2).toString();
            String ppucity=booking_list.getValueAt(i,3).toString();
            String ppuadd=booking_list.getValueAt(i,4).toString();
            String ppudate=booking_list.getValueAt(i,5).toString();
            String pputime=booking_list.getValueAt(i,6).toString();
            String ddropcity=booking_list.getValueAt(i,7).toString();
            String ddropadd=booking_list.getValueAt(i,8).toString();
            String ddropdate=booking_list.getValueAt(i,9).toString();
            String ddroptime=booking_list.getValueAt(i,10).toString();
            String pprice=booking_list.getValueAt(i,11).toString();
            String customer=new bike.management.system.customer_cls().getcustomerById(Integer.valueOf(cusid)).getNm();
            String bikemodel=new bike.management.system.bike_cls().getBikeById(Integer.valueOf(bikeid)).getBmodel();
            bw.write("Booking ID:"+id);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("Bike ID:"+bikeid+ " | Bike Model: " + bikemodel);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("Customer ID:"+cusid+ " | Customer FullName: " + customer);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("PickUp City:"+ppucity);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("PickUp Address:"+ppuadd);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("PickUp Date:"+ ppudate + " | Time:"+ pputime);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("Dropoff City:"+ddropcity);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("Dropoff Address:"+ddropadd);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("Dropoff Date:"+ ddropdate + " | Time:" + ddroptime);
            bw.newLine();
            bw.write("-------------------------------------------------------------");
            bw.newLine();
            bw.write("Total Price:"+pprice);
            JOptionPane.showMessageDialog(rootPane, "Data Has Been Exported", "Export", HEIGHT);
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
    }//GEN-LAST:event_printActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking_list("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booking_list;
    private javax.swing.JLabel booking_logo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton print;
    private javax.swing.JButton sel_booking;
    // End of variables declaration//GEN-END:variables
}