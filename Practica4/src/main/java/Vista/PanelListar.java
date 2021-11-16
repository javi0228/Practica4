package Vista;

import Controlador.*;
import Modelo.*;


public class PanelListar extends javax.swing.JPanel {

    Lista listado;

    public PanelListar() {

        initComponents();

        fieldNombre.setEditable(false);
        fieldSueldo.setEditable(false);
        fieldFecha.setEditable(false);
        fieldDni.setEditable(false);
        fieldEdad.setEditable(false);
        fieldApellidos.setEditable(false);
        checkCasado.setEnabled(false);
        checkCasado.setLabel("Casado");

    }

    public void apagarBotones() {

        if (listado.getInicio().getSiguiente() != null) {
            btSiguiente.setEnabled(true);

        } else {
            btSiguiente.setEnabled(false);
            

        }
        
        btRetroceder.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldNombre = new javax.swing.JTextField();
        fieldSueldo = new javax.swing.JTextField();
        fieldFecha = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelSueldo = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        btRetroceder = new javax.swing.JButton();
        btSiguiente = new javax.swing.JButton();
        labelEdad = new javax.swing.JLabel();
        fieldEdad = new javax.swing.JTextField();
        fieldDni = new javax.swing.JTextField();
        labelDni = new javax.swing.JLabel();
        labelCasado = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        fieldApellidos = new javax.swing.JTextField();
        checkCasado = new java.awt.Checkbox();

        fieldSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSueldoActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre:");

        labelSueldo.setText("Sueldo:");

        labelFecha.setText("Fecha de contratacion:");

        btRetroceder.setText("Retroceder");
        btRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetrocederActionPerformed(evt);
            }
        });

        btSiguiente.setText("Siguiente");
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });

        labelEdad.setText("Edad: ");

        labelDni.setText("DNI: ");

        labelCasado.setText("Casado: ");

        labelApellidos.setText("Apellidos: ");

        checkCasado.setLabel("checkbox1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btRetroceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(btSiguiente)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNombre)
                    .addComponent(labelSueldo)
                    .addComponent(labelFecha)
                    .addComponent(labelEdad)
                    .addComponent(labelDni)
                    .addComponent(labelCasado)
                    .addComponent(labelApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fieldApellidos)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(fieldSueldo)
                    .addComponent(fieldFecha)
                    .addComponent(fieldEdad)
                    .addComponent(fieldDni)
                    .addComponent(checkCasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSueldo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEdad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkCasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRetroceder)
                    .addComponent(btSiguiente))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed

        listado.avanzar();
        btRetroceder.setEnabled(true);
        
        //Creo un objeto de tipo Object para posteriormente convertirlo en el objeto que estará en la lista
        Object ob = listado.getActual().getDato();

        if (ob instanceof Programador) {
            
            setCamposProgramador(ob);
            
        } else {
            if (ob instanceof Analista) {
                
                setCamposAnalista(ob);
            }
        }

        if (listado.ultimo() ) {
            btSiguiente.setEnabled(false);
        } else {
            btSiguiente.setEnabled(true);
        }

        


    }//GEN-LAST:event_btSiguienteActionPerformed

    private void fieldSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSueldoActionPerformed

    private void btRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetrocederActionPerformed
        // TODO add your handling code here:
        listado.retroceder();
        btSiguiente.setEnabled(true);

        Object ob = listado.getActual().getDato();

        if (ob instanceof Programador) {
            
            setCamposProgramador(ob);
            
        } else {
            if (ob instanceof Analista) {
                
                setCamposAnalista(ob);
            }
        }

        if (listado.primero()) {
            btRetroceder.setEnabled(false);
        } else {
            btRetroceder.setEnabled(true);
        }


    }//GEN-LAST:event_btRetrocederActionPerformed

    void setCamposAnalista(Object ob){
        
        fieldNombre.setText(((Analista) ob).getNombre());
        fieldSueldo.setText("" + ((Analista) ob).getSueldo());
        checkCasado.setVisible(false);
        labelCasado.setVisible(false);
        fieldApellidos.setVisible(false);
        labelApellidos.setVisible(false);
        fieldDni.setVisible(true);
        labelDni.setVisible(true);
        fieldEdad.setVisible(true);                
        labelEdad.setVisible(true);
        
    }
    
   
    void setCamposProgramador (Object ob){
        
        fieldNombre.setText(((Programador) ob).getNombre());
        fieldSueldo.setText("" + ((Programador) ob).getSueldo());
        fieldDni.setVisible(false);
        fieldEdad.setVisible(false);
        labelDni.setVisible(false);
        labelEdad.setVisible(false);
        labelApellidos.setVisible(true);
        fieldApellidos.setVisible(true);
        checkCasado.setVisible(true);
        labelCasado.setVisible(true);
        
    }
    void inicializarCampos() {

        Object ob = listado.getInicio().getDato();

        if (ob instanceof Programador) {
            
            setCamposProgramador(ob);
            

        } else {
            
            setCamposAnalista(ob);

        }
        
        btRetroceder.setEnabled(false);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRetroceder;
    private javax.swing.JButton btSiguiente;
    private java.awt.Checkbox checkCasado;
    private javax.swing.JTextField fieldApellidos;
    private javax.swing.JTextField fieldDni;
    private javax.swing.JTextField fieldEdad;
    private javax.swing.JTextField fieldFecha;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldSueldo;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCasado;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSueldo;
    // End of variables declaration//GEN-END:variables
}
