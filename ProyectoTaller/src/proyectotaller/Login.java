
package proyectotaller;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); // centrar
        editarComponentesInicio();
    }
        
    private void editarComponentesInicio(){ // para editar manualmente ciertos componentes del jFrame
        //fondo inicio
        ImageIcon fondoInicio = new ImageIcon("src/Imagenes/bib8.jpg"); // crear imagen
        Icon fondoIn = new ImageIcon(fondoInicio.getImage().getScaledInstance(jLabelFondoInicio.getWidth(), jLabelFondoInicio.getHeight(), Image.SCALE_SMOOTH)); // crear icono
        jLabelFondoInicio.setIcon(fondoIn); // pasar icono
         
        //Panel botones
        //jPanelIniIniciarSesion.setBackground(new Color(0, 243, 247,50));
        jPanelIniIniciarSesion.setBackground(new Color(53, 53, 53,195));
        //jPanelIniRegistrarse.setBackground(new Color(0, 243, 247,50));
        jPanelIniRegistrarse.setBackground(new Color(53, 53, 53,245));
        //jPanelIniSalir.setBackground(new Color(0, 243, 247,50));
        jPanelIniSalir.setBackground(new Color(255,255,255,40));
        
        //Panel Titulo inicio
        jPanelTituloInicio.setBackground(new Color(160,160,160,64));
        jLabelTextoTitulo.setForeground(new Color(224, 224, 224,200));
        
        //Panel datos inicio
        jPanelDatosInicio.setBackground(new Color(160,160,160,64));
        
    }//fin editar componentes
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIniSalir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelTituloInicio = new javax.swing.JPanel();
        jLabelTextoTitulo = new javax.swing.JLabel();
        jPanelDatosInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIniUsuario = new javax.swing.JTextField();
        jPasswordIniContraseña = new javax.swing.JPasswordField();
        jPanelIniIniciarSesion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelIniRegistrarse = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIniSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIniSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelIniSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIniSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelIniSalirMouseExited(evt);
            }
        });
        jPanelIniSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Salir");
        jPanelIniSalir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        getContentPane().add(jPanelIniSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 110, 30));

        jPanelTituloInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTituloInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTextoTitulo.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabelTextoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoTitulo.setText("G&J Mecánicos");
        jLabelTextoTitulo.setToolTipText("");
        jPanelTituloInicio.add(jLabelTextoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 440, 50));

        getContentPane().add(jPanelTituloInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1060, 90));

        jPanelDatosInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDatosInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("USUARIO");
        jPanelDatosInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, 50));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CONTRASEÑA");
        jPanelDatosInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 50));

        jTextFieldIniUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldIniUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextFieldIniUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldIniUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelDatosInicio.add(jTextFieldIniUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 210, 30));

        jPasswordIniContraseña.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordIniContraseña.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jPasswordIniContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordIniContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelDatosInicio.add(jPasswordIniContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 210, 30));

        jPanelIniIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIniIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelIniIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIniIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelIniIniciarSesionMouseExited(evt);
            }
        });
        jPanelIniIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar Sesión");
        jPanelIniIniciarSesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanelDatosInicio.add(jPanelIniIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, 30));

        jPanelIniRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelIniRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelIniRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelIniRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelIniRegistrarseMouseExited(evt);
            }
        });
        jPanelIniRegistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registrarse");
        jPanelIniRegistrarse.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanelDatosInicio.add(jPanelIniRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        getContentPane().add(jPanelDatosInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 550, 280));

        jLabelFondoInicio.setBackground(new java.awt.Color(51, 51, 51));
        jLabelFondoInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jLabelFondoInicio.setOpaque(true);
        getContentPane().add(jLabelFondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelIniSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jPanelIniSalirMouseClicked

    private void jPanelIniSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniSalirMouseEntered
        jPanelIniSalir.setBackground(new Color(255,255,255,70));
        this.repaint();
    }//GEN-LAST:event_jPanelIniSalirMouseEntered

    private void jPanelIniSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniSalirMouseExited
        jPanelIniSalir.setBackground(new Color(255,255,255,40));
        this.repaint();
    }//GEN-LAST:event_jPanelIniSalirMouseExited

    private void jPanelIniIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniIniciarSesionMouseEntered
        jPanelIniIniciarSesion.setBackground(new Color(79, 79, 79,110));
        this.repaint();
    }//GEN-LAST:event_jPanelIniIniciarSesionMouseEntered

    private void jPanelIniIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniIniciarSesionMouseExited
        jPanelIniIniciarSesion.setBackground(new Color(53, 53, 53,195));
        this.repaint();
    }//GEN-LAST:event_jPanelIniIniciarSesionMouseExited

    private void jPanelIniRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniRegistrarseMouseEntered
        jPanelIniRegistrarse.setBackground(new Color(66, 66, 66,199));
        this.repaint();
    }//GEN-LAST:event_jPanelIniRegistrarseMouseEntered

    private void jPanelIniRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniRegistrarseMouseExited
        jPanelIniRegistrarse.setBackground(new Color(53, 53, 53,245));
        this.repaint();
    }//GEN-LAST:event_jPanelIniRegistrarseMouseExited

    private void jPanelIniRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniRegistrarseMouseClicked
        FormRegistrarse reg = new FormRegistrarse();
        this.dispose();
        reg.setVisible(true);
    }//GEN-LAST:event_jPanelIniRegistrarseMouseClicked

    private void jPanelIniIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIniIniciarSesionMouseClicked
        if (jTextFieldIniUsuario.getText().equals("")&&jPasswordIniContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe Completar todos los campos!","¡ERROR!",JOptionPane.WARNING_MESSAGE);
        }else{
        if(ListaDoble.usuariosReg.verificarUsuario(jTextFieldIniUsuario.getText(),jPasswordIniContraseña.getText()) == true){ //Verifica si el nombre de usuario y contraseña son correctos
            
            ListaDoble.usuariosReg.usuarioLogueado(jTextFieldIniUsuario.getText(),jPasswordIniContraseña.getText()); //loguear el usuario
            
            if (ListaDoble.usuariosReg.verificarAdmin(jTextFieldIniUsuario.getText(),jPasswordIniContraseña.getText()) == true) {
                FormAdmin adm = new FormAdmin();
                
                adm.setTextjLabelAdmNombreTitulo();
                adm.setTextjLabel1AdmInfoNombre();
                adm.setTextjLabelAdmInfoCedula();
                adm.setTextjLabelAdmInfoTelefono();
                adm.setTextjLabelAdmInfoUsuRegitrados();
                
                this.dispose();
                adm.setVisible(true);
                
            }else{
                FormUsuario usu = new FormUsuario();
                
                usu.setTextjLabelUsuNombreTitulo();
                usu.setTextjLabelUsuInfoNombre();
                usu.setTextjLabelUsuInfoCedula();
                usu.setTextjLabelUsuInfoTelefono();
                //usu.setTextjLabelUsuInfoLibReservados();
                
                this.dispose();
                usu.setVisible(true);
            }
            
            }else{  // si los datos no son correctos
            JOptionPane.showMessageDialog(null, "¡Nombre de usuario o contraseña incorrectos!","¡ERROR!",JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_jPanelIniIniciarSesionMouseClicked

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondoInicio;
    private javax.swing.JLabel jLabelTextoTitulo;
    private javax.swing.JPanel jPanelDatosInicio;
    private javax.swing.JPanel jPanelIniIniciarSesion;
    private javax.swing.JPanel jPanelIniRegistrarse;
    private javax.swing.JPanel jPanelIniSalir;
    private javax.swing.JPanel jPanelTituloInicio;
    private javax.swing.JPasswordField jPasswordIniContraseña;
    private javax.swing.JTextField jTextFieldIniUsuario;
    // End of variables declaration//GEN-END:variables
}
