/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jefer
 */
public class Ventana extends javax.swing.JFrame {

    //Declaracion de variables globales
    String[][] matrizDatos;
    int[] llaves;
    String[] letras;
    int encSep;
    Dispersion d;

    public Ventana() {
        this.setTitle("Dispersion");
        this.setResizable(false);
        initComponents();
        lLlaves.setVisible(false);
        lNombres.setVisible(false);
        bRetirar.setVisible(false);
        lCabezasListas.setVisible(false);
        lCursor.setVisible(false);
        lDisponible.setVisible(false);
        bMostrarTablas.setVisible(false);
        bBuscar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lInfo2 = new javax.swing.JLabel();
        tPrimo = new javax.swing.JTextField();
        lLlavesM = new javax.swing.JLabel();
        tLlavesM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tNombresM = new javax.swing.JTextField();
        lLlaves = new javax.swing.JLabel();
        lNombres = new javax.swing.JLabel();
        lCursor = new javax.swing.JLabel();
        bDispersar = new javax.swing.JButton();
        bRetirar = new javax.swing.JButton();
        bMostrarTablas = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatos = new javax.swing.JTable();
        bAleatorio = new javax.swing.JButton();
        tLlaves = new javax.swing.JTextField();
        lInfo = new javax.swing.JLabel();
        lCabezasListas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tListaCabezas = new javax.swing.JTable();
        lDisponible = new javax.swing.JLabel();
        lEncSep = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tLlavesLineal = new javax.swing.JTable();
        lCursor1 = new javax.swing.JLabel();
        lCursor2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tLlavesDH = new javax.swing.JTable();
        lCursor3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tLlavesPC = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tCabezasLineal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTprimoDH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTprimoPC = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        TextLineal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lInfo2.setText("Numero Primo");

        tPrimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tPrimoFocusGained(evt);
            }
        });
        tPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrimoActionPerformed(evt);
            }
        });
        tPrimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPrimoKeyTyped(evt);
            }
        });

        lLlavesM.setText("llaves:");

        jLabel2.setText("nombres:");

        lLlaves.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lLlaves.setText("llaves: ");

        lNombres.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lNombres.setText("nombres: ");

        lCursor.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCursor.setForeground(new java.awt.Color(51, 51, 51));
        lCursor.setText("Grafica Cursor");

        bDispersar.setText("Dispersar");
        bDispersar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bDispersar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDispersarActionPerformed(evt);
            }
        });

        bRetirar.setText("Retirar");
        bRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarActionPerformed(evt);
            }
        });

        bMostrarTablas.setText("Mostrar tabla");
        bMostrarTablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bMostrarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarTablasActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        tDatos.setVisible(false);
        tDatos.setVisible(false);
        jScrollPane1.setViewportView(tDatos);

        bAleatorio.setText("Generar aleatoriamente");
        bAleatorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAleatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAleatorioActionPerformed(evt);
            }
        });

        tLlaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLlavesActionPerformed(evt);
            }
        });

        lInfo.setText("numero de llaves a dispersar aleatoriamente:");

        lCabezasListas.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCabezasListas.setForeground(new java.awt.Color(51, 51, 51));
        lCabezasListas.setText("Cabezas de lista");

        tDatos.setVisible(false);
        tDatos.setVisible(false);
        jScrollPane2.setViewportView(tListaCabezas);

        lDisponible.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lDisponible.setForeground(new java.awt.Color(255, 0, 0));
        lDisponible.setText("Proximo disponible: ");
        lDisponible.setVisible(false);

        lEncSep.setText(" ");

        tLlavesLineal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tLlavesLineal);

        lCursor1.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCursor1.setForeground(new java.awt.Color(51, 51, 51));
        lCursor1.setText("Prueba Cuadratica");

        lCursor2.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCursor2.setForeground(new java.awt.Color(51, 51, 51));
        lCursor2.setText("Encadenamiento lineal");

        tLlavesDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tLlavesDH);

        lCursor3.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCursor3.setForeground(new java.awt.Color(51, 51, 51));
        lCursor3.setText("Doble Hash");

        tLlavesPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tLlavesPC);

        tCabezasLineal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tCabezasLineal);

        jLabel1.setText("Doble Hash");

        JTprimoDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTprimoDHActionPerformed(evt);
            }
        });

        jLabel3.setText("Prueba cuadratica");

        TextLineal.setColumns(20);
        TextLineal.setRows(5);
        jScrollPane8.setViewportView(TextLineal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lLlaves, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lLlavesM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tLlavesM, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tNombresM, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTprimoDH, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lEncSep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTprimoPC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(lCursor)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(lCabezasListas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bDispersar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bMostrarTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lInfo)))
                                        .addGap(18, 18, 18)
                                        .addComponent(tLlaves, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(lCursor2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(752, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(lCursor3)
                        .addGap(518, 518, 518)
                        .addComponent(lCursor1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDispersar)
                    .addComponent(bMostrarTablas)
                    .addComponent(tPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lInfo2)
                    .addComponent(lEncSep)
                    .addComponent(jLabel1)
                    .addComponent(JTprimoDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lInfo)
                    .addComponent(tLlaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTprimoPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLlavesM)
                    .addComponent(lLlavesM)
                    .addComponent(bAleatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bRetirar)
                            .addComponent(bBuscar)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lLlaves)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCursor)
                            .addComponent(lCabezasListas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tNombresM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDisponible)
                .addGap(43, 43, 43)
                .addComponent(lCursor2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCursor3)
                    .addComponent(lCursor1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAleatorioActionPerformed
        String encSep = tPrimo.getText();
        String llaves = tLlaves.getText();
        String primoDH = JTprimoDH.getText();
        String primoPC = JTprimoPC.getText();
        if ((llaves.equals(null) || llaves.equals("")) && (encSep.equals(null) || encSep.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete los campos", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (encSep.equals(null) || encSep.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if ((primoDH.equals(null) || primoDH.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de Doble Hash", "Atencion", JOptionPane.ERROR_MESSAGE);
            JTprimoDH.setText("");
            JTprimoDH.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if ((primoPC.equals(null) || primoPC.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de Prueba Cuadratica", "Atencion", JOptionPane.ERROR_MESSAGE);
            JTprimoPC.setText("");
            JTprimoPC.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (llaves.equals(null) || llaves.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de numero de llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(llaves) && !esNumerico(encSep)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico entero en los dos campos", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(encSep) || !esNumerico(primoDH) || !esNumerico(primoPC)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico en el campo encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(llaves)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico en el campo llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esPrimo(encSep) || !esPrimo(primoDH) || !esPrimo(primoPC)) {
            JOptionPane.showMessageDialog(getContentPane(), "El numero ingresado no es primo (en el campo Enc Sep)", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else {
            this.encSep = Integer.parseInt(encSep);
            generarAleatoriamente(Integer.parseInt(llaves));
            setValores(hacerString(this.llaves), "llaves", lLlaves, tLlavesM);
            if (Integer.parseInt(encSep) < this.llaves.length || Integer.parseInt(primoDH) < this.llaves.length || Integer.parseInt(primoPC) < this.llaves.length) {
                JOptionPane.showMessageDialog(getContentPane(), "El numero de llaves debe ser menor o igual a los numeros primos", "Atencion", JOptionPane.ERROR_MESSAGE);
                return;
            }for (int i = 0; i < this.llaves.length; i++) {
                for (int j = i+1; j < this.llaves.length; j++) {
                    System.out.println(this.llaves[i]);
                    System.out.println(this.llaves[j]);
                    System.out.println("son diferentes");
                    if (this.llaves[i] == this.llaves[j]) {
                        JOptionPane.showMessageDialog(getContentPane(), "hay una llave repetida", "Atencion", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            lLlaves.setVisible(true);
            setValores(letras, "nombres", lNombres, this.tNombresM);
            lNombres.setVisible(true);
            lEncSep.setText(encSep);
            dispersion(this.encSep, this.llaves, this.letras, Integer.parseInt(primoDH), Integer.parseInt(primoPC));
        }
    }//GEN-LAST:event_bAleatorioActionPerformed

    private void bRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarActionPerformed
        String llave = tLlavesM.getText();
        System.out.println(llave);
        if (llaves.equals(null) || llaves.equals("") || !esNumerico(llave)) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de llave, es el unico que se tiene en cuenta", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
        } else {
            retirar(Integer.parseInt(llave));
            tLlavesM.setText("");
            crearModelo(d.matrizDH(), tLlavesDH);
            mostrarHeader(d.matrizDH(), tLlavesDH, "0");
            ponerDatos(d.matrizDH(), tLlavesDH);
            tLlavesDH.setVisible(true);
            crearModelo(d.matrizPC(), tLlavesPC);
            mostrarHeader(d.matrizPC(), tLlavesPC, "0");
            ponerDatos(d.matrizPC(), tLlavesPC);
            tLlavesPC.setVisible(true);
        }
    }//GEN-LAST:event_bRetirarActionPerformed
                                         

    private void bDispersarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDispersarActionPerformed
        String llaves = tLlavesM.getText();
        String nombres = tNombresM.getText();
        String encSep = tPrimo.getText();
        String primoDH = JTprimoDH.getText();
        String primoPC = JTprimoPC.getText();
        if ((llaves.equals(null) || llaves.equals("")) && (nombres.equals(null) || nombres.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete los campos", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
            tNombresM.setText("");
            tNombresM.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (llaves.equals(null) || llaves.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
            tNombresM.setText("");
            tNombresM.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (nombres.equals(null) || nombres.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de nombres", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
            tLlavesM.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if ((primoDH.equals(null) || primoDH.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de Doble Hash", "Atencion", JOptionPane.ERROR_MESSAGE);
            JTprimoDH.setText("");
            JTprimoDH.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if ((primoPC.equals(null) || primoPC.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de Prueba Cuadratica", "Atencion", JOptionPane.ERROR_MESSAGE);
            JTprimoPC.setText("");
            JTprimoPC.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if ((encSep.equals(null) || encSep.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(encSep) || !esNumerico(primoDH) || !esNumerico(primoPC)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico en el campo de encadenamiento separado, doble hash y prueba cuadratica", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esPrimo(encSep) || !esPrimo(primoDH) || !esPrimo(primoPC)) {
            JOptionPane.showMessageDialog(getContentPane(), "El numero ingresado no es primo (en el campo Enc Sep, doble hash y prueba cuadratica)", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else {
            if (registrarValores(llaves, nombres) == 2) {
                JOptionPane.showMessageDialog(getContentPane(), "Ingrese llaves numericas", "Atencion", JOptionPane.ERROR_MESSAGE);
                tLlavesM.setText("");
                tLlavesM.requestFocus();
                lLlaves.setVisible(false);
                lNombres.setVisible(false);
            } else if (registrarValores(llaves, nombres) == 2) {
                JOptionPane.showMessageDialog(getContentPane(), "Ingrese llaves numericas", "Atencion", JOptionPane.ERROR_MESSAGE);
                tLlavesM.setText("");
                tLlavesM.requestFocus();
                lLlaves.setVisible(false);
                lNombres.setVisible(false);
            } else if (this.llaves.length != this.letras.length) {
                JOptionPane.showMessageDialog(getContentPane(), "Ingrese la misma cantidad de llaves que de nombres de las llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
                tLlavesM.setText("");
                tNombresM.setText("");
                tLlavesM.requestFocus();
                lLlaves.setVisible(false);
                lNombres.setVisible(false);
            } else {
                setValores(hacerString(this.llaves), "llaves", lLlaves, tLlavesM);
                if (Integer.parseInt(encSep) < this.llaves.length || Integer.parseInt(primoDH) < this.llaves.length || Integer.parseInt(primoPC) < this.llaves.length) {
                    JOptionPane.showMessageDialog(getContentPane(), "El numero de llaves debe ser menor o igual a los numeros primos", "Atencion", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                lLlaves.setVisible(true);
                setValores(letras, "nombres", lNombres, this.tNombresM);
                lNombres.setVisible(true);
                this.encSep = Integer.parseInt(encSep);
                lEncSep.setText(encSep);
                //Metodo de dispersion
                dispersion(this.encSep, this.llaves, this.letras, Integer.parseInt(primoDH), Integer.parseInt(primoPC));
            }

        }
    }//GEN-LAST:event_bDispersarActionPerformed

    
    
    private void tPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrimoActionPerformed

    }//GEN-LAST:event_tPrimoActionPerformed

    private void tPrimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPrimoKeyTyped

    }//GEN-LAST:event_tPrimoKeyTyped

    private void tPrimoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPrimoFocusGained

    }//GEN-LAST:event_tPrimoFocusGained

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        String llave = tLlavesM.getText();
        System.out.println(llave);
        if (llaves.equals(null) || llaves.equals("") || !esNumerico(llave)) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de llave, es el unico que se tiene en cuenta", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
        } else if (!buscarDato(Integer.parseInt(llave))) {
            JOptionPane.showMessageDialog(getContentPane(), "El dato no se encuentra", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
        } else {
            buscar(Integer.parseInt(llave));
            tLlavesM.setText("");
            bMostrarTablas.setVisible(true);
            bBuscar.setVisible(false);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bMostrarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTablasActionPerformed
        mostrarTablas();
        bMostrarTablas.setVisible(false);
    }//GEN-LAST:event_bMostrarTablasActionPerformed

    private void tLlavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLlavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLlavesActionPerformed

    private void JTprimoDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTprimoDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTprimoDHActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTprimoDH;
    private javax.swing.JTextField JTprimoPC;
    private javax.swing.JTextArea TextLineal;
    private javax.swing.JButton bAleatorio;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bDispersar;
    private javax.swing.JButton bMostrarTablas;
    private javax.swing.JButton bRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lCabezasListas;
    private javax.swing.JLabel lCursor;
    private javax.swing.JLabel lCursor1;
    private javax.swing.JLabel lCursor2;
    private javax.swing.JLabel lCursor3;
    private javax.swing.JLabel lDisponible;
    private javax.swing.JLabel lEncSep;
    private javax.swing.JLabel lInfo;
    private javax.swing.JLabel lInfo2;
    private javax.swing.JLabel lLlaves;
    private javax.swing.JLabel lLlavesM;
    private javax.swing.JLabel lNombres;
    private javax.swing.JTable tCabezasLineal;
    private javax.swing.JTable tDatos;
    private javax.swing.JTable tListaCabezas;
    private javax.swing.JTextField tLlaves;
    private javax.swing.JTable tLlavesDH;
    private javax.swing.JTable tLlavesLineal;
    private javax.swing.JTextField tLlavesM;
    private javax.swing.JTable tLlavesPC;
    private javax.swing.JTextField tNombresM;
    private javax.swing.JTextField tPrimo;
    // End of variables declaration//GEN-END:variables

    private boolean esNumerico(String llaves) {
        try {
            Integer.parseInt(llaves);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean esPrimo(String llaves) {
        // El 0, 1 y 4 no son primos
        if (Integer.parseInt(llaves) == 0 || Integer.parseInt(llaves) == 1 || Integer.parseInt(llaves) == 4) {
            return false;
        }
        for (int x = 2; x < Integer.parseInt(llaves) / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (Integer.parseInt(llaves) % x == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

    private void generarAleatoriamente(int cantidad) {
        Random r = new Random();
        letras = new String[cantidad];
        llaves = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            llaves[i] = (int) (Math.random() * 200);
            String letras2 = "";
            for (int j = 0; j < 2; j++) {
                char c = (char) (r.nextInt(26) + 'a');
                letras2 += String.valueOf(c);
            }
            letras[i] = letras2;
        }

        ArrayList<Integer> datos = new ArrayList();
        for (int i = 0; i < llaves.length; i++) {
            datos.add(llaves[i]);
        }
        ArrayList<Integer> sinRep = generos(datos);

        llaves = new int[sinRep.size()];
        for (int i = 0; i < llaves.length; i++) {
            llaves[i] = sinRep.get(i);
        }
        if (llaves.length != cantidad) {
            generarAleatoriamente(cantidad);
        }
    }

    public static ArrayList<Integer> generos(ArrayList<Integer> generos) {
        ArrayList<Integer> sinrep = new ArrayList<>();
        for (int i = 0; i < generos.size(); i++) {
            if (!sinrep.contains(generos.get(i))) {
                sinrep.add(generos.get(i));
            } else {
                System.out.println("Repetida la " + generos.get(i));
            }
        }
        return sinrep;
    }

    private void setValores(String[] matriz, String valor, JLabel label, JTextField textField) {
        String cadena = "";
        String cadena2 = "";
        System.out.println(valor);
        cadena += valor + ": ";
        for (int i = 0; i < matriz.length; i++) {
            if (i == matriz.length - 1) {
                cadena2 += matriz[i];
                cadena += matriz[i];
            } else {
                cadena2 += matriz[i] + ",";
                cadena += matriz[i] + ",";
            }
        }
        label.setText(cadena);
        textField.setText(cadena2);
    }

    private String[] hacerString(int[] entrada) {
        String[] matriz = new String[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            matriz[i] = String.valueOf(entrada[i]);
        }
        return matriz;
    }

    private int registrarValores(String llaves, String nombres) {
        String[] partes1 = llaves.split(",");
        this.letras = new String[partes1.length];
        this.letras = nombres.split(",");
        this.llaves = new int[partes1.length];
        int[] llavesTemp = new int[partes1.length];
        for (int i = 0; i < partes1.length; i++) {
            llavesTemp = this.llaves;
//            int linea = Integer.parseInt(partes1[i]);
//            if (contains(llavesTemp, linea)) {
//                return 1;
//            } else 
            if (esNumerico(partes1[i])) {
                this.llaves[i] = Integer.parseInt(partes1[i]);
            } else {
                return 2;
            }
        }
        this.llaves = sinRepetir(this.llaves);
//        if (partes1.length < this.llaves.length) {
//            JOptionPane.showMessageDialog(getContentPane(), "Ingrese llaves numericas", "Atencion", JOptionPane.ERROR_MESSAGE);
//        }

        return 0;
    }

    public int[] sinRepetir(int[] a) {
        System.out.println("entra:" + Arrays.toString(a));
        ArrayList<Integer> posiciones = new ArrayList<>();
        int len = a.length;
        int pos = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    len--;
                    posiciones.add(i);
                    JOptionPane.showMessageDialog(getContentPane(), "Llave " + a[i] + " repetida", "Atencion", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        System.out.println("posiciones: " + posiciones.toString());
        String[] temp = new String[this.letras.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (k > len) {
                break;
            } else if (posiciones.contains(i)) {
                if (k == len) {
                    break;
                }
            } else {
                a[k] = a[i];
                temp[k++] = this.letras[i];
            }
        }

        int[] c = new int[len];
        this.letras = new String[len];

        for (int i = 0; i < len; i++) {
            c[i] = a[i];
            this.letras[i] = temp[i];
        }
        System.out.println("el c. " + Arrays.toString(c));
        return c;
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    private void dispersion(int nPrimo, int[] valores, String[] letras, int primoDH, int primoPC) {
        d = new Dispersion(nPrimo, valores, letras, primoDH, primoPC);
        d.llenar();
        d.guardar();
        d.llenarMatriz();
        matrizDatos = d.crearMatriz();
        for (int i = 0; i < matrizDatos.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizDatos[i].length; j++) {
                System.out.print(matrizDatos[i][j] + " ");
            }
        }

        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        crearModelo(d.matrizCabeza(), tListaCabezas);
        mostrarHeader(d.matrizCabeza(), tListaCabezas, "c");
        ponerDatos(d.matrizCabeza(), tListaCabezas);
        tListaCabezas.setVisible(true);
        crearModelo(reDefinirMatriz(matrizDatos), tDatos);
        mostrarHeader(reDefinirMatriz(matrizDatos), tDatos, "");
        ponerDatos(reDefinirMatriz(matrizDatos), tDatos);
        tDatos.setVisible(true);
        crearModelo(d.matrizLineal(), tLlavesLineal);
        mostrarHeader(d.matrizLineal(), tLlavesLineal, "0+");
        ponerDatos(d.matrizLineal(), tLlavesLineal);
        tLlavesLineal.setVisible(true);
        crearModelo(d.cabezasLineal(), tCabezasLineal);
        mostrarHeader(d.cabezasLineal(), tCabezasLineal, "M");
        ponerDatos(d.cabezasLineal(), tCabezasLineal);
        tCabezasLineal.setVisible(true);
        crearModelo(d.matrizDH(), tLlavesDH);
        mostrarHeader(d.matrizDH(), tLlavesDH, "0");
        ponerDatos(d.matrizDH(), tLlavesDH);
        tLlavesDH.setVisible(true);
        crearModelo(d.matrizPC(), tLlavesPC);
        mostrarHeader(d.matrizPC(), tLlavesPC, "0");
        ponerDatos(d.matrizPC(), tLlavesPC);
        tLlavesPC.setVisible(true);
        d.textoLineal(TextLineal);
        bRetirar.setVisible(true);
//        bBuscar.setVisible(true);
        proximoDisponible(llaves.length + 1);
    }

    //Creacion de la tabla
    private void crearModelo(String[][] matriz, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(matriz.length);
        modelo.setColumnCount(matriz[0].length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                tabla.setModel(modelo);
            }
        }
        tabla.setDefaultEditor(Object.class, null);
    }

    private void mostrarHeader(String[][] matriz, JTable tabla, String value) {
        if (value.equals("c")) {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            String[] valor = new String[]{"Modulo", "Cabeza", "Lista"};
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(valor[i]);
            }
            tabla.repaint();
        } else if (value.equals("a")) {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(matriz[i][0]);
            }
            tabla.repaint();
        } else if (value.equals("0")) {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(i);
            }
            tabla.repaint();
        } else if (value.equals("0+")) {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = cModelo.getColumn(0);
            columna.setHeaderValue(" ");
            for (int i = 1; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(i - 1);
            }
            tabla.repaint();
        } else if (value.equals("M")) {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = cModelo.getColumn(0);
            columna.setHeaderValue("Modulo");
            for (int i = 1; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(i - 1);
            }
            tabla.repaint();
        } else {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(i + 1 + "");
            }
            tabla.repaint();
        }

    }

    private void ponerVectDatos(String[][] matrizd, JTable tabla) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < matrizd.length; i++) {
            for (int j = 0; j < matrizd[0].length; j++) {
                tabla.setValueAt(matrizd[i][j], i, j);
            }
        }
        centrarDatos(tabla);
        tabla.setDefaultRenderer(String.class, centerRenderer);
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        dtm.removeRow(0);
    }

    //Completar tabla matriz
    private void ponerDatos(String[][] matriz, JTable tabla) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                tabla.setValueAt(matriz[i][j], i, j);
            }
        }
        centrarDatos(tabla);
        tabla.setDefaultRenderer(String.class, centerRenderer);
    }

    private void retirar(int llave) {
        d.borrar(llave);
        matrizDatos = d.getMatriz();
        for (int i = 0; i < matrizDatos.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizDatos[i].length; j++) {
                System.out.print(matrizDatos[i][j] + " ");
            }
        }
        crearModelo(d.matrizCabeza(), tListaCabezas);
        mostrarHeader(d.matrizCabeza(), tListaCabezas, "c");
        ponerDatos(d.matrizCabeza(), tListaCabezas);
        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        tListaCabezas.setVisible(true);
        crearModelo(reDefinirMatriz(matrizDatos), tDatos);
        mostrarHeader(reDefinirMatriz(matrizDatos), tDatos, "");
        ponerDatos(reDefinirMatriz(matrizDatos), tDatos);
        tDatos.setVisible(true);
        bRetirar.setVisible(true);
        borrarDatos(llaves, letras, llave);
        proximoDisponible(d.getPosicion() + 1);
    }

    private boolean buscarDato(int llave) {
        for (int i = 0; i < this.llaves.length; i++) {
            if (llave == llaves[i]) {
                return true;
            }
        }
        return false;
    }

    private void borrarDatos(int[] llaves, String[] letras, int llave) {
        ArrayList<Integer> ll = new ArrayList<Integer>();
        ArrayList<String> le = new ArrayList<String>();
        for (int i = 0; i < llaves.length; i++) {
            if (llave != llaves[i]) {
                ll.add(llaves[i]);
                le.add(letras[i]);
            }
        }
        this.letras = new String[le.size()];
        this.llaves = new int[ll.size()];
        for (int i = 0; i < this.llaves.length; i++) {
            this.llaves[i] = ll.get(i);
            this.letras[i] = le.get(i);
        }
        setValores(hacerString(this.llaves), "llaves", lLlaves, tLlavesM);
        setValores(this.letras, "nombres", lNombres, tNombresM);
        tLlavesM.setText("");
        tNombresM.setText("");
        lLlaves.setVisible(true);
        lNombres.setVisible(true);
    }

    private String[][] reDefinirMatriz(String[][] matrizDatos) {
        String[][] matriz = new String[matrizDatos.length - 1][matrizDatos[0].length - 1];
        for (int i = 0; i < matrizDatos.length - 1; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matrizDatos[i + 1][j];
            }
        }
        return matriz;
    }

    private void proximoDisponible(int c) {
        lDisponible.setText("Proximo disponible: " + c);
        lDisponible.setVisible(true);
    }

    private void buscar(int a) {
        int numero = d.buscar(a);
        System.out.println("numero " + numero);
        String[][] matrizD = new String[4][1];
        String[][] matrizC = new String[1][3];
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD[0].length; j++) {
                matrizD[i][j] = matrizDatos[i][numero];
            }
        }

        numero = d.buscarC(a, tListaCabezas);
        System.out.println("numero cabeza" + numero);

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                matrizC[i][j] = String.valueOf(tListaCabezas.getValueAt(numero, j));
            }
        }
        crearModelo(matrizC, tListaCabezas);
        mostrarHeader(matrizC, tListaCabezas, "c");
        ponerDatos(matrizC, tListaCabezas);
        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        tListaCabezas.setVisible(true);
        crearModelo(matrizD, tDatos);
        mostrarHeader(matrizD, tDatos, "a");
        ponerVectDatos(matrizD, tDatos);
        tDatos.setVisible(true);
    }

    private void centrarDatos(JTable tabla) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int j = 0; j < tabla.getColumnCount(); j++) {
            tabla.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
        }
    }

    private void mostrarTablas() {
        crearModelo(d.matrizCabeza(), tListaCabezas);
        mostrarHeader(d.matrizCabeza(), tListaCabezas, "c");
        ponerDatos(d.matrizCabeza(), tListaCabezas);
        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        tListaCabezas.setVisible(true);
        crearModelo(reDefinirMatriz(matrizDatos), tDatos);
        mostrarHeader(reDefinirMatriz(matrizDatos), tDatos, "");
        ponerDatos(reDefinirMatriz(matrizDatos), tDatos);
        tDatos.setVisible(true);
        bBuscar.setVisible(true);
    }

}
