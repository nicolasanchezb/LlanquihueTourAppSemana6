package gui;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JTextField txtNombre;
    private JTextField txtRut;
    private JTextArea areaDatos;
    private JButton btnRegistrar;

    public VentanaPrincipal() {

        setTitle("Llanquihue Tour");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtNombre = new JTextField(20);
        txtRut = new JTextField(20);
        areaDatos = new JTextArea();
        areaDatos.setEditable(false);

        btnRegistrar = new JButton("Registrar");

        JPanel panelSuperior = new JPanel(new GridLayout(3, 2));

        panelSuperior.add(new JLabel("Nombre"));
        panelSuperior.add(txtNombre);

        panelSuperior.add(new JLabel("RUT"));
        panelSuperior.add(txtRut);

        panelSuperior.add(btnRegistrar);

        add(panelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(areaDatos), BorderLayout.CENTER);

        btnRegistrar.addActionListener(e -> registrarCliente());

    }

    private void registrarCliente() {

        String nombre = txtNombre.getText();
        String rut = txtRut.getText();

        areaDatos.append("Cliente registrado\n");
        areaDatos.append("Nombre: " + nombre + "\n");
        areaDatos.append("RUT: " + rut + "\n");
        areaDatos.append("-------------------------\n");

        txtNombre.setText("");
        txtRut.setText("");

    }

}