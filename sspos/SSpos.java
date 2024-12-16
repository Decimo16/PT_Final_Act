package j.sspos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableRowSorter;

public class SSpos extends javax.swing.JFrame {
    
    private static ArrayList<CartItem> cartItems = new ArrayList<>();
    private static ArrayList<Purchase> purchaseHistory = new ArrayList<>();
    private TableRowSorter<DefaultTableModel> rowSorter;
    private static double cashValue;
    private static HashMap<String, Integer> purchaseCount = new HashMap<>();
    private static String mostPurchasedItem = "";
    private static int maxPurchaseCount = 0;
    private static int totalQuantityPurchased = 0;
    private static double totalCashEarned = 0.0; 
    private static int totalQu;
    private static double totalPr;
    
    public SSpos() {
        initComponents();
    }
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        InvPanel = new javax.swing.JPanel();
        javax.swing.JButton Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        itemF = new javax.swing.JTextField();
        quantityF = new javax.swing.JTextField();
        priceF = new javax.swing.JTextField();
        categoryF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        CoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CoTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        cartArea = new javax.swing.JTextArea();
        Remove = new javax.swing.JButton();
        CartT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cashF = new javax.swing.JTextField();
        totalF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        changeF = new javax.swing.JTextField();
        Checkout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MyPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        purchaseHistoryArea = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tnd = new javax.swing.JLabel();
        QuanT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        MSRefresh = new javax.swing.JButton();
        TotalP = new javax.swing.JTextField();
        MostP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        CashT = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        Tinv = new javax.swing.JTextField();
        Tcost = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tindahan Suite");
        setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        setSize(new java.awt.Dimension(736, 584));

        jTabbedPane4.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane4.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane4.setPreferredSize(new java.awt.Dimension(730, 549));

        InvPanel.setBackground(new java.awt.Color(51, 51, 51));
        InvPanel.setMaximumSize(new java.awt.Dimension(730, 549));

        Update.setBackground(new java.awt.Color(153, 153, 153));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update Item");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(153, 153, 153));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete Item");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity:");

        itemF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFActionPerformed(evt);
            }
        });

        quantityF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFActionPerformed(evt);
            }
        });

        priceF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFActionPerformed(evt);
            }
        });

        categoryF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category:");

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add Item");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.getTableHeader().setReorderingAllowed(false);
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);
        if (itemTable.getColumnModel().getColumnCount() > 0) {
            itemTable.getColumnModel().getColumn(0).setResizable(false);
            itemTable.getColumnModel().getColumn(1).setResizable(false);
            itemTable.getColumnModel().getColumn(2).setResizable(false);
            itemTable.getColumnModel().getColumn(3).setResizable(false);
        }
        rowSorter = new TableRowSorter<>((DefaultTableModel) itemTable.getModel());
        itemTable.setRowSorter(rowSorter);
        rowSorter.setSortable(0, false);
        rowSorter.setSortable(1, false);
        rowSorter.setSortable(2, false);
        rowSorter.setSortable(3, false);
        // Add DocumentListener to the search field
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }

            private void filterTable() {
                String query = searchField.getText();
                if (query.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + query)); // Case insensitive search
                }
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search:");

        javax.swing.GroupLayout InvPanelLayout = new javax.swing.GroupLayout(InvPanel);
        InvPanel.setLayout(InvPanelLayout);
        InvPanelLayout.setHorizontalGroup(
            InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(InvPanelLayout.createSequentialGroup()
                        .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InvPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(quantityF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InvPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(categoryF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InvPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField))
                            .addComponent(jSeparator3)))
                    .addGroup(InvPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(itemF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InvPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(priceF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        InvPanelLayout.setVerticalGroup(
            InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add)
                        .addComponent(Delete)))
                .addGap(6, 6, 6)
                .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvPanelLayout.createSequentialGroup()
                        .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InvPanelLayout.createSequentialGroup()
                        .addComponent(Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("INVENTORY", InvPanel);

        CoPanel.setBackground(new java.awt.Color(51, 51, 51));
        CoPanel.setMaximumSize(new java.awt.Dimension(730, 549));
        CoPanel.setPreferredSize(new java.awt.Dimension(730, 514));

        CoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CoTable.getTableHeader().setReorderingAllowed(false);
        CoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CoTable);
        if (CoTable.getColumnModel().getColumnCount() > 0) {
            CoTable.getColumnModel().getColumn(0).setResizable(false);
            CoTable.getColumnModel().getColumn(1).setResizable(false);
            CoTable.getColumnModel().getColumn(2).setResizable(false);
            CoTable.getColumnModel().getColumn(3).setResizable(false);
        }

        cartArea.setEditable(false);
        cartArea.setColumns(20);
        cartArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartArea.setRows(5);
        cartArea.setAutoscrolls(false);
        cartArea.setDragEnabled(true);
        jScrollPane3.setViewportView(cartArea);

        Remove.setBackground(new java.awt.Color(153, 153, 153));
        Remove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setText("Remove Item");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        CartT.setBackground(new java.awt.Color(153, 153, 153));
        CartT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CartT.setForeground(new java.awt.Color(255, 255, 255));
        CartT.setText("Total");
        CartT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartTActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("       Cash");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("     Change");

        changeF.setEditable(false);

        Checkout.setBackground(new java.awt.Color(153, 153, 153));
        Checkout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Checkout.setForeground(new java.awt.Color(255, 255, 255));
        Checkout.setText("Checkout");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CART");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Item");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("  Qty");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Price");

        javax.swing.GroupLayout CoPanelLayout = new javax.swing.GroupLayout(CoPanel);
        CoPanel.setLayout(CoPanelLayout);
        CoPanelLayout.setHorizontalGroup(
            CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addGroup(CoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(jSeparator2)
                    .addGroup(CoPanelLayout.createSequentialGroup()
                        .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CoPanelLayout.createSequentialGroup()
                                .addComponent(CartT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalF))
                            .addComponent(Remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CoPanelLayout.createSequentialGroup()
                                .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cashF, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(changeF)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CoPanelLayout.setVerticalGroup(
            CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoPanelLayout.createSequentialGroup()
                .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cashF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(changeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Checkout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        CoPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CartT, Checkout, cashF, changeF, jLabel2, jLabel4, totalF});

        jTabbedPane4.addTab("CHECKOUT", CoPanel);

        MyPanel.setBackground(new java.awt.Color(51, 51, 51));
        MyPanel.setMaximumSize(new java.awt.Dimension(730, 549));
        MyPanel.setPreferredSize(new java.awt.Dimension(730, 514));

        purchaseHistoryArea.setEditable(false);
        purchaseHistoryArea.setColumns(20);
        purchaseHistoryArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        purchaseHistoryArea.setRows(5);
        jScrollPane4.setViewportView(purchaseHistoryArea);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Purchase History");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Refresh.setBackground(new java.awt.Color(153, 153, 153));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Items Purchased:");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Purchased:");

        tnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tnd.setForeground(new java.awt.Color(255, 255, 255));
        tnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        QuanT.setEditable(false);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Inventory");

        MSRefresh.setText("Refresh");
        MSRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSRefreshActionPerformed(evt);
            }
        });
        Tinv.setEditable(false);
        
        totalF.setEditable(false);

        TotalP.setEditable(false);

        MostP.setEditable(false);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Most Purchased:");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Total Cash Earned:");

        CashT.setEditable(false);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cart");

        Tcost.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Total Inventory Items:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Total Cost:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Item");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Qty");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Price");

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MyPanelLayout.createSequentialGroup()
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MyPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MyPanelLayout.createSequentialGroup()
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(MyPanelLayout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MyPanelLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MyPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MostP, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(TotalP, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(QuanT, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(CashT, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(Tinv)
                                    .addComponent(Tcost)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MyPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(MSRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tnd, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MyPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        MyPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CashT, MostP, QuanT, Tinv, TotalP, jLabel15, jLabel16, jLabel3});

        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refresh))
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MyPanelLayout.createSequentialGroup()
                                .addComponent(Tinv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)))
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MyPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CashT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MostP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QuanT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MSRefresh)
                            .addComponent(tnd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );

        MyPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CashT, MSRefresh, MostP, QuanT, Tcost, Tinv, TotalP, jLabel15, jLabel16, jLabel18, jLabel19, jLabel3, tnd});

        jTabbedPane4.addTab("MY STORE", MyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    //InvPanel
    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String item = itemF.getText();
        String price = priceF.getText();
        String quantity = quantityF.getText();
        String category = categoryF.getText();
        if (!item.isEmpty() && !price.isEmpty() && !quantity.isEmpty() && !category.isEmpty()) { //if and only if the fields are filled the items are only added
            String data[] = {itemF.getText(), priceF.getText(), quantityF.getText(), categoryF.getText()};
            DefaultTableModel tableModel = (DefaultTableModel)itemTable.getModel();
            DefaultTableModel tblModel = (DefaultTableModel) CoTable.getModel();
            tableModel.addRow(data);
            tblModel.addRow(data);
            clearInputFields();
            updateTotals();
        } else {
            JOptionPane.showMessageDialog(InvPanel, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModel tableModel = (DefaultTableModel)itemTable.getModel();
        int selectedRow = itemTable.getSelectedRow();//selected via mouseclick
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow); //selected row will be removed
            clearInputFields();
            updateTotals();
        } else {
            JOptionPane.showMessageDialog(InvPanel, "Please select an item to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModel tableModel = (DefaultTableModel)itemTable.getModel();
        int selectedRow = itemTable.getSelectedRow();
        if (selectedRow != -1) {
            String item = itemF.getText();
            String price = priceF.getText();
            String quantity = quantityF.getText();
            String category = categoryF.getText();
             //below adds the selected row to the fields again to be edited
            tableModel.setValueAt(item, selectedRow, 0);
            tableModel.setValueAt(price, selectedRow, 1);
            tableModel.setValueAt(quantity, selectedRow, 2);
            tableModel.setValueAt(category, selectedRow, 3);
            clearInputFields();
        } else {
            JOptionPane.showMessageDialog(InvPanel, "Please select an item to update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void itemFActionPerformed(java.awt.event.ActionEvent evt) {                                      
        itemF.getText();
    }
    private void priceFActionPerformed(java.awt.event.ActionEvent evt) {                                       
        priceF.getText();
    }
    private void quantityFActionPerformed(java.awt.event.ActionEvent evt) {                                          
        quantityF.getText();
    }
    private void categoryFActionPerformed(java.awt.event.ActionEvent evt) {                                          
        categoryF.getText();
    }
    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {                                       
        DefaultTableModel tableModel = (DefaultTableModel)itemTable.getModel();
        int selectedRow = itemTable.getSelectedRow();
        if (selectedRow != -1) { //this stores the selected row
            // Populate input fields with selected item details
            itemF.setText((String) tableModel.getValueAt(selectedRow, 0));
            priceF.setText((String) tableModel.getValueAt(selectedRow, 1));
            quantityF.setText((String) tableModel.getValueAt(selectedRow, 2));
            categoryF.setText((String) tableModel.getValueAt(selectedRow, 3));
        }
    }
    //CoPanel
    private void CartTActionPerformed(java.awt.event.ActionEvent evt) {                                      
        totalF.setText("PHP " +calculateTotal()); //displays the total after button press
    }
    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel tblModel = (DefaultTableModel)CoTable.getModel();
        cashValue = Double.parseDouble(cashF.getText());
        if(cashValue<calculateTotal()){
            JOptionPane.showMessageDialog(CoPanel, "Insufficient Cash!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            changeF.setText("PHP" + calculateChange());
            for (CartItem item : cartItems) {
                purchaseHistory.add(new Purchase(item.getItem(), item.getPrice(), item.getQuantity()));
            }
            for (CartItem item : cartItems) {
                for (int i = 0; i < tblModel.getRowCount(); i++) {
                    String tableItem = (String) tblModel.getValueAt(i, 0);
                    int tableQuantity = Integer.parseInt((String) tblModel.getValueAt(i, 2));
                    if (tableItem.equals(item.getItem())) {
                        int newTableQuantity = tableQuantity - item.getQuantity();
                        tblModel.setValueAt(String.valueOf(newTableQuantity), i, 2);
                        if (newTableQuantity <= 0) {
                            tblModel.removeRow(i);
                        }
                        break; // Exit the inner loop once the item is found
                    }
                }
            }
            for (CartItem item : cartItems) {
                //below gets the variables needed for the stats
                purchaseCount.put(item.getItem(), purchaseCount.getOrDefault(item.getItem(), 0) + item.getQuantity());
                int currentCount = purchaseCount.get(item.getItem());
                //checks if item is the most bought
                if (currentCount > maxPurchaseCount) {
                    maxPurchaseCount = currentCount;
                    mostPurchasedItem = item.getItem();
                }
                //totals for stats
                totalCashEarned += (item.getPrice() * item.getQuantity());
                totalQuantityPurchased += item.getQuantity();
            }
            JOptionPane.showMessageDialog(CoPanel, "Purchase Complete");
            cartItems.clear();
            updateCartDisplay();
            totalF.setText("");
            cashF.setText("");
            changeF.setText("");
        }
    }
    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModel tblModel = (DefaultTableModel)CoTable.getModel();
        String selectedItem = JOptionPane.showInputDialog(CoPanel, "Enter the item:");
        if (selectedItem != null && !selectedItem.isEmpty()) {
            boolean found = false;
            //looks within the cart array for the item
            for (CartItem item : cartItems) {
                if (item.getItem().equalsIgnoreCase(selectedItem)) {
                    int quantityToReturn = item.getQuantity();
                    for (int row = 0; row < tblModel.getRowCount(); row++) {
                        String itemName = (String) tblModel.getValueAt(row, 0);
                        if (itemName.equalsIgnoreCase(selectedItem)) {
                            int currentQuantity = Integer.parseInt((String) tblModel.getValueAt(row, 2));
                            tblModel.setValueAt(String.valueOf(currentQuantity + quantityToReturn), row, 2);
                            break;
                        }
                    }
                    cartItems.remove(item);
                    found = true;
                    break;
                }
            }
            if (found) {
                updateCartDisplay();
            } else {
                JOptionPane.showMessageDialog(CoPanel, "Item not found in the cart.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void CoTableMouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel tblModel = (DefaultTableModel)CoTable.getModel();
        int selectedRow = CoTable.getSelectedRow();
      //feature for adding to cart below, once clicked a promt will appear
      int choice2 = JOptionPane.showConfirmDialog(CoPanel, "Add to cart(YES), Delete Item(NO)","", JOptionPane.YES_NO_CANCEL_OPTION);
      if(choice2 == JOptionPane.YES_OPTION){
        if (selectedRow != -1) {
            String item = (String) tblModel.getValueAt(selectedRow, 0);
            double price = Double.parseDouble((String) tblModel.getValueAt(selectedRow, 1));
            int availableQuantity = Integer.parseInt((String) tblModel.getValueAt(selectedRow, 2));
            String quantityInput = JOptionPane.showInputDialog(CoPanel, "How many" + item + "?" + " (Available: " + availableQuantity + "):");
            if (quantityInput != null && !quantityInput.isEmpty()) {
                try {
                    int quantity = Integer.parseInt(quantityInput);
                    if (quantity > 0 && quantity <= availableQuantity) {
                        cartItems.add(new CartItem(item, price, quantity));
                        int newAvailableQuantity = availableQuantity - quantity;
                        tblModel.setValueAt(String.valueOf(newAvailableQuantity), selectedRow, 2);
                        updateCartDisplay();
                    } else {
                        JOptionPane.showMessageDialog(CoPanel, "Really?", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CoPanel, "How 'many' ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
        }
      }
        else if(choice2 == JOptionPane.NO_OPTION){
        int choice = JOptionPane.showConfirmDialog(CoPanel, "Delete Item?","Confirmation", JOptionPane.OK_CANCEL_OPTION);
        if(choice == JOptionPane.OK_OPTION){

        if (selectedRow != -1) {
            tblModel.removeRow(selectedRow); //selected row will be removed
        } else {}
        
        }
        else{}
        }
        else{}
    }
    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) { 
        purchaseHistoryArea.setText("");
        for (Purchase purchase : purchaseHistory) {
            purchaseHistoryArea.append(purchase.getItem() + "..............." +purchase.getQuantity()+ "..............." + purchase.getPrice() + "\n");
        }
    } // history collection and display
    private void MSRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String time = JOptionPane.showInputDialog(MyPanel, "Enter Time and Date");
        tnd.setText("Last Updated: " + time);
        TotalP.setText(mostPurchasedItem);
        QuanT.setText("" + maxPurchaseCount);
        TotalP.setText("" + totalQuantityPurchased);
        CashT.setText("" + totalCashEarned);
        MostP.setText(mostPurchasedItem);
        Tcost.setText("" + totalPr);
        Tinv.setText("" + totalQu);
    } //Refresh Stats
    //main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SSpos().setVisible(true);
            }
        });
    }
    //other voids
    private static void clearInputFields() {
        itemF.setText("");
        priceF.setText("");
        quantityF.setText("");
        categoryF.setText("");
        } //clear text fields in Inventory
    // more variables for outputs
    static class CartItem {
        private String item;
        private double price;
        private int quantity;

        public CartItem(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItem() {
            return item;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    } // variable for cart area placement 
    static class Purchase {
    private String item;
    private double price;
    private int quantity;
    
    public Purchase(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
} // variable for history are
    //Checkout Cart
    private static void updateCartDisplay() {
        cartArea.setText(""); // Clear the cart display
        cartArea.setEditable(false);
        for (CartItem item : cartItems) {
            cartArea.append(item.getItem() +  "                         " + item.getQuantity() + "                        " + item.getPrice() + "\n");
        }
    } // places the item price and qty variable
    private static double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    } //computation for total
    private static double calculateChange() {
        double change;
            change = cashValue - calculateTotal();
        return change;
    } // computation for change
    private void updateTotals() {
    DefaultTableModel tableModel = (DefaultTableModel)itemTable.getModel();
    totalPr = 0.0;
    totalQu = 0;

    for (int i = 0; i < tableModel.getRowCount(); i++) {
        double price = Double.parseDouble((String) tableModel.getValueAt(i, 1));
        int quantity = Integer.parseInt((String) tableModel.getValueAt(i, 2));
        totalPr += price * quantity;
        totalQu += quantity;
        
    }
     } // computation for stats
    
// Variables declaration                    
    private javax.swing.JButton CartT;
    private javax.swing.JTextField CashT;
    private javax.swing.JButton Checkout;
    private javax.swing.JPanel CoPanel;
    private javax.swing.JTable CoTable;
    private javax.swing.JButton Delete;
    private javax.swing.JPanel InvPanel;
    private javax.swing.JButton MSRefresh;
    private javax.swing.JTextField MostP;
    private javax.swing.JPanel MyPanel;
    private javax.swing.JTextField QuanT;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField Tcost;
    private javax.swing.JTextField Tinv;
    private javax.swing.JTextField TotalP;
    private javax.swing.JButton add;
    private static javax.swing.JTextArea cartArea;
    private static javax.swing.JTextField cashF;
    private static javax.swing.JTextField categoryF;
    private javax.swing.JTextField changeF;
    private static javax.swing.JTextField itemF;
    private static javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane4;
    private static javax.swing.JTextField priceF;
    private javax.swing.JTextArea purchaseHistoryArea;
    private static javax.swing.JTextField quantityF;
    private javax.swing.JTextField searchField;
    private static javax.swing.JLabel tnd;
    private javax.swing.JTextField totalF;                  
}
    