/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import static jodicelukeendicott.riskofrain2database.Main.mmw;

/**
 *
 * @author lukej
 */
public class GameItemSelectionWin extends javax.swing.JFrame {
    public DefaultListModel<GameItem> dlm;
     private ArrayList<GameItem> al;
     private ArrayList<GameItem> dlmArrayl;
     /*
     private ArrayList<GameItem> white;
     private ArrayList<GameItem> green;
     private ArrayList<GameItem> red;
     private ArrayList<GameItem> boss;
     private ArrayList<GameItem> lunar;
     private ArrayList<GameItem> other; */
  //  public Hashtable<String,ArrayList<GameItem>> directory;
    int idx = -1;
    /**
     * Creates new form GameItemSelectionWin
     */
    public GameItemSelectionWin() {
        dlm = new DefaultListModel<>();
        al = new ArrayList<>();
        dlmArrayl = new ArrayList<>();
        /*
        white = new ArrayList<>();
        green = new ArrayList<>();
        red = new ArrayList<>();
        boss = new ArrayList<>();
        lunar = new ArrayList<>();
        other = new ArrayList<>();
        
        directory = new Hashtable<>();
        */
          initComponents();
          jbtngetinfo.setEnabled(false);
          try {
            ReadFiles rf = new ReadFiles();
              al = rf.readItemtxtFile();
           
       } catch (FileNotFoundException ex) {
          System.out.println("Error:"+ ex);
       }
          
          al.forEach(itm -> {
              dlm.addElement(itm);
              dlmArrayl.add(itm);
                    }); 
             /* if(itm.getRarity().equals("white")){
                 white.add(itm);
             }
             else if(itm.getRarity().equals("green")){
                 green.add(itm);
             }
             else if(itm.getRarity().equals("red")){
                 red.add(itm);
             }
             else if(itm.getRarity().equals("boss")){
                 boss.add(itm);
             }
             else if(itm.getRarity().equals("blue")){
                 lunar.add(itm);
             }
             else if(itm.getRarity().equals("other")){
                 other.add(itm);      
             }
      //forloop
        directory.put("white", white);
        directory.put("green", green);
        directory.put("red", red);
        directory.put("boss", boss);
        directory.put("lunar", lunar);
        directory.put("other", other);
          */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jbtngetinfo = new javax.swing.JButton();
        jbtnTglAll = new javax.swing.JToggleButton();
        jbtnTglgreen = new javax.swing.JToggleButton();
        jbtnTglred = new javax.swing.JToggleButton();
        jbtnTglwhite = new javax.swing.JToggleButton();
        jbtnTglboss = new javax.swing.JToggleButton();
        jbtnTgllunar = new javax.swing.JToggleButton();
        jbtnTglother = new javax.swing.JToggleButton();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item Selection");

        jList1.setModel(dlm);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jbtngetinfo.setText("Get Item Info");
        jbtngetinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtngetinfoActionPerformed(evt);
            }
        });

        jbtnTglAll.setSelected(true);
        jbtnTglAll.setText("All Items");
        jbtnTglAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTglAllActionPerformed(evt);
            }
        });

        jbtnTglgreen.setText("Green Items");
        jbtnTglgreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTglgreenActionPerformed(evt);
            }
        });

        jbtnTglred.setText("Red Items");
        jbtnTglred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTglredActionPerformed(evt);
            }
        });

        jbtnTglwhite.setText("White Items");
        jbtnTglwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTglwhiteActionPerformed(evt);
            }
        });

        jbtnTglboss.setText("Boss Items");
        jbtnTglboss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTglbossActionPerformed(evt);
            }
        });

        jbtnTgllunar.setText("Lunar Items");
        jbtnTgllunar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTgllunarActionPerformed(evt);
            }
        });

        jbtnTglother.setText("Misc. Items");
        jbtnTglother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTglotherActionPerformed(evt);
            }
        });

        btnback.setText("Back to Menu");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jbtngetinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnTglother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnTglAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnTglgreen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jbtnTglwhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnTglred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnTglboss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnTgllunar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtngetinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbtnTglAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnTglwhite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnTglgreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnTglred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTglboss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnTgllunar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnTglother)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtngetinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtngetinfoActionPerformed
       if(idx>-1){
   GameItemWin giw = new GameItemWin(dlm.get(idx));
   giw.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null, "You need to select an item");
       }
    }//GEN-LAST:event_jbtngetinfoActionPerformed

    private void jbtnTglAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTglAllActionPerformed
        
        dlm.clear();
        dlmArrayl.forEach(itm -> {
              dlm.addElement(itm);
        });
        this.fixButtonState(jbtnTglAll);
        
    }//GEN-LAST:event_jbtnTglAllActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        mmw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void jbtnTglwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTglwhiteActionPerformed
         dlm.clear();
          this.addtodlm("white");
          this.fixButtonState(jbtnTglwhite);
    }//GEN-LAST:event_jbtnTglwhiteActionPerformed

    private void jbtnTglgreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTglgreenActionPerformed
    dlm.clear();
    this.addtodlm("green");
    this.fixButtonState(jbtnTglgreen);
    }//GEN-LAST:event_jbtnTglgreenActionPerformed

    private void jbtnTglredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTglredActionPerformed
    dlm.clear();
    this.addtodlm("red");
    this.fixButtonState(jbtnTglred);
    }//GEN-LAST:event_jbtnTglredActionPerformed

    private void jbtnTglbossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTglbossActionPerformed
    dlm.clear();
    this.addtodlm("boss");
    this.fixButtonState(jbtnTglboss);       
    }//GEN-LAST:event_jbtnTglbossActionPerformed

    private void jbtnTgllunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTgllunarActionPerformed
    dlm.clear();
    this.addtodlm("blue");
    this.fixButtonState(jbtnTgllunar);
    }//GEN-LAST:event_jbtnTgllunarActionPerformed

    private void jbtnTglotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTglotherActionPerformed
    dlm.clear();
    this.addtodlm("other");
    this.fixButtonState(jbtnTglother);
    }//GEN-LAST:event_jbtnTglotherActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
   if(evt.getValueIsAdjusting()){
       idx = evt.getLastIndex();
        jbtngetinfo.setEnabled(true);
   }
    }//GEN-LAST:event_jList1ValueChanged

    private void addtodlm(String type){
        if(jbtnTglAll.isSelected()){
        dlm.clear();
        jbtnTglAll.setSelected(false);
        jbtnTglAll.setEnabled(true);
        }
        al.forEach(itm-> {
         if(itm.getRarity().equals(type)){
             dlm.addElement(itm);
             dlmArrayl.add(itm);
         }
    });
    }
    private void fixButtonState(JToggleButton b){
        jbtnTglAll.setSelected(false);
        jbtnTglboss.setSelected(false);
        jbtnTglwhite.setSelected(false);
        jbtnTglgreen.setSelected(false);
        jbtnTglred.setSelected(false);
        jbtnTgllunar.setSelected(false);
        jbtnTglother.setSelected(false);
        b.setSelected(true);
        
    }
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
            java.util.logging.Logger.getLogger(GameItemSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameItemSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameItemSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameItemSelectionWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameItemSelectionWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<GameItem> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jbtnTglAll;
    private javax.swing.JToggleButton jbtnTglboss;
    private javax.swing.JToggleButton jbtnTglgreen;
    private javax.swing.JToggleButton jbtnTgllunar;
    private javax.swing.JToggleButton jbtnTglother;
    private javax.swing.JToggleButton jbtnTglred;
    private javax.swing.JToggleButton jbtnTglwhite;
    private javax.swing.JButton jbtngetinfo;
    // End of variables declaration//GEN-END:variables
}
