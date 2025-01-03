/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.tools.DocumentationTool.Location;

/**
 *
 * @author Dell
 */
public class location_cls 
{   
    private int id;
    private String city;
    private String address;

    public location_cls() {
    }

    public location_cls(int id, String city, String address) {
        this.id = id;
        this.city = city;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    
    //Create a function to populate the Jcombobox_brand with brands
    // and to do that we will use a hashmap
    public HashMap<String, Integer> citysHashMap()
    {
        HashMap<String, Integer>citys_map = new HashMap<String, Integer>();
        ResultSet rs=getData("select * from location");
        
        try
        {
            while(rs.next())
            {
                citys_map.put(rs.getString(2),rs.getInt(1));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return citys_map;
    }
    /*public HashMap<String, Integer> addressHashMap()
    {
        HashMap<String, Integer>address_map = new HashMap<String, Integer>();
        ResultSet rs=getData("select * from location");
        
        try
        {
            while(rs.next())
            {
                address_map.put(rs.getString(3),rs.getInt(1));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return address_map;
    }*/
    
    public ArrayList<location_cls> locationListByCity(String city)
    {
        ArrayList<location_cls> loclist = new ArrayList<>();
        ResultSet rs=getData("select * from location where city='"+city+"'");
        try
        {
            while(rs.next())
            {
                location_cls l = new location_cls(rs.getInt(1),rs.getString(2),rs.getString(3));
                loclist.add(l);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.toString());
        }
        return loclist; 
    } 
}
