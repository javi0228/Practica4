
package Vista;

import Controlador.*;
import Modelo.Empleado;


public class Principal extends javax.swing.JFrame {
    
    private static Lista listado=new <Empleado>Lista();
    
    public Principal() {
        
        initComponents();
        labelNoDatos.setVisible(false);
    }
    
    public static Lista getLista(){
        return listado;
    }
    
    public static void setLista(Lista list){
        
        Principal.listado=list;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPractica = new javax.swing.JLabel();
        labelNoDatos = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        Altas = new javax.swing.JMenu();
        AltaProg = new javax.swing.JMenuItem();
        AltaAnalista = new javax.swing.JMenuItem();
        Listar = new javax.swing.JMenu();
        Listar1 = new javax.swing.JMenuItem();
        ListarTodos = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Principal"); // NOI18N

        labelPractica.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        labelPractica.setText("PRÁCTICA 4");

        labelNoDatos.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        labelNoDatos.setForeground(new java.awt.Color(255, 51, 51));
        labelNoDatos.setText("NO HAY DATOS EN LA LISTA");

        Altas.setLabel("Altas");

        AltaProg.setText("Programador");
        AltaProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaProgActionPerformed(evt);
            }
        });
        Altas.add(AltaProg);

        AltaAnalista.setText("Analista");
        AltaAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaAnalistaActionPerformed(evt);
            }
        });
        Altas.add(AltaAnalista);

        BarraMenu.add(Altas);

        Listar.setLabel("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        Listar1.setText("Ver todos los empleados 1 a 1");
        Listar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Listar1ActionPerformed(evt);
            }
        });
        Listar.add(Listar1);

        ListarTodos.setText("Ver lista de empleados");
        ListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTodosActionPerformed(evt);
            }
        });
        Listar.add(ListarTodos);

        BarraMenu.add(Listar);

        Ayuda.setLabel("Ayuda");

        AcercaDe.setText("Acerca de...");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        Ayuda.add(AcercaDe);

        BarraMenu.add(Ayuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(labelNoDatos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(labelPractica)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(labelPractica)
                .addGap(63, 63, 63)
                .addComponent(labelNoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AltaProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaProgActionPerformed
        // TODO add your handling code here:
         
        this.setContentPane(panelAltasProg);
        panelAltasProg.listado=getLista();
        panelAltasProg.pedirFoco();
        pack();
    }//GEN-LAST:event_AltaProgActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
         
        
    }//GEN-LAST:event_ListarActionPerformed

    private void Listar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Listar1ActionPerformed
        // TODO add your handling code here:
        
        if (listado.getInicio()!=null) {
            this.setContentPane(panelListar);
            panelListar.listado = getLista();
            
            panelListar.apagarBotones();
            panelListar.inicializarCampos();
            
            pack();
        }else{
            labelNoDatos.setVisible(true);
        }
        
    }//GEN-LAST:event_Listar1ActionPerformed

    
    private void AltaAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaAnalistaActionPerformed
             
        this.setContentPane(panelAltasAnalista);
        panelAltasAnalista.listado=getLista();
        panelAltasAnalista.pedirFoco();
        pack();
    }//GEN-LAST:event_AltaAnalistaActionPerformed

    private void ListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTodosActionPerformed
    
        if (listado.getInicio()!=null) {
            this.setContentPane(panelListarTodos);
            panelListarTodos.listado = getLista();
            panelListarTodos.rellenarArray();
            panelListarTodos.vaciarLista();
           
            
            pack();
        }else{
            labelNoDatos.setVisible(true);
        }
       
    }//GEN-LAST:event_ListarTodosActionPerformed
     
     private void verLista() {
        Nodo aux=listado.getInicio();
           
           while(aux!=null){
               System.out.println(aux.getDato());
               aux=aux.getSiguiente();
           }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    
//    private void cambiarContenedor(javax.swing.JPanel aux){
//        this.setContentPane(aux);
//        pack();
//    }

    
    private final PanelAltasAnalista panelAltasAnalista= new PanelAltasAnalista();
    private final PanelAltasProg panelAltasProg= new PanelAltasProg(listado);
    private final PanelListar panelListar= new PanelListar();
    private final PanelListarTodos panelListarTodos=new PanelListarTodos();
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenuItem AltaAnalista;
    private javax.swing.JMenuItem AltaProg;
    private javax.swing.JMenu Altas;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu Listar;
    private javax.swing.JMenuItem Listar1;
    private javax.swing.JMenuItem ListarTodos;
    private javax.swing.JLabel labelNoDatos;
    private javax.swing.JLabel labelPractica;
    // End of variables declaration//GEN-END:variables

   
}
