package org.shyam;
import java.sql.*;

public class StudentData {

    private Connection getConnection() throws SQLException {
        try {
            Connection con = DriverManager.getConnection("jdbc:h2:mem:testdb;INIT=RUNSCRIPT FROM 'classpath:create.sql'", "sa", "");
            return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public void add(int id, String name, String surname, String email, String phone, String branch, String joiningYear) throws SQLException {
        String sql = "INSERT INTO STUDENTS (ID, NAME, SURNAME, EMAIL, PHONE, BRANCH, JOINING_YEAR) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, surname);
            pst.setString(4, email);
            pst.setString(5, phone);
            pst.setString(6, branch);
            pst.setString(7, joiningYear);
            pst.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM STUDENTS WHERE ID = ?";
        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }

    public void update(int id, String column, String value) throws SQLException {
        String sql = "UPDATE STUDENTS SET " + column + " = ? WHERE ID = ?";
        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, value);
            pst.setInt(2, id);
            pst.executeUpdate();
        }
    }
    public void fetch(int id) throws SQLException {
        String sql = "SELECT * FROM STUDENTS WHERE ID = ?";
        try (Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Student Details:");
                    System.out.println("ID: " + rs.getInt("ID"));
                    System.out.println("Name: " + rs.getString("NAME"));
                    System.out.println("Surname: " + rs.getString("SURNAME"));
                    System.out.println("Email: " + rs.getString("EMAIL"));
                    System.out.println("Phone: " + rs.getString("PHONE"));
                    System.out.println("Branch: " + rs.getString("BRANCH"));
                    System.out.println("Joining Year: " + rs.getString("JOINING_YEAR"));
                } else {
                    System.out.println("No student found with ID " + id);
                }
            }
        }
    }
    public  void fetchAll() throws SQLException {
        String sql = "SELECT * FROM STUDENTS";
        try (Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement(sql)) {
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Student Details:");
                    System.out.println("ID: " + rs.getInt("ID"));
                    System.out.println("Name: " + rs.getString("NAME"));
                    System.out.println("Surname: " + rs.getString("SURNAME"));
                    System.out.println("Email: " + rs.getString("EMAIL"));
                    System.out.println("Phone: " + rs.getString("PHONE"));
                    System.out.println("Branch: " + rs.getString("BRANCH"));
                    System.out.println("Joining Year: " + rs.getString("JOINING_YEAR"));
                }
            }
        }
    }
}
