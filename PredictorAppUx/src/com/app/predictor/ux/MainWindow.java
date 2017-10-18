/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.predictor.ux;

import static javax.swing.JOptionPane.showMessageDialog;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.xml.parsers.ParserConfigurationException;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.xml.sax.SAXException;
import com.app.predictor.model.PicoPlacaForm;
import com.app.predictor.service.ServicePredictorPicoPlaca;


/**
 * The Class MainWindow.
 *
 * @author root
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow.
     */
    public MainWindow() {
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

        jPanelMaster = new javax.swing.JPanel();
        jPanelHead = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonMenuBuscar = new javax.swing.JButton();
        jButtonAbout = new javax.swing.JButton();
        jPanelDetail = new javax.swing.JPanel();
        jPanelDashboard = new javax.swing.JPanel();
        Date dateParam = new Date();
        jDateChooserParam = new com.toedter.calendar.JDateChooser(dateParam);
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        jSpinnerParam = new javax.swing.JSpinner(sm);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonExecuteSearch = new javax.swing.JButton();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelAbout = new javax.swing.JPanel();
        jScrollPanelPdfViewer = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Predictor PP");
        setResizable(false);

        jPanelHead.setBackground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Prototype Program");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("This program is only for example, contains core Java and Architecture client-server with Spring Framework");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Predictor Pico-Placa");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Valid for Ecuador Country");

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanelMenu.setLayout(new java.awt.BorderLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jToolBar1.setRollover(true);

        jButtonMenuBuscar.setText("Dashboard");
        jButtonMenuBuscar.setFocusable(false);
        jButtonMenuBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMenuBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonMenuBuscar);

        jButtonAbout.setText("About");
        jButtonAbout.setFocusable(false);
        jButtonAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAbout);

        jPanelMenu.add(jToolBar1, java.awt.BorderLayout.CENTER);

        jPanelDetail.setLayout(new java.awt.CardLayout());

        jPanelDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanelDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelDashboard.setPreferredSize(new java.awt.Dimension(426, 331));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinnerParam,"HH:mm:ss");
        jSpinnerParam.setEditor(de);

        jLabel4.setText("Placa:");

        jLabel5.setText("Fecha:");

        jLabel6.setText("Hora:");

        jButtonExecuteSearch.setText("Buscar");
        jButtonExecuteSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonExecuteSearch.setBorderPainted(false);
        jButtonExecuteSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecuteSearchActionPerformed(evt);
            }
        });

        jTextFieldPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaActionPerformed(evt);
            }
        });
        jTextFieldPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPlacaKeyPressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ejm:PCD402 or PCD4003");

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4))
                            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonExecuteSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinnerParam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooserParam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jTextFieldPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 406, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExecuteSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jPanelDetail.add(jPanelDashboard, "card2");

        try{
            URL location = new URL("http://www.mobilpymes.com/CV_WilliamHuera.pdf");
            this.openPdf(location);}
        catch(Exception ex){
            ex.getMessage();
        }
        //this.openPdf("CV_WilliamHuera.pdf");
        //setExtendedState(MAXIMIZED_BOTH);

        javax.swing.GroupLayout jPanelAboutLayout = new javax.swing.GroupLayout(jPanelAbout);
        jPanelAbout.setLayout(jPanelAboutLayout);
        jPanelAboutLayout.setHorizontalGroup(
            jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanelPdfViewer, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
        );
        jPanelAboutLayout.setVerticalGroup(
            jPanelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanelPdfViewer, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        jPanelDetail.add(jPanelAbout, "card3");

        javax.swing.GroupLayout jPanelMasterLayout = new javax.swing.GroupLayout(jPanelMaster);
        jPanelMaster.setLayout(jPanelMasterLayout);
        jPanelMasterLayout.setHorizontalGroup(
            jPanelMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMasterLayout.setVerticalGroup(
            jPanelMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMasterLayout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(jPanelMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMasterLayout.createSequentialGroup()
                    .addGap(0, 144, Short.MAX_VALUE)
                    .addComponent(jPanelDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * J button 2 action performed.
     *
     * @param evt the evt
     */
    private void jButtonExecuteSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecuteSearchActionPerformed
      try{
      this.executeProcess();
      }catch(Exception ex){
          ex.getMessage();
      }
      finally{
          jTextFieldPlaca.setText(null);
      }
    }//GEN-LAST:event_jButtonExecuteSearchActionPerformed

    /**
     * J button about action performed.
     *
     * @param evt the evt
     */
    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutActionPerformed
//        showMessageDialog(null, "About programmer: William Huera send email to whuera@gmail.com");
        jPanelDetail.removeAll();
        jPanelDetail.repaint();
        jPanelDetail.revalidate();
        jPanelDetail.add(jPanelAbout);
        jPanelDetail.repaint();
        jPanelDetail.revalidate();
        
        
    }//GEN-LAST:event_jButtonAboutActionPerformed

    /**
     * J button menu buscar action performed.
     *
     * @param evt the evt
     */
    private void jButtonMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBuscarActionPerformed
        // TODO add your handling code here:
        //this.executeProcess();
         jPanelDetail.removeAll();
        jPanelDetail.repaint();
        jPanelDetail.revalidate();
        jPanelDetail.add(jPanelDashboard);
        jPanelDetail.repaint();
        jPanelDetail.revalidate();
        jTextFieldPlaca.requestFocus();
    }//GEN-LAST:event_jButtonMenuBuscarActionPerformed

    private void jTextFieldPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPlacaKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldPlacaKeyPressed

    private void jTextFieldPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlacaActionPerformed

    /**
     * Execute process.
     */
    public void executeProcess(){       
        String input = jTextFieldPlaca.getText().replace(" ", "").trim();
         if (!jTextFieldPlaca.getText().isEmpty() && input.length()>=6){                         
            Calendar dateInput = jDateChooserParam.getCalendar();
            ServicePredictorPicoPlaca bussinesRule = new ServicePredictorPicoPlaca();
            PicoPlacaForm picoPlacaForm = new PicoPlacaForm();
            picoPlacaForm.setDateQuestion(dateInput);
            picoPlacaForm.setNumber(jTextFieldPlaca.getText().replace(" ",""));
            DateFormat df = new SimpleDateFormat("HH:mm");
            Date today = (Date) jSpinnerParam.getValue();
            String reportDate = df.format(today);
            picoPlacaForm.setParamTime(reportDate);
            try {
                String remoteMessage = bussinesRule.dayEnabled(picoPlacaForm);
                showMessageDialog(null, remoteMessage);
            } catch (SAXException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                jTextFieldPlaca.setText("");
                jTextFieldPlaca.requestFocus();
            }
        }else{
            showMessageDialog(null, "Revise los parametros de ingreso");
            jTextFieldPlaca.requestFocus();
        }
    }
    
    /**
     * Open pdf.
     *
     * @param location the location
     */
    public void openPdf(URL location){
        SwingController control = new SwingController();
        SwingViewBuilder factory = new SwingViewBuilder(control);
        JPanel viewerComponent = factory.buildViewerPanel();
        ComponentKeyBinding.install(control, viewerComponent);
        control.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                        control.getDocumentViewController()));
        control.openDocument(location);
        jScrollPanelPdfViewer.setViewportView(viewerComponent);
 
    }
    
    /**
     * The main method.
     *
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    /** The j button 2. */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonExecuteSearch;
    private javax.swing.JButton jButtonMenuBuscar;
    private com.toedter.calendar.JDateChooser jDateChooserParam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelAbout;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelDetail;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JPanel jPanelMaster;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JScrollPane jScrollPanelPdfViewer;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerParam;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
