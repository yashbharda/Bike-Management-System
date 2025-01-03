package bike.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class bike_cls 
{
    private int bid;
    private int brand_id;
    private String bmodel;
    private String bfuel;
    private String bcolor;
    private int bprice;
    private String da;
    private String ad;
    private String mc;
    private String led;
    private String lc;
    private String aw;
    private String dc;
    private String pt;
    private String path;

    public bike_cls() {
    }

    public bike_cls(int bid, int brand_id, String bmodel, String bfuel, String bcolor, int bprice, String da, String ad, String mc, String led, String lc, String aw, String dc, String pt, String path) {
        this.bid = bid;
        this.brand_id = brand_id;
        this.bmodel = bmodel;
        this.bfuel = bfuel;
        this.bcolor = bcolor;
        this.bprice = bprice;
        this.da = da;
        this.ad = ad;
        this.mc = mc;
        this.led = led;
        this.lc = lc;
        this.aw = aw;
        this.dc = dc;
        this.pt = pt;
        this.path = path;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBmodel() {
        return bmodel;
    }

    public void setBmodel(String bmodel) {
        this.bmodel = bmodel;
    }

    public String getBfuel() {
        return bfuel;
    }

    public void setBfuel(String bfuel) {
        this.bfuel = bfuel;
    }

    public String getBcolor() {
        return bcolor;
    }

    public void setBcolor(String bcolor) {
        this.bcolor = bcolor;
    }

    public int getBprice() {
        return bprice;
    }

    public void setBprice(int bprice) {
        this.bprice = bprice;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getAw() {
        return aw;
    }

    public void setAw(String aw) {
        this.aw = aw;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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
    
    public ArrayList<bike_cls> b_cls()
    {
        ArrayList<bike_cls> bikelist = new ArrayList<>();
        ResultSet rs=getData("select * from bikes");
        
        try
        {
            while(rs.next())
            {
                bike_cls bike=new bike_cls(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
                bikelist.add(bike);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        
        return bikelist;
    }
    
    //Create a function to get bike by id
    public ArrayList<bike_cls> bikeListByCity(int brand_id)
    {
        ArrayList<bike_cls> bikelist = new ArrayList<>();
        ResultSet rs=getData("select * from bikes where brandid="+brand_id);
        try
        {
            while(rs.next())
            {
                bike_cls b = new bike_cls(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
                bikelist.add(b);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return bikelist; 
    }
    
    //create a function to search bike by id
    
    public bike_cls getBikeById(int bikeid)
    {
        String query="select * from bikes where id="+bikeid;
        ResultSet rs=getData(query);
        bike_cls bcls=null;
        try
        {
            if(rs.next())
            {
            
            bcls=new bike_cls(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
            }
            else
            {
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return bcls;
    }
}
