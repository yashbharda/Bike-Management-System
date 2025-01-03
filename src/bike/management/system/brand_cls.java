package bike.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class brand_cls 
{
    private int id;
    private String name;
    private String logo;

    public brand_cls()
    {
        
    }
    
    public brand_cls(int _id, String _name, String _logo) {
        this.id = _id;
        this.name = _name;
        this.logo = _logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
        
    public  ResultSet getData(String query)
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
    
    //Create a function to populate the Jcombobox_brand with brands
    // and to do that we will use a hashmap
    public HashMap<Integer, String> BrandsHashMap()
    {
        HashMap<Integer, String>Brands_map = new HashMap<Integer, String>();
        ResultSet rs=getData("select * from brand");
        
        try
        {
            while(rs.next())
            {
                Brands_map.put(rs.getInt(1),rs.getString(2));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return Brands_map;
    }
    
    public ArrayList<brand_cls> brandList()
    {
        ArrayList<brand_cls> brandlist = new ArrayList<>();
        ResultSet rs=getData("select * from brand");
        
        try
        {
            while(rs.next())
            {
                brand_cls user=new brand_cls(rs.getInt(1),rs.getString(2),rs.getString(3));
                brandlist.add(user);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }   
        return brandlist;
    }
    
    public brand_cls getBrandById(int brandidd)
    {
        String query="select * from brand where id="+brandidd;
        ResultSet rs=getData(query);
        brand_cls brandcls=null;
        try
        {
            rs.next();
            brandcls=new brand_cls(rs.getInt(1),rs.getString(2),rs.getString(3));
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return brandcls;
    }

}
    


