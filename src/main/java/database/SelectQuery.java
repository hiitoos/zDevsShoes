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
                String SQL = "SELECT paises.id_pais, paises.nombre, count(paises.id_pais) FROM direcciones LEFT JOIN paises ON direcciones.id_pais = paises.id_pais group by paises.id_pais;";
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
