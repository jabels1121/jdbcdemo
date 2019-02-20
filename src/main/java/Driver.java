import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

    private static SupportMethods sql = new SupportMethods();

    public static void main(String[] args) {

        try {
            String select = "select * from employees";
            ResultSet rs = sql.selectQuery(select);
            while (rs.next()) {
                System.out.println(rs.getString("last_name") + " " + rs.getString("first_name"));
            }

            Connection cn = sql.getConnection();
            Statement st = cn.createStatement();
            st.executeUpdate("insert into employees (last_name, first_name, email, department, salary) VALUES (\"test\", \"test\", \"test\", \"test\", \"test\")");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
