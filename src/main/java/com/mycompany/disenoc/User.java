
package com.mycompany.disenoc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author jessi
 */
public class User extends javax.swing.JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        //setTitle("Ventana Usuario");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        
        // Panel Superior
        
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(0, 204, 204));
        JLabel lblTitulo = new JLabel("CARRERA BUAP 2025");
        lblTitulo.setFont(new Font("Bodoni MT Black", Font.BOLD, 48));
        lblTitulo.setForeground(Color.BLACK);
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);

        
        // Panel Central
       
        JPanel panelCentral = new JPanel(new GridLayout(1, 2));

        // Lado Izquierdo (Imagen)
        JPanel panelImagen = new JPanel(new BorderLayout());
        panelImagen.setBackground(new Color(204,255,255));
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/LOGO.png"));
        Image imagenEscalada = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        JLabel lblImagen = new JLabel(iconoEscalado, SwingConstants.CENTER);
        panelImagen.add(lblImagen, BorderLayout.CENTER);

        // Panel Derecho (Campos)
        JPanel panelCampos = new JPanel(new GridBagLayout());
        panelCampos.setBackground(new Color(204,255,255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblUsuario = new JLabel("Usuario: ");
        lblUsuario.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelCampos.add(lblUsuario, gbc);

        txtUsuario = new JTextField(15);
        gbc.gridx = 1;
        panelCampos.add(txtUsuario, gbc);

        JLabel lblClave = new JLabel("Clave:");
        lblClave.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelCampos.add(lblClave, gbc);

        txtClave = new JPasswordField(15); 
        gbc.gridx = 1;
        panelCampos.add(txtClave, gbc);

        // Agregar paneles al central
        panelCentral.add(panelImagen);
        panelCentral.add(panelCampos);
        add(panelCentral, BorderLayout.CENTER);

       
        // Panel Inferior
     
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(new Color(0,204,204));

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setFont(new Font("Arial", Font.PLAIN, 16));
        btnIngresar.setBackground(Color.WHITE);
        btnIngresar.setForeground(Color.BLACK);
        btnIngresar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = txtUsuario.getText();
                String clave = new String(txtClave.getPassword());

                if (nom.equals("Lola") && clave.equals("12")) {
                    accesoPermitido();
                } else if (nom.equals("Emma") && clave.equals("1234")) {
                    accesoPermitido();
                } else if (nom.equals("Laura") && clave.equals("123456")) {
                    accesoPermitido();
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado", "SEGURIDAD BUAP", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 16));
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opc = JOptionPane.showConfirmDialog(null, "¿Quiere salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opc == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        panelBotones.add(btnIngresar);
        panelBotones.add(btnSalir);
        add(panelBotones, BorderLayout.SOUTH);
    }

    // Método para acceso permitido
    private void accesoPermitido() {
        JOptionPane.showMessageDialog(this, "Acceso permitido", "SEGURIDAD BUAP", JOptionPane.INFORMATION_MESSAGE);
        MenuGen r2 = new MenuGen(); // Asegúrate de tener esta clase
        r2.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
