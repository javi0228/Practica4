package Vista;

import Controlador.*;
import Modelo.*;
import javax.swing.JOptionPane;


public class PanelListar extends javax.swing.JPanel {

    Lista listado;
    

    public PanelListar() {

        initComponents();

        fieldNombre.setEditable(false);
        fieldSueldo.setEditable(false);
        fieldFecha.setEditable(false);
        fieldDni.setEditable(false);
        plusField.setEditable(false);
        idField.setEditable(false);
        sueldoMaxField.setEditable(false);
        horasExtrasField.setEditable(false);
        sueldoExtraField.setEditable(false);
      

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
        plusLabel = new javax.swing.JLabel();
        plusField = new javax.swing.JTextField();
        fieldDni = new javax.swing.JTextField();
        labelDni = new javax.swing.JLabel();
        horasExtrasField = new javax.swing.JTextField();
        horasExtrasLabel = new javax.swing.JLabel();
        sueldoMaxField = new javax.swing.JTextField();
        sueldoMaxLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        sueldoExtraField = new javax.swing.JTextField();
        sueldoExtraLabel = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();

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

        plusLabel.setText("Plus:");

        labelDni.setText("DNI: ");

        horasExtrasLabel.setText("Horas extras:");

        sueldoMaxLabel.setText("Sueldo máximo:");

        idLabel.setText("Id:");

        sueldoExtraLabel.setText("Sueldo extra:");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btRetroceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btSiguiente)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFecha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plusLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sueldoMaxLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelSueldo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horasExtrasLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sueldoExtraLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(325, 325, 325)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldDni)
                            .addComponent(plusField)
                            .addComponent(fieldFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(fieldNombre)
                            .addComponent(fieldSueldo)
                            .addComponent(horasExtrasField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(sueldoMaxField)
                            .addComponent(idField)
                            .addComponent(sueldoExtraField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCalcular)
                        .addGap(310, 310, 310))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSueldo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldoMaxLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(fieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDni))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasExtrasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasExtrasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoExtraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldoExtraLabel))
                .addGap(113, 113, 113)
                .addComponent(btCalcular)
                .addGap(53, 53, 53)
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

    private void setMensajeError(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje,"Error en la introducción de datos",JOptionPane.ERROR_MESSAGE);
    }
    
    private void btRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetrocederActionPerformed
        // TODO add your handling code here:
        listado.retroceder();
        btSiguiente.setEnabled(true);

        Object ob = listado.getActual().getDato();

        if (ob instanceof Programador) {
            
            setCamposProgramador(ob);
            
            /*if(Float.parseFloat(sueldoExtraField.getText())==0){
                botonCalcular.setEnabled(false);
            } else {
                botonCalcular.setEnabled(true);
            }*/
            
        } else {
            if (ob instanceof Analista) {
                
                setCamposAnalista(ob);
                
                /*if(Float.parseFloat(plusField.getText())==0){
                botonCalcular.setEnabled(false);
                } else {
                    botonCalcular.setEnabled(true);
                }*/
            }
        }

        if (listado.primero()) {
            btRetroceder.setEnabled(false);
        } else {
            btRetroceder.setEnabled(true);
        }


    }//GEN-LAST:event_btRetrocederActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        
        Object ob = listado.getActual().getDato();
        float total;
        float plus=0;
        String[] porcentaje=plusField.getText().split("%");
        
        if (ob instanceof Programador) {
            total=Float.parseFloat(fieldSueldo.getText())+ Float.parseFloat(sueldoExtraField.getText());
            if(total>Float.parseFloat(sueldoMaxField.getText())){
                setMensajeError("Error, el sueldo no puede superar el sueldo máximo establecido: "+((Programador)ob).getSueldoMax());
                btCalcular.setEnabled(false);
            } else {
                ((Programador)ob).setSueldo(total);
               
                fieldSueldo.setText(""+((Programador) ob).getSueldo());
                sueldoExtraField.setText(""+((Programador) ob).getSueldoExtra());
            }
        } else {
            if (ob instanceof Analista) {
                plus=Float.parseFloat(fieldSueldo.getText())*((Float.parseFloat(porcentaje[0]))/100);
                total=Float.parseFloat(fieldSueldo.getText()) + plus;
                if(total>Float.parseFloat(sueldoMaxField.getText())){
                    setMensajeError("Error, el sueldo no puede superar el sueldo máximo establecido: "+((Analista)ob).getSueldoMax());
                    btCalcular.setEnabled(false);
                } else {
                    ((Analista)ob).setSueldo(total);
                
                    fieldSueldo.setText(""+((Analista) ob).getSueldo());
                    sueldoExtraField.setText(""+((Analista) ob).getPlus());
                }
            }
        }
    }//GEN-LAST:event_btCalcularActionPerformed

    void setCamposAnalista(Object ob){
        
        //inicializo los campos de analista
       
        
        
        idField.setText(""+((Empleado)ob).getId());
        sueldoMaxField.setText(""+((Empleado)ob).getSueldoMax());
        fieldFecha.setText(""+((Empleado)ob).getFechaAlta());
        fieldNombre.setText(((Analista) ob).getNombre());
        fieldSueldo.setText("" + ((Analista) ob).getSueldo());
        fieldDni.setText(((Analista)ob).getDNI());
        plusField.setText(""+((Analista)ob).getPlus()+"%");
        
        float plus=0;
        String[] porcentaje=plusField.getText().split("%");
        plus=Float.parseFloat(fieldSueldo.getText())*((Float.parseFloat(porcentaje[0]))/100);
        
        if(((Analista)ob).comprobarAnio() && (Analista.comprobarSueldoExtra(Float.parseFloat(fieldSueldo.getText()), Float.parseFloat(sueldoMaxField.getText()), plus))){
            btCalcular.setEnabled(true);
        } else {
            btCalcular.setEnabled(false);
        }
        
        //oculto campos programador
        horasExtrasField.setVisible(false);
        horasExtrasLabel.setVisible(false);
        sueldoExtraField.setVisible(false);
        sueldoExtraLabel.setVisible(false);
        
        //muestro campos analista
        fieldDni.setVisible(true);
        labelDni.setVisible(true);
        plusField.setVisible(true);                
        plusLabel.setVisible(true);
        
    }
    
   
    void setCamposProgramador (Object ob){
        
        
        
        //inicializo los campos de programador
        idField.setText(""+((Empleado)ob).getId());
        sueldoMaxField.setText(""+((Empleado)ob).getSueldoMax());
        fieldFecha.setText(""+((Empleado)ob).getFechaAlta());
        fieldNombre.setText(((Programador) ob).getNombre());
        fieldSueldo.setText(""+((Programador) ob).getSueldo());
        horasExtrasField.setText(""+((Programador)ob).getHorasExtra());
        sueldoExtraField.setText(""+((Programador)ob).getSueldoExtra());
        
        if(((Programador)ob).comprobarMes() && (Programador.comprobarSueldoExtra(Float.parseFloat(fieldSueldo.getText()), Float.parseFloat(sueldoMaxField.getText()), Float.parseFloat(sueldoExtraField.getText())))){
            btCalcular.setEnabled(true);
        } else {
            btCalcular.setEnabled(false);
        }
        
        
        //oculto campos analista
        fieldDni.setVisible(false);
        labelDni.setVisible(false);
        plusField.setVisible(false);                
        plusLabel.setVisible(false);
        
        //muestro campos programador        
        horasExtrasField.setVisible(true);
        horasExtrasLabel.setVisible(true);
        sueldoExtraField.setVisible(true);
        sueldoExtraLabel.setVisible(true);
        
        
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
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btRetroceder;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JTextField fieldDni;
    private javax.swing.JTextField fieldFecha;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldSueldo;
    private javax.swing.JTextField horasExtrasField;
    private javax.swing.JLabel horasExtrasLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSueldo;
    private javax.swing.JTextField plusField;
    private javax.swing.JLabel plusLabel;
    private javax.swing.JTextField sueldoExtraField;
    private javax.swing.JLabel sueldoExtraLabel;
    private javax.swing.JTextField sueldoMaxField;
    private javax.swing.JLabel sueldoMaxLabel;
    // End of variables declaration//GEN-END:variables
}
