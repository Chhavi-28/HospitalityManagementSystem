package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import database.DatabaseConnector;
import entity.Reservation;

public class ReservationDAO {

    public void addReservation(Reservation reservation) {

        String query = "INSERT INTO Reservation(guest_id, room_id, check_in, check_out) VALUES (?, ?, ?, ?)";

        try {
            Connection con = DatabaseConnector.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, reservation.getGuestId());
            ps.setInt(2, reservation.getRoomId());
            ps.setDate(3, reservation.getCheckIn());
            ps.setDate(4, reservation.getCheckOut());

            ps.executeUpdate();

            System.out.println("Reservation Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}