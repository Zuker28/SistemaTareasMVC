/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
/**
 *
 * @author usuri
 */
public class VistaTarea extends JFrame {

    public JTextField txtCodigo, txtTitulo, txtCurso, txtFecha;
    public JComboBox<String> cbEstado;
    public JButton btnRegistrar;

    public VistaTarea() {
        setTitle("Sistema de Tareas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 100, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 20, 200, 25);
        add(txtCodigo);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 60, 100, 25);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(120, 60, 200, 25);
        add(txtTitulo);

        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(20, 100, 100, 25);
        add(lblCurso);

        txtCurso = new JTextField();
        txtCurso.setBounds(120, 100, 200, 25);
        add(txtCurso);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(20, 140, 100, 25);
        add(lblFecha);

        txtFecha = new JTextField();
        txtFecha.setBounds(120, 140, 200, 25);
        add(txtFecha);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(20, 180, 100, 25);
        add(lblEstado);

        cbEstado = new JComboBox<>(new String[]{"Pendiente", "En proceso", "Completada"});
        cbEstado.setBounds(120, 180, 200, 25);
        add(cbEstado);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(120, 220, 120, 30);
        add(btnRegistrar);
    }
}
