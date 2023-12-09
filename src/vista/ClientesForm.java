/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import modelo.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC_TONY
 */
public class ClientesForm extends javax.swing.JFrame {

    /**
     * Creates new form ClientesForm
     */
    public ClientesForm() {
        initComponents();
        setLocationRelativeTo(null);
        verCliente();
        verTipoCliente();
        habilitarBotones(false,true, false, false, false, false, false, false, false, false);
    }

    void limpiar() {
        txtId.setText("");
        txtNombre2.setText("");
        txtNumeroCliente.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtId.requestFocus();
    }

    void verCliente() {
        DefaultTableModel modelocliente;
        DAOCliente oDCli = new DAOCliente();
        modelocliente = oDCli.verCliente();
        tblCliente.setModel(modelocliente);
    }

    void habilitarBotones(boolean a, boolean b, boolean ed, boolean el, boolean id, boolean nom, boolean dir, boolean tel, boolean tip, boolean num) {
        btnAgregar.setEnabled(a);
        btnBuscar.setEnabled(b);
        btnEditar.setEnabled(ed);
        btnEliminar.setEnabled(el);
        txtId.setEnabled(id);
        txtNombre2.setEnabled(nom);
        txtDireccion.setEnabled(dir);
        txtTelefono.setEnabled(tel);
        CboTipoCliente.setEnabled(tip);
        txtNumeroCliente.setEnabled(num);
    }
    
    void verTipoCliente(){
        DefaultComboBoxModel modelocliente;
        DAOTipoCliente objeto = new DAOTipoCliente();
        modelocliente = objeto.verTipoCl();
        CboTipoCliente.setModel(modelocliente);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        CboTipoCliente = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE CLIENTES");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 320, 50));

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnEliminar.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 70, 40));

        tblCliente.setBackground(new java.awt.Color(255, 204, 102));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre / Razon Social", "RUC", "DNI", "Direccion", "Telefono"
            }
        ));
        tblCliente.setColumnSelectionAllowed(true);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        tblCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 890, 190));

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditar.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 70, 40));

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 90, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("ID Cliente: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 30));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Nombre o Razon social :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        txtNombre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 390, 30));

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nueva-pagina.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoMouseExited(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 120, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tipo :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("DNI / RUC:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));

        txtNumeroCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtNumeroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 120, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Direccion :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 40));

        txtDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 390, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Telefono :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 90, 30));

        txtTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 120, 30));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 40));

        btnSalir2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion-chico.png"))); // NOI18N
        btnSalir2.setText("Salir");
        btnSalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalir2MouseExited(evt);
            }
        });
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 120, 50));

        CboTipoCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CboTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboTipoClienteActionPerformed(evt);
            }
        });
        jPanel2.add(CboTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo bl.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 910, 560));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CboTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboTipoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboTipoClienteActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int idCliente, codTipoCliente;
        String nombreCliente, dniruc, direccion, telefono, tipoCliente;

        idCliente = Integer.parseInt(txtId.getText());
        nombreCliente = txtNombre2.getText();
        direccion = txtDireccion.getText();
        telefono = txtTelefono.getText();
        dniruc = txtNumeroCliente.getText();

        tipoCliente = (String)CboTipoCliente.getSelectedItem();
        DTOTipoCliente objetoC = new DTOTipoCliente();
        objetoC.setTipoCliente(tipoCliente);

        DAOTipoCliente objetoD = new DAOTipoCliente();
        codTipoCliente = objetoD.recuperarCodigo(objetoC);

        DTOCliente objeto = new DTOCliente();
        objeto.setIdCliente(idCliente);
        objeto.setNombreCliente(nombreCliente);
        objeto.setDireccion(direccion);
        objeto.setTelefono(telefono);
        objeto.setIdTipoCliente(codTipoCliente);
        objeto.setNumeroCliente(dniruc);

        DAOCliente oDCli = new DAOCliente();
        oDCli.agregar(objeto);

        verCliente();
        limpiar();
        habilitarBotones(false,true, false, false, false, false, false, false, false, false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitarBotones(true,true, false, false,true, true, true, true, true, true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int idCliente, codTipoCliente;
        String nombreCliente, dniruc, direccion, telefono, tipoCliente;
        idCliente = Integer.parseInt(txtId.getText());
        nombreCliente = txtNombre2.getText();
        direccion = txtDireccion.getText();
        telefono = txtTelefono.getText();
        dniruc = txtNumeroCliente.getText();
        tipoCliente = (String)CboTipoCliente.getSelectedItem();
        DTOTipoCliente objetoC = new DTOTipoCliente();
        objetoC.setTipoCliente(tipoCliente);
        DAOTipoCliente objetoD = new DAOTipoCliente();
        codTipoCliente = objetoD.recuperarCodigo(objetoC);
        DTOCliente objeto = new DTOCliente(idCliente, nombreCliente, dniruc, direccion, telefono, codTipoCliente);
        DAOCliente oDCli = new DAOCliente();
        oDCli.editar(objeto);
        verCliente();
        limpiar();
        habilitarBotones(false,true, false, false, false, false, false, false, false, false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        int fila;
        fila = tblCliente.getSelectedRow();
        String IdCliente,NombreCliente,Direccion,Telefono,TipoCliente,NumeroCliente;
        IdCliente = (String) tblCliente.getValueAt(fila,0);
        NombreCliente = (String) tblCliente.getValueAt(fila,1);
        Direccion = (String) tblCliente.getValueAt(fila,2);
        Telefono = (String) tblCliente.getValueAt(fila,3);
        TipoCliente = (String) tblCliente.getValueAt(fila,4);
        NumeroCliente = (String) tblCliente.getValueAt(fila,5);

        txtId.setText(IdCliente);
        txtNombre2.setText(NombreCliente);
        txtDireccion.setText(Direccion);
        txtTelefono.setText(Telefono);
        CboTipoCliente.setSelectedItem(TipoCliente);
        txtNumeroCliente.setText(NumeroCliente);
        habilitarBotones(false, true, true, true, true, true, true, true, true, true);
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idCliente;
        idCliente = Integer.parseInt(txtId.getText());

        DTOCliente objeto = new DTOCliente(idCliente);

        DAOCliente objetoD= new DAOCliente();
        objetoD.eliminar(objeto);

        verCliente();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        btnNuevo.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseExited
        btnNuevo.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnNuevoMouseExited

    private void btnSalir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir2MouseEntered
        btnSalir2.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnSalir2MouseEntered

    private void btnSalir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir2MouseExited
        btnSalir2.setBackground(new Color(255,255,255 ));
    }//GEN-LAST:event_btnSalir2MouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(255,255,255 ));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
         btnEliminar.setBackground(new Color(255,255,255 ));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(255,255,255 ));
    }//GEN-LAST:event_btnBuscarMouseExited
    
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
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboTipoCliente;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
