package miVentana;
import archivos.colas.Cola;
import archivos.pilas.Pila;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mis.clases.ClienteCorporativo;
import mis.clases.Comprobante;
import mis.clases.Fecha;
import miGestion.GestionMensajeria;

public class MiFormulario extends javax.swing.JFrame {
    Pila pilaux=new Pila();
    Cola cola = new Cola();     
    GestionMensajeria ColaGM=new GestionMensajeria();
    DefaultTableModel modeloComprobantes,modeloClientes;
    
    Comprobante c1;
    public MiFormulario() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TextNombre = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        TextTipo = new javax.swing.JLabel();
        TextMonto = new javax.swing.JLabel();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        FieldMonto = new javax.swing.JTextField();
        BotonApilar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxCiudadOrigen = new javax.swing.JComboBox<>();
        ComboBoxCiudadDestino = new javax.swing.JComboBox<>();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        BotonEncolar = new javax.swing.JButton();
        FieldRUC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BotonMostrar = new javax.swing.JButton();
        BotonMonto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaComprobantes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxClientews = new javax.swing.JComboBox<>();
        BotonBuscar = new javax.swing.JButton();
        BotonFechas = new javax.swing.JButton();
        Elige = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVICIO DE CURRIER");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SERVICIO DE CURRIER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE CORPORATIVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12))); // NOI18N

        TextNombre.setText("Nombre: ");

        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        TextTipo.setText("Tipo:");

        TextMonto.setText("Monto:");

        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giro", "Encomienda" }));
        ComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoActionPerformed(evt);
            }
        });

        FieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMontoActionPerformed(evt);
            }
        });

        BotonApilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apilar2.png"))); // NOI18N
        BotonApilar.setText("Apilar Comprobantes");
        BotonApilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonApilarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ciudad Destino:");

        jLabel2.setText("Ciudad Origen:");

        ComboBoxCiudadOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad 1", "Ciudad 2", "Ciudad 3", "Ciudad 4" }));
        ComboBoxCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCiudadOrigenActionPerformed(evt);
            }
        });

        ComboBoxCiudadDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad 1", "Ciudad 2", "Ciudad 3", "Ciudad 4", " " }));

        jLabel3.setText("Fecha de Emisión");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonApilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TextTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(TextMonto)
                                .addGap(40, 40, 40)
                                .addComponent(FieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextMonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonApilar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonEncolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ColaClientes.jpg"))); // NOI18N
        BotonEncolar.setText("Encolar Clientes");
        BotonEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEncolarActionPerformed(evt);
            }
        });

        jLabel4.setText("RUC :");

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextNombre)
                                .addComponent(jLabel4))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(FieldRUC, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(FieldNombre)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEncolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BotonSalir))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNombre)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEncolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        BotonMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cliente2.jpg"))); // NOI18N
        BotonMostrar.setText("Mostrar Clientes en Cola");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        BotonMonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/billetes2.png"))); // NOI18N
        BotonMonto.setText("Monto de Recaudación por Giros y Encomiendas");
        BotonMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMontoActionPerformed(evt);
            }
        });

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaClientes);

        TablaComprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaComprobantes);

        jLabel5.setText("Comprobantes del Cliente : ");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonFechas.setText("Monto de Recaudación por Fechas ");
        BotonFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFechasActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccionar Fecha ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(ComboBoxClientews, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotonBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elige, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonFechas))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(BotonMostrar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonMonto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboBoxClientews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(BotonMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonMonto)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Elige, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(224, 224, 224))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMontoActionPerformed

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void BotonApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApilarActionPerformed
        //Apilar Comprobante
        String tipo= this.ComboBoxTipo.getSelectedItem().toString();
        double monto=Double.parseDouble(this.FieldMonto.getText());
        String CiudadOrigen=this.ComboBoxCiudadOrigen.getSelectedItem().toString();
        String CiudadDestino=this.ComboBoxCiudadDestino.getSelectedItem().toString();
        int dia=this.DateChooser.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes=this.DateChooser.getCalendar().get((Calendar.MONTH));
        int year=this.DateChooser.getCalendar().get(Calendar.YEAR);
        
        Fecha actual=new Fecha(dia,mes,year);
        c1=new Comprobante(tipo,CiudadOrigen,CiudadDestino,actual,monto);
        //Se apilan Comprobantes en Pilaux
        pilaux.apilar(c1); 
        this.ComboBoxTipo.setSelectedIndex(0);
        this.ComboBoxCiudadDestino.setSelectedIndex(0);
        this.ComboBoxCiudadOrigen.setSelectedIndex(0);
        this.FieldMonto.setText(null);
         this.DateChooser.setCalendar(null);
          
    }//GEN-LAST:event_BotonApilarActionPerformed

    private void BotonEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEncolarActionPerformed
        String nombre="";
        nombre=this.FieldNombre.getText();
        this.ComboBoxClientews.addItem(nombre);
        String RUC="";
        RUC=this.FieldRUC.getText();     
        ClienteCorporativo oCliente=new ClienteCorporativo(nombre,RUC);
        int n=0;
         while(!pilaux.estaVacia()){ 
        oCliente.apilarComprobantes(pilaux.desapilar());
        n++;
         }         
        ColaGM.EncolarCliente(oCliente);             
        this.FieldNombre.setText(null);
        this.FieldRUC.setText(null);   
       
        
    }//GEN-LAST:event_BotonEncolarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void ComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoActionPerformed

    private void ComboBoxCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCiudadOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCiudadOrigenActionPerformed

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
         // Imprimir segun el cliente            
        String []cabecera={"RUC","Razón social","N° Comprobantes"};
        modeloClientes=new DefaultTableModel(null, cabecera);     
        
        while(!ColaGM.getClientesCorp().estaVacia()){   
            int n=1;
            ClienteCorporativo cliente = ColaGM.getClientesCorp().desencolar();
            cola.encolar(cliente);            
            String ruc = cliente.getRUC();
            String razon = cliente.getRazonSocialCliente();           
            n=cliente.cantidaddePilasValidas();
            modeloClientes.addRow(new String[]{String.valueOf(ruc),razon,String.valueOf(n)});
        }
        while(!cola.estaVacia()){
            ColaGM.EncolarCliente(cola.desencolar());
        }
        TablaClientes.setModel(modeloClientes);


    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void BotonMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMontoActionPerformed
            JOptionPane.showMessageDialog(null, ColaGM.Calcular());

    }//GEN-LAST:event_BotonMontoActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        String buscado=this.ComboBoxClientews.getSelectedItem().toString();
        Cola aux = new Cola();
        boolean estado=false;
        ClienteCorporativo Buscado = null;
        while(!ColaGM.getClientesCorp().estaVacia() || estado==false)
        {
            ClienteCorporativo x=ColaGM.getClientesCorp().desencolar();
            aux.encolar(x);
            if(x.getRazonSocialCliente().equals(buscado))
            {
                Buscado= x;
                estado=true;
            }
        }
        while(!aux.estaVacia())
        {
            ClienteCorporativo oCliente=aux.desencolar();
            ColaGM.getClientesCorp().encolar(oCliente);
        }
        Pila aux1=new Pila();
        Pila aux2=new Pila();
        if(Buscado.getListaComprobantes().estaVacia()){
            System.out.print("Nada");
        }
        else{
            while(!Buscado.getListaComprobantes().estaVacia()){
            aux1.apilar(Buscado.getListaComprobantes().desapilar());            
            }
            while(!aux1.estaVacia()){
            Comprobante x=aux1.desapilar();
            Buscado.getListaComprobantes().apilar(x);
            aux2.apilar(x);
            }
        }
        
        String []cabecera={"Tipo","Monto","Fecha","Origen","Destino"};
        modeloComprobantes=new DefaultTableModel(null, cabecera);
        while(!aux2.estaVacia()){
            Comprobante p=aux2.desapilar();
            String tipo=p.getTipo();
            int monto= (int) p.getMonto();
            String fecha=p.getFechaEmision().mostrar();
            String Origen= p.getCiudadOrigen();
            String Destino= p.getCiudadDestino();
            modeloComprobantes.addRow(new String[]{tipo,String.valueOf(monto),fecha, Origen,Destino});          
        }
        TablaComprobantes.setModel(modeloComprobantes);
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFechasActionPerformed
        // TODO add your handling code here:
        int dia=this.Elige.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes=this.Elige.getCalendar().get(Calendar.MONTH);
        int year=this.Elige.getCalendar().get(Calendar.YEAR);
        Fecha actual=new Fecha(dia,mes,year);
        String mensaje=actual.mostrar()+":"+ColaGM.CalcFecha(actual);
        JOptionPane.showMessageDialog(null, mensaje);
    }//GEN-LAST:event_BotonFechasActionPerformed

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
            java.util.logging.Logger.getLogger(MiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonApilar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEncolar;
    private javax.swing.JButton BotonFechas;
    private javax.swing.JButton BotonMonto;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboBoxCiudadDestino;
    private javax.swing.JComboBox<String> ComboBoxCiudadOrigen;
    private javax.swing.JComboBox<String> ComboBoxClientews;
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private com.toedter.calendar.JDateChooser DateChooser;
    private com.toedter.calendar.JDateChooser Elige;
    private javax.swing.JTextField FieldMonto;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldRUC;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaComprobantes;
    private javax.swing.JLabel TextMonto;
    private javax.swing.JLabel TextNombre;
    private javax.swing.JLabel TextTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
