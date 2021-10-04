package Vistas;
import Archivos.GestionA;
import DES.CifradoDES;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author Rafael
 */
public class Cifrar extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    GestionA gestion = new GestionA();
    
    /**
     * Creates new form Cifrar
     */
    public Cifrar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/Icono.png"));
        return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NomArch = new javax.swing.JTextField();
        Bseleccionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Clave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Mensajes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Bcifrar = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        txtAreaTexto = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 2, 36)); // NOI18N
        jLabel1.setText("Cifrar Mensaje");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 30, 160, 30));

        jLabel2.setText("Archivo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 97, -1, -1));

        NomArch.setEditable(false);
        NomArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomArchActionPerformed(evt);
            }
        });
        getContentPane().add(NomArch, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 94, 122, -1));

        Bseleccionar.setBackground(new java.awt.Color(153, 255, 153));
        Bseleccionar.setText("Seleccionar");
        Bseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BseleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(Bseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 93, -1, -1));

        jLabel3.setText("Llave");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 137, -1, -1));

        Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveActionPerformed(evt);
            }
        });
        getContentPane().add(Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 134, 122, -1));

        jLabel4.setText("Archivo Cifrado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        Mensajes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Mensajes.setForeground(new java.awt.Color(255, 0, 51));
        Mensajes.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 2, 18)); // NOI18N
        jButton1.setText("Inicio");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione Archivo");

        Bcifrar.setBackground(new java.awt.Color(153, 255, 153));
        Bcifrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bcifrar.setText("Cifrar");
        Bcifrar.setMaximumSize(new java.awt.Dimension(87, 23));
        Bcifrar.setMinimumSize(new java.awt.Dimension(87, 23));
        Bcifrar.setPreferredSize(new java.awt.Dimension(87, 23));
        Bcifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcifrarActionPerformed(evt);
            }
        });

        txtAreaTexto.setEditable(false);
        txtAreaTexto.setColumns(20);
        txtAreaTexto.setRows(5);
        scroll.setViewportView(txtAreaTexto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bcifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addGap(83, 83, 83)
                .addComponent(Bcifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BseleccionarActionPerformed
        
        //Utilizamos el metodo JFilechooser para que pueda escoger los archivos desde el equipo
        if(seleccionado.showDialog(this, "Seleccionar") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            //Lo inicializamos en una variable, y despues vemos si es un archivo txt
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String contenido = gestion.AbrirATexto(archivo);
                    txtAreaTexto.setText(contenido);
                    NomArch.setText(archivo.getName());
                }else{
                    Mensajes.setText("Este no es archivo de txt");
                }
            }
        }
        
    }//GEN-LAST:event_BseleccionarActionPerformed

    private void BcifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcifrarActionPerformed
        
        boolean Bandera = true;
        String checarClave = Clave.getText();
        int NumeroCaracteres = 0;
        //Verificamos que la llave sea de 8 caracteres minimo
        if (checarClave.length() != 8) {
            Bandera = false;
            NumeroCaracteres = 8;
        }
        if (!Bandera) {
            Mensajes.setText("Error Verifique que la llave posea: " + NumeroCaracteres + " Carácteres minimo");
            return;
        }
        if (Clave.getText().isEmpty() || txtAreaTexto.getText().isEmpty() || NomArch.getText().isEmpty()) {
            Mensajes.setText("Verifique que no haya un campo vacio");
        }else{
            
            //Ciframos utilizando nuestros metodos de otra clase
        CifradoDES log = new CifradoDES();
        //Pasamos llave con texto
        txtAreaTexto.setText(log.Cifrado(txtAreaTexto.getText(), Clave.getText()));
        //Devolvemos lo que cifro el metodo
        if(seleccionado.showDialog(null, "Cifrar") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                String contenido = txtAreaTexto.getText();
                String respuesta = gestion.GuardarATexto(archivo, contenido);
                if(respuesta != null){
                    Mensajes.setText(respuesta);
                }else{
                    Mensajes.setText("Hubo un error al guardar el texto");
                }
            }else{
                Mensajes.setText("El archivo debe estar en formato txt");
            }
        }
        }
        
    }//GEN-LAST:event_BcifrarActionPerformed

    private void NomArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomArchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomArchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio ir = new Inicio();
        ir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcifrar;
    private javax.swing.JButton Bseleccionar;
    private javax.swing.JTextField Clave;
    private javax.swing.JLabel Mensajes;
    private javax.swing.JTextField NomArch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea txtAreaTexto;
    // End of variables declaration//GEN-END:variables
}