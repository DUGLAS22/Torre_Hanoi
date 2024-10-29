/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STE
 */


import javafx.scene.layout.Pane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
public class VentanaPrincipal extends javax.swing.JFrame {

    int contNumMov = 0;
    Pila pilaTorreA;
    Pila pilaTorreB;
    Pila pilaTorreC;
    
    DefaultTableModel ModeloTablaTorreA, ModeloTablaTorreB, ModeloTablaTorreC;
    
    int objetivo = 0;
    double NumMinMov = 0;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //casteo
        ModeloTablaTorreA = (DefaultTableModel) torreA.getModel();
        ModeloTablaTorreA.setRowCount(10);
        
        ModeloTablaTorreB = (DefaultTableModel) torreB.getModel();
        ModeloTablaTorreB.setRowCount(10);
        
        ModeloTablaTorreC = (DefaultTableModel) torreC.getModel();
        ModeloTablaTorreC.setRowCount(10);
        
        DefaultTableCellRenderer renderTorreA = new DefaultTableCellRenderer();
        renderTorreA.setHorizontalAlignment(SwingConstants.CENTER);
        torreA.getColumnModel().getColumn(0).setCellRenderer( renderTorreA);
        
        DefaultTableCellRenderer renderTorreB = new DefaultTableCellRenderer();
        renderTorreB.setHorizontalAlignment(SwingConstants.CENTER);
        torreB.getColumnModel().getColumn(0).setCellRenderer( renderTorreB);
        
        DefaultTableCellRenderer renderTorreC = new DefaultTableCellRenderer();
        renderTorreC.setHorizontalAlignment(SwingConstants.CENTER);
        torreC.getColumnModel().getColumn(0).setCellRenderer(renderTorreC);
    }
    
        private void Limpiar(){
            contNumMov = 0;
            NumMinMov = 0;
            cbnumDiscos.setSelectedItem(String.valueOf(objetivo));
        }
        private void salir(){
            this.dispose();
        }
        
        private void PresentarCantMov(){
            contNumMov++;
            lblnumMov.setText(String.valueOf(contNumMov));
        }
        private void Reiniciar(){
            try{
               if(!lblminMov.getText().equals("")){
                   Limpiar();
                   iniciar();
               } 
            }catch(Exception E){
                System.out.println("ERROR: "+ E.getMessage());
            }
        }
        private void iniciar(){
            try{
        pilaTorreA = new Pila();
        pilaTorreB = new Pila();
        pilaTorreC = new Pila();
        
        objetivo = Integer.parseInt(cbnumDiscos.getSelectedItem().toString());
        NumMinMov = Math.pow(2,objetivo)-1;
        lblnumMov.setText(String.valueOf(contNumMov));
        lblminMov.setText(String.valueOf(String.format("%.0f", NumMinMov)));
        
        for(int x = objetivo; x >= 1; x--){
            Nodo Plataforma = new Nodo();
            
            String Disco ="";
            for(int y = x; y > 0; y--){
                Disco+= "*";
            }
            Plataforma.setDato(Disco);
            pilaTorreA.Push(Plataforma);
        }
        PresentarTorreA();
        PresentarTorreB();
        PresentarTorreC();
            }catch(Exception E){
                System.out.println("ERROR: "+ E.getMessage());
            }
        }
        
        private void PresentarTorreA(){
            ((DefaultTableModel)torreA.getModel()).setRowCount(0);
            ModeloTablaTorreA.setRowCount(10);
            Nodo k;
            int RowDisco = (10- pilaTorreA.getContNodo());
            if(pilaTorreA.getContNodo()>0){
                for(k = pilaTorreA.getCabeza();k.getAbajo()!= null; k = k.getAbajo()){
                    String[] Vector ={k.getDato()};
                    ModeloTablaTorreA.insertRow(RowDisco, Vector);
                    RowDisco++;
                }
                if(k.getAbajo()== null){
                    String[] Vector ={k.getDato()};
                    ModeloTablaTorreA.insertRow(RowDisco, Vector);
                }
            }
            torreA.setModel(ModeloTablaTorreA);
            ModeloTablaTorreA.setRowCount(10);
            
            
        }
         private void PresentarTorreB(){
            ((DefaultTableModel)torreB.getModel()).setRowCount(0);
            ModeloTablaTorreB.setRowCount(10);
            Nodo k;
            int RowDisco = (10- pilaTorreB.getContNodo());
            if(pilaTorreB.getContNodo()>0){
                for(k = pilaTorreB.getCabeza();k.getAbajo()!= null; k = k.getAbajo()){
                    String[] Vector ={k.getDato()};
                    ModeloTablaTorreB.insertRow(RowDisco, Vector);
                    RowDisco++;
                }
                if(k.getAbajo()== null){
                    String[] Vector ={k.getDato()};
                    ModeloTablaTorreB.insertRow(RowDisco, Vector);
                }
            }
            torreB.setModel(ModeloTablaTorreB);
            ModeloTablaTorreB.setRowCount(10);
            
            
        }
    
          private void PresentarTorreC(){
            ((DefaultTableModel)torreC.getModel()).setRowCount(0);
            ModeloTablaTorreC.setRowCount(10);
            Nodo k;
            int RowDisco = (10- pilaTorreC.getContNodo());
            if(pilaTorreC.getContNodo()>0){
                for(k = pilaTorreC.getCabeza();k.getAbajo()!= null; k = k.getAbajo()){
                    String[] Vector ={k.getDato()};
                    ModeloTablaTorreC.insertRow(RowDisco, Vector);
                    RowDisco++;
                }
                if(k.getAbajo()== null){
                    String[] Vector ={k.getDato()};
                    ModeloTablaTorreC.insertRow(RowDisco, Vector);
                }
            }
            torreC.setModel(ModeloTablaTorreC);
            ModeloTablaTorreC.setRowCount(10);
            
            
        } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        torreB = new javax.swing.JTable();
        btnmoverA_B = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        torreA = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        torreC = new javax.swing.JTable();
        btnmoverA_C = new javax.swing.JButton();
        btnmoverB_C = new javax.swing.JButton();
        btnmoverB_A = new javax.swing.JButton();
        btnmoverC_B = new javax.swing.JButton();
        btnmoverC_A = new javax.swing.JButton();
        cbnumDiscos = new javax.swing.JComboBox<>();
        lblnumMov = new javax.swing.JLabel();
        lblminMov = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnreiniciar = new javax.swing.JButton();
        btniniciar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        torreB.setBackground(new java.awt.Color(153, 255, 153));
        torreB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        torreB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        torreB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TORRE B"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        torreB.setAutoscrolls(false);
        torreB.setFocusable(false);
        torreB.setRowSelectionAllowed(false);
        torreB.setShowHorizontalLines(false);
        torreB.setShowVerticalLines(false);
        jScrollPane3.setViewportView(torreB);
        if (torreB.getColumnModel().getColumnCount() > 0) {
            torreB.getColumnModel().getColumn(0).setResizable(false);
        }

        btnmoverA_B.setBackground(new java.awt.Color(153, 255, 255));
        btnmoverA_B.setForeground(new java.awt.Color(0, 0, 204));
        btnmoverA_B.setText("Mover a B");
        btnmoverA_B.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnmoverA_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverA_BActionPerformed(evt);
            }
        });

        torreA.setBackground(new java.awt.Color(153, 255, 153));
        torreA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        torreA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        torreA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TORRE A"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        torreA.setAutoscrolls(false);
        torreA.setFocusable(false);
        torreA.setRowSelectionAllowed(false);
        torreA.setShowHorizontalLines(false);
        torreA.setShowVerticalLines(false);
        jScrollPane4.setViewportView(torreA);
        if (torreA.getColumnModel().getColumnCount() > 0) {
            torreA.getColumnModel().getColumn(0).setResizable(false);
        }

        torreC.setBackground(new java.awt.Color(153, 255, 153));
        torreC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        torreC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        torreC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TORRE C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        torreC.setAutoscrolls(false);
        torreC.setFocusable(false);
        torreC.setGridColor(new java.awt.Color(255, 204, 102));
        torreC.setRowSelectionAllowed(false);
        torreC.setShowHorizontalLines(false);
        torreC.setShowVerticalLines(false);
        jScrollPane5.setViewportView(torreC);
        if (torreC.getColumnModel().getColumnCount() > 0) {
            torreC.getColumnModel().getColumn(0).setResizable(false);
        }

        btnmoverA_C.setBackground(new java.awt.Color(153, 255, 255));
        btnmoverA_C.setForeground(new java.awt.Color(0, 0, 204));
        btnmoverA_C.setText("Mover a C");
        btnmoverA_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverA_CActionPerformed(evt);
            }
        });

        btnmoverB_C.setBackground(new java.awt.Color(153, 255, 255));
        btnmoverB_C.setForeground(new java.awt.Color(0, 51, 204));
        btnmoverB_C.setText("Mover a C");
        btnmoverB_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverB_CActionPerformed(evt);
            }
        });

        btnmoverB_A.setBackground(new java.awt.Color(153, 255, 255));
        btnmoverB_A.setForeground(new java.awt.Color(0, 0, 204));
        btnmoverB_A.setText("Mover a A");
        btnmoverB_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverB_AActionPerformed(evt);
            }
        });

        btnmoverC_B.setBackground(new java.awt.Color(153, 255, 255));
        btnmoverC_B.setForeground(new java.awt.Color(0, 51, 204));
        btnmoverC_B.setText("Mover a B");
        btnmoverC_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverC_BActionPerformed(evt);
            }
        });

        btnmoverC_A.setBackground(new java.awt.Color(153, 255, 255));
        btnmoverC_A.setForeground(new java.awt.Color(0, 51, 204));
        btnmoverC_A.setText("Mover a A");
        btnmoverC_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverC_AActionPerformed(evt);
            }
        });

        cbnumDiscos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbnumDiscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnumDiscosActionPerformed(evt);
            }
        });

        lblnumMov.setBackground(new java.awt.Color(255, 255, 255));
        lblnumMov.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumMov.setForeground(new java.awt.Color(0, 51, 204));
        lblnumMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumMov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblnumMov.setFocusable(false);

        lblminMov.setBackground(new java.awt.Color(255, 255, 255));
        lblminMov.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblminMov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminMov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblminMov.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Numero de discos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Numero de movimientos min");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Numero de movimientos");

        btnreiniciar.setBackground(new java.awt.Color(255, 255, 153));
        btnreiniciar.setText("Reiniciar");
        btnreiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreiniciarActionPerformed(evt);
            }
        });

        btniniciar.setBackground(new java.awt.Color(51, 255, 0));
        btniniciar.setText("Iniciar");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 102, 102));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblminMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbnumDiscos, 0, 153, Short.MAX_VALUE)
                            .addComponent(lblnumMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnreiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmoverA_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmoverA_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmoverB_C)
                            .addComponent(btnmoverB_A))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmoverC_B)
                            .addComponent(btnmoverC_A)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmoverA_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmoverB_A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmoverB_C)
                            .addComponent(btnmoverA_C))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbnumDiscos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblminMov, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblnumMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmoverC_A, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmoverC_B)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreiniciar)
                    .addComponent(btnsalir))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(419, Short.MAX_VALUE)
                    .addComponent(btniniciar)
                    .addGap(19, 19, 19)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void moverDeA_C(){
            try{
            if(pilaTorreA.getContNodo() > 0){
                Nodo l = new Nodo();
                l.setDato(pilaTorreA.Peek());
                
                if(pilaTorreC.getContNodo() > 0){
                    if(l.getDato().compareTo(pilaTorreC.Peek()) > 0){
                        return;
                    }
                }
               pilaTorreA.Pop();
               pilaTorreC.Push(l);
               PresentarTorreA();
               PresentarTorreC();
               PresentarCantMov();
               
               if( pilaTorreC.getContNodo()==objetivo && contNumMov == NumMinMov ){
                   JOptionPane.showMessageDialog(null, "FELICIDADES HAS ALCANZADO EL OBJETIVO MINIMO DE MOVIMIENTO\n\n INTENTA CON OTRO NIVEL DE DIFICULTAD", "FELICITACIONES", JOptionPane.WARNING_MESSAGE);
                  
               }else if(pilaTorreC.getContNodo()== objetivo && contNumMov != NumMinMov){
                JOptionPane.showMessageDialog(null, "FELICIDADES LO HAZ RESUELTO\n\n INTENTA SUPERAR EL OBJETIVO MINIMO DE MOVIMIENTO", "FELICITACIONES", JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }   
    }
    private void btnmoverA_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverA_CActionPerformed
        moverDeA_C();
    }//GEN-LAST:event_btnmoverA_CActionPerformed
    private void moverDeB_C(){
        try{
            if(pilaTorreB.getContNodo() > 0){
                Nodo l = new Nodo();
                l.setDato(pilaTorreB.Peek());
                
                if(pilaTorreC.getContNodo() > 0){
                    if(l.getDato().compareTo(pilaTorreC.Peek()) > 0){
                        return;
                    }
                }
               pilaTorreB.Pop();
               pilaTorreC.Push(l);
               PresentarTorreB();
               PresentarTorreC();
               PresentarCantMov();
               
               if( pilaTorreC.getContNodo()==objetivo && contNumMov == NumMinMov ){
                   JOptionPane.showMessageDialog(null, "FELICIDADES HAS ALCANZADO EL OBJETIVO MINIMO DE MOVIMIENTO\n\n INTENTA CON OTRO NIVEL DE DIFICULTAD", "FELICITACIONES", JOptionPane.WARNING_MESSAGE);
                  
               }else if(pilaTorreC.getContNodo()== objetivo && contNumMov != NumMinMov){
                JOptionPane.showMessageDialog(null, "FELICIDADES LO HAZ RESUELTO\n\n INTENTA SUPERAR EL OBJETIVO MINIMO DE MOVIMIENTO", "FELICITACIONES", JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }   
    }
    private void btnmoverB_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverB_CActionPerformed
        moverDeB_C();
    }//GEN-LAST:event_btnmoverB_CActionPerformed
        private void moverDeC_B(){
            try{
            if(pilaTorreC.getContNodo() > 0){
                Nodo l = new Nodo();
                l.setDato(pilaTorreC.Peek());
                
                if(pilaTorreB.getContNodo() > 0){
                    if(l.getDato().compareTo(pilaTorreB.Peek()) > 0){
                        return;
                    }
                }
               pilaTorreC.Pop();
               pilaTorreB.Push(l);
               PresentarTorreC();
               PresentarTorreB();
               PresentarCantMov();
            }
        }catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }
        }
    private void btnmoverC_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverC_BActionPerformed
        moverDeC_B();
    }//GEN-LAST:event_btnmoverC_BActionPerformed

    private void cbnumDiscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnumDiscosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnumDiscosActionPerformed

    private void btnreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreiniciarActionPerformed
   
        Reiniciar();
    }//GEN-LAST:event_btnreiniciarActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        contNumMov = 0;
        iniciar();
       
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        
        salir();
    }//GEN-LAST:event_btnsalirActionPerformed
    private void moverDeA_B(){
        try{
            if(pilaTorreA.getContNodo() > 0){
                Nodo l = new Nodo();
                l.setDato(pilaTorreA.Peek());
                
                if(pilaTorreB.getContNodo() > 0){
                    if(l.getDato().compareTo(pilaTorreB.Peek()) > 0){
                        return;
                    }
                }
               pilaTorreA.Pop();
               pilaTorreB.Push(l);
               PresentarTorreA();
               PresentarTorreB();
               PresentarCantMov();
            }
        }catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }
    }
    private void btnmoverA_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverA_BActionPerformed
        moverDeA_B();
    }//GEN-LAST:event_btnmoverA_BActionPerformed
        private void moverDeB_A(){
          try{
            if(pilaTorreB.getContNodo() > 0){
                Nodo l = new Nodo();
                l.setDato(pilaTorreB.Peek());
                
                if(pilaTorreA.getContNodo() > 0){
                    if(l.getDato().compareTo(pilaTorreA.Peek()) > 0){
                        return;
                    }
                }
               pilaTorreB.Pop();
               pilaTorreA.Push(l);
               PresentarTorreA();
               PresentarTorreB();
               PresentarCantMov();
            }
        }catch(Exception E){
            System.out.println("ERROR:"+E.getMessage());
        }   
        }
    private void btnmoverB_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverB_AActionPerformed

        moverDeB_A();
    }//GEN-LAST:event_btnmoverB_AActionPerformed
        private void moverDeC_A(){
          try{
            if(pilaTorreC.getContNodo() > 0){
                Nodo l = new Nodo();
                l.setDato(pilaTorreC.Peek());
                
                if(pilaTorreA.getContNodo() > 0){
                    if(l.getDato().compareTo(pilaTorreA.Peek()) > 0){
                        return;
                    }
                }
               pilaTorreC.Pop();
               pilaTorreA.Push(l);
               PresentarTorreA();
               PresentarTorreC();
               PresentarCantMov();
            }
        }catch(Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }   
        }
    private void btnmoverC_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverC_AActionPerformed

        moverDeC_A();
    }//GEN-LAST:event_btnmoverC_AActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnmoverA_B;
    private javax.swing.JButton btnmoverA_C;
    private javax.swing.JButton btnmoverB_A;
    private javax.swing.JButton btnmoverB_C;
    private javax.swing.JButton btnmoverC_A;
    private javax.swing.JButton btnmoverC_B;
    private javax.swing.JButton btnreiniciar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbnumDiscos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblminMov;
    private javax.swing.JLabel lblnumMov;
    private javax.swing.JTable torreA;
    private javax.swing.JTable torreB;
    private javax.swing.JTable torreC;
    // End of variables declaration//GEN-END:variables
}
