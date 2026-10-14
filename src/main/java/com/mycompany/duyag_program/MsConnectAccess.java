/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duyag_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CL2-PC
 */
public class MsConnectAccess {

    public static Connection conn() {

        try {
            String url =
                "jdbc:ucanaccess://C:\\Users\\CL2-PC\\Documents\\myDBs1rens.accdb";

            return DriverManager.getConnection(url);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                null,
                "Database connection failed:\n" + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE
            );

            return null;
        }
    }
}