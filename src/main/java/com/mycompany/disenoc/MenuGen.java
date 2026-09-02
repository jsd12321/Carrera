/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.disenoc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jessi
 */
public class MenuGen extends javax.swing.JFrame {

    /**
     * Creates new form MenuGen
     */
    public MenuGen() {
        initComponents();
        //setTitle("Menú General");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa

        setLayout(new BorderLayout());

        // =============== Panel Superior ====================
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBackground(new Color(0,204,204)); 

        JLabel lblTitulo = new JLabel("CARRERA BUAP 2025", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Bodoni MT Black", Font.BOLD, 48));

        JLabel lblSubtitulo = new JLabel("MENU GENERAL", SwingConstants.CENTER);
        lblSubtitulo.setFont(new Font("SimSun-ExtG", Font.PLAIN, 24));

        panelSuperior.add(lblTitulo, BorderLayout.NORTH);
        panelSuperior.add(lblSubtitulo, BorderLayout.CENTER);

        // =============== Panel Central ====================
        JPanel panelCentral = new JPanel(new GridLayout(1, 3));
        panelCentral.setBackground(new Color(204,255,255)); // Verde claro

        // Imagen izquierda
        JLabel lblIzquierda = new JLabel();
        lblIzquierda.setHorizontalAlignment(SwingConstants.CENTER);
        lblIzquierda.setIcon(new ImageIcon(getClass().getResource("/imagenes/Corredores22.png"))); // sin escalado
        panelCentral.add(lblIzquierda);

        // Botones centro
        JPanel panelBotones = new JPanel(new GridLayout(3, 1, 50, 50));
        panelBotones.setOpaque(false);
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JButton btnHombre = new JButton("Hombre");
        JButton btnMujer = new JButton("Mujer");
        JButton btnNino = new JButton("Niño");

        configurarBoton(btnHombre);
        configurarBoton(btnMujer);
        configurarBoton(btnNino);

        panelBotones.add(btnHombre);
        panelBotones.add(btnMujer);
        panelBotones.add(btnNino);

        panelCentral.add(panelBotones);

        // Imagen derecha
        JLabel lblDerecha = new JLabel();
        lblDerecha.setHorizontalAlignment(SwingConstants.CENTER);
        lblDerecha.setIcon(new ImageIcon(getClass().getResource("/imagenes/BUAPL.png"))); // sin escalado
        panelCentral.add(lblDerecha);

        // =============== Panel Inferior ====================
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 15));
        panelInferior.setBackground(new Color(0,204,204));

        JButton btnAutor = new JButton("Autor");
        JButton btnSalir = new JButton("Salir");

        configurarBoton(btnAutor);
        configurarBoton(btnSalir);

        panelInferior.add(btnAutor);
        panelInferior.add(btnSalir);

        // =============== Agregar todo al JFrame ====================
        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // =============== Funcionalidad de los botones ====================

        btnHombre.addActionListener(e -> {
            Hombre r2 = new Hombre();
            r2.setVisible(true);
            dispose();
        });

        btnMujer.addActionListener(e -> {
            Mujer r2 = new Mujer();
            r2.setVisible(true);
            dispose();
        });

        btnNino.addActionListener(e -> {
            Nino r2 = new Nino();
            r2.setVisible(true);
            dispose();
        });

        btnAutor.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,
                "Jessica Zepeda Cano\nCurso: Programación Orientada a Objetos\nMatrícula: 202463993\nNo. Lista: 26",
                "AUTOR", JOptionPane.INFORMATION_MESSAGE);
        });

        btnSalir.addActionListener(e -> {
            int opc = JOptionPane.showConfirmDialog(null, "¿Quiere salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opc == 0) {
                System.exit(0);
            }
        });
    }

    // Método auxiliar para personalizar botones
    private void configurarBoton(JButton boton) {
        boton.setBackground(Color.WHITE);
        boton.setForeground(Color.BLACK);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Arial", Font.PLAIN, 16));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //boton.setMargin(new Insets(2, 10, 2, 10));
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
            .addGap(0, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MenuGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
