/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.*;

/**
 *
 * @author Javir
 */
public class PanelAltasProg extends javax.swing.JPanel {
    
    Lista listado;
   
    public PanelAltasProg(Lista listado) {
        initComponents();
        casadoBox.setLabel("Casado");
        MensajeError.setVisible(false);
        
    }
    
    public void pedirFoco(){
        nombreField.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        sueldoLabel = new javax.swing.JLabel();
        sueldoField = new javax.swing.JTextField();
        fechaLabel = new javax.swing.JLabel();
        fechaField1 = new javax.swing.JTextField();
        btAceptar = new javax.swing.JButton();
        apellidosField = new javax.swing.JTextField();
        apellidoLabel = new javax.swing.JLabel();
        casadoLabel = new javax.swing.JLabel();
        casadoBox = new java.awt.Checkbox();
        fechaField2 = new javax.swing.JTextField();
        fechaField3 = new javax.swing.JTextField();
        MensajeError = new javax.swing.JOptionPane();

        nombreLabel.setText("Nombre: ");

        nombreField.setToolTipText("");
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        sueldoLabel.setText("Sueldo: ");

        sueldoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoFieldActionPerformed(evt);
            }
        });

        fechaLabel.setText("Fecha de contratación (dd/mm/aaaa):");

        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        apellidosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosFieldActionPerformed(evt);
            }
        });

        apellidoLabel.setText("Apellidos: ");

        casadoLabel.setText("Casado: ");

        casadoBox.setLabel("checkbox1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaLabel)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellidoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sueldoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(casadoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(292, 292, 292)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fechaField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaField3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                    .addComponent(apellidosField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sueldoField, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAceptar)
                        .addGap(274, 274, 274))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoLabel)
                    .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoLabel)
                    .addComponent(sueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel)
                    .addComponent(fechaField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(casadoBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casadoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addComponent(btAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(MensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        // TODO add your handling code here:
        
        Object ob=new Object();
        
        if(Empleado.comprobarSueldo(Float.parseFloat(sueldoField.getText()))){
            
            MensajeError.setVisible(false);
            
            ob=new Programador(nombreField.getText(),Float.parseFloat(sueldoField.getText()),
                Integer.parseInt(fechaField1.getText()),Integer.parseInt(fechaField2.getText()),
                Integer.parseInt(fechaField3.getText()),apellidosField.getText() ,casadoBox.getState());
            
            listado.insertar(ob);
            
        }else if(!Empleado.comprobarSueldo(Float.parseFloat(sueldoField.getText()))){
            setMensajeError("Sueldo incorrecto, supera el sueldo máximo establecido ("+Empleado.getSueldoMax()+") o es inferior al mínimo (1000), inténtelo de nuevo.");
        }
        setFieldNull();
    }//GEN-LAST:event_btAceptarActionPerformed

     private void setMensajeError(String mensaje){
        MensajeError.setMessage(mensaje);
        MensajeError.setVisible(true);
    }
    
    private void setFieldNull(){
       
        nombreField.setText(null);
        apellidosField.setText(null);
        casadoBox.setState(false);
        fechaField1.setText(null);
        fechaField1.setText(null);
        fechaField2.setText(null);
        fechaField3.setText(null);
        sueldoField.setText(null);
        nombreField.requestFocus();
    }
    
    private void sueldoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldoFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void apellidosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane MensajeError;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidosField;
    private javax.swing.JButton btAceptar;
    private java.awt.Checkbox casadoBox;
    private javax.swing.JLabel casadoLabel;
    private javax.swing.JTextField fechaField1;
    private javax.swing.JTextField fechaField2;
    private javax.swing.JTextField fechaField3;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField sueldoField;
    private javax.swing.JLabel sueldoLabel;
    // End of variables declaration//GEN-END:variables
}