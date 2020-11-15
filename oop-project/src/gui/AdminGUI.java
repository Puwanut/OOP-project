/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author IsilenceT
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form adminJFrame
     */

    
    public AdminGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icon_search = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_search.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        lb_search_icon.setIcon(icon_search);
        
        ImageIcon icon_borrow = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_borrow.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        lb_borrow_icon.setIcon(icon_borrow);
        
        ImageIcon icon_book = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_book.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        lb_book_icon.setIcon(icon_book);
        
        ImageIcon icon_logout = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_logout.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        lb_logout_icon.setIcon(icon_logout);
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pa_menu = new javax.swing.JPanel();
        lb_ADMIN = new javax.swing.JLabel();
        pa_menu_search = new javax.swing.JPanel();
        lb_search_icon = new javax.swing.JLabel();
        lb_search_text = new javax.swing.JLabel();
        pa_menu_borrow = new javax.swing.JPanel();
        lb_borrow_icon = new javax.swing.JLabel();
        lb_borrow_text = new javax.swing.JLabel();
        pa_menu_book = new javax.swing.JPanel();
        lb_book_icon = new javax.swing.JLabel();
        lb_book_text = new javax.swing.JLabel();
        pa_menu_logout = new javax.swing.JPanel();
        lb_logout_icon = new javax.swing.JLabel();
        lb_logout_text = new javax.swing.JLabel();
        pa_center = new javax.swing.JPanel();
        pa_search = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pa_borrow = new javax.swing.JPanel();
        pa_book = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        pa_menu.setBackground(new java.awt.Color(204, 255, 204));
        pa_menu.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        pa_menu.setMinimumSize(new java.awt.Dimension(0, 0));

        lb_ADMIN.setFont(new java.awt.Font("Kanit", 1, 36)); // NOI18N
        lb_ADMIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ADMIN.setText("ADMIN");
        lb_ADMIN.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        pa_menu_search.setBackground(pa_menu.getBackground());
        pa_menu_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pa_menu_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pa_menu_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pa_menu_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pa_menu_searchMouseExited(evt);
            }
        });

        lb_search_icon.setBackground(new java.awt.Color(153, 204, 255));
        lb_search_icon.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_search_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_search_icon.setPreferredSize(new java.awt.Dimension(50, 50));

        lb_search_text.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_search_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_search_text.setText("ค้นหาหนังสือ");

        javax.swing.GroupLayout pa_menu_searchLayout = new javax.swing.GroupLayout(pa_menu_search);
        pa_menu_search.setLayout(pa_menu_searchLayout);
        pa_menu_searchLayout.setHorizontalGroup(
            pa_menu_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_search_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_search_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pa_menu_searchLayout.setVerticalGroup(
            pa_menu_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_menu_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_search_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_search_text)
                .addContainerGap())
        );

        pa_menu_borrow.setBackground(pa_menu.getBackground());
        pa_menu_borrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pa_menu_borrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pa_menu_borrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pa_menu_borrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pa_menu_borrowMouseExited(evt);
            }
        });

        lb_borrow_icon.setBackground(new java.awt.Color(153, 204, 255));
        lb_borrow_icon.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_borrow_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_borrow_icon.setMaximumSize(new java.awt.Dimension(50, 50));
        lb_borrow_icon.setMinimumSize(new java.awt.Dimension(50, 50));
        lb_borrow_icon.setPreferredSize(new java.awt.Dimension(50, 50));

        lb_borrow_text.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_borrow_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_borrow_text.setText("<html><body style=\"text-align: center\">ทำรายการ<br>ยืม-คืนหนังสือ</body></html>");

        javax.swing.GroupLayout pa_menu_borrowLayout = new javax.swing.GroupLayout(pa_menu_borrow);
        pa_menu_borrow.setLayout(pa_menu_borrowLayout);
        pa_menu_borrowLayout.setHorizontalGroup(
            pa_menu_borrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_borrow_text)
            .addComponent(lb_borrow_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pa_menu_borrowLayout.setVerticalGroup(
            pa_menu_borrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_menu_borrowLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lb_borrow_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_borrow_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pa_menu_book.setBackground(pa_menu.getBackground());
        pa_menu_book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pa_menu_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pa_menu_bookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pa_menu_bookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pa_menu_bookMouseExited(evt);
            }
        });

        lb_book_icon.setBackground(new java.awt.Color(153, 204, 255));
        lb_book_icon.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_book_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_book_icon.setMaximumSize(new java.awt.Dimension(50, 50));
        lb_book_icon.setMinimumSize(new java.awt.Dimension(50, 50));
        lb_book_icon.setPreferredSize(new java.awt.Dimension(50, 50));

        lb_book_text.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_book_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_book_text.setText("ทะเบียนหนังสือ");

        javax.swing.GroupLayout pa_menu_bookLayout = new javax.swing.GroupLayout(pa_menu_book);
        pa_menu_book.setLayout(pa_menu_bookLayout);
        pa_menu_bookLayout.setHorizontalGroup(
            pa_menu_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_book_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_book_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pa_menu_bookLayout.setVerticalGroup(
            pa_menu_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_menu_bookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_book_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_book_text)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pa_menu_logout.setBackground(pa_menu.getBackground());
        pa_menu_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pa_menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pa_menu_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pa_menu_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pa_menu_logoutMouseExited(evt);
            }
        });

        lb_logout_icon.setBackground(new java.awt.Color(153, 204, 255));
        lb_logout_icon.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_logout_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logout_icon.setMaximumSize(new java.awt.Dimension(50, 50));
        lb_logout_icon.setMinimumSize(new java.awt.Dimension(50, 50));
        lb_logout_icon.setPreferredSize(new java.awt.Dimension(50, 50));

        lb_logout_text.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        lb_logout_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logout_text.setText("Logout");

        javax.swing.GroupLayout pa_menu_logoutLayout = new javax.swing.GroupLayout(pa_menu_logout);
        pa_menu_logout.setLayout(pa_menu_logoutLayout);
        pa_menu_logoutLayout.setHorizontalGroup(
            pa_menu_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_menu_logoutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lb_logout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_logout_text)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pa_menu_logoutLayout.setVerticalGroup(
            pa_menu_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_menu_logoutLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(pa_menu_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_logout_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_logout_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pa_menuLayout = new javax.swing.GroupLayout(pa_menu);
        pa_menu.setLayout(pa_menuLayout);
        pa_menuLayout.setHorizontalGroup(
            pa_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pa_menu_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pa_menu_borrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pa_menu_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pa_menu_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa_menuLayout.setVerticalGroup(
            pa_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_menuLayout.createSequentialGroup()
                .addComponent(lb_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pa_menu_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pa_menu_borrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pa_menu_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(pa_menu_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(pa_menu, java.awt.BorderLayout.LINE_START);

        pa_center.setBackground(new java.awt.Color(255, 255, 255));
        pa_center.setLayout(new java.awt.CardLayout());

        pa_search.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel1.setText("ค้นหาจาก");

        jLabel2.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jLabel2.setText("ข้อมูลที่ต้องการค้นหา");

        jComboBox1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลขเรียกหนังสือ", "ประเภทหนังสือ", "ชื่อหนังสือ" }));

        jTextField1.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "เลขเรียกหนังสือ", "ประเภทหนังสือ", "ชื่อหนังสือ", "สถานะ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(150);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(500);
            jTable1.getColumnModel().getColumn(3).setMinWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        javax.swing.GroupLayout pa_searchLayout = new javax.swing.GroupLayout(pa_search);
        pa_search.setLayout(pa_searchLayout);
        pa_searchLayout.setHorizontalGroup(
            pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_searchLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pa_searchLayout.createSequentialGroup()
                        .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pa_searchLayout.setVerticalGroup(
            pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_searchLayout.createSequentialGroup()
                .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_searchLayout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pa_searchLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pa_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pa_center.add(pa_search, "panel_search");

        pa_borrow.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pa_borrowLayout = new javax.swing.GroupLayout(pa_borrow);
        pa_borrow.setLayout(pa_borrowLayout);
        pa_borrowLayout.setHorizontalGroup(
            pa_borrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        pa_borrowLayout.setVerticalGroup(
            pa_borrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pa_center.add(pa_borrow, "panel_borrow");

        pa_book.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout pa_bookLayout = new javax.swing.GroupLayout(pa_book);
        pa_book.setLayout(pa_bookLayout);
        pa_bookLayout.setHorizontalGroup(
            pa_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        pa_bookLayout.setVerticalGroup(
            pa_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pa_center.add(pa_book, "panel_book");

        getContentPane().add(pa_center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pa_menu_searchMouseEntered(MouseEvent evt) {//GEN-FIRST:event_pa_menu_searchMouseEntered
        lb_search_text.setForeground(Color.red);
    }//GEN-LAST:event_pa_menu_searchMouseEntered

    private void pa_menu_searchMouseExited(MouseEvent evt) {//GEN-FIRST:event_pa_menu_searchMouseExited
        lb_search_text.setForeground(Color.black);
    }//GEN-LAST:event_pa_menu_searchMouseExited

    private void pa_menu_borrowMouseEntered(MouseEvent evt) {//GEN-FIRST:event_pa_menu_borrowMouseEntered
        lb_borrow_text.setForeground(Color.red);
    }//GEN-LAST:event_pa_menu_borrowMouseEntered

    private void pa_menu_borrowMouseExited(MouseEvent evt) {//GEN-FIRST:event_pa_menu_borrowMouseExited
        lb_borrow_text.setForeground(Color.black);
    }//GEN-LAST:event_pa_menu_borrowMouseExited

    private void pa_menu_bookMouseEntered(MouseEvent evt) {//GEN-FIRST:event_pa_menu_bookMouseEntered
        lb_book_text.setForeground(Color.red);
    }//GEN-LAST:event_pa_menu_bookMouseEntered

    private void pa_menu_bookMouseExited(MouseEvent evt) {//GEN-FIRST:event_pa_menu_bookMouseExited
        lb_book_text.setForeground(Color.black);
    }//GEN-LAST:event_pa_menu_bookMouseExited

    private void pa_menu_logoutMouseEntered(MouseEvent evt) {//GEN-FIRST:event_pa_menu_logoutMouseEntered
        lb_logout_text.setForeground(Color.red);
    }//GEN-LAST:event_pa_menu_logoutMouseEntered

    private void pa_menu_logoutMouseExited(MouseEvent evt) {//GEN-FIRST:event_pa_menu_logoutMouseExited
        lb_logout_text.setForeground(Color.black);
    }//GEN-LAST:event_pa_menu_logoutMouseExited

    private void pa_menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pa_menu_logoutMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pa_menu_logoutMouseClicked

    private void pa_menu_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pa_menu_searchMouseClicked
        CardLayout cl = (CardLayout)(pa_center.getLayout());
        cl.show(pa_center, "panel_search");
        System.out.println("change to panel_search");
    }//GEN-LAST:event_pa_menu_searchMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pa_menu_borrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pa_menu_borrowMouseClicked
        CardLayout cl = (CardLayout)(pa_center.getLayout());
        cl.show(pa_center, "panel_borrow");
        System.out.println("change to panel_borrow");
    }//GEN-LAST:event_pa_menu_borrowMouseClicked

    private void pa_menu_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pa_menu_bookMouseClicked
        CardLayout cl = (CardLayout)(pa_center.getLayout());
        cl.show(pa_center, "panel_book");
        System.out.println("change to panel_book");
    }//GEN-LAST:event_pa_menu_bookMouseClicked

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_ADMIN;
    private javax.swing.JLabel lb_book_icon;
    private javax.swing.JLabel lb_book_text;
    private javax.swing.JLabel lb_borrow_icon;
    private javax.swing.JLabel lb_borrow_text;
    private javax.swing.JLabel lb_logout_icon;
    private javax.swing.JLabel lb_logout_text;
    private javax.swing.JLabel lb_search_icon;
    private javax.swing.JLabel lb_search_text;
    private javax.swing.JPanel pa_book;
    private javax.swing.JPanel pa_borrow;
    private javax.swing.JPanel pa_center;
    private javax.swing.JPanel pa_menu;
    private javax.swing.JPanel pa_menu_book;
    private javax.swing.JPanel pa_menu_borrow;
    private javax.swing.JPanel pa_menu_logout;
    private javax.swing.JPanel pa_menu_search;
    private javax.swing.JPanel pa_search;
    // End of variables declaration//GEN-END:variables
}