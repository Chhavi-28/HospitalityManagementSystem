
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HospitalityGUI extends JFrame {

    JButton btnHotel, btnRoom, btnGuest, btnReservation, btnRetrieve;

    public HospitalityGUI() {

        setTitle("Hotel Reservation System");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 1, 10, 10));

        btnHotel = new JButton("Add Hotel");
        btnHotel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new AddHotelForm();

            }
        });
        
        btnRoom = new JButton("Add Room");
        btnRoom.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new AddRoomForm();

            }
        });
        btnGuest = new JButton("Add Guest");
        btnGuest.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new AddGuestForm();

            }
        });
        btnReservation = new JButton("Add Reservation");
        btnReservation.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new AddReservationForm();

            }
        });
        btnRetrieve = new JButton("Retrieve Data");
        btnRetrieve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new ViewDataForm();

            }
        });

        add(btnHotel);
        add(btnRoom);
        add(btnGuest);
        add(btnReservation);
        add(btnRetrieve);

        setVisible(true);
    }

    public static void main(String[] args) {

        new HospitalityGUI();

    }
}
