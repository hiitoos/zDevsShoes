import java.util.Scanner;

public class Main {
    static int choice=0;
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("Selecciona una opción");
        Scanner menu = new Scanner(System.in);
        do {
            System.out.println("--- Menú principal ---");
            System.out.println("1.- Ver ventas totales");
            System.out.println("2.- Ver ventas por pais");
            System.out.println("3.- Listar usuarios");
            switch (choice){
                case 1 -> ventasTotales();
                case 2 -> ventasPais();
                case 3 -> listarUsuarios();
            }
        }while (choice!=0);
    }

    public static void ventasTotales(){

    }

    public static void ventasPais(){

    }

    public static void listarUsuarios(){

    }
}
