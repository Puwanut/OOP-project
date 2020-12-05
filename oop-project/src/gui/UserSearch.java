/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.Book;
import database.Connect;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author IsilenceT
 */
public class UserSearch extends javax.swing.JPanel {

    /**
     * Creates new form UserSearch
     */
    private ArrayList<Book> all_books_list;
    
    public UserSearch() {
        initComponents();
        
        ImageIcon icon_search_small = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_search.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        btn_search.setIcon(icon_search_small);

        ImageIcon icon_clear_search = new ImageIcon(new ImageIcon(getClass().getResource("../image/icon_clear_search.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        btn_reset.setIcon(icon_clear_search);
        
        all_books_list = booklist();
        showBookTable(all_books_list);
    }
    
    public ArrayList<Book> booklist(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        try {
            Connection con = Connect.connectDB();
            String querybook = "SELECT * FROM bookinfo";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(querybook);
            Book book;
            while (rs.next()){
                book = new Book(rs.getBytes("imgbook"), rs.getString("bname"), rs.getString("bookauthor"), rs.getBoolean("status"));
                booksList.add(book);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return booksList;
    }
    
    public ArrayList<Book> booklist(String searchtext){
        ArrayList<Book> booksList = new ArrayList<Book>();
        try {
            Connection con = Connect.connectDB();
            String querybook = "SELECT * FROM bookinfo WHERE CONCAT(bname, bookauthor) LIKE '%" + searchtext + "%'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(querybook);
            Book book;
            while (rs.next()){
                book = new Book(rs.getBytes("imgbook"), rs.getString("bname"), rs.getString("bookauthor"), rs.getBoolean("status"));
                booksList.add(book);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return booksList;
    }
    
    public void showBookTable(ArrayList<Book> list) {
//        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableModel model = (DefaultTableModel) JTable_bookinfo.getModel();
//        Object[] newIdentifiers = new Object[]{"รูปปกหนังสือ", "ชื่อหนังสือ", "ชื่อ", "d"};
//        model.setColumnIdentifiers(newIdentifiers);
        JTable_bookinfo.getColumn("รูปปกหนังสือ").setCellRenderer(new MyTableCellRenderer());
        Object[] row = new Object[4];
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getImgbook()).getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
            JLabel imagelb = new JLabel();
            imagelb.setIcon(image);
            row[0] = imagelb;
            row[1] = list.get(i).getBname();
            row[2] = list.get(i).getBookauthor();
            if (list.get(i).getStatus() == true) {
                row[3] = "Available";
            } else {
                row[3] = "UnAvailable";
            }
            model.addRow(row);
        }
//        for (int i=1; i<4; i++){
//            JTable_bookinfo.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
//            JTable_bookinfo.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
//        }
    }
    
    class MyTableCellRenderer implements TableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
//            TableColumn tb = JTable_bookinfo.getColumn("รูปปกหนังสือ");
//            tb.setPreferredWidth(150);
//            tb.setMaxWidth(150);
//            JTable_bookinfo.setRowHeight(200);
            return (Component) value;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_search = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_bookinfo = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        lb_search.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        lb_search.setText("ข้อมูลที่ต้องการค้นหา");

        tf_search.setFont(new java.awt.Font("Kanit", 0, 18)); // NOI18N
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        btn_search.setText("ค้นหา");
        btn_search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Kanit", 0, 24)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        JTable_bookinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "รูปปกหนังสือ", "ชื่อหนังสือ", "ชื่อผู้แต่ง", "สถานะ"
            }
        ));
        JTable_bookinfo.setRowHeight(200);
        jScrollPane1.setViewportView(JTable_bookinfo);
        if (JTable_bookinfo.getColumnModel().getColumnCount() > 0) {
            JTable_bookinfo.getColumnModel().getColumn(0).setMinWidth(150);
            JTable_bookinfo.getColumnModel().getColumn(0).setPreferredWidth(150);
            JTable_bookinfo.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_search)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed

    }//GEN-LAST:event_tf_searchActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       showBookTable(booklist(tf_search.getText()));
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        showBookTable(all_books_list);
    }//GEN-LAST:event_btn_resetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_bookinfo;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_search;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
