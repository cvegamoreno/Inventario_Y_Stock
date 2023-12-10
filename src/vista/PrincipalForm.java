/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package vista;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.plaf.metal.MetalLookAndFeel;

/**
 *
 * @author PC_TONY
 */
public class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public PrincipalForm() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/logoP.png")).getImage());
        this.setSize(1440,900);
        setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        opCargarUsuario = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        opCargarVenta = new javax.swing.JMenuItem();
        opListadoVenta = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        opCargarRegistro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opRegistrocli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSalir.setText("X");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        desktopPane.add(btnSalir);
        btnSalir.setBounds(1360, 60, 70, 50);

        btnMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMinimizar.setText("-");
        btnMinimizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        desktopPane.add(btnMinimizar);
        btnMinimizar.setBounds(1290, 60, 70, 50);

        jTextField2.setBackground(new java.awt.Color(236, 236, 236));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 153, 51));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("BIENVENIDO");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        desktopPane.add(jTextField2);
        jTextField2.setBounds(0, 50, 1440, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo Big.jpg"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(0, 0, 2300, 1170);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2300, 1170));

        menuBar.setBorder(null);

        fileMenu.setBackground(new java.awt.Color(0, 204, 255));
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuaprincipal.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Registro");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        opCargarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opCargarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-correcta.png"))); // NOI18N
        opCargarUsuario.setMnemonic('o');
        opCargarUsuario.setText("Registo Usuario");
        opCargarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCargarUsuarioActionPerformed(evt);
            }
        });
        fileMenu.add(opCargarUsuario);

        menuBar.add(fileMenu);

        editMenu.setBackground(new java.awt.Color(0, 204, 255));
        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Venta");
        editMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        opCargarVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opCargarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-correcta.png"))); // NOI18N
        opCargarVenta.setMnemonic('t');
        opCargarVenta.setText("Realizar Venta");
        opCargarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCargarVentaActionPerformed(evt);
            }
        });
        editMenu.add(opCargarVenta);

        opListadoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-correcta.png"))); // NOI18N
        opListadoVenta.setText("Lista de Ventas");
        opListadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opListadoVentaActionPerformed(evt);
            }
        });
        editMenu.add(opListadoVenta);

        menuBar.add(editMenu);

        helpMenu.setBackground(new java.awt.Color(0, 204, 255));
        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Productos");
        helpMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        opCargarRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opCargarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-correcta.png"))); // NOI18N
        opCargarRegistro.setMnemonic('c');
        opCargarRegistro.setText("Registrar Producto");
        opCargarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCargarRegistroActionPerformed(evt);
            }
        });
        helpMenu.add(opCargarRegistro);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        opRegistrocli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opRegistrocli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-correcta.png"))); // NOI18N
        opRegistrocli.setText("Registro deClientes");
        opRegistrocli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrocliActionPerformed(evt);
            }
        });
        jMenu1.add(opRegistrocli);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCargarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCargarVentaActionPerformed
        new VentaForm().setVisible(true);
    }//GEN-LAST:event_opCargarVentaActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        
    }//GEN-LAST:event_editMenuActionPerformed

    private void opCargarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCargarUsuarioActionPerformed
        new RegistrarUsuario().setVisible(true);
    }//GEN-LAST:event_opCargarUsuarioActionPerformed

    private void opCargarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCargarRegistroActionPerformed
        FrmProducto frmProducto = new FrmProducto();
        frmProducto.setVisible(true);
    }//GEN-LAST:event_opCargarRegistroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(255,204,204) );
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 69, 69) );
    }//GEN-LAST:event_btnSalirMouseEntered

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void opRegistrocliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrocliActionPerformed
        ClientesForm clientesForm = new ClientesForm();
        clientesForm.setVisible(true);
    }//GEN-LAST:event_opRegistrocliActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(PrincipalForm.ICONIFIED); 
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(new Color(255, 247, 83) );
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(new Color(255,255,255) );
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void opListadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListadoVentaActionPerformed
        ListaVentas listaVentas = new ListaVentas();
        listaVentas.setVisible(true);
    }//GEN-LAST:event_opListadoVentaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem opCargarRegistro;
    private javax.swing.JMenuItem opCargarUsuario;
    private javax.swing.JMenuItem opCargarVenta;
    private javax.swing.JMenuItem opListadoVenta;
    private javax.swing.JMenuItem opRegistrocli;
    // End of variables declaration//GEN-END:variables

    private static class Product {

        public Product() {
        }

        private Product(PrincipalForm aThis, boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void SetVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
