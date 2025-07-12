/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ariana Egoavil Olive
 */
    public class VentanaGestionCandidatos extends javax.swing.JFrame {
   
        private GestionarCandidato gestorCandidato = new GestionarCandidato();
        private GestionarPartidosPoliticos gestorPartido = new GestionarPartidosPoliticos();
        private GestionarMesasElectorales gestorMesas = new GestionarMesasElectorales();
        private GestionarMiembrosMesa gestorMiembros = new GestionarMiembrosMesa();
        private GestionarElecciones gestorElecciones = new GestionarElecciones();
        private GestionarActasElectorales gestorActas = new GestionarActasElectorales();
        private DefaultTableModel modeloTabla;
        
        
    public VentanaGestionCandidatos(GestionarCandidato gestorCandidato) {
            this.gestorCandidato = gestorCandidato;
            initComponents();
            configurarModeloTabla(); 
            actualizarTabla(); 
}
    
    
    //metodo de configurar tablal
    private void configurarModeloTabla() {
       modeloTabla = new DefaultTableModel();
       modeloTabla.addColumn("Nombre");
       modeloTabla.addColumn("Apellidos");
       modeloTabla.addColumn("DNI");
       modeloTabla.addColumn("Partido Político");

       Visualizacion.setModel(modeloTabla);
     }   


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PartidoPolitico = new javax.swing.JTextField();
        Mostrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visualizacion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Nombre.setForeground(new java.awt.Color(153, 153, 153));
        Nombre.setText("Text here...");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido: ");

        Apellido.setForeground(new java.awt.Color(153, 153, 153));
        Apellido.setText("Text here...");

        jLabel3.setText("DNI:");

        DNI.setForeground(new java.awt.Color(153, 153, 153));
        DNI.setText("Text here...");

        jLabel4.setText("Partido Político:");

        PartidoPolitico.setForeground(new java.awt.Color(153, 153, 153));
        PartidoPolitico.setText("Text here...");

        Mostrar.setText("MOSTRAR");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Visualizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Partido Político"
            }
        ));
        jScrollPane1.setViewportView(Visualizacion);

        jLabel5.setText("GESTIÓN DE CANDIDATOS");

        jLabel6.setText("Aquí puede visualisar lo que usted este agregando...");

        Guardar.setText("Actualizar Contenido");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Guardar)
                            .addGap(18, 18, 18)
                            .addComponent(Volver))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(33, 33, 33)
                                                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(95, 95, 95))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(PartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Mostrar)
                                            .addGap(30, 30, 30)
                                            .addComponent(Modificar))
                                        .addComponent(Eliminar))
                                    .addGap(61, 61, 61)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mostrar)
                            .addComponent(Modificar))
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver)
                    .addComponent(Guardar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        // regreso al antrior menu
        new MenuOperador(gestorCandidato, gestorPartido, gestorMesas, 
         gestorMiembros, gestorElecciones, gestorActas).setVisible(true);

        this.dispose();
        
        
        
    }//GEN-LAST:event_VolverActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
            String dni = this.DNI.getText(); // mismo que para eliminar
            String nuevoNombre = this.Nombre.getText();
            String nuevoApellido = this.Apellido.getText();
            String nuevoPartido = this.PartidoPolitico.getText();

            gestorCandidato.modificarCandidato(dni, nuevoNombre, nuevoApellido, nuevoPartido);
          
            javax.swing.JOptionPane.showMessageDialog(this, "Candidato modificado correctamente.");
            
            this.Nombre.setText("");
            this.Apellido.setText("");
            this.DNI.setText("");
            this.PartidoPolitico.setText("");
            actualizarTabla(); 
    }//GEN-LAST:event_ModificarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        
          String nombre = this.Nombre.getText();
          String apellido = this.Apellido.getText();
          String dni = this.DNI.getText();
          String partido = this.PartidoPolitico.getText();

          Candidato nuevo = new Candidato(nombre, apellido, dni, partido);
          
    
     //para dar mensaje:
         javax.swing.JOptionPane.showMessageDialog(this, "¡Candidato registrado!");

           //si quiero limpiar campss
           this.Nombre.setText("");
           this.Apellido.setText("");
           this.DNI.setText("");
           this.PartidoPolitico.setText("");

           // para llamar  a actualizarTabla() puse:
              gestorCandidato.MeterCandidato(nuevo);
              actualizarTabla();
 
    }//GEN-LAST:event_MostrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
          String dni = DNI.getText();
            //era para verificar si se esta poniendo algo en la tabla
            if (!dni.isEmpty()) 
            {
                gestorCandidato.eliminarCandidato(dni);
                actualizarTabla();
                JOptionPane.showMessageDialog(this, "Candidato eliminado.");
            } 
            else 
            // y si el campo esta vacio dira eso como requisito 
            {
                
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un DNI para eliminar.");
                    }

        
        
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:         private GestionarCandidato gestor;
        
        String nombre   = Nombre.getText().trim();
        String apellido = Apellido.getText().trim();
        String dni      = DNI.getText().trim();
        String partido  = PartidoPolitico.getText().trim();        
   
        
         Candidato nuevo = new Candidato(nombre, apellido, dni, partido);
        gestorCandidato.MeterCandidato(nuevo);  
        
        this.Nombre.setText("");
        this.Apellido.setText("");
        this.DNI.setText("");
        this.PartidoPolitico.setText("");

        actualizarTabla();       

    }//GEN-LAST:event_GuardarActionPerformed

    public void actualizarTabla()
    {
          modeloTabla.setRowCount(0);
          
        for (Candidato c : gestorCandidato.getLista()) 
        {
            modeloTabla.addRow(new Object[]
            {
                c.getNombre(),
                c.getApellido(),
                c.getDni(),
                c.getPartidopolitico()
            });
    }
    }
    
   
            public static void main(String[] args) {
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info :
                            javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField DNI;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField PartidoPolitico;
    private javax.swing.JTable Visualizacion;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
