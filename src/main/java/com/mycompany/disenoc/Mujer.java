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
public class Mujer extends javax.swing.JFrame {
        private JTextField jTextField6, jTextField7, jTextField8, jTextField9, jTextField5;
        private static List<Mujerr> listaMujeres = new ArrayList<>();
        private static int contadorMujeres = 1;
    /**
     * Creates new form Mujer
     */
    public Mujer() {
        initComponents();
        //setTitle("Registro de Mujeres");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        // Panel superior
        JPanel panelSuperior = new JPanel(new GridLayout(2, 1));
        panelSuperior.setBackground(new Color(0,204,204));

        JLabel titulo = new JLabel("CARRERA BUAP 2025", SwingConstants.CENTER);
        titulo.setFont(new Font("Bodoni MT Black", Font.BOLD, 48));

        JLabel subtitulo = new JLabel("REGISTRO DE ASISTENTES MUJERES", SwingConstants.CENTER);
        subtitulo.setFont(new Font("SimSun-ExtG", Font.PLAIN, 24));

        panelSuperior.add(titulo);
        panelSuperior.add(subtitulo);

        // Panel central
        JPanel panelCentral = new JPanel(new GridLayout(1, 2));
        panelCentral.setBackground(new Color(204,255,255)); // Rosa muy claro

        JLabel lblImagen = new JLabel();
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/MJCorriendo.png")));
        panelCentral.add(lblImagen);

        JPanel panelCampos = new JPanel(new GridBagLayout());
        panelCampos.setBackground(new Color(204,255,255));
        panelCampos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel lblNombre = new JLabel("Nombre: ");
        lblNombre.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        jTextField6 = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 0;
        panelCampos.add(lblNombre, gbc);
        gbc.gridx = 1;
        panelCampos.add(jTextField6, gbc);

        JLabel lblPaterno = new JLabel("Paterno: ");
        lblPaterno.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        jTextField7 = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 1;
        panelCampos.add(lblPaterno, gbc);
        gbc.gridx = 1;
        panelCampos.add(jTextField7, gbc);

        JLabel lblMaterno = new JLabel("Materno: ");
        lblMaterno.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        jTextField8 = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 2;
        panelCampos.add(lblMaterno, gbc);
        gbc.gridx = 1;
        panelCampos.add(jTextField8, gbc);

        JLabel lblEdad = new JLabel("Edad: ");
        lblEdad.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        jTextField9 = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 3;
        panelCampos.add(lblEdad, gbc);
        gbc.gridx = 1;
        panelCampos.add(jTextField9, gbc);

        JLabel lblFacultad = new JLabel("Facultad: ");
        lblFacultad.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        jTextField5 = new JTextField(40);
        gbc.gridx = 0; gbc.gridy = 4;
        panelCampos.add(lblFacultad, gbc);
        gbc.gridx = 1;
        panelCampos.add(jTextField5, gbc);

        panelCentral.add(panelCampos);

        // Panel inferior
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelInferior.setBackground(new Color(0,204,204));

        JButton btnRegistrar = new JButton("Registrar");
        JButton btnListar1 = new JButton("Listar 1");
        JButton btnListar2 = new JButton("Listar 2");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnRegresar = new JButton("Regresar");

        for (JButton b : new JButton[]{btnRegistrar, btnListar1, btnListar2, btnBuscar, btnRegresar}) {
            b.setBackground(Color.WHITE);
            b.setForeground(Color.BLACK);
            b.setFont(new Font("Arial", Font.PLAIN, 14));
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
            panelInferior.add(b);
        }

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // Funcionalidad botones

        btnRegistrar.addActionListener(e -> {
            String nombre = jTextField6.getText().trim();
            String paterno = jTextField7.getText().trim();
            String materno = jTextField8.getText().trim();
            int edad;
            String facultad = jTextField5.getText().trim();

            try {
                edad = Integer.parseInt(jTextField9.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Edad inválida. Introduzca un número.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(this, "¿Desea registrar a la asistente?", "Confirmar registro", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String folio = String.format("M-%04d", contadorMujeres++);
                Mujerr mujerr = new Mujerr(nombre, paterno, materno, edad, facultad, folio);
                listaMujeres.add(mujerr);

                JOptionPane.showMessageDialog(this, "Registro exitoso", "Registrada", JOptionPane.INFORMATION_MESSAGE);

                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField5.setText("");
            }
        });

        btnListar1.addActionListener(e -> {
            if (listaMujeres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay asistentes registradas.", "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            for (Mujerr m : listaMujeres) {
                JOptionPane.showMessageDialog(this, m.toString(), "Asistente registrada", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnListar2.addActionListener(e -> {
            if (listaMujeres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay registros para mostrar.", "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            String[] opciones = {"Como están registradas", "Ordenadas por apellido paterno"};
            int seleccion = JOptionPane.showOptionDialog(this,
                    "¿Cómo desea mostrar los registros?",
                    "Orden de listado",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            List<Mujerr> copiaLista = new ArrayList<>(listaMujeres);

            if (seleccion == 1) {
                for (int i = 0; i < copiaLista.size() - 1; i++) {
                    for (int j = 0; j < copiaLista.size() - i - 1; j++) {
                        if (copiaLista.get(j).getPaterno().compareToIgnoreCase(copiaLista.get(j + 1).getPaterno()) > 0) {
                            Mujerr temp = copiaLista.get(j);
                            copiaLista.set(j, copiaLista.get(j + 1));
                            copiaLista.set(j + 1, temp);
                        }
                    }
                }
            }

            System.out.println("=== LISTA DE ASISTENTES MUJERES ===");
            for (Mujerr m : copiaLista) {
                System.out.println(m.toString());
            }
        });

        btnBuscar.addActionListener(e -> {
            if (listaMujeres.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay asistentes registradas.", "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            String apellidoBuscar = JOptionPane.showInputDialog(this, "Ingrese el apellido paterno a buscar:");

            if (apellidoBuscar == null || apellidoBuscar.trim().isEmpty()) {
                return;
            }

            boolean encontrada = false;
            for (Mujerr m : listaMujeres) {
                if (m.getPaterno().equalsIgnoreCase(apellidoBuscar.trim())) {
                    JOptionPane.showMessageDialog(this, "¡ASISTENTE ENCONTRADA!\n" + m.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    encontrada = true;
                }
            }

            if (!encontrada) {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna asistente con ese apellido.", "No encontrada", JOptionPane.WARNING_MESSAGE);
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
            .addGap(0, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mujer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
