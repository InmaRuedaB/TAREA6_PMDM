package vista;

import controlador.ExceptionController;
import controlador.LoginController;
import java.sql.SQLException;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author inmar
 */
public class JPanelLogin extends javax.swing.JPanel {
    
    private JMenu vista;
    private JMenu acerca;
    private JMenuItem abrir;
    private JMenuItem cerrar;
    

    /**
     * Creates new form jPanelLogin
     */
    public JPanelLogin(JMenu vista, JMenu acerca, JMenuItem abrir, JMenuItem cerrar ) {
        initComponents();
        this.vista = vista;
        this.acerca=acerca;
        this.abrir=abrir;
        this.cerrar=cerrar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btIngresar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lbUsuario.setText("USUARIO (DNI):");
        lbUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbContraseña.setText("CONTRASEÑA:");
        lbContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ACCESO AL PORTAL DEL TRABAJADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btIngresar)
                        .addGap(66, 66, 66)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelar)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btIngresar))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
                txtContraseña.setText("");
                this.setVisible(false);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        String usuario=null, pass=null;
        usuario= txtUsuario.getText();
        pass = txtContraseña.getText();
        
        String consulta = "select * from trabajador where DNI='" + usuario + "' and PASS='" + pass + "'";
        System.out.print(consulta);
        try {
            LoginController.loginGetTrabajador(usuario, pass);
        } catch (SQLException ex) {
            ExceptionController.getError(0, "JPanelLogin.btIngresarActionPerformed()");
        }
        
        if(LoginController.getAuxTrab()!= null)
        {
            this.setVisible(false);
            habilitaMenu();
            eliminarValoresUsuario();
        }else {
            eliminarValoresUsuario();
            ExceptionController.getError(3, "");
        }
    }//GEN-LAST:event_btIngresarActionPerformed

    public void eliminarValoresUsuario() {
        this.txtContraseña.setText("");
        this.txtUsuario.setText("");
    }
    
     public void habilitaMenu() {
        vista.setEnabled(true);
        acerca.setEnabled(true);
        abrir.setEnabled(false);
        cerrar.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
