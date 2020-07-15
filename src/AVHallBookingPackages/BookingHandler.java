/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *
 * @author 212704598
 */
public class BookingHandler {

    private User currentUser = null;

    private Logger logger = Logger.getLogger("BookingHandler");

    ArrayList<Booking> bookings = new ArrayList<Booking>();

    private BookingHandler() {
    }
    private static BookingHandler BH = null;

    public static BookingHandler createBHObj() {
        if (BH == null) {
            BH = new BookingHandler();
        }
        return BH;
    }

    public void createUser(String name, String phoneNumber) {
        currentUser = new User(name, phoneNumber);
    }

    public boolean createBooking(Date date) {
        if (isDateAvailable(date)) {
            Booking booking = getCurrentUserBooking();
            if (booking != null) {
                booking.setDate(convertDate(date));
            } else {
                Booking newBooking = new Booking(currentUser, convertDate(date));
                bookings.add(newBooking);
            }
            return true;
        } else {
            return false;//false for date is not available
        }
    }

    public ArrayList<String> getBookings() {
        Booking booking = getCurrentUserBooking();
        if (booking != null) {
            return booking.getDates();
        }
        return null;
    }

    public int updateBooking(Date newDate, Date previousDate) {
        Booking booking = getCurrentUserBooking();
        if (booking != null) {
            if (isDateAvailable(previousDate)) {
                return 1; //no booking onsuch date
            } else if (isDateAvailable(newDate)) {
                booking.getDates().remove(convertDate(previousDate));
                booking.setDate(convertDate(newDate));
                return 3;
            } else {
                return 2;
            }
        } else {
            return 0;
        }
    }

    public boolean cancelBooking(Date date) {
        if (!isDateAvailable(date)) {
            Booking booking = getCurrentUserBooking();
            booking.getDates().remove(convertDate(date));
            return true;
        }
        return false;
    }

    public boolean cancelAllBooking() {
        Booking booking = getCurrentUserBooking();
        if (booking == null) {
            return false;
        } else {
            booking.cancelAllBookings();
            return true;
        }
    }

    public boolean isDateAvailable(Date date) {
        for (Booking booking : bookings) {
            for (String d : booking.getDates()) {
                if (d.equals(convertDate(date))) {
                    return false;
                }
            }
        }
        return true;//true for date is available
    }

    private Booking getCurrentUserBooking() {
        for (Booking b : bookings) {
            if (b.getUser().getName().equals(currentUser.getName()) && b.getUser().getPhoneNumber().equals(currentUser.getPhoneNumber())) {
                return b;
            }
        }
        return null;
    }

   private String convertDate(Date date) {
        String day,m,d,y;
        String[] s2 = date.toString().split(" ");
        day = s2[0];
        m = s2[1];
        d = s2[2];
        y=s2[5];
        return day + " " + m + " " + d + " " + y;
    }

}
