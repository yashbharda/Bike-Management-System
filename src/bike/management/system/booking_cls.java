package bike.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class booking_cls 
{
    private int bike_id;
    private int idd;
    private String pucity;
    private String puadd;
    private String pudate;
    private String putime;
    private String dropcity;
    private String dropadd;
    private String dropdate;
    private String droptime;
    private int bike_price;

    public booking_cls() {
    }

    public booking_cls(int bike_id, int idd, String pucity, String puadd, String pudate, String putime, String dropcity, String dropadd, String dropdate, String droptime, int bike_price) {
        this.bike_id = bike_id;
        this.idd = idd;
        this.pucity = pucity;
        this.puadd = puadd;
        this.pudate = pudate;
        this.putime = putime;
        this.dropcity = dropcity;
        this.dropadd = dropadd;
        this.dropdate = dropdate;
        this.droptime = droptime;
        this.bike_price = bike_price;
    }

    public int getBike_id() {
        return bike_id;
    }

    public void setBike_id(int bike_id) {
        this.bike_id = bike_id;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getPucity() {
        return pucity;
    }

    public void setPucity(String pucity) {
        this.pucity = pucity;
    }

    public String getPuadd() {
        return puadd;
    }

    public void setPuadd(String puadd) {
        this.puadd = puadd;
    }

    public String getPudate() {
        return pudate;
    }

    public void setPudate(String pudate) {
        this.pudate = pudate;
    }

    public String getPutime() {
        return putime;
    }

    public void setPutime(String putime) {
        this.putime = putime;
    }

    public String getDropcity() {
        return dropcity;
    }

    public void setDropcity(String dropcity) {
        this.dropcity = dropcity;
    }

    public String getDropadd() {
        return dropadd;
    }

    public void setDropadd(String dropadd) {
        this.dropadd = dropadd;
    }

    public String getDropdate() {
        return dropdate;
    }

    public void setDropdate(String dropdate) {
        this.dropdate = dropdate;
    }

    public String getDroptime() {
        return droptime;
    }

    public void setDroptime(String droptime) {
        this.droptime = droptime;
    }

    public int getBike_price() {
        return bike_price;
    }

    public void setBike_price(int bike_price) {
        this.bike_price = bike_price;
    }
    
    
    public ResultSet getData(String query)
    {
        PreparedStatement ps;
        ResultSet rs=null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
           
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return rs;
    }
    
    public ArrayList<booking_cls> book_cls()
    {
        ArrayList<booking_cls> bookinglist = new ArrayList<>();
        ResultSet rs=getData("select * from reservation");
        
        try
        {
            while(rs.next())
            {
                booking_cls booklist=new booking_cls(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11));
                bookinglist.add(booklist);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        
        return bookinglist;
    }
    
    
}
