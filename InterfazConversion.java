package conv.conversor;

import javax.swing.JOptionPane;

public class InterfazConversion extends javax.swing.JFrame {        
    
    /**
     * @autor Brandon Osorio.
     * Oracle Next Education G5.
     */
    
    public InterfazConversion() {
        initComponents();       
        this.setLocationRelativeTo(null);
    }   
    
    private double dolar = 0.059;
    private double euro = 0.054;
    private double libras = 0.046;
    private double yen = 8.35;
    private double won = 76.29;
    private double pesoCol = 234.991;
    private double dolCanada = 0.079;
    private double pesoArg = 16.27;
    private double soles = 0.21;    
    
    private void ConversionMxToMon(double conversion, double cantidadIngresada, double moneda){
        conversion = cantidadIngresada*moneda;
        conversion = Math.round(conversion*100.0)/100.0;
        ResultadoConversion.setText(Double.toString(conversion));
    }
    
    private void ConversionMonToMx(double conversion, double cantidadIngresada, double moneda){
        conversion = cantidadIngresada/moneda;
        conversion = Math.round(conversion*100.0)/100.0;
        ResultadoConversion.setText(Double.toString(conversion));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ResultadoConversion = new java.awt.TextField();
        IngresarCantidad1 = new java.awt.TextField();
        TxtRes = new javax.swing.JLabel();
        TxtConv1 = new javax.swing.JLabel();
        SelectorConversor = new javax.swing.JComboBox<>();
        BotonConversion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelFondo.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setBackground(new java.awt.Color(204, 204, 255));
        Titulo.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Conversor de Monedas");

        ResultadoConversion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ResultadoConversion.setEditable(false);
        ResultadoConversion.setEnabled(false);
        ResultadoConversion.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        ResultadoConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoConversionActionPerformed(evt);
            }
        });

        IngresarCantidad1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IngresarCantidad1.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        IngresarCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarCantidad1ActionPerformed(evt);
            }
        });

        TxtRes.setBackground(new java.awt.Color(204, 204, 255));
        TxtRes.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        TxtRes.setForeground(new java.awt.Color(0, 0, 0));
        TxtRes.setText("Resultado de conversión:");

        TxtConv1.setBackground(new java.awt.Color(204, 204, 255));
        TxtConv1.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        TxtConv1.setForeground(new java.awt.Color(0, 0, 0));
        TxtConv1.setText("Ingresa la cantidad a convertir:");

        SelectorConversor.setBackground(new java.awt.Color(255, 255, 255));
        SelectorConversor.setFont(new java.awt.Font("Elephant", 0, 16)); // NOI18N
        SelectorConversor.setForeground(new java.awt.Color(0, 0, 0));
        SelectorConversor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Peso Mexicano a Dólar", "De Peso Mexicano a Euro", "De Peso Mexicano a Libras",
            "De Peso Mexicano a Yen", "De Peso Mexicano a Won Coreano", "De Peso Mexicano a Peso Colombiano", "De Peso Mexicano a Dólar Canadiense", "De Peso Mexicano a Peso Argentino",
            "De Peso Mexicano a Soles","De Dólar a Peso Mexicano", "De Euro a Peso Mexicano", "De Libras a Peso Mexicano", "De Yen a Peso Mexicano", "De Won Coreano a Peso Mexicano",
            "De Peso Colombiano a Peso Mexicano", "De Dólar Canadiense a Peso Mexicano", "De Peso Argentino a Peso Mexicano", "De Soles a Peso Mexicano"}));
SelectorConversor.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        SelectorConversorActionPerformed(evt);
    }
    });

    BotonConversion.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
    BotonConversion.setText("Convertir");
    BotonConversion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BotonConversionActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
    PanelFondo.setLayout(PanelFondoLayout);
    PanelFondoLayout.setHorizontalGroup(
        PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanelFondoLayout.createSequentialGroup()
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtConv1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IngresarCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResultadoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelFondoLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(TxtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotonConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addGap(179, 179, 179)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(SelectorConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(100, Short.MAX_VALUE))
    );
    PanelFondoLayout.setVerticalGroup(
        PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanelFondoLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35)
            .addComponent(SelectorConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
            .addComponent(TxtConv1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(IngresarCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFondoLayout.createSequentialGroup()
                    .addComponent(BotonConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                    .addComponent(TxtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addComponent(ResultadoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(43, 43, 43))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 644, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 414, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadoConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoConversionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoConversionActionPerformed

    private void IngresarCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarCantidad1ActionPerformed

    private void SelectorConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorConversorActionPerformed
        
    }//GEN-LAST:event_SelectorConversorActionPerformed

    private void BotonConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConversionActionPerformed
        String contenidoTxtField = IngresarCantidad1.getText();
        String seleccionConversion = (String) SelectorConversor.getSelectedItem();
        double cantidadIngresada = 0;        
        
        try {
            cantidadIngresada =  Double.parseDouble(contenidoTxtField);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor no válido, "
                    + "solo se permiten caracteres númericos."); 
            dispose();
            InterfazConversion interfaz = new InterfazConversion();
            interfaz.setVisible(true);
        }                   

        double conversion = 0;
        
        switch(seleccionConversion){
            case "De Peso Mexicano a Dólar" -> {
                ConversionMxToMon(conversion, cantidadIngresada, dolar);
            }
            case "De Dólar a Peso Mexicano" -> {
                ConversionMonToMx(conversion, cantidadIngresada, dolar);
            }
            case "De Peso Mexicano a Euro" ->{
                ConversionMxToMon(conversion, cantidadIngresada, euro);
            }
            case "De Euro a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, euro);
            }
            case "De Peso Mexicano a Libras" ->{
                ConversionMxToMon(conversion, cantidadIngresada, libras);
            }
            case "De Libras a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, libras);
            }
            case "De Peso Mexicano a Yen" ->{
                ConversionMxToMon(conversion, cantidadIngresada, yen);
            }
            case "De Yen a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, yen);
            }
            case "De Peso Mexicano a Won Coreano" ->{
                ConversionMxToMon(conversion, cantidadIngresada, won);
            }
            case "De Won Coreano a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, won);
            }
            case "De Peso Mexicano a Peso Colombiano" ->{
                ConversionMxToMon(conversion, cantidadIngresada, pesoCol);
            }
            case "De Peso Colombiano a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, pesoCol);
            }
            case "De Peso Mexicano a Dólar Canadiense" ->{
                ConversionMxToMon(conversion, cantidadIngresada, dolCanada);
            }
            case "De Dólar Canadiense a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, dolCanada);
            }
            case "De Peso Mexicano a Peso Argentino" ->{
                ConversionMxToMon(conversion, cantidadIngresada, pesoArg);
            }
            case "De Peso Argentino a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, pesoArg);
            }
            case "De Peso Mexicano a Soles" ->{
                ConversionMxToMon(conversion, cantidadIngresada, soles);
            }
            case "De Soles a Peso Mexicano" ->{
                ConversionMonToMx(conversion, cantidadIngresada, soles);
            }
            
            default -> JOptionPane.showMessageDialog(this,"Selección invalida.");
        }                     
    }//GEN-LAST:event_BotonConversionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(this,"Gracias por "
                + "usar mi conversor de monedas !");
    }//GEN-LAST:event_formWindowClosing

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazConversion().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConversion;
    private java.awt.TextField IngresarCantidad1;
    private javax.swing.JPanel PanelFondo;
    private java.awt.TextField ResultadoConversion;
    private javax.swing.JComboBox<String> SelectorConversor;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TxtConv1;
    private javax.swing.JLabel TxtRes;
    // End of variables declaration//GEN-END:variables
}
