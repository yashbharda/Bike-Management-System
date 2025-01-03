package bike.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class user_cls 
{
    private int idd;
    private String fname;
    private String uname;
    private String pass;
    
    private String user_type;
    private String path;
    private String phn;
    private String em;

    public user_cls() {
    }

    public user_cls(int idd, String fname, String uname, String pass,  String user_type, String path, String phn, String em) {
        this.idd = idd;
        this.fname = fname;
        this.uname = uname;
        this.pass = pass;
        
        this.user_type = user_type;
        this.path = path;
        this.phn = phn;
        this.em = em;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    
    
    
    public user_cls getuserById(int userid)
    {
        String query="select * from user where id="+userid;
        ResultSet rs=getData(query);
        user_cls ucls=null;
        try
        {
            rs.next();
            ucls=new user_cls(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return ucls;
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
    
    public ArrayList<user_cls> userList()
    {
        ArrayList<user_cls> userlist = new ArrayList<>();
        ResultSet rs=getData("select * from user");
        
        try
        {
            while(rs.next())
            {
                user_cls user=new user_cls(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                userlist.add(user);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }   
        return userlist;
    }
}

