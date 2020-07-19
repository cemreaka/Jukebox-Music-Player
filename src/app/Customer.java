/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.io.Serializable;
/**
 *
 * @author Aynur Cemre Aka
 */
public class Customer implements Serializable{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    Customer(String firstName, String lastName, String userName, String password)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
    }    
    Customer(Customer c)
    {
        this.firstName= c.firstName;
        this.lastName=c.lastName;
        this.userName=c.userName;
        this.password=c.password;
    }   
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getUserName()
    {
        return this.userName;
    }   
    public String getPassword()
    {
        return this.password;
    }    
}
