package vista;

import controlador.ConnectionFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import controlador.ExceptionController;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Aplicacion extends javax.swing.JFrame {

    JPanelLogin panelUsuario = null;
    JPanel1a1 panel1a1 = null;
    JPanelVerPerfil panelVerPerfil = null;
    JPanelAltaBajaActividades panelAltayBaja = null;
    jPanelAcercaDe panelAcercaade = null;

    public Aplicacion() {
        initComponents();
        itemCerrar.setEnabled(false);
        jMenuVista.setEnabled(false);
        jMenuAcercade.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConexion = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        itemCerrar = new javax.swing.JMenuItem();
        jMenuVista = new javax.swing.JMenu();
        itemUnoaUno = new javax.swing.JMenuItem();
        itaemAlta = new javax.swing.JMenuItem();
        itemPerfil = new javax.swing.JMenuItem();
        jMenuAcercade = new javax.swing.JMenu();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuConexion.setText("Conexión ");

        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        jMenuConexion.add(itemAbrir);

        itemCerrar.setText("Cerrar");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        jMenuConexion.add(itemCerrar);

        jMenuBar1.add(jMenuConexion);

        jMenuVista.setText("Vista");

        itemUnoaUno.setText("1 a 1");
        itemUnoaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUnoaUnoActionPerformed(evt);
            }
        });
        jMenuVista.add(itemUnoaUno);

        itaemAlta.setText("Alta/Baja");
        itaemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itaemAltaActionPerformed(evt);
            }
        });
        jMenuVista.add(itaemAlta);

        itemPerfil.setText("Ver Perfil Logado");
        itemPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPerfilActionPerformed(evt);
            }
        });
        jMenuVista.add(itemPerfil);

        jMenuBar1.add(jMenuVista);

        jMenuAcercade.setText("Acerca de ");
        jMenuAcercade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAcercadeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAcercade);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        try {
            ConnectionFactory.close();
            deshabilitaMenu();
            pack();
        } catch (SQLException ex) {
            ExceptionController.getError(2, "Aplicacion.itemCerrarActionPerformed()");
        }
        itemAbrir.setEnabled(true);
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void itemPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPerfilActionPerformed

        if (panelVerPerfil == null) {
            panelVerPerfil = new JPanelVerPerfil();
        }
        //ConnectionFactory.abrirConexion();
        setContentPane(panelVerPerfil);
        panelVerPerfil.setVisible(true);
        pack();

    }//GEN-LAST:event_itemPerfilActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        try {
            if (panelUsuario == null) {
                panelUsuario = new JPanelLogin(jMenuVista, jMenuAcercade, itemAbrir, itemCerrar);
            }
            ConnectionFactory.abrirConexion();
            setContentPane(panelUsuario);
            panelUsuario.setVisible(true);
            
            pack();
            //itemAbrir.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemAbrirActionPerformed

    private void itemUnoaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUnoaUnoActionPerformed
        if (panel1a1 == null) {
            panel1a1 = new JPanel1a1();
        }

        panel1a1.setVisible(true);
        setContentPane(panel1a1);
        pack();
    }//GEN-LAST:event_itemUnoaUnoActionPerformed

    private void jMenuAcercadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAcercadeMouseClicked
        if (panelAcercaade == null) {
            panelAcercaade = new jPanelAcercaDe();
        }

        panelAcercaade.setVisible(true);
        setContentPane(panelAcercaade);
        pack();
    }//GEN-LAST:event_jMenuAcercadeMouseClicked

    private void itaemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itaemAltaActionPerformed
        if (panelAltayBaja == null) {
            panelAltayBaja = new JPanelAltaBajaActividades();
        }

        panelAltayBaja.setVisible(true);
        setContentPane(panelAltayBaja);
        pack();
    }//GEN-LAST:event_itaemAltaActionPerformed

    public void deshabilitaMenu() {
        jMenuAcercade.setEnabled(false);
        itemAbrir.setEnabled(false);
        itemCerrar.setEnabled(false);
        jMenuVista.setEnabled(false);

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itaemAlta;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemPerfil;
    private javax.swing.JMenuItem itemUnoaUno;
    private javax.swing.JMenu jMenuAcercade;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConexion;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu jMenuVista;
    // End of variables declaration//GEN-END:variables
}
