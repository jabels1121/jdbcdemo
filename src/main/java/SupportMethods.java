import java.sql.*;

public class SupportMethods {

    private String url = "jdbc:mysql://localhost:3306/demo";
    private String login = "student";
    private String password = "student";
    private Connection connection;

    public Connection getConnection() {
        if (connection != null) {
            return connection;
        }
        try {
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public ResultSet selectQuery(String query) throws SQLException {
        Statement stm = getConnection().createStatement();
        return stm.executeQuery(query);
    }

    public void insertQuery(String sql) throws SQLException {
        Statement stm = getConnection().createStatement();
        stm.executeUpdate(sql);
    }

}
