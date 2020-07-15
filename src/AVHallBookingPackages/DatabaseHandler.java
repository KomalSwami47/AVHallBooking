/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVHallBookingPackages;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 212704598
 */
public class DatabaseHandler {

    private static Logger logger = Logger.getLogger("DatabaseHandler");
    private String driverClass = "com.mysql.jdbc.Driver";
    private Statement statement;
    private Integer userId = null;

    private DatabaseHandler() {
    }

    private static DatabaseHandler DBH = null;

    public static DatabaseHandler createDBHObj() {
        if (DBH == null) {
            DBH = new DatabaseHandler();
        }
        return DBH;
    }

    public void setDatabaseConnection() {
        try {
            Class.forName(driverClass);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseforhallbooking", "root", "123@456");
            statement = connection.createStatement();
            //statement.executeUpdate("CREATE TABLE User(userId integer PRIMARY KEY AUTO_INCREMENT, name character(20), phoneNumber character(10));");
            //statement.executeUpdate("CREATE TABLE Booking(userId integer, date character(20));");
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public void createUser(String name, String phoneNumber) {
        try {
            String insertUserQuery = "INSERT INTO User(name, phoneNumber) VALUES(\"" + name + "\", \"" + phoneNumber + "\");";
            setUserId(name, phoneNumber);
            if (userId == null) {
                statement.executeUpdate(insertUserQuery);
                setUserId(name, phoneNumber);
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    boolean createBooking(Date date) {
        String stringDate = convertDate(date);
        String createBookingQuery = "INSERT INTO booking(userId, date) VALUES(" + userId + ",\"" + stringDate + "\")";
        try {
            if (isDateAvailable(date)) {
                statement.executeUpdate(createBookingQuery);
                return true;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            return false;
        }
        return false;
    }

    public ArrayList<String> getBookings() {
        String getBookingDatesQuery = "SELECT date FROM booking WHERE userId='" + userId + "';";
        ArrayList<String> bookings = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(getBookingDatesQuery);
            while (resultSet.next()) {
                bookings.add(resultSet.getString("date"));
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
        return bookings;
    }

    public int updateBooking(Date newDate, Date previousDate) {
        ArrayList<String> bookings = getBookings();
        String updateDateQuery = "UPDATE booking SET date='" + convertDate(newDate) + "' WHERE userId = " + userId + " AND date='" + convertDate(previousDate) + "';";
        if (bookings.size() != 0) {
            if (!doesDateBelongToCurrentUser(previousDate)) {
                return 1; //no booking previous date
            } else if (isDateAvailable(newDate)) {
                try {
                    statement.executeUpdate(updateDateQuery);
                } catch (Exception e) {
                    logger.log(Level.SEVERE, e.getMessage(), e);
                }
                return 3;
            } else {
                return 2;
            }
        } else {
            return 0; //no booking in your name
        }
    }

    public boolean cancelBooking(Date date) {
        String cancelBookingQuery = "DELETE FROM booking WHERE date='" + convertDate(date) + "';";
        if (doesDateBelongToCurrentUser(date)) {
            try {
                statement.executeUpdate(cancelBookingQuery);
                return true;
            } catch (Exception e) {
                logger.log(Level.SEVERE, e.getMessage(), e);
                return false;
            } 
        }
        return false;
    }

    public boolean cancelAllBooking() {
        String cancelAllBookingQuery = "DELETE FROM booking WHERE userId=" + userId + ";";
        ArrayList<String> bookings = getBookings();
        if(bookings.size() != 0)
        {
            try {
                statement.executeUpdate(cancelAllBookingQuery);
                return true;
            } catch (Exception e) {
                logger.log(Level.SEVERE, e.getMessage(), e);
                return false;
            }
        }
        return false;
    }
    
    public void signOut()
    {
        userId = null;
    }

    private boolean isDateAvailable(Date date) {
        boolean isDateAvailable = false;
        String stringDate = convertDate(date);
        String checkDateQuery = "SELECT date FROM booking WHERE date=\"" + stringDate + "\";";
        try {
            ResultSet resultSet = statement.executeQuery(checkDateQuery);
            if (!resultSet.next()) {
                isDateAvailable = true;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            return isDateAvailable;
        }
        return isDateAvailable;
    }
    
    private boolean doesDateBelongToCurrentUser(Date date)
    {
        boolean doesDateBelongToCurrentUser = false;
        String stringDate = convertDate(date);
        String checkDateQuery = "SELECT date FROM booking WHERE date=\"" + stringDate + "\" AND userId="+ userId + ";";
        try {
            ResultSet resultSet = statement.executeQuery(checkDateQuery);
            if (resultSet.next()) {
                doesDateBelongToCurrentUser = true;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            return doesDateBelongToCurrentUser;
        }
        return doesDateBelongToCurrentUser;
    }

private void setUserId(String nameLabel, String phoneNumber) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT userId FROM User WHERE name='" + nameLabel + "' AND phoneNumber='" + phoneNumber + "';");
        if (resultSet.next()) {
            userId = resultSet.getInt("userId");
            logger.log(Level.INFO, "Current User ID  = " + userId);
        }
    }

    private String convertDate(Date date) {
        String  m,d,y;
        String[] s2 = date.toString().split(" ");
        d = s2[0];
        m = s2[1];
        y = s2[2];
        
        return d + " " + m + " " + y;
    }
}
