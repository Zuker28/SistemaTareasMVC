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

    private VistaTarea vista;
    private ArrayList<Tarea> listaTareas;

    public ControladorTarea(VistaTarea vista) {
        this.vista = vista;
        this.listaTareas = new ArrayList<>();

        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnRegistrar) {

            String codigo = vista.txtCodigo.getText();
            String titulo = vista.txtTitulo.getText();
            String curso = vista.txtCurso.getText();
            String fecha = vista.txtFecha.getText();
            String estado = vista.cbEstado.getSelectedItem().toString();

            if (codigo.isEmpty() || titulo.isEmpty() || curso.isEmpty() || fecha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos vacíos");
                return;
            }

            for (Tarea t : listaTareas) {
                if (t.getCodigo().equals(codigo)) {
                    JOptionPane.showMessageDialog(null, "Código repetido");
                    return;
                }
            }

            Tarea tarea = new Tarea(codigo, titulo, curso, fecha, estado);
            listaTareas.add(tarea);

            JOptionPane.showMessageDialog(null, "Tarea registrada");

            mostrarTareas();
        }

        if (e.getSource() == vista.btnEliminar) {

            String codigo = vista.txtCodigo.getText();

            listaTareas.removeIf(t -> t.getCodigo().equals(codigo));

            JOptionPane.showMessageDialog(null, "Tarea eliminada");
        }

        if (e.getSource() == vista.btnBuscar) {

            String texto = vista.txtCodigo.getText();

            for (Tarea t : listaTareas) {
                if (t.getCodigo().equals(texto) || t.getTitulo().equalsIgnoreCase(texto)) {
                    JOptionPane.showMessageDialog(null,
                            t.getCodigo() + " - " + t.getTitulo() + " - " + t.getEstado());
                    return;
                }
            }

            JOptionPane.showMessageDialog(null, "No encontrada");
        }
    }

    public void mostrarTareas() {
        String texto = "";

        for (Tarea t : listaTareas) {
            texto += t.getCodigo() + " - " + t.getTitulo() + " - " + t.getEstado() + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}