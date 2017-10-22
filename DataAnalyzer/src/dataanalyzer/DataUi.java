/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author jimstewart
 */
public class DataUi extends javax.swing.JFrame {
    String[] tables;
    List<String> fieldComboBoxModel;
    /**
     * Creates new form DataUi
     */
    public DataUi() {
        tables = getTableNames();
        fieldComboBoxModel = new ArrayList<String>();
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

        tableDropdownLabel = new javax.swing.JLabel();
        tableDropdown = new javax.swing.JComboBox<String>(tables);
        ColumnListLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ColumnList = new javax.swing.JList<>(new DefaultListModel<String>());
        jScrollPane1 = new javax.swing.JScrollPane();
        UsedColumnList = new javax.swing.JList<>(new DefaultListModel<String>());
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        CriteriaLabel = new javax.swing.JLabel();
        FieldNameComboBox = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDropdownLabel.setText("Table");

        tableDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableDropdownActionPerformed(evt);
            }
        });

        ColumnListLabel.setText("Columns");

        jScrollPane2.setViewportView(ColumnList);

        jScrollPane1.setViewportView(UsedColumnList);

        AddButton.setText("Add >>");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("<< Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        CriteriaLabel.setText("Criteria");

        jLabel1.setText("Field");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("This part will change depending on\ndata type. If it's numerical use <, >,\n=. If it's text, use equal to, contains,\nstarts with, ends with.");
        jScrollPane3.setViewportView(jTextArea1);

        jLabel2.setText("Table down here listing the criteria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CriteriaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FieldNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ColumnListLabel)
                                        .addComponent(tableDropdownLabel))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tableDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(277, 277, 277)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableDropdownLabel)
                    .addComponent(tableDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColumnListLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CriteriaLabel)
                        .addComponent(jLabel1)))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableDropdownActionPerformed
        String tableName = tableDropdown.getSelectedItem().toString();
        List<String> columns = getColumns(tableName);
        DefaultListModel m = new DefaultListModel();
        columns.stream().forEach((column) -> {
            m.addElement(column);
        });
        ColumnList.setModel(m);
    }//GEN-LAST:event_tableDropdownActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        List<String> c = ColumnList.getSelectedValuesList();
        for(String l:c){
            DefaultListModel<String> uclm = (DefaultListModel<String>)(UsedColumnList.getModel());
            uclm.addElement(tableDropdown.getSelectedItem() + "." + l);
            FieldNameComboBox.addItem(l);
            DefaultListModel<String> clm = (DefaultListModel<String>)(ColumnList.getModel());
            clm.removeElement(l);
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        List<String> c = UsedColumnList.getSelectedValuesList();
        for(String l:c){
            String[] splitListItem = l.split("\\.");
            String currentTable = tableDropdown.getSelectedItem().toString();
            if(splitListItem[0].equals(currentTable)){
                DefaultListModel<String> clm = (DefaultListModel<String>)(ColumnList.getModel());
                clm.addElement(splitListItem[1]);
            }
            FieldNameComboBox.removeItem(l);
            DefaultListModel<String> uclm = (DefaultListModel<String>)(UsedColumnList.getModel());
            uclm.removeElement(l);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DataUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DataUi().setVisible(true);
        });
    }

    private static String[] getTableNames(){
        String[] tableNames;
        DataReader dr = new DataReader();
        tableNames = dr.getTables();
        return tableNames;
    }
    
    private List<String> getColumns(String tableName){
        DataReader dr = new DataReader();
        List<String> columns = dr.getFieldNames(tableName);
        return columns;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JList<String> ColumnList;
    private javax.swing.JLabel ColumnListLabel;
    private javax.swing.JLabel CriteriaLabel;
    private javax.swing.JComboBox<String> FieldNameComboBox;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JList<String> UsedColumnList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> tableDropdown;
    private javax.swing.JLabel tableDropdownLabel;
    // End of variables declaration//GEN-END:variables
}
