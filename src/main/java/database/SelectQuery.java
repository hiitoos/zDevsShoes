package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
    public SelectQuery(Statement stmt, String var){
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

            if (var.equals("pais")){
                SQL ="SELECT paises.id_pais, paises.nombre, COUNT(pedidos.id_pedidos) as total FROM direcciones LEFT JOIN clientes ON direcciones.id_cliente=clientes.id_Clientes LEFT JOIN paises ON direcciones.id_pais = paises.id_pais LEFT JOIN pedidos ON pedidos.id_cliente = clientes.id_Clientes WHERE pedidos.pagado = 1 GROUP BY paises.id_pais";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    int total = rs.getInt("total");
                    System.out.println("Se han realizado " + total + " ventas en " + nombre);
                }
            }

            if (var.equals("usuario")){
                SQL = "SELECT COUNT(*) FROM clientes";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    int count = rs.getInt("count(*)");
                    System.out.println("Hay " + count + " usuarios registrados");
                }
            }

            if (var.equals("nofinalizados")) {
                SQL = "SELECT DISTINCT nombre, email FROM clientes INNER JOIN pedidos ON (clientes.id_clientes = pedidos.id_cliente) WHERE pedidos.pagado = 0";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String email = rs.getString("email");
                    System.out.println ("El usuario " + nombre + " - " + email + " tiene pedidos pendientes de pago");
                }
            }

            if (var.equals("mascompras")){
                SQL = "SELECT nombre, apellido1, apellido2, COUNT(*) FROM clientes LEFT JOIN pedidos ON (clientes.id_Clientes = pedidos.id_cliente) WHERE pedidos.pagado = 1 GROUP BY id_cliente ORDER BY COUNT(*)";
                rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido1 = rs.getString("apellido1");
                    System.out.println ("Cliente con más compras realizadas: " + nombre + " " + apellido1);
                }
            }

        }catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
