
package conexion;
import java.sql.*;
/**
 *
 * @author royer
 */
public class Conexion {
    public static Connection conectar (){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_parqueadero", "root", "");
            return cn;
        }catch (SQLException e){
            System.out.println("Error en la conexión local " + e);
        }
            return null;
    }
}