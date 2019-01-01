/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cheque.print;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hasitha
 */
public class DB {

    private static Connection com;

    public static Connection conect() throws Exception {
     DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        com = DriverManager.getConnection("jdbc:derby:cheque;create=true;user=root;password=root123");
        return com;
    }
    
    
   

    
}