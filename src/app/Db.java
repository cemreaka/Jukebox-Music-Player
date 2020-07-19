/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aynur Cemre Aka
 */
public class Db {
    private String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey ";
    private String user = "root";
    private String password = "Cw8bmeCpek";
    
    private Connection connect() {
        Connection c;
        try {
            c = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            c = null;
        }
        return c;
    }
    public void addCustomer(Customer c) throws Exception{
        Connection connection = connect();       
        PreparedStatement addCustomer = connection.prepareStatement("INSERT INTO jukeboxx.customer(FIRSTNAME, LASTNAME, USERNAME, PW) VALUES(?,?,?,?);"); 
        addCustomer.setString(1, c.getFirstName());
        addCustomer.setString(2, c.getLastName());
        addCustomer.setString(3, c.getUserName());
        addCustomer.setString(4, c.getPassword());
        addCustomer.execute();
        connection.close();           
    }  
    public void getNameOfSong(JComboBox cb)
    {
        Connection connection =connect();
        try(PreparedStatement find = connection.prepareStatement("SELECT songName "+"FROM JUKEBOXX.song"))
        {
            ResultSet findNames = find.executeQuery();
            while(findNames.next())
            {
                cb.addItem(findNames.getString(1));
            }
        } catch(SQLException s)
        {
            System.err.println("An error has occured."+s.getMessage());
        }
    }   
    public String getFirstName(String username)
    {
        Connection c = connect();
        try (PreparedStatement f = c.prepareStatement(
                    "SELECT FIRSTNAME FROM JUKEBOXX.CUSTOMER WHERE USERNAME = ?")) 
        {
            f.setString(1,username);
            ResultSet rs= f.executeQuery();
            String firstname=new String();
            while(rs.next())
            {
               firstname = rs.getString("FIRSTNAME"); 
            }           
            return firstname;
        } catch(SQLException e)
        {
            System.err.println("An error has occured." + e.getMessage());
            return null;
        }
    }  
    public String getLastName(String username)
    {
        Connection c = connect();
        try (PreparedStatement f = c.prepareStatement(
                    "SELECT LASTNAME FROM JUKEBOXX.CUSTOMER WHERE USERNAME = ?")) 
        {
            f.setString(1,username);
            ResultSet rs= f.executeQuery();
            String lastname=new String();
            while(rs.next())
            {
               lastname = rs.getString("LASTNAME"); 
            }           
            return lastname;
        } catch(SQLException e)
        {
            System.err.println("An error has occured." + e.getMessage());
            return null;
        }
    }
    public String getPassword(String username)
    {
        Connection c = connect();
        try (PreparedStatement f = c.prepareStatement(
                    "SELECT PW FROM JUKEBOXX.CUSTOMER WHERE USERNAME = ?")) 
        {
            f.setString(1,username);
            ResultSet rs= f.executeQuery();
            String pw=new String();
            while(rs.next())
            {
               pw = rs.getString("PW"); 
            }           
            return pw;
        } catch(SQLException e)
        {
            System.err.println("An error has occured." + e.getMessage());
            return null;
        }
    }   
    public void deleteSong(String name) throws Exception
    {
        Connection c = connect();
        PreparedStatement f = c.prepareStatement("DELETE "+"FROM JUKEBOXX.song WHERE songName=?");
        f.setString(1, name);
        f.execute();
    }
    public void addSong(String username, String name, String genre, String artist, String path) throws Exception
    {
        Connection c = connect();       
        PreparedStatement f = c.prepareStatement("INSERT INTO jukeboxx.SONG(USERNAME,SONGNAME, SONGGENRE, ARTISTNAME, SONGPATH) VALUES(?,?,?,?,?);");
        f.setString(1, username);          
        f.setString(2, name);
        f.setString(3,genre);
        f.setString(4,artist);
        f.setString(5, path);
        f.execute();
    }    
    public boolean checkCustomer(String username, String password)
    {
        Connection c = connect();
        ResultSet rs;
        try(PreparedStatement f = c.prepareStatement("SELECT * FROM JUKEBOXX.CUSTOMER WHERE USERNAME = ? AND PW= ?;")){
            f.setString(1,username);
            f.setString(2,password);
            rs=f.executeQuery();
            
            return rs.next();
            
        } catch(SQLException e)
        {
           System.err.println("An error has occured. "+e.getMessage());
           return false;
        }
    }    
    public void searchGenre(String genre, JComboBox cb)
    {
        ResultSet rs;
        Connection connection = connect();
        try (PreparedStatement find = connection.prepareStatement(
                    "SELECT ARTISTNAME FROM JUKEBOXX.SONG WHERE SONGGENRE=? AND USERNAME=?")) 
        {
            find.setString(1,genre);
            find.setString(2,"system");
            rs = find.executeQuery();          
            while(rs.next())
            {
                cb.addItem(rs.getString(1));                                       
            }
        }
        catch (SQLException ex) {
            System.err.println("An error has occured." + ex.getMessage());
        }
    }   
    public void searchArtist(String artist, String genre, JTable songList, DefaultTableModel modelTable )
    {
        ResultSet rs;
        Connection connection = connect();
        ResultSetMetaData rsmd;
        try (PreparedStatement find = connection.prepareStatement(
                    "SELECT SONGNAME,SONGGENRE,ARTISTNAME,SONGPATH FROM JUKEBOXX.SONG WHERE SONGGENRE=? AND ARTISTNAME=? AND USERNAME=?")) 
        {
            find.setString(1,genre);
            find.setString(2, artist);
            find.setString(3,"system");
            rs = find.executeQuery();
            rsmd = rs.getMetaData();
            int columnNumber = rsmd.getColumnCount();  
            while(rs.next())
            {
                Object[] objects = new Object[columnNumber];
                for(int i = 0; i < columnNumber; i++)
                {
                    objects[i]=rs.getObject(i+1);
                }
                modelTable.addRow(objects);                                        
            }
        }
        catch (SQLException ex) {
            System.err.println("An error has occured." + ex.getMessage());
        }
    }
    public void getInfo(String username, JTable songList, DefaultTableModel modelTable) {
        Connection connection = connect();
        ResultSetMetaData rsmd;
        try (PreparedStatement find = connection.prepareStatement(
                    "SELECT SONGNAME, SONGGENRE, ARTISTNAME, SONGPATH FROM JUKEBOXX.SONG WHERE USERNAME=?")) 
        {
            find.setString(1,username);
            ResultSet rs = find.executeQuery();
            rsmd = rs.getMetaData();
            int columnNumber = rsmd.getColumnCount();            
            while(rs.next())
            {
                Object[] objects = new Object[columnNumber];
                for(int i = 0; i < columnNumber; i++)
                {
                    objects[i]=rs.getObject(i+1);
                }
                modelTable.addRow(objects);                                        
            }
        }
        catch (SQLException ex) {
            System.err.println("An error has occured." + ex.getMessage());
        }
    }
    public void deleteSongList(String userName, String name) throws Exception  
    {
        Connection c = connect();
        PreparedStatement f = c.prepareStatement("DELETE "+"FROM JUKEBOXX.song WHERE songName=? AND USERNAME=?");
        f.setString(1, name);
        f.setString(2, userName);
        f.execute();
    }
}
