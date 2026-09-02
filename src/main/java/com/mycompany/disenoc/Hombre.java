/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.disenoc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author jessi
 */
public class Hombre extends javax.swing.JFrame {
        private JTextField txtNombre, txtPaterno, txtMaterno, txtEdad, txtFacultad;
        private static List<Hombree> listaHombres = new ArrayList<>(); 
        private static int contadorHombres = 1;
    /**
     * Creates new form Hombre
     */
    public Hombre() {
        initComponents();
        //setTitle("Registro de Hombres");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        // ==== Panel superior ====
        JPanel panelSuperior = new JPanel(new GridLayout(2, 1));
        panelSuperior.setBackground(new Color(0,204,204)); 

        JLabel titulo = new JLabel("CARRERA BUAP 2025", SwingConstants.CENTER);
        titulo.setFont(new Font("Bodoni MT Black", Font.BOLD, 48));

        JLabel subtitulo = new JLabel("REGISTRO DE ASISTENTES HOMBRES", SwingConstants.CENTER);
        subtitulo.setFont(new Font("SimSun-ExtG", Font.PLAIN, 24));

        panelSuperior.add(titulo);
        panelSuperior.add(subtitulo);

        // ==== Panel central ====
        JPanel panelCentral = new JPanel(new GridLayout(1, 2));
        panelCentral.setBackground(new Color(204,255,255));

        // Imagen izquierda
        JLabel lblImagen = new JLabel();
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/HMCorriendo.png")));
        panelCentral.add(lblImagen);

        // Campos a la derecha
        JPanel panelCampos = new JPanel(new GridBagLayout());
        panelCampos.setBackground(new Color(204,255,255));
        panelCampos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel lblNombre = new JLabel("Nombre: ");
        lblNombre.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        txtNombre = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 0;
        panelCampos.add(lblNombre, gbc);
        gbc.gridx = 1;
        panelCampos.add(txtNombre, gbc);

        JLabel lblPaterno = new JLabel("Paterno: ");
        lblPaterno.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        txtPaterno = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 1;
        panelCampos.add(lblPaterno, gbc);
        gbc.gridx = 1;
        panelCampos.add(txtPaterno, gbc);

        JLabel lblMaterno = new JLabel("Materno: ");
        lblMaterno.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        txtMaterno = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 2;
        panelCampos.add(lblMaterno, gbc);
        gbc.gridx = 1;
        panelCampos.add(txtMaterno, gbc);

        JLabel lblEdad = new JLabel("Edad: ");
        lblEdad.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        txtEdad = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 3;
        panelCampos.add(lblEdad, gbc);
        gbc.gridx = 1;
        panelCampos.add(txtEdad, gbc);

        JLabel lblFacultad = new JLabel("Facultad: ");
        lblFacultad.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        txtFacultad = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 4;
        panelCampos.add(lblFacultad, gbc);
        gbc.gridx = 1;
        panelCampos.add(txtFacultad, gbc);

        panelCentral.add(panelCampos);


        // ==== Panel inferior ====
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelInferior.setBackground(new Color(0,204,204)); // Azul claro

        JButton btnRegistrar = new JButton("Registrar");
        JButton btnListar1 = new JButton("Listar 1");
        JButton btnListar2 = new JButton("Listar 2");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnRegresar = new JButton("Regresar");

        // Formato botones
        for (JButton b : new JButton[]{btnRegistrar, btnListar1, btnListar2, btnBuscar, btnRegresar}) {
            b.setBackground(Color.WHITE);
            b.setForeground(Color.BLACK);
            b.setFont(new Font("Arial", Font.PLAIN, 14));
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelInferior.add(b);
        }

        // ==== Añadir todo a la ventana ====
        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // ==== Funcionalidad de los botones ====

        btnRegistrar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            String paterno = txtPaterno.getText().trim();
            String materno = txtMaterno.getText().trim();
            int edad;
            String facultad = txtFacultad.getText().trim();

            try {
                edad = Integer.parseInt(txtEdad.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Edad invalida. Introduzca un número.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(this, "¿Desea registrar al asistente?", "Confirmar registro", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String folio = String.format("H-%04d", contadorHombres++);
                Hombree h = new Hombree(nombre, paterno, materno, edad, facultad, folio);
                listaHombres.add(h);

                JOptionPane.showMessageDialog(this, "Registro exitoso", "Registrado", JOptionPane.INFORMATION_MESSAGE);

                txtNombre.setText("");
                txtPaterno.setText("");
                txtMaterno.setText("");
                txtEdad.setText("");
                txtFacultad.setText("");
            }
        });

        btnListar1.addActionListener(e -> {
            if (listaHombres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se ha registrado nadie.", "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            for (Hombree h : listaHombres) {
                JOptionPane.showMessageDialog(this, h.toString(), "Hombre registrado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnListar2.addActionListener(e -> {
            if (listaHombres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay registros para mostrar.", "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            String[] opciones = {"Como están registrados", "Ordenados por apellido paterno"};
            int seleccion = JOptionPane.showOptionDialog(this,
                    "¿Cómo desea mostrar los registros?",
                    "Orden de listado",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            List<Hombree> copiaLista = new ArrayList<>(listaHombres);

            if (seleccion == 1) {
                for (int i = 0; i < copiaLista.size() - 1; i++) {
                    for (int j = 0; j < copiaLista.size() - i - 1; j++) {
                        if (copiaLista.get(j).getPaterno().compareToIgnoreCase(copiaLista.get(j + 1).getPaterno()) > 0) {
                            Hombree temp = copiaLista.get(j);
                            copiaLista.set(j, copiaLista.get(j + 1));
                            copiaLista.set(j + 1, temp);
                        }
                    }
                }
            }

            System.out.println("=== LISTA DE ASISTENTES HOMBRES ===");
            for (Hombree h : copiaLista) {
                System.out.println(h.toString());
            }
        });

        btnBuscar.addActionListener(e -> {
            if (listaHombres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay asistentes registrados.", "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            String apellidoBuscar = JOptionPane.showInputDialog(this, "Ingrese el apellido paterno a buscar:");

            if (apellidoBuscar == null || apellidoBuscar.trim().isEmpty()) {
                return;
            }

            boolean encontrado = false;
            for (Hombree h : listaHombres) {
                if (h.getPaterno().equalsIgnoreCase(apellidoBuscar.trim())) {
                    JOptionPane.showMessageDialog(this, "¡ASISTENTE ENCONTRADO!\n" + h.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "No se encontró ningún asistente con ese apellido.", "No encontrado", JOptionPane.WARNING_MESSAGE);
            }
        });

        btnRegresar.addActionListener(e -> {
            MenuGen menu = new MenuGen();
            menu.setVisible(true);
            this.dispose();
        });
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
