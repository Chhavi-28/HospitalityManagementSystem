package gui;

import javax.swing.*;
import java.awt.*;
import dao.ReservationDAO;
import entity.Reservation;

import java.sql.Date;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AddReservationForm extends JFrame {

    JLabel lblGuestId, lblRoomId, lblCheckIn, lblCheckOut;

    JTextField txtGuestId, txtRoomId, txtCheckIn, txtCheckOut;

    JButton btnSave;

    public AddReservationForm() {

        setTitle("Add Reservation");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(5,2,10,10));

        lblGuestId = new JLabel("Guest ID");
        lblRoomId = new JLabel("Room ID");
        lblCheckIn = new JLabel("Check In (yyyy-mm-dd)");
        lblCheckOut = new JLabel("Check Out (yyyy-mm-dd)");

        txtGuestId = new JTextField();
        txtRoomId = new JTextField();
        txtCheckIn = new JTextField();
        txtCheckOut = new JTextField();

        btnSave = new JButton("Save");

        add(lblGuestId);
        add(txtGuestId);

        add(lblRoomId);
        add(txtRoomId);

        add(lblCheckIn);
        add(txtCheckIn);

        add(lblCheckOut);
        add(txtCheckOut);

        add(new JLabel());
        add(btnSave);
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Reservation reservation = new Reservation();

                reservation.setGuestId(Integer.parseInt(txtGuestId.getText()));
                reservation.setRoomId(Integer.parseInt(txtRoomId.getText()));

                reservation.setCheckIn(Date.valueOf(txtCheckIn.getText()));
                reservation.setCheckOut(Date.valueOf(txtCheckOut.getText()));

                ReservationDAO dao = new ReservationDAO();
                dao.addReservation(reservation);

                JOptionPane.showMessageDialog(null, "Reservation Added Successfully!");

                txtGuestId.setText("");
                txtRoomId.setText("");
                txtCheckIn.setText("");
                txtCheckOut.setText("");

            }
        });

        setVisible(true);
    }
}
