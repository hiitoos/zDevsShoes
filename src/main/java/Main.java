import database.ConnectionDB;
import database.SelectQuery;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    static int choice=0;
    static SelectQuery sq;

    public static void main(String[] args) throws SQLException {
        sq = new SelectQuery();
        menu();
        sq.closeConn();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("************************************************************");
            System.out.println("--- Menú principal ---");
            System.out.println("1.- Ver ventas totales");
            System.out.println("2.- Ver ventas por pais");
            System.out.println("3.- Listar usuarios");
            System.out.println("4.- Usuarios con pedidos sin finalizar");
            System.out.println("5.- Usuarios con más compras realizadas");
            System.out.println("0.- Salir");
            System.out.println("************************************************************");

            System.out.print("Selecciona una opción: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> sq.launchQuery("total");
                case 2 -> sq.launchQuery("pais");
                case 3 -> sq.launchQuery("usuario");
                case 4 -> sq.launchQuery("nofinalizados");
                case 5 -> sq.launchQuery("mascompras");
                case 0 -> {
                    System.out.println("Hasta luego");
                    System.exit(1);
                }
                default -> System.out.println("Seleccion incorrecta");
            }
        }while (choice!=0);
    }
}
