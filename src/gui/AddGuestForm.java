package gui;

import javax.swing.*;
import java.awt.*;
import dao.GuestDAO;
import entity.Guest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AddGuestForm extends JFrame {

    JLabel lblName, lblEmail, lblPhone;

    JTextField txtName, txtEmail, txtPhone;

    JButton btnSave;

    public AddGuestForm() {

        setTitle("Add Guest");
        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(4,2,10,10));

        lblName = new JLabel("Guest Name");
        lblEmail = new JLabel("Email");
        lblPhone = new JLabel("Phone");

        txtName = new JTextField();
        txtEmail = new JTextField();
        txtPhone = new JTextField();

        btnSave = new JButton("Save");

        add(lblName);
        add(txtName);

        add(lblEmail);
        add(txtEmail);

        add(lblPhone);
        add(txtPhone);

        add(new JLabel());
        add(btnSave);
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Guest guest = new Guest();

                guest.setGuestName(txtName.getText());
                guest.setEmail(txtEmail.getText());
                guest.setPhone(txtPhone.getText());

                GuestDAO dao = new GuestDAO();
                dao.addGuest(guest);

                JOptionPane.showMessageDialog(null, "Guest Added Successfully!");

                txtName.setText("");
                txtEmail.setText("");
                txtPhone.setText("");
            }
        });

        setVisible(true);
    }
}