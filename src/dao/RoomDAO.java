package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import database.DatabaseConnector;
import entity.Room;

public class RoomDAO {

    public void addRoom(Room room) {

        String query = "INSERT INTO Room(hotel_id, room_number, room_type, price, status) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, room.getHotelId());
            ps.setString(2, room.getRoomNumber());
            ps.setString(3, room.getRoomType());
            ps.setDouble(4, room.getPrice());
            ps.setString(5, room.getStatus());

            ps.executeUpdate();

            System.out.println("Room Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewRooms() {

        String query = "SELECT * FROM Room";

        try {
            Connection con = DatabaseConnector.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("-----------------------------");
                System.out.println("Room ID : " + rs.getInt("room_id"));
                System.out.println("Hotel ID : " + rs.getInt("hotel_id"));
                System.out.println("Room Number : " + rs.getString("room_number"));
                System.out.println("Room Type : " + rs.getString("room_type"));
                System.out.println("Price : " + rs.getDouble("price"));
                System.out.println("Status : " + rs.getString("status"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateRoom(int roomId, String status) {

        String query = "UPDATE Room SET status = ? WHERE room_id = ?";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, status);
            ps.setInt(2, roomId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Room Updated Successfully!");
            } else {
                System.out.println("Room Not Found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteRoom(int roomId) {

        String query = "DELETE FROM Room WHERE room_id = ?";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, roomId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Room Deleted Successfully!");
            } else {
                System.out.println("Room Not Found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
