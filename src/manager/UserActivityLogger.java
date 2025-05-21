/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import config.dbConnect; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cecilia Amit
 */
public class UserActivityLogger {
    
     private dbConnect dbc; 

    public UserActivityLogger() {
        this.dbc = new dbConnect(); 
    }
    


 
    public void logLogin(int userId) {
        String actionMessage = "User with ID " + userId + " logged in";
        logActivity(userId, actionMessage);
    }

    /**
     * Logs a user logout event into the tbl_logs table.
     *
     * @param userId The ID of the user who logged out.
     */
    public void logLogout(int userId) {
        String actionMessage = "User with ID " + userId + " logged out";
        logActivity(userId, actionMessage);
    }

    /**
     * Generic method to log user activity into the tbl_logs table.
     * This method handles the database insertion.
     *
     * @param userId The ID of the user performing the action.
     * @param action The description of the action (e.g., "User logged in").
     */
    private void logActivity(int userId, String action) {
        Connection con = null;
        PreparedStatement pstmt = null;

        String insertLogQuery = "INSERT INTO tbl_logs(action, date, u_id) VALUES(?, ?, ?)";

        try {
            con = dbc.getConnection();
            pstmt = con.prepareStatement(insertLogQuery);

            pstmt.setString(1, action);
            pstmt.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            pstmt.setInt(3, userId);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Log entry added successfully: " + action);
            } else {
                System.out.println("Failed to add log entry: " + action);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserActivityLogger.class.getName()).log(Level.SEVERE, "Database error while logging activity", ex);
            System.err.println("Database error while logging activity: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    dbc.closeConnection(con);
                }
            } catch (SQLException e) {
                Logger.getLogger(UserActivityLogger.class.getName()).log(Level.SEVERE, "Error closing database resources", e);
                System.err.println("Error closing database resources: " + e.getMessage());
            }
        }
    }
}