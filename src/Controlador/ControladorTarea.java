/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Tarea;
import Vista.VistaTarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ControladorTarea implements ActionListener {

    private final VistaTarea vista;
    private final ArrayList<Tarea> listaTareas;

    public ControladorTarea(VistaTarea vista) {
        this.vista = vista;
        this.listaTareas = new ArrayList<>();

        this.vista.btnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {

            String codigo = vista.txtCodigo.getText();
            String titulo = vista.txtTitulo.getText();
            String curso = vista.txtCurso.getText();
            String fecha = vista.txtFecha.getText();
            String estado = vista.cbEstado.getSelectedItem().toString();

            Tarea tarea = new Tarea(codigo, titulo, curso, fecha, estado);
            listaTareas.add(tarea);

            JOptionPane.showMessageDialog(null, "Tarea registrada");

            mostrarTareas();
        }
    }

    public void mostrarTareas() {
        String texto = "";

        for (Tarea t : listaTareas) {
            texto += t.getCodigo() + " - " + t.getTitulo() + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}