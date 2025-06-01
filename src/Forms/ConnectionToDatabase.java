/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Black Code
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionToDatabase {

    static Connection conn = null;

    public static Connection connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medical",
                    "root",
                    ""
            );
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
            return null;
        }
    }
}
