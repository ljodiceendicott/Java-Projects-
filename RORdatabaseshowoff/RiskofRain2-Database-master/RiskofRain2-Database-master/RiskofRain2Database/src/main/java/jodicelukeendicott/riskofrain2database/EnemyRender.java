/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import static java.awt.Color.gray;
import static java.awt.Color.white;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author lukej
 */
public class EnemyRender extends javax.swing.JPanel implements ListCellRenderer<Enemy> {

    /**
     * Creates new form EnemyRender
     */
    public EnemyRender() {
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

        jlbName = new javax.swing.JLabel();

        jlbName.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbName, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbName, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
     @Override
    public Component getListCellRendererComponent(JList<? extends Enemy> list, Enemy itm, int idx, boolean isSelected, boolean cellHasFocus) {
      jlbName.setText(itm.getName());
      if(isSelected)
          setBackground(white);
      else{
          setBackground(gray);
      }
           return this;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbName;
    // End of variables declaration//GEN-END:variables
}
