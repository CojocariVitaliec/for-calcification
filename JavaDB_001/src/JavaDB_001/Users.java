/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDB_001;
/**
 *
 * @author Mastermind
 */
public class Users {
     
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public Users(int ID, String FirstName, String LastName, int Age)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
}
    

