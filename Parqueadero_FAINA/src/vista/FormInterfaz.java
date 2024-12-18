/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import controlador.VehiculoControl;
import modelo.Vehiculo;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class FormInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    private int idVehiculo = 0;
    private double totalPagar = 0;

    public FormInterfaz() {
        initComponents();
        this.setTitle("Speed4Wheels");
        this.setSize(1170, 670);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.cargarTablaVehiculos();
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
        jButton_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_regirstrarVehiculo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Placa = new javax.swing.JTextField();
        jComboBox_tipoVehiculo = new javax.swing.JComboBox<>();
        jButton_registrar1 = new javax.swing.JButton();
        jPanel_retirarVehiculo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel_valorPagar = new javax.swing.JLabel();
        jTextField_PlacaRetiro = new javax.swing.JTextField();
        jButton_retirar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton_buscarPlacaRetiro = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel_horaEntrada = new javax.swing.JLabel();
        jLabel_horaSalida = new javax.swing.JLabel();
        jPanel_historial = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_busqueda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser_fechaBusqueda = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_vehiculos = new javax.swing.JTable();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_salir.setBackground(new java.awt.Color(255, 102, 0));
        jButton_salir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_salir.setText("SALIR");
        jButton_salir.setToolTipText("");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/freepik-export-20241126224548nbur.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 20, 570, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 640));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Space 4 Wheels");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/freepik-export-202411262254098i7L (2).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 144, -1));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N

        jPanel_regirstrarVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_regirstrarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_regirstrarVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro de ingreso de vehiculos al parqueadero");
        jPanel_regirstrarVehiculo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de vehículo:");
        jPanel_regirstrarVehiculo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Placa:");
        jPanel_regirstrarVehiculo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jTextField_Placa.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Placa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField_Placa.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PlacaActionPerformed(evt);
            }
        });
        jPanel_regirstrarVehiculo.add(jTextField_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 250, 30));

        jComboBox_tipoVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox_tipoVehiculo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox_tipoVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_tipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Carro", "Moto", "Publico", "Particular" }));
        jComboBox_tipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipoVehiculoActionPerformed(evt);
            }
        });
        jPanel_regirstrarVehiculo.add(jComboBox_tipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 250, 30));

        jButton_registrar1.setBackground(new java.awt.Color(255, 102, 0));
        jButton_registrar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_registrar1.setText("REGISTRAR");
        jButton_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrar1ActionPerformed(evt);
            }
        });
        jPanel_regirstrarVehiculo.add(jButton_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 250, 30));

        jTabbedPane1.addTab("Registrar vehículo", jPanel_regirstrarVehiculo);

        jPanel_retirarVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_retirarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_retirarVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("Vehiculo Retirado");
        jPanel_retirarVehiculo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Retiro de Vehiculos del Parqueadero");
        jPanel_retirarVehiculo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel_valorPagar.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_valorPagar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_valorPagar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_valorPagar.setText("$ 0.00");
        jPanel_retirarVehiculo.add(jLabel_valorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jTextField_PlacaRetiro.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_PlacaRetiro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField_PlacaRetiro.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_PlacaRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PlacaRetiroActionPerformed(evt);
            }
        });
        jPanel_retirarVehiculo.add(jTextField_PlacaRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 140, 30));

        jButton_retirar.setBackground(new java.awt.Color(255, 102, 0));
        jButton_retirar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_retirar.setText("RETIRAR");
        jButton_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retirarActionPerformed(evt);
            }
        });
        jPanel_retirarVehiculo.add(jButton_retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 190, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Valor a pagar: ");
        jPanel_retirarVehiculo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Placa:");
        jPanel_retirarVehiculo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Hora de salida:");
        jPanel_retirarVehiculo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jButton_buscarPlacaRetiro.setBackground(new java.awt.Color(255, 102, 0));
        jButton_buscarPlacaRetiro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_buscarPlacaRetiro.setText("Buscar");
        jButton_buscarPlacaRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarPlacaRetiroActionPerformed(evt);
            }
        });
        jPanel_retirarVehiculo.add(jButton_buscarPlacaRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Hora de entrada:");
        jPanel_retirarVehiculo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel_horaEntrada.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_horaEntrada.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_horaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_horaEntrada.setText("00:00:00");
        jPanel_retirarVehiculo.add(jLabel_horaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel_horaSalida.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_horaSalida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_horaSalida.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_horaSalida.setText("00:00:00");
        jPanel_retirarVehiculo.add(jLabel_horaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jTabbedPane1.addTab("Retirar vehículo", jPanel_retirarVehiculo);

        jPanel_historial.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_historial.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_historial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administrar vehículos del parqueadero");
        jPanel_historial.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha:");
        jPanel_historial.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jTextField_busqueda.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_busqueda.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField_busqueda.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_busquedaActionPerformed(evt);
            }
        });
        jPanel_historial.add(jTextField_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Placa:");
        jPanel_historial.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jDateChooser_fechaBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser_fechaBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser_fechaBusqueda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel_historial.add(jDateChooser_fechaBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 160, 30));

        jTable_vehiculos.setBackground(new java.awt.Color(0, 0, 0));
        jTable_vehiculos.setForeground(new java.awt.Color(255, 255, 255));
        jTable_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Placa", "Tipo vehículo", "Valor pagado", "Estado"
            }
        ));
        jTable_vehiculos.setSelectionBackground(new java.awt.Color(255, 204, 51));
        jScrollPane1.setViewportView(jTable_vehiculos);

        jPanel_historial.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 620, 240));

        buscar.setBackground(new java.awt.Color(255, 102, 0));
        buscar.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel_historial.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 353, 100, 30));

        jTabbedPane1.addTab("Administrar Vehiculos", jPanel_historial);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 640, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 730, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_tipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tipoVehiculoActionPerformed

    private void jTextField_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PlacaActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jTextField_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_busquedaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField_busquedaActionPerformed

    private void jTextField_PlacaRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PlacaRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PlacaRetiroActionPerformed

    private void jButton_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retirarActionPerformed
        if (jLabel16.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Busque un vehiculo para retirar");

        } else {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            String fecha = dateFormat.format(date);
            //Actualizar_Vehiculo

            Vehiculo vehiculo = new Vehiculo();
            VehiculoControl vehiculoControl = new VehiculoControl();

            vehiculo.setHoraSalida(fecha);
            vehiculo.setTotalValor(totalPagar);
            vehiculo.setEstado("EGRESADO");

            if (vehiculoControl.actualizar(vehiculo, idVehiculo)) {
                JOptionPane.showMessageDialog(null, "Vehiculo Retirado con Éxito");
                this.cargarTablaVehiculos();
                jTextField_PlacaRetiro.setText("");
                jLabel_horaEntrada.setText("00:00:00");
                jLabel_horaSalida.setText("00:00:00");
                jLabel_valorPagar.setText("% 0.00");

            } else {
                System.out.println("Error al actualizar datos del vehiculo");
            }

        }


    }//GEN-LAST:event_jButton_retirarActionPerformed

    private void jButton_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrar1ActionPerformed

        String placa = jTextField_Placa.getText().trim();

        if (placa.isEmpty()) {
            JOptionPane.showInternalMessageDialog(null, "Ingrese la placa del Vehículo");

        } else {

            String tipo_vehiculo = jComboBox_tipoVehiculo.getSelectedItem().toString().trim();
            if (tipo_vehiculo.equalsIgnoreCase("Seleccione:")) {
                JOptionPane.showMessageDialog(null, "Seleccione un tipo de vehiculo");

            } else {
                VehiculoControl controlVehiculo = new VehiculoControl();
                Vehiculo vehiculo = new Vehiculo();

                vehiculo.setPlaca(placa);
                vehiculo.setTipoVehiculo(tipo_vehiculo);

                //fecha y hora
                DateFormat dateFormatFecha = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
                Calendar calendar = Calendar.getInstance();
                Date date = calendar.getTime();

                String fecha = dateFormatFecha.format(date);

                vehiculo.setHoraEntrada(fecha);
                vehiculo.setHoraSalida(null);
                vehiculo.setEstado("INGRESADO");

                if (controlVehiculo.guardar(vehiculo)) {
                    JOptionPane.showMessageDialog(null, "***Ingreso de vehiculo registrado***");
                    //Cargar la Tabla
                    this.cargarTablaVehiculos();
                    //Limpiar
                    jTextField_Placa.setText("");
                    jComboBox_tipoVehiculo.setSelectedItem("Seleccione:");
                } else {
                    JOptionPane.showMessageDialog(null, "Error en el registro del vehiculo");
                }

            }

        }

    }//GEN-LAST:event_jButton_registrar1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        String PlacaPropietarioBusqueda = jTextField_busqueda.getText().trim();
        Date fechaBusqueda = jDateChooser_fechaBusqueda.getDate();
        String fechaComoCadena = "";
        if (fechaBusqueda != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            fechaComoCadena = sdf.format(fechaBusqueda);
        }
        if (PlacaPropietarioBusqueda.isEmpty() && fechaComoCadena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la Placa");
            this.cargarTablaVehiculos();
        } else {
            VehiculoControl vehiculoControl = new VehiculoControl();
            vehiculoControl.buscaVehiculosPlacaFecha(PlacaPropietarioBusqueda, fechaComoCadena);

            ArrayList<Vehiculo> listaVehiculo = vehiculoControl.listaVehiculo;

            DefaultTableModel model = new DefaultTableModel();
            this.jTable_vehiculos = new JTable(model);
            this.jScrollPane1.setViewportView(this.jTable_vehiculos);
            model.addColumn("N°");
            model.addColumn("Placa");
            model.addColumn("Tipo de Vehiculo");
            model.addColumn("Valor Pagado");
            model.addColumn("Estado");

            Object fila[] = new Object[5];
            for (Vehiculo vehiculo : listaVehiculo) {
                fila[0] = vehiculo.getIdVehiculo();
                fila[1] = vehiculo.getPlaca();
                fila[2] = vehiculo.getTipoVehiculo();
                fila[3] = vehiculo.getTotalValor();
                fila[4] = vehiculo.getEstado();

            }
            model.addRow(fila);

        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton_buscarPlacaRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarPlacaRetiroActionPerformed

        // TODO add your handling code here:
        String placaBuscar = jTextField_PlacaRetiro.getText().trim();
        String estado = "", salida = "";
        double valor = 0.00;

        if (placaBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una Placa");

        } else {
            Connection cn = Conexion.conectar();
            String sql = "select * from tb_vehiculo WHERE placa =+ '" + placaBuscar + "'";
            Statement st;

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();

            try {
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    idVehiculo = rs.getInt("id_vehiculo");
                    jLabel_horaEntrada.setText(rs.getString("hora_entrada"));
                    salida = rs.getString("hora_salida");
                    valor = rs.getDouble("valor_pagado");
                    estado = rs.getString("estado");

                    //fechayhora
                    String tiempoIngreso = rs.getString("hora_entrada");
                    Date tiempo = dateFormat.parse(tiempoIngreso);
                    int minutosACobrar = (int) (date.getTime() - tiempo.getTime()) / 60000;

                    if (rs.getString("tipo_vehiculo").equals("Particular")) {

                    }
                    if (minutosACobrar < 60) {
                        totalPagar = 0.50;

                    } else {
                        totalPagar = ((minutosACobrar - 60) * 0.01) + 0.50;

                    }
                    if (rs.getString("tipo_vehiculo").equals("Moto")) {

                    }
                    if (minutosACobrar < 60) {

                        totalPagar = 0.25;

                    } else {
                        totalPagar = ((minutosACobrar - 60) * 0.01) + 0.25;
                    }

                }
                String fecha = dateFormat.format(date);
                jLabel_horaSalida.setText(fecha);
                jLabel_valorPagar.setText("$" + valor);

                if (estado.equalsIgnoreCase("EGRESADO")) {
                    jButton_retirar.setEnabled(false);
                    jLabel_horaSalida.setText(salida);
                    jLabel_valorPagar.setText(String.valueOf(valor));
                } else {
                    jButton_retirar.setEnabled(true);

                }
            } catch (SQLException e) {
                System.out.println("Error al buscar datos del Vehiculo Ingresado" + e);

            } catch (ParseException ex) {
                Logger.getLogger(FormInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_buscarPlacaRetiroActionPerformed

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
            java.util.logging.Logger.getLogger(FormInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton_buscarPlacaRetiro;
    private javax.swing.JButton jButton_registrar1;
    private javax.swing.JButton jButton_retirar;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JComboBox<String> jComboBox_tipoVehiculo;
    private com.toedter.calendar.JDateChooser jDateChooser_fechaBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_horaEntrada;
    private javax.swing.JLabel jLabel_horaSalida;
    private javax.swing.JLabel jLabel_valorPagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_historial;
    private javax.swing.JPanel jPanel_regirstrarVehiculo;
    private javax.swing.JPanel jPanel_retirarVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_vehiculos;
    private javax.swing.JTextField jTextField_Placa;
    private javax.swing.JTextField jTextField_PlacaRetiro;
    private javax.swing.JTextField jTextField_busqueda;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaVehiculos() {

        Connection cn = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_vehiculo, placa, tipo_vehiculo, valor_pagado, estado from tb_vehiculo";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            this.jTable_vehiculos = new JTable(model);
            this.jScrollPane1.setViewportView(this.jTable_vehiculos);

            model.addColumn("N°");
            model.addColumn("Placa");
            model.addColumn("Tipo de Vehiculo");
            model.addColumn("Valor Pagado");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }

        } catch (SQLException e) {

            System.out.println("Error al llenar la tabla de vehiculos" + e);

        }
    }

}
