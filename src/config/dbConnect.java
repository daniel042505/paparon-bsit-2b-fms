
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class dbConnect {
    
 private Connection connect;

       // constructor to connect to our database
        public dbConnect (){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodms", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }   
       //Function to save data
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }
        //Function to UpdateData
        public void UpdateData(String sql){
        try{
        PreparedStatement pst = connect.prepareStatement(sql);
        int rowsUpdated = pst.executeUpdate();
        if(rowsUpdated > 0){
      
        }else{
            System.out.println("Data Update Failed!");
            
        }
         pst.close();
        }catch(SQLException ex){
            System.out.println("Connection Error"+ex);
        }
        }
    
        //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    
                    
         // Function to execute a query and get the count result (for checking username/email existence)
    public int executeQueryForCount(String query) {
        int count = 0;
        try (Statement stmt = connect.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                count = rs.getInt(1); // Get the count from the first column of the result set
            }
        } catch (SQLException e) {
            System.out.println("Error in executeQueryForCount: " + e.getMessage());
        }
        return count;
        
        
    }
 


    // New function to retrieve the occupation of the user (manager/cashier)
    public String getUserOccupation(String username) {
        String occupation = null;
        try {
            // Create the SQL query to fetch the occupation based on username
            String sql = "SELECT u_occ FROM tbl_user WHERE u_user = ?";

            // Prepare the statement
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, username);

            // Execute the query
            ResultSet rs = pst.executeQuery();

            // Check if the username exists and get the occupation
            if (rs.next()) {
                occupation = rs.getString("u_occ"); // Assuming the column is named "u_occupation"
            }

            // Close the resources
            rs.close();
            pst.close();

        } catch (SQLException ex) {
            System.out.println("Error during fetching occupation: " + ex.getMessage());
        }

        return occupation; // Return the occupation value (manager/cashier)
    }
     // Function to delete a user by ID
    public boolean deleteUserById(String userId) {
        boolean success = false;
        try {
            String sql = "DELETE FROM tbl_user WHERE u_id = ?";
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.setString(1, userId);
            int rowsDeleted = pst.executeUpdate();
            pst.close();
            if (rowsDeleted > 0) {
                success = true;
                JOptionPane.showMessageDialog(null, "User deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No user found with the given ID.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error deleting user: " + ex.getMessage());
        }
        return success;
    }
}



    

