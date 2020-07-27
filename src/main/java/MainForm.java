import database.ConnectionDB;
import database.SelectQuery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class MainForm {
    private JButton vTotal;
    private JPanel panelMain;
    private JButton vPais;
    private JButton usuTotal;
    private JButton comprasPendientesButton;
    private JButton cliMas;
    static ConnectionDB dataBase;
    static Connection conn;
    static java.sql.Statement stmt;

    public MainForm() {
        vTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventasTotales();
            }
        });
        vPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectQuery(stmt, "pais");
            }
        });
        usuTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectQuery(stmt, "usuario");
            }
        });
        comprasPendientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectQuery(stmt, "nofinalizados");
            }
        });
        cliMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectQuery(stmt, "mascompras");
            }
        });
    }

    public static void main(String[] args) throws SQLException {
        dataBase = new ConnectionDB();
        conn = dataBase.getConnection();
        stmt = conn.createStatement();
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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

    public static void pedidosNoFinalizados(){
        new SelectQuery(stmt, "nofinalizados");
    }

    public static void listarTopCliente(){    //verificar con conexión
        new SelectQuery(stmt, "mascompras");
    }
}
