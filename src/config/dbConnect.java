
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
    public boolean checkLogin(String username, String password) {
    boolean isValidUser = false;
    try {
        // Create the SQL query
        String sql = "SELECT * FROM tbl_user WHERE u_user = ? AND u_pass = ?";

        // Prepare the statement
        PreparedStatement pst = connect.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Check if the status is "active"
            String status = rs.getString("u_status");

            if ("active".equals(status)) {
                isValidUser = true;
            } else if ("pending".equals(status)) {
                isValidUser = false;
            }
        }
        rs.close();
        pst.close();

    } catch (SQLException ex) {
        System.out.println("Error during login check: " + ex.getMessage());
    }

    return isValidUser;
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

}
    

