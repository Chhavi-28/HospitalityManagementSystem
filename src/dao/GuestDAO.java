package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import database.DatabaseConnector;
import entity.Guest;

public class GuestDAO {

    public void addGuest(Guest guest) {

        String query = "INSERT INTO Guest(guest_name, email, phone) VALUES (?, ?, ?)";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, guest.getGuestName());
            ps.setString(2, guest.getEmail());
            ps.setString(3, guest.getPhone());

            ps.executeUpdate();

            System.out.println("Guest Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewGuests() {

        String query = "SELECT * FROM Guest";

        try {
            Connection con = DatabaseConnector.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("----------------------");
                System.out.println("Guest ID : " + rs.getInt("guest_id"));
                System.out.println("Name : " + rs.getString("guest_name"));
                System.out.println("Email : " + rs.getString("email"));
                System.out.println("Phone : " + rs.getString("phone"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateGuest(int id, String phone) {

        String query = "UPDATE Guest SET phone=? WHERE guest_id=?";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, phone);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Guest Updated Successfully!");
            else
                System.out.println("Guest Not Found!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteGuest(int id) {

        String query = "DELETE FROM Guest WHERE guest_id=?";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Guest Deleted Successfully!");
            else
                System.out.println("Guest Not Found!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
