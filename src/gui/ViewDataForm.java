package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import database.DatabaseConnector;

public class ViewDataForm extends JFrame {

    JTable table;
    DefaultTableModel model;

    public ViewDataForm() {

        setTitle("Retrieve Data");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Type");
        model.addColumn("Name");
        model.addColumn("Details");

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
        try {

            Connection con = DatabaseConnector.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Hotel");

            while (rs.next()) {

                model.addRow(new Object[]{

                        rs.getInt("hotel_id"),
                        "Hotel",
                        rs.getString("hotel_name"),
                        rs.getString("location") + " | " + rs.getString("amenities")

                });

            }
            ResultSet rsRoom = st.executeQuery("SELECT * FROM Room");

            while (rsRoom.next()) {

                model.addRow(new Object[]{

                    rsRoom.getInt("room_id"),
                    "Room",
                    rsRoom.getString("room_number"),
                    rsRoom.getString("room_type") + " | ₹"
                            + rsRoom.getDouble("price") + " | "
                            + rsRoom.getString("status")

                });

            }

            rsRoom.close();
            ResultSet rsGuest = st.executeQuery("SELECT * FROM Guest");

            while (rsGuest.next()) {

                model.addRow(new Object[]{

                    rsGuest.getInt("guest_id"),
                    "Guest",
                    rsGuest.getString("guest_name"),
                    rsGuest.getString("email") + " | "
                            + rsGuest.getString("phone")

                });

            }

            rsGuest.close();
            ResultSet rsReservation = st.executeQuery("SELECT * FROM Reservation");

            while (rsReservation.next()) {

                model.addRow(new Object[]{

                    rsReservation.getInt("reservation_id"),
                    "Reservation",
                    "Guest ID : " + rsReservation.getInt("guest_id"),
                    "Room : " + rsReservation.getInt("room_id")
                            + " | "
                            + rsReservation.getDate("check_in")
                            + " -> "
                            + rsReservation.getDate("check_out")

                });

            }

            rsReservation.close();
            
            

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        setVisible(true);
    }
}