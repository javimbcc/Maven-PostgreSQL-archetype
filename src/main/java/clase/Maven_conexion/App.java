package clase.Maven_conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import clase.Maven_conexion.modelos.conexiones.conexionPostgreSQL;
import clase.Maven_conexion.utils.variablesConexionPostgreSQL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Instanciamos los datos de conexion de utils y los desestructuramos
    			conexionPostgreSQL conexion = new conexionPostgreSQL();

    			// Instanciamos variablesConexionPostgreSQL para poder recoger los credenciales
    			// de inicio de sesion
    			variablesConexionPostgreSQL vc = new variablesConexionPostgreSQL();

    			// Instanciamos las listas
    			

    			// Hacemos su desestructuracion
    			final String HOST = vc.getHost();
    			final String PORT = vc.getPort();
    			final String DB = vc.getDb();
    			final String USER = vc.getUser();
    			final String PASS = vc.getPass();

    			// Hacemos la conexion
    			Connection cn = conexion.añadirConexionPostgreSql(USER, PASS, PORT, HOST, DB);

    		
    			
    			
    			try {
    				cn.close();
    				System.out.println("Conexión a PostgreSQL cerrada");
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    }
}
