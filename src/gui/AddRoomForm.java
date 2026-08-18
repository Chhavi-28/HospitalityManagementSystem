package gui;

import javax.swing.*;

import java.awt.*;
import dao.RoomDAO;
import entity.Room;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AddRoomForm extends JFrame {

    JLabel lblHotelId, lblRoomNumber, lblRoomType, lblPrice, lblStatus;

    JTextField txtHotelId, txtRoomNumber, txtRoomType, txtPrice, txtStatus;

    JButton btnSave;

    public AddRoomForm() {

        setTitle("Add Room");
        setSize(400,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(6,2,10,10));

        lblHotelId = new JLabel("Hotel ID");
        lblRoomNumber = new JLabel("Room Number");
        lblRoomType = new JLabel("Room Type");
        lblPrice = new JLabel("Price");
        lblStatus = new JLabel("Status");

        txtHotelId = new JTextField();
        txtRoomNumber = new JTextField();
        txtRoomType = new JTextField();
        txtPrice = new JTextField();
        txtStatus = new JTextField();

        btnSave = new JButton("Save");

        add(lblHotelId);
        add(txtHotelId);

        add(lblRoomNumber);
        add(txtRoomNumber);

        add(lblRoomType);
        add(txtRoomType);

        add(lblPrice);
        add(txtPrice);

        add(lblStatus);
        add(txtStatus);

        add(new JLabel());
        add(btnSave);
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Room room = new Room();

                room.setHotelId(Integer.parseInt(txtHotelId.getText()));
                room.setRoomNumber(txtRoomNumber.getText());
                room.setRoomType(txtRoomType.getText());
                room.setPrice(Double.parseDouble(txtPrice.getText()));
                room.setStatus(txtStatus.getText());

                RoomDAO dao = new RoomDAO();
                dao.addRoom(room);

                JOptionPane.showMessageDialog(null, "Room Added Successfully!");

                txtHotelId.setText("");
                txtRoomNumber.setText("");
                txtRoomType.setText("");
                txtPrice.setText("");
                txtStatus.setText("");
            }
        });

        setVisible(true);
    }
}