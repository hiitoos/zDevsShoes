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
    static SelectQuery sq;

    public static void main(String[] args) throws SQLException {
        sq = new SelectQuery();
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainForm() {
        vTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sq.launchQuery("total");
            }
        });
        vPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sq.launchQuery("pais");
            }
        });
        usuTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sq.launchQuery("usuario");
            }
        });
        comprasPendientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sq.launchQuery("nofinalizados");
            }
        });
        cliMas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sq.launchQuery("mascompras");
            }
        });
    }


}
