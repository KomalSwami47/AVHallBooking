/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

public class User {
    String name;
    String phoneNumber;
    
    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    
        }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
