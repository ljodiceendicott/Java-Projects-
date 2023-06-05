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
public class SurvivorWin extends javax.swing.JFrame {

    /**
     * Creates new form SurvivorWin
     */
    public SurvivorWin() {
        initComponents();
    }
    public SurvivorWin(Survivor s){
        initComponents();
        jlblSurvname.setText(s.getName());
        lblunlock.setText(s.getUnlocking());
        lblPassive.setText(s.getPassive());
        lblSpeed.setText(s.getSpeed());
        lblArmor.setText(s.getArmor());
        lblHealth.setText(s.getHealth());
        lblHealthRegen.setText(s.getHealthregen());
        lblDamage.setText(s.getDamage());
            Ability ab1 = s.getAbility(0);
            lblability1type.setText(ab1.getLoadoutSlot());
            lblability1name.setText(ab1.getName());
            lblability1cd.setText("Cooldown:"+ab1.getCD());
            lblability1desc.setText(ab1.getDescrp());
            
            Ability ab2 = s.getAbility(1);
            lblability2type.setText(ab2.getLoadoutSlot());
            lblability2name.setText(ab2.getName());
            lblability2cd.setText("Cooldown:"+ab2.getCD());
            lblability2desc.setText(ab2.getDescrp());
            
            Ability ab3 = s.getAbility(2);
            lblability3type.setText(ab3.getLoadoutSlot());
            lblability3name.setText(ab3.getName());
            lblability3cd.setText("Cooldown:"+ab3.getCD());
            lblability3desc.setText(ab3.getDescrp());
        
            Ability ab4 = s.getAbility(3);
            lblability4type.setText(ab4.getLoadoutSlot());
            lblability4name.setText(ab4.getName());
            lblability4cd.setText("Cooldown:"+ab4.getCD());
            lblability4desc.setText(ab4.getDescrp());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblSurvname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSpeed = new javax.swing.JLabel();
        jlblArmorLabel = new javax.swing.JLabel();
        lblArmor = new javax.swing.JLabel();
        jlblHealthLabel = new javax.swing.JLabel();
        lblHealth = new javax.swing.JLabel();
        lblHealthRegenLabel = new javax.swing.JLabel();
        lblHealthRegen = new javax.swing.JLabel();
        lblDamageLabel = new javax.swing.JLabel();
        lblDamage = new javax.swing.JLabel();
        jlblSpeedLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUnlockLabel = new javax.swing.JLabel();
        lblunlock = new javax.swing.JLabel();
        jlblPassLabel = new javax.swing.JLabel();
        lblPassive = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ability1panel = new javax.swing.JPanel();
        lblability1desc = new javax.swing.JLabel();
        lblability1cd = new javax.swing.JLabel();
        lblability1type = new javax.swing.JLabel();
        lblability2type = new javax.swing.JLabel();
        ability2panel = new javax.swing.JPanel();
        lblability2cd = new javax.swing.JLabel();
        lblability2desc = new javax.swing.JLabel();
        lblability3type = new javax.swing.JLabel();
        ability3panel = new javax.swing.JPanel();
        lblability3desc = new javax.swing.JLabel();
        lblability3cd = new javax.swing.JLabel();
        lblability4type = new javax.swing.JLabel();
        ability4panel = new javax.swing.JPanel();
        lblability4desc = new javax.swing.JLabel();
        lblability4cd = new javax.swing.JLabel();
        lblability1name = new javax.swing.JLabel();
        lblability2name = new javax.swing.JLabel();
        lblability3name = new javax.swing.JLabel();
        lblability4name = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jlblSurvname.setFont(new java.awt.Font("Terminator Two", 1, 24)); // NOI18N
        jlblSurvname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblSurvname.setText("Survivor");

        lblSpeed.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblSpeed.setText("jLabel7");

        jlblArmorLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jlblArmorLabel.setText("Armor:");

        lblArmor.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblArmor.setText("jLabel9");

        jlblHealthLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jlblHealthLabel.setText("Health:");

        lblHealth.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblHealth.setText("jLabel11");

        lblHealthRegenLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblHealthRegenLabel.setText("Health Regen:");

        lblHealthRegen.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblHealthRegen.setText("jLabel13");

        lblDamageLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblDamageLabel.setText("Damage:");

        lblDamage.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblDamage.setText("jLabel15");

        jlblSpeedLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jlblSpeedLabel.setText("Speed:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDamageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDamage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblSpeedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSpeed))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHealthRegenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHealthRegen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblArmorLabel)
                            .addComponent(jlblHealthLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHealth)
                            .addComponent(lblArmor))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSpeed)
                    .addComponent(jlblSpeedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblArmorLabel)
                    .addComponent(lblArmor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblHealthLabel)
                    .addComponent(lblHealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthRegenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthRegen))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDamageLabel)
                    .addComponent(lblDamage))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        lblUnlockLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblUnlockLabel.setText("How to Unlock ->");

        lblunlock.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblunlock.setText("jLabel2");

        jlblPassLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jlblPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblPassLabel.setText("Passive->");

        lblPassive.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblPassive.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblUnlockLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblunlock, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPassive)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnlockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblunlock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassive))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ability1panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ability1panel.setPreferredSize(new java.awt.Dimension(756, 100));

        lblability1desc.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblability1desc.setText("Ability Description");

        lblability1cd.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblability1cd.setText("cooldown");

        javax.swing.GroupLayout ability1panelLayout = new javax.swing.GroupLayout(ability1panel);
        ability1panel.setLayout(ability1panelLayout);
        ability1panelLayout.setHorizontalGroup(
            ability1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ability1panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ability1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblability1cd)
                    .addComponent(lblability1desc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ability1panelLayout.setVerticalGroup(
            ability1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ability1panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblability1cd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblability1desc)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblability1type.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblability1type.setText("Ability type");

        lblability2type.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblability2type.setText("Ability type");

        ability2panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblability2cd.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblability2cd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblability2cd.setText("cooldown");

        lblability2desc.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblability2desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblability2desc.setText("Ability Description");

        javax.swing.GroupLayout ability2panelLayout = new javax.swing.GroupLayout(ability2panel);
        ability2panel.setLayout(ability2panelLayout);
        ability2panelLayout.setHorizontalGroup(
            ability2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ability2panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ability2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblability2cd)
                    .addComponent(lblability2desc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ability2panelLayout.setVerticalGroup(
            ability2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ability2panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblability2cd)
                .addGap(18, 18, 18)
                .addComponent(lblability2desc)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lblability3type.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblability3type.setText("Ability type");

        ability3panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblability3desc.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblability3desc.setText("Ability Description");

        lblability3cd.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblability3cd.setText("cooldown");

        javax.swing.GroupLayout ability3panelLayout = new javax.swing.GroupLayout(ability3panel);
        ability3panel.setLayout(ability3panelLayout);
        ability3panelLayout.setHorizontalGroup(
            ability3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ability3panelLayout.createSequentialGroup()
                .addGroup(ability3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ability3panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblability3cd))
                    .addGroup(ability3panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblability3desc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ability3panelLayout.setVerticalGroup(
            ability3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ability3panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblability3cd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblability3desc)
                .addGap(28, 28, 28))
        );

        lblability4type.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblability4type.setText("Ability type");

        ability4panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblability4desc.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lblability4desc.setText("Ability Description");

        lblability4cd.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblability4cd.setText("cooldown");

        javax.swing.GroupLayout ability4panelLayout = new javax.swing.GroupLayout(ability4panel);
        ability4panel.setLayout(ability4panelLayout);
        ability4panelLayout.setHorizontalGroup(
            ability4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ability4panelLayout.createSequentialGroup()
                .addGroup(ability4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ability4panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblability4cd))
                    .addGroup(ability4panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblability4desc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ability4panelLayout.setVerticalGroup(
            ability4panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ability4panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblability4cd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblability4desc)
                .addGap(28, 28, 28))
        );

        lblability1name.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblability1name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblability1name.setText("Ability name");
        lblability1name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblability1name.setOpaque(true);

        lblability2name.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblability2name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblability2name.setText("Ability name");
        lblability2name.setOpaque(true);

        lblability3name.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblability3name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblability3name.setText("Ability name");
        lblability3name.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblability4name.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblability4name.setText("Ability 1 name");
        lblability4name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblability3type)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblability1name, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblability3name, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblability4name, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ability4panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ability3panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ability1panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
                            .addComponent(ability2panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblability4type, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblability1type, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblability2type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblability2name, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 382, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblability1type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblability1name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability1panel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblability2type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblability2name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability2panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblability3type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblability3name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability3panel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblability4type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblability4name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ability4panel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setBackground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("picture....Maybe");
        jLabel14.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jlblSurvname)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlblSurvname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(SurvivorWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurvivorWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurvivorWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurvivorWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SurvivorWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ability1panel;
    private javax.swing.JPanel ability2panel;
    private javax.swing.JPanel ability3panel;
    private javax.swing.JPanel ability4panel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlblArmorLabel;
    private javax.swing.JLabel jlblHealthLabel;
    private javax.swing.JLabel jlblPassLabel;
    private javax.swing.JLabel jlblSpeedLabel;
    private javax.swing.JLabel jlblSurvname;
    private javax.swing.JLabel lblArmor;
    private javax.swing.JLabel lblDamage;
    private javax.swing.JLabel lblDamageLabel;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblHealthRegen;
    private javax.swing.JLabel lblHealthRegenLabel;
    private javax.swing.JLabel lblPassive;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JLabel lblUnlockLabel;
    private javax.swing.JLabel lblability1cd;
    private javax.swing.JLabel lblability1desc;
    private javax.swing.JLabel lblability1name;
    private javax.swing.JLabel lblability1type;
    private javax.swing.JLabel lblability2cd;
    private javax.swing.JLabel lblability2desc;
    private javax.swing.JLabel lblability2name;
    private javax.swing.JLabel lblability2type;
    private javax.swing.JLabel lblability3cd;
    private javax.swing.JLabel lblability3desc;
    private javax.swing.JLabel lblability3name;
    private javax.swing.JLabel lblability3type;
    private javax.swing.JLabel lblability4cd;
    private javax.swing.JLabel lblability4desc;
    private javax.swing.JLabel lblability4name;
    private javax.swing.JLabel lblability4type;
    private javax.swing.JLabel lblunlock;
    // End of variables declaration//GEN-END:variables
}
