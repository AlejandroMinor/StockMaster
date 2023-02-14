/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StockMaster;

//import com.sun.prism.j2d.J2DPipeline;
import conexionesSQL.conexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aleja
 */
public class login extends javax.swing.JFrame {

    public static String nombreUsuario, apellidosUsuario, IDUsuario, puesto;
    conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public static String getIDUsuario() {
        return IDUsuario;
    }

    public static String getpuesto() {
        return puesto;
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
        imgLogoSeguricam = new javax.swing.JLabel();
        mensajeBienvenida = new javax.swing.JLabel();
        UserTextField = new javax.swing.JTextField();
        iconUser = new javax.swing.JLabel();
        cuadroGrisUser = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        iconPass = new javax.swing.JLabel();
        cuadroGrisPassword = new javax.swing.JLabel();
        btnInicioSesion = new javax.swing.JLabel();
        iconLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        MostrarContraseñaCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogoSeguricam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(imgLogoSeguricam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        mensajeBienvenida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mensajeBienvenida.setForeground(new java.awt.Color(102, 102, 102));
        mensajeBienvenida.setText("Te damos la bienvendida");
        jPanel1.add(mensajeBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 210, 30));

        UserTextField.setBackground(new java.awt.Color(162, 162, 162));
        UserTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserTextField.setForeground(new java.awt.Color(226, 226, 226));
        UserTextField.setText("            USUARIO | ID");
        UserTextField.setBorder(null);
        UserTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserTextFieldFocusGained(evt);
            }
        });
        UserTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTextFieldMouseClicked(evt);
            }
        });
        jPanel1.add(UserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 200, 320, 40));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-username-96.png"))); // NOI18N
        jPanel1.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 40));

        cuadroGrisUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra gris.png"))); // NOI18N
        jPanel1.add(cuadroGrisUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jPasswordField.setBackground(new java.awt.Color(162, 162, 162));
        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(226, 226, 226));
        jPasswordField.setText("            CONTRASEÑA");
        jPasswordField.setBorder(null);
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
        });
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 290, -1));

        iconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-password-96.png"))); // NOI18N
        jPanel1.add(iconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 40, 40));

        cuadroGrisPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra gris.png"))); // NOI18N
        jPanel1.add(cuadroGrisPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        btnInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioSesion.setText("Iniciar Sesión");
        btnInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseClicked(evt);
            }
        });
        jPanel1.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 140, 40));

        iconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-login-96.png"))); // NOI18N
        jPanel1.add(iconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 40, 40));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra azul.png"))); // NOI18N
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        MostrarContraseñaCheckBox.setForeground(new java.awt.Color(102, 102, 102));
        MostrarContraseñaCheckBox.setText("Mostrar contraseña");
        MostrarContraseñaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraseñaCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarContraseñaCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTextFieldMouseClicked
        UserTextField.setText("");
    }//GEN-LAST:event_UserTextFieldMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        jPasswordField.setText("");
        jPasswordField.setEchoChar('*');
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        imgLogoSeguricam.requestFocus();
        jPasswordField.setEchoChar((char) 0);
    }//GEN-LAST:event_formWindowOpened

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void MostrarContraseñaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraseñaCheckBoxActionPerformed

        if (MostrarContraseñaCheckBox.isSelected()) {
            jPasswordField.setEchoChar((char) 0);

        } else {
            jPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_MostrarContraseñaCheckBoxActionPerformed

    private void UserTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserTextFieldFocusGained

    }//GEN-LAST:event_UserTextFieldFocusGained

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        jPasswordField.setText("");
        jPasswordField.setEchoChar('*');
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void btnInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesionMouseClicked

        if (jPasswordField.getPassword().equals("") | jPasswordField.getPassword().equals("              CONTRASEÑA") | UserTextField.getText().equals("") | UserTextField.getText().contains("            USUARIO | ID")) {
            JOptionPane.showMessageDialog(null, "Para continuar debe rellenar todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {

            boolean acceso = consultaInicio(UserTextField.getText(), jPasswordField.getText());
            if (acceso) {
                ventanaPrincipal ventanaInicioAdministrador = new ventanaPrincipal();
                ventanaInicioAdministrador.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Las credenciales de acceso no coinciden", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnInicioSesionMouseClicked

    private void jPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyTyped
        if (MostrarContraseñaCheckBox.isSelected()) {
            jPasswordField.setEchoChar((char) 0);

        } else {
            jPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_jPasswordFieldKeyTyped

    public boolean consultaInicio(String id, String password) {
        boolean registroEncontrado = false;

        String SQL = "select * from user where idUser = " + id + "";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                if (rs.getString("idUser").equals(id) & rs.getString("password").equals(password)) {
                    registroEncontrado = true;
                    IDUsuario = rs.getString("idUser");
                    nombreUsuario = rs.getString("Nombre");
                    apellidosUsuario = rs.getString("apellidos");
                    puesto = rs.getString("puesto");
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return registroEncontrado;

    }

    /**
     * @param args the command line arguments
     */
    public static void login() {
        /* Set the Nimbus look and feel */


 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox MostrarContraseñaCheckBox;
    private javax.swing.JTextField UserTextField;
    private javax.swing.JLabel btnInicioSesion;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel cuadroGrisPassword;
    private javax.swing.JLabel cuadroGrisUser;
    private javax.swing.JLabel iconLogin;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel imgLogoSeguricam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel mensajeBienvenida;
    // End of variables declaration//GEN-END:variables
}
