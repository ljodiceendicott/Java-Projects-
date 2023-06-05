/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

/**
 *
 * @author lukej
 */
public class RunLogViewWin extends javax.swing.JFrame {

    /**
     * Creates new form RunLogViewWin
     */
    public RunLogViewWin() {
        initComponents();
    }
    public RunLogViewWin(RunLogEntry en){
        initComponents();
        this.setName("Run Log Information: "+en.getName());
        jlbTime.setText("Time:"+en.getTime()+ "Minutes");
        jlbLoops.setText("Loops Complete:"+en.getStagesDone());
        jlcharname.setText(en.getSurvivorplayed());
        jlcharpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+en.getSurvivorplayed()+".png")));
        if(!en.getBeatGame()){
            if(en.getKilledBy()=="I have no idea"){
                jlkilledbyname.setText("Unknown");
            }
            else{
        jlkilledbyname.setText(en.getKilledBy());
        jlenemypic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+en.getKilledBy()+".png")));
            }
        lbdefeated.setText("Good Try");
        }
        else{
            jlkilled.setText("Beat Game");
            jlkilledbyname.setText("Defeated Mithrix");
        jlenemypic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mithrix.png")));
        lbdefeated.setText("Defeated");
                }
        jtpnotes.setText(en.getNotes());
        this.setTitle(en.getName());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbLoops = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlcharname = new javax.swing.JLabel();
        jlcharpic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpnotes = new javax.swing.JTextPane();
        killedbypanel = new javax.swing.JPanel();
        jlkilled = new javax.swing.JLabel();
        jlenemypic = new javax.swing.JLabel();
        jlkilledbyname = new javax.swing.JLabel();
        lbdefeated = new javax.swing.JLabel();

        jlbTime.setFont(new java.awt.Font("Terminator Two", 1, 30)); // NOI18N
        jlbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTime.setText("Time:");

        jLabel2.setFont(new java.awt.Font("Terminator Two", 1, 24)); // NOI18N

        jlbLoops.setFont(new java.awt.Font("Terminator Two", 0, 24)); // NOI18N
        jlbLoops.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLoops.setText("Loops Complete:");

        jlcharname.setFont(new java.awt.Font("Terminator Two", 1, 36)); // NOI18N
        jlcharname.setText("char play");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlcharname)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlcharpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlcharname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlcharpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Terminator Two", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Notes from the run");

        jtpnotes.setEditable(false);
        jScrollPane1.setViewportView(jtpnotes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jlkilled.setFont(new java.awt.Font("Terminator Two", 1, 24)); // NOI18N
        jlkilled.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlkilled.setText("Enemy killed by");

        jlkilledbyname.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        jlkilledbyname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlkilledbyname.setText("jLabel4");

        lbdefeated.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lbdefeated.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout killedbypanelLayout = new javax.swing.GroupLayout(killedbypanel);
        killedbypanel.setLayout(killedbypanelLayout);
        killedbypanelLayout.setHorizontalGroup(
            killedbypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlkilled, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addGroup(killedbypanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(killedbypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlenemypic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlkilledbyname, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbdefeated, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        killedbypanelLayout.setVerticalGroup(
            killedbypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(killedbypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlkilled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlkilledbyname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlenemypic, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbdefeated, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(killedbypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbLoops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTime)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbLoops)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(killedbypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RunLogViewWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunLogViewWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunLogViewWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunLogViewWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunLogViewWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbLoops;
    private javax.swing.JLabel jlbTime;
    private javax.swing.JLabel jlcharname;
    private javax.swing.JLabel jlcharpic;
    private javax.swing.JLabel jlenemypic;
    private javax.swing.JLabel jlkilled;
    private javax.swing.JLabel jlkilledbyname;
    private javax.swing.JTextPane jtpnotes;
    private javax.swing.JPanel killedbypanel;
    private javax.swing.JLabel lbdefeated;
    // End of variables declaration//GEN-END:variables
}