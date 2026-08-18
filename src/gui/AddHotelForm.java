package gui;
import dao.HotelDAO;
import entity.Hotel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.*;

public class AddHotelForm extends JFrame {

    JLabel lblName, lblLocation, lblAmenities;
    JTextField txtName, txtLocation, txtAmenities;
    JButton btnSave;

    public AddHotelForm() {

        setTitle("Add Hotel");
        setSize(350,250);
        setLayout(new GridLayout(4,2,10,10));
        setLocationRelativeTo(null);

        lblName = new JLabel("Hotel Name");
        lblLocation = new JLabel("Location");
        lblAmenities = new JLabel("Amenities");

        txtName = new JTextField();
        txtLocation = new JTextField();
        txtAmenities = new JTextField();

        btnSave = new JButton("Save");

        add(lblName);
        add(txtName);

        add(lblLocation);
        add(txtLocation);

        add(lblAmenities);
        add(txtAmenities);

        add(new JLabel());
        add(btnSave);
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Hotel hotel = new Hotel();

                hotel.setHotelName(txtName.getText());
                hotel.setLocation(txtLocation.getText());
                hotel.setAmenities(txtAmenities.getText());

                HotelDAO dao = new HotelDAO();
                dao.addHotel(hotel);

                JOptionPane.showMessageDialog(null, "Hotel Added Successfully!");

                txtName.setText("");
                txtLocation.setText("");
                txtAmenities.setText("");
            }
        });

        setVisible(true);
    }
}
