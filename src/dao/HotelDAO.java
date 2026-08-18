package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import database.DatabaseConnector;
import entity.Hotel;

public class HotelDAO {

    public void addHotel(Hotel hotel) {

        String query = "INSERT INTO Hotel(hotel_name, location, amenities) VALUES (?, ?, ?)";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, hotel.getHotelName());
            ps.setString(2, hotel.getLocation());
            ps.setString(3, hotel.getAmenities());

            ps.executeUpdate();

            System.out.println("Hotel Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewHotels() {

        String query = "SELECT * FROM Hotel";

        try {
            Connection con = DatabaseConnector.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("Hotel ID : " + rs.getInt("hotel_id"));
                System.out.println("Hotel Name : " + rs.getString("hotel_name"));
                System.out.println("Location : " + rs.getString("location"));
                System.out.println("Amenities : " + rs.getString("amenities"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateHotel(int id, String newLocation) {

        String query = "UPDATE Hotel SET location = ? WHERE hotel_id = ?";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, newLocation);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Hotel Updated Successfully!");
            } else {
                System.out.println("Hotel Not Found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteHotel(int id) {

        String query = "DELETE FROM Hotel WHERE hotel_id = ?";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Hotel Deleted Successfully!");
            } else {
                System.out.println("Hotel Not Found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}