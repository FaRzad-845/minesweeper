package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Data {

    private static PreparedStatement preparedStatement;
    private static Statement statement;
    private static ResultSet resultSet;
    private static Connection connect = DB_Connection.get_connection();
    private static String querySend;
    private static String queryGet;
    private static ArrayList<AllRecordsData> allRecords;

    public static void send(String name, int record) throws SQLException {
        querySend = " insert into users (name,record)"
                + " values (?, ?)";

        preparedStatement = connect.prepareStatement(querySend);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, record);

        preparedStatement.execute();

        connect.close();
    }

    public static ArrayList<AllRecordsData> get() throws SQLException {
        queryGet = "SELECT * FROM users";
        
        statement = connect.createStatement();
        resultSet = statement.executeQuery(queryGet);
                
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int record = resultSet.getInt("record");
            AllRecordsData data = new AllRecordsData(record,name);
            allRecords.add(data);
        }
        
        statement.close();
        return allRecords;
    }

}
