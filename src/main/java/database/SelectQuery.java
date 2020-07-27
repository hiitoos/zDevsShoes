package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {
    static ConnectionDB dataBase;
    static Connection conn;
    static java.sql.Statement stmt;

    public SelectQuery () throws SQLException {
        dataBase = new ConnectionDB();
        conn = dataBase.getConnection();
        stmt = conn.createStatement();
    }

    public void closeConn() throws SQLException {
        stmt.close();
        conn.close();
    }

    public void launchQuery(String var){
        String SQL;
        ResultSet rs;
        try {
            if (var.equals("total")) {
                SQL = "SELECT COUNT(*) FROM pedidos WHERE pagado = 1";
               rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    int count = rs.getInt("count(*)");
                    System.out.println("La cantidad total de ventas es de " + count);
                }
            }

            else if (var.equals("pais")){
                SQL ="SELECT paises.id_pais, paises.nombre, COUNT(pedidos.id_pedidos) as total FROM direcciones LEFT JOIN clientes ON direcciones.id_cliente=clientes.id_Clientes LEFT JOIN paises ON direcciones.id_pais = paises.id_pais LEFT JOIN pedidos ON pedidos.id_cliente = clientes.id_Clientes WHERE pedidos.pagado = 1 GROUP BY paises.id_pais";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    int total = rs.getInt("total");
                    System.out.println("Se han realizado " + total + " ventas en " + nombre);
                }
            }

            else if (var.equals("usuario")){
                SQL = "SELECT COUNT(*) FROM clientes";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    int count = rs.getInt("count(*)");
                    System.out.println("Hay " + count + " usuarios registrados");
                }
            }

            else if (var.equals("nofinalizados")) {
                SQL = "SELECT DISTINCT nombre, email FROM clientes INNER JOIN pedidos ON (clientes.id_clientes = pedidos.id_cliente) WHERE pedidos.pagado = 0";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String email = rs.getString("email");
                    System.out.println ("El usuario " + nombre + " - " + email + " tiene pedidos pendientes de pago");
                }
            }

            else if (var.equals("mascompras")){  ///////// comprobar con conexión
                SQL = "SELECT nombre, apellido1, apellido2 FROM clientes WHERE id_cliente IN (\tSELECT id_cliente, COUNT(*) FROM pedidos WHERE pagado = 1 GROUP BY id_cliente HAVING COUNT(*) >= ALL(SELECT COUNT(*) FROM pedidos group by id_cliente))";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido1 = rs.getString("apellido1");
                    System.out.println ("Cliente con más compras realizadas: " + nombre + " " + apellido1);
                }
            }

        }catch (SQLException exception) {
            System.out.println("Error: " + exception);
        }
    }
}
