/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista.tablas;

import controlador.AsignaturaControl;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Asignatura;
import modelo.Carrera;

/**
 *
 * @author Andy Abad
 */
public class TablaCarrerasVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form TablaCarrerasVista
     */
    public TablaCarrerasVista() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 500));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabla de Carreras");

        jLabel2.setText("Ingrese el codigo de la asignatura:: ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo: ", "Nombre: ", "Titulo: ", "Horas de Pasantias: ", "Director Carrera: "
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton1)))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(72, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setLenguajeTablaCarreraVista(ResourceBundle resourceBundle)
    {
        this.resourceBundle=resourceBundle;
        jLabel1.setText(resourceBundle.getString("JLABELTCV1"));
        jLabel2.setText(resourceBundle.getString("JLABELTCV2")+": ");
        jButton1.setText(resourceBundle.getString("JBUTTON2"));
        this.setModeloTabla();
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String codigo=jTextField1.getText();
        Asignatura asignatura=asignaturaControl.listar().get(asignaturaControl.buscarAsignaturaPorCodigo(codigo));
        this.actualizarTablaCarrera(asignatura);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo=jTextField1.getText();
        Asignatura asignatura=asignaturaControl.listar().get(asignaturaControl.buscarAsignaturaPorCodigo(codigo));
        this.actualizarTablaCarrera(asignatura);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void setModeloTabla()
    {
        String[] encabezado=new String[5];
        encabezado[0]=resourceBundle.getString("JTABLETCV1");
        encabezado[1]=resourceBundle.getString("JTABLETCV2");
        encabezado[2]=resourceBundle.getString("JTABLETCV3");
        encabezado[3]=resourceBundle.getString("JTABLETCV4");
        encabezado[4]=resourceBundle.getString("JTABLETCV5");
        
        var datos=new Object[0][5];
        
        TableModel modeloTabla=new DefaultTableModel(datos, encabezado);
        jTable2.setModel(modeloTabla);
        
    }
    public void actualizarTablaCarrera(Asignatura asignatura)
    {
        String[] encabezado=new String[5];
        encabezado[0]=resourceBundle.getString("JTABLETCV1");
        encabezado[1]=resourceBundle.getString("JTABLETCV2");
        encabezado[2]=resourceBundle.getString("JTABLETCV3");
        encabezado[3]=resourceBundle.getString("JTABLETCV4");
        encabezado[4]=resourceBundle.getString("JTABLETCV5");
        
        var datos=new Object[asignatura.getCarreraList().size()][5];
        int i=0;
        for(Carrera carrera: asignatura.getCarreraList())
        {
            datos[i][0]=carrera.getCodigo();
            datos[i][1]=carrera.getNombre();
            datos[i][2]=carrera.getTitulo();
            datos[i][3]=carrera.getHorasPasantias();
            datos[i][4]=carrera.getDirectorCarrera();
            i++;
        }
        TableModel modeloTabla=new DefaultTableModel(datos, encabezado);
        jTable2.setModel(modeloTabla);
        
    }
    AsignaturaControl asignaturaControl=new AsignaturaControl();
    ResourceBundle resourceBundle;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
