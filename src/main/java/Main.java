import database.ConnectionDB;
import database.SelectQuery;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    static int choice=0;
    static ConnectionDB dataBase;
    static Connection conn;
    static java.sql.Statement stmt;

    public static void main(String[] args) throws SQLException {
        dataBase = new ConnectionDB();
        conn = dataBase.getConnection();
        stmt = conn.createStatement();
        menu();
        stmt.close();
        conn.close();
    }

    public static void menu(){
        System.out.println("Selecciona una opción");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--- Menú principal ---");
            System.out.println("1.- Ver ventas totales");
            System.out.println("2.- Ver ventas por pais");
            System.out.println("3.- Listar usuarios");
            System.out.println("4.- Usuarios con pedidos sin finalizar");
            System.out.println("0.- Salir");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> ventasTotales();
                case 2 -> ventasPais();
                case 3 -> listarUsuarios();
                case 4 -> pedidosNoFinalizados();
                case 0 -> {
                    System.out.println("Hasta luego");
                    System.exit(1);
                }
                default -> System.out.println("Seleccion incorrecta");
            }
        }while (choice!=0);
    }

    public static void ventasTotales(){
        new SelectQuery(stmt, "total");
    }

    public static void ventasPais(){
        new SelectQuery(stmt, "pais");
    }

    public static void listarUsuarios(){
        new SelectQuery(stmt, "usuario");

    }

    public static void pedidosNoFinalizados(){   ////////////////verificar con conexión !!!!
        new SelectQuery(stmt, "nofinalizados");
    }
}
