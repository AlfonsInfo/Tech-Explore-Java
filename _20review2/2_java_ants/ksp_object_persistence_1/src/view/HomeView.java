package view;

import controller.ProductController;
import data.UserSession;
import exception.CustomException;
import java.awt.Image;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Product;
import utils.Helper;

public final  class HomeView extends javax.swing.JFrame {
    
    //Enum State
    enum State{
        DEFAULT,
        CREATE,
        SEARCH_DATA_FOR_UPDATED,
        DATA_FOR_UPDATED,
        SEARCH_DATA_FOR_DELETED,
        DATA_FOR_DELETED,
    };
    
    //Define variable
    private final ProductController productController = new ProductController();   
    private static final String COMMON_ERROR_TITLE = "Terjadi Kesalahan";
    private static final String COMMON_ERROR_MESSAGE = "Terjadi Suatu Kesalahan , Periksa Inputan Anda Atau Coba beberapa saat lagi";
    private State stateCondition = State.DEFAULT;
    
    public HomeView() {
        initComponents();
        greetingUser();
        setEnabledSearchForUpdateAndDelete(false);
        setEnableInputUpsert(false);
        
    }
    
    public void showDialog(String message, String title){
         javax.swing.JOptionPane.showConfirmDialog(this.rootPane, message, title, JOptionPane.YES_OPTION);
    }
    
    public void resetInputForm(){
            idProductInput.setText("");
            productNameInput.setText("");
            priceInput.setText("");
            stockInput.setText("");
    }
    
    private void setViewBaseOnState(State statecondition){
        
         this.stateCondition = statecondition; 
         
        Helper.printLog(null, null, statecondition.toString());
        switch(statecondition){
            case CREATE:
                setEnabledSearchForUpdateAndDelete(false);
                setEnableInputUpsert(true);
                createButton.setEnabled(true);
                updateButton.setEnabled(false);
                deleteButton.setEnabled(false);
                cancelButton.setEnabled(true);
                confirmButton.setEnabled(true);
                break;

            case SEARCH_DATA_FOR_UPDATED:
                setEnabledSearchForUpdateAndDelete(true);
                setEnableInputUpsert(false);
                updateButton.setEnabled(true);
                deleteButton.setEnabled(false);
                createButton.setEnabled(false);
                searchByIdButton.setEnabled(true);
                cancelButton.setEnabled(true);

                break;

            case  SEARCH_DATA_FOR_DELETED:
                setEnabledSearchForUpdateAndDelete(true);
                setEnableInputUpsert(false);
                updateButton.setEnabled(false);
                deleteButton.setEnabled(true);
                createButton.setEnabled(false);
                cancelButton.setEnabled(true);

                break;

            case DATA_FOR_UPDATED:
                 setEnableInputUpsert(true);
                 updateButton.setEnabled(false);
                 deleteButton.setEnabled(false);
                 confirmButton.setText("Update");
            
                 break;
      
            case DATA_FOR_DELETED:
                 setEnableInputUpsert(false);
                 updateButton.setEnabled(false);
                 deleteButton.setEnabled(false);
                 confirmButton.setText("Delete"); 
                 cancelButton.setEnabled(true);
                 confirmButton.setEnabled(true);
               
                 break;
          
            case DEFAULT:
                setEnableInputUpsert(false);
                setEnabledSearchForUpdateAndDelete(false);
                updateButton.setEnabled(true);
                createButton.setEnabled(true);
                viewButton.setEnabled(true);
                deleteButton.setEnabled(true);
                idProductInput.setText("");
                searchInput.setText("");
                confirmButton.setText("Confirm");
                resetInputForm();
                 break;
        }
    }
    
    
    private void setTextAreaData(List<Product> product) {
        String text = "";
        for(int i = 0 ; i < product.size() ; i++){
            text += product.get(i).toString()+ "\n";
        }
        textAreaData.setText(text);
    }
    
    
    public void greetingUser(){
            String greetingFullText =  getGreeting() + "  " + UserSession.getUser().getUsername();
            textGreetingUser.setText(greetingFullText);
    }

    
    private String getGreeting(){
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
                return "Good Morning";
        }else if(timeOfDay >= 12 && timeOfDay < 17){
                return  "Good Afternoon";
        }else if(timeOfDay >= 17 && timeOfDay < 21){
                return "Good Evening";
        }else if(timeOfDay >= 21 && timeOfDay < 24){
                return "Good Night";
        }
        return "Hello ";
    }
    
    
     public void setEnabledSearchForUpdateAndDelete(boolean value){
          idProductInput.setEnabled(value);
          searchByIdButton.setEnabled(value);
     }
     
     public void setEnableInputUpsert(boolean value){
          productNameInput.setEnabled(value);
          priceInput.setEnabled(value);
          stockInput.setEnabled(value);
          cancelButton.setEnabled(value);
          confirmButton.setEnabled(value);
     }
 
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        textGreetingUser = new javax.swing.JLabel();
        textGreetingUser1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        productNameInput = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        productInputLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stockInput = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaData = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        productInputLabel1 = new javax.swing.JLabel();
        idProductInput = new javax.swing.JTextField();
        searchByIdButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 153, 255));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.setFocusCycleRoot(true);
        panel.setName(""); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(500, 800));

        header.setBackground(new java.awt.Color(0, 102, 153));

        textGreetingUser.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        textGreetingUser.setForeground(new java.awt.Color(255, 255, 255));
        textGreetingUser.setText("Hello....");

        textGreetingUser1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        textGreetingUser1.setForeground(new java.awt.Color(255, 255, 255));
        textGreetingUser1.setText("Inventory Management System");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(textGreetingUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addComponent(textGreetingUser, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGreetingUser)
                    .addComponent(textGreetingUser1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(102, 204, 255));
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(204, 204, 0));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(0, 51, 255));
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View All Data");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        productNameInput.setBackground(new java.awt.Color(255, 255, 255));
        productNameInput.setForeground(new java.awt.Color(0, 0, 0));
        productNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameInputActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(102, 204, 255));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchInput.setBackground(new java.awt.Color(255, 255, 255));
        searchInput.setForeground(new java.awt.Color(0, 0, 0));
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        productInputLabel.setBackground(new java.awt.Color(255, 255, 255));
        productInputLabel.setForeground(new java.awt.Color(255, 255, 255));
        productInputLabel.setText("Nama Produk :");

        priceLabel.setBackground(new java.awt.Color(255, 255, 255));
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Harga Produk :");

        priceInput.setBackground(new java.awt.Color(255, 255, 255));
        priceInput.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stok Produk :");

        stockInput.setBackground(new java.awt.Color(255, 255, 255));
        stockInput.setForeground(new java.awt.Color(0, 0, 0));

        confirmButton.setBackground(new java.awt.Color(51, 153, 0));
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(102, 102, 255));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        textAreaData.setBackground(new java.awt.Color(255, 255, 255));
        textAreaData.setColumns(20);
        textAreaData.setRows(5);
        jScrollPane1.setViewportView(textAreaData);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tampil Data");

        productInputLabel1.setBackground(new java.awt.Color(255, 255, 255));
        productInputLabel1.setForeground(new java.awt.Color(255, 255, 255));
        productInputLabel1.setText("Id Produk");

        idProductInput.setBackground(new java.awt.Color(255, 255, 255));
        idProductInput.setForeground(new java.awt.Color(0, 0, 0));
        idProductInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductInputActionPerformed(evt);
            }
        });

        searchByIdButton.setBackground(new java.awt.Color(0, 204, 204));
        searchByIdButton.setForeground(new java.awt.Color(255, 255, 255));
        searchByIdButton.setText("Search");
        searchByIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(createButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updateButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteButton))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(productInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(productNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(productInputLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idProductInput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchByIdButton))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(cancelButton)
                                                .addGap(38, 38, 38)
                                                .addComponent(confirmButton))
                                            .addComponent(stockInput, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchButton))
                                    .addComponent(viewButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(searchButton)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productInputLabel1)
                    .addComponent(idProductInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByIdButton)
                    .addComponent(viewButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productInputLabel)
                    .addComponent(productNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stockInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        setViewBaseOnState(State.SEARCH_DATA_FOR_DELETED);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        setViewBaseOnState(State.CREATE);
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        setViewBaseOnState(State.SEARCH_DATA_FOR_UPDATED);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        List<Product> product = productController.readProduct("");
        setTextAreaData(product);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        List<Product> product = productController.readProduct(searchInput.getText());
        setTextAreaData(product);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Helper.printLog(stateCondition.toString(), Helper.getCurrentMethodName(), null /* replace with data from form*/);
        
        try{
            
        if(Objects.equals(stateCondition, State.CREATE)){
            Product product = new Product();
            product.setName(productNameInput.getText());
            product.setPrice( Double.valueOf(priceInput.getText()) );
            product.setStock(Integer.valueOf(stockInput.getText()));
            productController.createData(product);
            showDialog("Berhasil Menambahkan Produk", "Sukses");
        }else if( Objects.equals(stateCondition,  State.DATA_FOR_UPDATED)){
            String idForUpdated =idProductInput.getText();
            Product product =new Product();
            product.setName(productNameInput.getText());
            product.setPrice( Double.valueOf(priceInput.getText()) );
            product.setStock(Integer.valueOf(stockInput.getText()));
            productController.updateData(idForUpdated, product);
            showDialog("Berhasil Memperbarui data Produk", "Sukses");
        }else if(Objects.equals(stateCondition, State.DATA_FOR_DELETED)){
            showDialog("Berhasil Hapus Produk", "Sukses");
        }
        setViewBaseOnState(State.DEFAULT);
        }catch(NumberFormatException e){
            Helper.printLogError(e.getMessage(), null);
            showDialog("harga dan stok harus angka", COMMON_ERROR_TITLE);
            resetInputForm();
        }catch(Exception e){
            Helper.printLogError(e.getMessage(), Helper.getCurrentMethodName());
            showDialog(COMMON_ERROR_MESSAGE, COMMON_ERROR_TITLE);

        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
            setViewBaseOnState(State.DEFAULT);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchByIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdButtonActionPerformed
        try{
            
        //kalo datanya dapat
        Product product = productController.findByProductId(idProductInput.getText());
        
        if(product.getId() != null){
            //baru lanjut kesini
            productNameInput.setText(product.getName());
            priceInput.setText(String.valueOf( product.getPrice()));
            stockInput.setText(String.valueOf( product.getStock()));
            if(stateCondition.equals(State.SEARCH_DATA_FOR_UPDATED) || stateCondition.equals(State.DATA_FOR_UPDATED)){
                setViewBaseOnState(State.DATA_FOR_UPDATED);
            }else if(stateCondition.equals(State.SEARCH_DATA_FOR_DELETED) || stateCondition.equals(State.DATA_FOR_DELETED)) {
                setViewBaseOnState(State.DATA_FOR_DELETED);
            }
        }else{
            resetInputForm();
                        
            //notif
        }
        }catch(CustomException e){
            showDialog(e.getMessage(), COMMON_ERROR_TITLE);
        }catch(Exception e){
            showDialog(COMMON_ERROR_MESSAGE, COMMON_ERROR_TITLE);
        }
    }//GEN-LAST:event_searchByIdButtonActionPerformed

    private void idProductInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductInputActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void productNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameInputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { 
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }
    
    public void scaleIcon(String assets, javax.swing.JLabel c, int width, int height) 
    {
        ImageIcon icon  = new ImageIcon(getClass().getResource(assets)); // alamatnya dependen atau independen
        
        Image img  = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height,Image.SCALE_FAST );
        ImageIcon ScaledIcon = new ImageIcon(imgScale);
        c.setIcon(ScaledIcon);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel header;
    private javax.swing.JTextField idProductInput;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField priceInput;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productInputLabel;
    private javax.swing.JLabel productInputLabel1;
    private javax.swing.JTextField productNameInput;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchByIdButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField stockInput;
    private javax.swing.JTextArea textAreaData;
    private javax.swing.JLabel textGreetingUser;
    private javax.swing.JLabel textGreetingUser1;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
