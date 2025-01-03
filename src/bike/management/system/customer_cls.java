package bike.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class customer_cls 
{
    private int idd;
    private String nm;
    private String dob;
    private String phn;
    private String em;
    private String ad;

    public customer_cls() {
    }

    public customer_cls(int idd, String nm, String dob, String phn, String em, String ad) {
        this.idd = idd;
        this.nm = nm;
        this.dob = dob;
        this.phn = phn;
        this.em = em;
        this.ad = ad;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
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
    
    
    public customer_cls getcustomerById(int customerid)
    {
        String query="select * from customer where id="+customerid;
        ResultSet rs=getData(query);
        customer_cls cuscls=null;
        try
        {
            rs.next();
            cuscls=new customer_cls(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return cuscls;
    }
    
    
    
    public ArrayList<customer_cls> cus_cls()
    {
        ArrayList<customer_cls> customerlist = new ArrayList<>();
        ResultSet rs=getData("select * from customer");
        
        try
        {
            while(rs.next())
            {
                customer_cls customer=new customer_cls(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                customerlist.add(customer);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        
        return customerlist;
    }
}
