package Connections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class JdbcDbData  {


    static final Logger LOG = LoggerFactory.getLogger(JdbcDbData.class);
    protected static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    protected static final String DB_URL = "jdbc:mysql://localhost:3306/wido?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //protected static final String DB_URL = "jdbc:mysql://localhost/mao";
    protected static final String USER = "wodi";
    protected static final String PASS = "wodi";
    protected static  Connection conn;
    static DatabaseMetaData metadata;
    static PreparedStatement ps = null ;

    public static void JdbcDbDataa() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        metadata = conn.getMetaData();
    }

    public static PreparedStatement executeTheQuerty(String quertydb) {
        try{
            ps =conn.prepareStatement(quertydb);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return ps;


    }


    public static int checkifTableExists(String tableName) throws SQLException, ClassNotFoundException{
        int  x = 0;
        JdbcDbDataa();
        ResultSet tables = metadata.getTables(null, null, tableName, null);
        if (tables.next()) {
            x =1;

        }
        else {
            System.out.println(tableName + "  Table does not exist");
        }
        return x;
    }

    public static void initdb() throws SQLException, ClassNotFoundException{
        JdbcDbDataa();
    }

}
