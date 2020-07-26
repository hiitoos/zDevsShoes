package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
    public SelectQuery(Statement stmt, String var){
        try {
            if (var.equals("total")) {
                String SQL = "SELECT COUNT(*) FROM pedidos ";
                ResultSet rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    int count = rs.getInt("count(*)");
                    System.out.println("La cantidad total de ventas es de " + count);
                }
            }

            if (var.equals("pais")){
                String SQL ="SELECT paises.id_pais, paises.nombre, COUNT(pedidos.id_pedidos) as total FROM direcciones LEFT JOIN clientes ON direcciones.id_cliente=clientes.id_Clientes LEFT JOIN paises ON direcciones.id_pais = paises.id_pais LEFT JOIN pedidos ON pedidos.id_cliente = clientes.id_Clientes WHERE pedidos.pagado = 1 GROUP BY paises.id_pais";
                ResultSet rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    int total = rs.getInt("total");
                    System.out.println("Se han realizado " + total + " ventas en " + nombre);
                }
            }
        }catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
