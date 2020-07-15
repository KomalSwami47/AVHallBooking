/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 212704598
 */
public class Booking {
    
    private User user;
    private ArrayList<String> dates  = new ArrayList<>();
    

   public Booking(User user, String date) {
        
        this.user = user;
        this.dates.add(date);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDate(String date) {
        this.dates.add(date);
    }
    
    public void cancelAllBookings()
    {
        this.dates = new ArrayList<>();
    }
 }

