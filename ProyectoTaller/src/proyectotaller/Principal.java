package proyectotaller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private String rutaArchivo = "BibliotecaMusica.txt";
    Producto p;
    Proceso rp;

    int clicTabla;

    public Principal() {
        initComponents();
        
        rp=new Proceso(); 
        
        try {
            cargarArchivo();
            listarRegistro();
        } catch (Exception e) {
            mensaje("No existe el archivo","Mensaje",0);
        }

    }

    public void cargarArchivo() {
        File ruta = new File(rutaArchivo);
        try {
            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);

            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                p = new Producto();
                p.setCodigo(Integer.parseInt(st.nextToken()));
                p.setNombre(st.nextToken());
                p.setTelefono(st.nextToken());
                p.setMarca(st.nextToken());
                p.setModelo(st.nextToken());
                p.setPlaca(st.nextToken());
                p.setColor(st.nextToken());
                p.setProblema(st.nextToken());
                //p.setAno(st.nextToken());
                rp.agregarRegistro(p);
            }
            bu.close();

        } catch (Exception e) {
            mensaje("Error al cargar archivo","Mensaje",0);
        }
    }

    public void guardarArchivo() {
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(rutaArchivo);
            pw = new PrintWriter(fw);

            for (int i = 0; i < rp.cantidadRegistros(); i++) {
                p = rp.obtenerRegistro(i);
                pw.println(String.valueOf(p.getCodigo()
                        + ", " + p.getNombre()
                        + ", " + p.getTelefono()
                        + ", " + p.getMarca()
                        + ", " + p.getModelo()
                        + ", " + p.getPlaca()
                        + ", " + p.getColor()
                        + ", " + p.getProblema()));
                        
                        //+ ", " + p.getAno()));
                        
            }
            pw.close();
        } catch (Exception e) {
            mensaje("Error al grabar el archivo","Mensaje",0);
        }
    }

    public void ingresarRegistro() {
         try {
            if(leerCodigo()==-8){
                mensaje("Ingresar la cedula",
                        "Captura informacion",1);
            }else if(leerNombre()==null){
                mensaje("Ingresar nombre del cliente",
                        "Captura informacion",1);
            }else if(leerTelefono()==null){
                mensaje("Ingresar el telefono del cliente",
                        "Captura informacion",1);
            }else if(leerMarca()==null){
                mensaje("Ingresar la marca del vehículo",
                        "Captura informacion",1);
            }else if(leerModelo()==null){
                mensaje("Ingresar el modelo del vehículo",
                        "Captura informacion",1);
            }else if(leerPlaca()==null){
                mensaje("Ingresar la placa del vehículo",
                        "Captura informacion",1);
            }else if(leerColor()==null){
                mensaje("Ingresar el color del vehículo",
                        "Captura informacion",1);
            }else if(leerProblema()==null){
                mensaje("Ingresar el problema del vehículo",
                        "Captura informacion",1);
            }else{
                p = new Producto(leerCodigo(), leerNombre(), leerTelefono(), leerMarca(), leerModelo(), leerPlaca(), leerColor(), leerProblema());
                if(rp.buscaCodigo(p.getCodigo())!=-1){
                    mensaje("Error codigo ya existe",
                        "ERROR",0);
                }else{
                    rp.agregarRegistro(p);
                }
                guardarArchivo();
                listarRegistro();
                this.limpiarCampos();
            }
        } catch (Exception e) {

        }
    }
    
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        
        dt.addColumn("Nombre Cliente");
        dt.addColumn("Cédula del cliente");
        dt.addColumn("Telefono");
        dt.addColumn("Marca del vehículo");
        dt.addColumn("Modelo del vehículo");
        dt.addColumn("Placa del vehículo");
        dt.addColumn("Color del vehículo");
        dt.addColumn("Daño del vehículo");

        
        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < rp.cantidadRegistros(); i++) {
            p=rp.obtenerRegistro(i);
            fila[0]= p.getNombre();
            fila[1]= p.getCodigo();
            fila[2]= p.getTelefono();
            fila[3]= p.getMarca();
            fila[4]= p.getModelo();
            fila[5]= p.getPlaca();
            fila[6]= p.getColor();
            fila[7]= p.getProblema();
            
            dt.addRow(fila);
        }
        jTable.setModel(dt);
        jTable.setRowHeight(60);
        
    }
    private void limpiarCampos(){
        jtfNombreCliente.setText("");
        jtfCedula.setText("");
        jtfTelefono.setText("");
        jtfMarca.setText("");
        jtfModelo.setText("");
        jtfPlaca.setText("");
        jtfColor.setText("");
        jtfProblema.setText("");

        
      
    }
    
    

    
    public int leerCodigo() {
        try {
            int codigo = Integer.parseInt(jtfCedula.getText().trim());
            return codigo;
        } catch (Exception e) {
            return -8;
        }
    }

    public String leerNombre() {
        try {
            String nombre = jtfNombreCliente.getText().trim().replace(" ", "_");
            return nombre;
        } catch (Exception e) {
            return null;
        }
    }

    public String leerTelefono() {
        try {
            String telefono  = jtfTelefono.getText().trim().replace(" ", "_");
            return telefono;
        } catch (Exception e) {
            return null;
        }
    }

    public String leerMarca() {
        try {
            String marca  = jtfMarca.getText().trim().replace(" ", "_");
            return marca;
        } catch (Exception e) {
            return null;
        }
    }
    
        public String leerModelo() {
        try {
            String modelo  = jtfModelo.getText().trim().replace(" ", "_");
            return modelo;
        } catch (Exception e) {
            return null;
        }
    }

     public String leerPlaca() {
        try {
            String placa  = jtfPlaca.getText().trim().replace(" ", "_");
            return placa;
        } catch (Exception e) {
            return null;
        }
    }

     
       public String leerColor() {
        try {
            String color  = jtfColor.getText().trim().replace(" ", "_");
            return color;
        } catch (Exception e) {
            return null;
        }
    }  
   
       
        public String leerProblema() {
        try {
            String problema  = jtfProblema.getText().trim().replace(" ", "_");
            return problema;
        } catch (Exception e) {
            return null;
        }
    }
       
       
     
    public void mensaje(String mensaje, String titulo, int msj) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, msj);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlNombreCliente = new javax.swing.JLabel();
        jlCedula = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jtfNombreCliente = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jlModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlPlaca = new javax.swing.JLabel();
        jlColor = new javax.swing.JLabel();
        jlProblema = new javax.swing.JLabel();
        jtfPlaca = new javax.swing.JTextField();
        jtfColor = new javax.swing.JTextField();
        jtfProblema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlTitulo.setText("Registro de Automoviles");

        jlNombreCliente.setText("Nombre del cliente");

        jlCedula.setText("Cédula del cliente");

        jlTelefono.setText("Telefono del cliente");

        jlMarca.setText("Marca del vehículo");

        jtfNombreCliente.setToolTipText("Digite el codigo del producto");

        jtfCedula.setToolTipText("Digite el nombre del producto");

        jtfTelefono.setToolTipText("Digite el precio del producto");

        jtfMarca.setToolTipText("Digite la descripción del producto");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Cliente", "Cédula del cliente", "Telefono", "Marca del vehículo", "Modelo del vehículo", "Placa del vehículo", "Color del vehículo", "Daño del vehículo"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jlModelo.setText("Ingrese el modelo del vehículo");

        jtfModelo.setToolTipText("Digite la descripción del producto");
        jtfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfModeloActionPerformed(evt);
            }
        });

        jlPlaca.setText("Ingrese la placa del vehículo");

        jlColor.setText("Ingrese el color del vehículo");

        jlProblema.setText("Ingrese el daño del vehículo");

        jtfPlaca.setToolTipText("Digite la descripción del producto");
        jtfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaActionPerformed(evt);
            }
        });

        jtfColor.setToolTipText("Digite la descripción del producto");
        jtfColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfColorActionPerformed(evt);
            }
        });

        jtfProblema.setToolTipText("Digite la descripción del producto");
        jtfProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProblemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreCliente)
                                    .addComponent(jlCedula)
                                    .addComponent(jlTelefono)
                                    .addComponent(jlMarca)
                                    .addComponent(jlModelo)
                                    .addComponent(jlPlaca)
                                    .addComponent(jlColor)
                                    .addComponent(jlProblema))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jtfNombreCliente)
                                    .addComponent(jtfTelefono)
                                    .addComponent(jtfMarca)
                                    .addComponent(jtfModelo)
                                    .addComponent(jtfPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfColor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfProblema)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbGuardar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCliente)
                    .addComponent(jtfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCedula)
                    .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMarca)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModelo)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlaca)
                    .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlColor)
                    .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProblema)
                    .addComponent(jtfProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        this.ingresarRegistro();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        clicTabla = jTable.rowAtPoint(evt.getPoint());
        int codigo=(int)jTable.getValueAt(clicTabla,0);
        String nombre=""+jTable.getValueAt(clicTabla,1);
        String telefono=""+jTable.getValueAt(clicTabla,2);
        String marca=""+jTable.getValueAt(clicTabla, 3);
        String modelo=""+jTable.getValueAt(clicTabla, 4);
        String placa=""+jTable.getValueAt(clicTabla, 5);
        String color=""+jTable.getValueAt(clicTabla, 6);
        String problema=""+jTable.getValueAt(clicTabla, 7);

        
        
        jtfNombreCliente.setText(String.valueOf(nombre));
        jtfCedula.setText(String.valueOf(codigo));
        jtfTelefono.setText(String.valueOf(telefono));
        jtfMarca.setText(String.valueOf(marca));
        jtfModelo.setText(String.valueOf(modelo));
        jtfPlaca.setText(String.valueOf(placa));
        jtfColor.setText(String.valueOf(color));
        jtfProblema.setText(String.valueOf(problema));
        
       
        
    }//GEN-LAST:event_jTableMouseClicked

    private void jtfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfModeloActionPerformed

    private void jtfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaActionPerformed

    private void jtfColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfColorActionPerformed

    private void jtfProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProblemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProblemaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlProblema;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNombreCliente;
    private javax.swing.JTextField jtfPlaca;
    private javax.swing.JTextField jtfProblema;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables


}
