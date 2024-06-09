
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        LgnBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RoomType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        BedType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        RoomNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        SearchData = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RmTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setPreferredSize(new java.awt.Dimension(1400, 800));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1300, 550));
        jPanel3.setPreferredSize(new java.awt.Dimension(1300, 700));
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(0, 102, 102));
        Left.setMinimumSize(new java.awt.Dimension(400, 800));
        Left.setPreferredSize(new java.awt.Dimension(300, 800));

        LgnBtn.setBackground(new java.awt.Color(0, 102, 102));
        LgnBtn.setForeground(new java.awt.Color(255, 255, 255));
        LgnBtn.setText("Log Out ");
        LgnBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        LgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LgnBtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\HotelManagementSystem\\src\\Images\\logok.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S W A R N A ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hotel Management System");

        jPanel4.setPreferredSize(new java.awt.Dimension(238, 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(LgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(LgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel3.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(1100, 800));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(1100, 75));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("R O O M S");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel2)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Right.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 650));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Full Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Room Type");

        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A/C", "NON A/C" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Bed Type");

        BedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Bed", "Double Bed" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Room Number");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Amount");

        savebtn.setText("Save");
        savebtn.setPreferredSize(new java.awt.Dimension(100, 40));
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.setPreferredSize(new java.awt.Dimension(100, 40));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.setPreferredSize(new java.awt.Dimension(100, 40));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Search By Name");

        SearchBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(RoomNum)
                    .addComponent(BedType, 0, 350, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(FullName)
                    .addComponent(RoomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amount)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchData)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BedType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Right.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        RmTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Room Number", "Room Type", "Bed Type", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RmTable);

        Right.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 650, 650));

        jPanel3.add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1200, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1400, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1418, 847));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void LgnBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }                                      
    
    public void LoadData(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            
            String SUrl = "jdbc:MySql://localhost:3306/swarna_hotel";
            String SUser = "root";
            String SPass = "";
            
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            
        DefaultTableModel model = new DefaultTableModel(new String[]{"FullName","RoomNum","RoomType","BedType","Amount"},0);
        
        RmTable.setModel(model);
        String sql ="SELECT * FROM rooms";
        ResultSet rs = st.executeQuery(sql);
        String i, f, l, e, m;
        
        while(rs.next()){
           i = rs.getString("Name");
           f = rs.getString("Room_Number");
           l = rs.getString("Room_Type");
           e = rs.getString("Bed_Type");
           m = rs.getString("Amount");
           model.addRow(new Object []{i, f, l, e, m});
        }
        }catch(Exception e){
            System.out.println("Error !" + e.getMessage());
        }
        
    }
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String fname, roomnumber, amount, query;
        Object roomtype, bedtype;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String SUrl = "jdbc:MySql://localhost:3306/swarna_hotel";
            String SUser = "root";
            String SPass = "";
            
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            
            if("".equals(FullName.getText())){
               JOptionPane.showMessageDialog(new JFrame(),"Full Name Is Require", "Error", JOptionPane.ERROR_MESSAGE);
               
           }else if("".equals(RoomNum.getText())){
               JOptionPane.showMessageDialog(new JFrame(),"Room Number Is Require", "Error", JOptionPane.ERROR_MESSAGE);
               
           }else if ("".equals(RoomType.getSelectedItem())){
               JOptionPane.showMessageDialog(new JFrame(),"Room Type Is Require", "Error", JOptionPane.ERROR_MESSAGE);
               
           }else if("".equals(BedType.getSelectedItem())){
               JOptionPane.showMessageDialog(new JFrame(),"Room Number Is Require", "Error", JOptionPane.ERROR_MESSAGE);
               
           }else if ("".equals(Amount.getText())){
               JOptionPane.showMessageDialog(new JFrame(),"Amount Is Require", "Error", JOptionPane.ERROR_MESSAGE);
               
           }else{
           fname = FullName.getText(); 
           roomnumber = RoomNum.getText();
           roomtype = RoomType.getSelectedItem();
           bedtype = BedType.getSelectedItem();
           amount = Amount.getText();
           
           query = "INSERT INTO rooms(Name, Room_Number, Room_Type, Bed_Type, Amount)"+ 
                   "VALUES('"+fname+"', '"+roomnumber+"', '"+roomtype+"', '"+bedtype+"', '"+amount+"')";
           
           st.executeUpdate(query);
           FullName.setText(""); 
           RoomNum.setText("");
           RoomType.setSelectedItem("");
           BedType.setSelectedItem("");
           Amount.setText("");
           showMessageDialog(null, "Information entered Successfully");
           LoadData();
           con.close();
           }  
        }catch(Exception e){
            System.out.println("Error !" + e.getMessage());
            
        }
        
        
    }                                       

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String fname, roomnumber, amount, query;
        Object roomtype, bedtype;
        int notFound = 0;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/swarna_hotel";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            fname= SearchData.getText();
            if("".equals(fname)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql ="SELECT * FROM rooms WHERE Name='"+fname+"'";
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 fname = FullName.getText(); 
                 roomnumber = RoomNum.getText();
                 roomtype = RoomType.getSelectedItem();
                 bedtype = BedType.getSelectedItem();
                 amount = Amount.getText();
                 
                 String sql2 = "UPDATE rooms SET Name='"+fname+"', Room_Number='"+roomnumber+"', Room_Type='"+roomtype+"', "
                         + "Bed_Type='"+bedtype+"', Amount='"+amount+"'  WHERE Name='"+fname+"'";
                 st.executeUpdate(sql2); 
                 LoadData();
                 con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }
        
    }                                         

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String fname;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/swarna_hotel";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            fname= SearchData.getText();
            if("".equals(fname)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql ="SELECT * FROM rooms WHERE Name='"+fname+"'";
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 String sql2 = "DELETE FROM rooms WHERE Name='"+fname+"'";
                 st.executeUpdate(sql2); 
                 LoadData();
                 con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }  
    }                                         

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String fname;
        int notFound=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String SUrl = "jdbc:MySql://localhost:3306/swarna_hotel";
            String SUser = "root";
            String SPass = "";
            
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            
             fname= SearchData.getText();
            
            if("".equals(fname)){
               JOptionPane.showMessageDialog(new JFrame(),"Full Name Is Require", "Error", JOptionPane.ERROR_MESSAGE);
               
            }else{
                String sql ="SELECT * FROM rooms WHERE Name='"+fname+"'";
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    FullName.setText(rs.getString("Name"));
                    RoomNum.setText(rs.getString("Room_Number"));
                    RoomType.setSelectedItem(rs.getString("Room_Type"));
                    BedType.setSelectedItem(rs.getString("Bed_Type"));
                    Amount.setText(rs.getString("Amount"));
                    notFound=1;
                    con.close();
                }
                if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid Name", "Dialog",JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){
            System.out.println("Error !" + e.getMessage());
            
        }
        
    }                                         

    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard x = new Dashboard();
                x.LoadData();
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Amount;
    private javax.swing.JComboBox<String> BedType;
    private javax.swing.JTextField FullName;
    private javax.swing.JPanel Left;
    private javax.swing.JButton LgnBtn;
    private javax.swing.JPanel Right;
    private javax.swing.JTable RmTable;
    private javax.swing.JTextField RoomNum;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchData;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration                   
}
