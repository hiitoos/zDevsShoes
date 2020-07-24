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
                String SQL = "SELECT COUNT(*) FROM pedidos ";
                //select clientes.nombre from direcciones left join clientes on clientes.id_cliente = direcciones.id_cliente
                // UNION select paises.nombre from direcciones left join paises on direcciones.id_pais=paises.id_pais;
                //todo make this sentence coherent. Now it returns clientes.nombre and paises.nombre but in one column
                ResultSet rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    int count = rs.getInt("count(*)");
                    System.out.println("La cantidad total de ventas por país es de " + count);
                }
            }
        }catch (SQLException exception) {
            System.out.println("Error al rollback and save point" + exception);
        }
    }
}
