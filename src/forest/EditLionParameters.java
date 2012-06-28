/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forest;

/**
 *
 * @author abc
 */
public class EditLionParameters extends javax.swing.JFrame {

    /**
     * Creates new form EditGiraffeParameters
     */
    public EditLionParameters() {
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

        FertilisationFactorSlider = new javax.swing.JSlider();
        MutationPercentSlider = new javax.swing.JSlider();
        MaxAgeSlider = new javax.swing.JSlider();
        InitialLionsSlider = new javax.swing.JSlider();
        InitialEnergySlider = new javax.swing.JSlider();
        MaxVisionSlider = new javax.swing.JSlider();
        MaxSpeedSlider = new javax.swing.JSlider();
        EnergyToReproduceSlider = new javax.swing.JSlider();
        FertilisationFactor = new javax.swing.JLabel();
        MutationPercent = new javax.swing.JLabel();
        MaxAge = new javax.swing.JLabel();
        InitialLions = new javax.swing.JLabel();
        EnergyToReproduce = new javax.swing.JLabel();
        MaxSpeed = new javax.swing.JLabel();
        MaxVision = new javax.swing.JLabel();
        EnergyToMate = new javax.swing.JLabel();
        LabelFertilisationFactor = new javax.swing.JLabel();
        LabelMutPerc = new javax.swing.JLabel();
        LabelMaxAge = new javax.swing.JLabel();
        LabelInitialLions = new javax.swing.JLabel();
        LabelEnergyToMate = new javax.swing.JLabel();
        LabelMaxVision = new javax.swing.JLabel();
        LabelMaxSpeed = new javax.swing.JLabel();
        LabelEnergyToReproduce = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Forest Simulation: Edit Lion Parameters");
        setMinimumSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(null);

        FertilisationFactorSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        FertilisationFactorSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FertilisationFactorSliderStateChanged(evt);
            }
        });
        getContentPane().add(FertilisationFactorSlider);
        FertilisationFactorSlider.setBounds(30, 390, 200, 30);

        MutationPercentSlider.setMaximum(10);
        MutationPercentSlider.setToolTipText("");
        MutationPercentSlider.setValue(2);
        MutationPercentSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        MutationPercentSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MutationPercentSliderStateChanged(evt);
            }
        });
        getContentPane().add(MutationPercentSlider);
        MutationPercentSlider.setBounds(30, 40, 200, 30);

        MaxAgeSlider.setMaximum(1000);
        MaxAgeSlider.setValue(100);
        MaxAgeSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        MaxAgeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MaxAgeSliderStateChanged(evt);
            }
        });
        getContentPane().add(MaxAgeSlider);
        MaxAgeSlider.setBounds(30, 90, 200, 30);

        InitialLionsSlider.setMaximum(25);
        InitialLionsSlider.setToolTipText("");
        InitialLionsSlider.setValue(8);
        InitialLionsSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        InitialLionsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                InitialLionsSliderStateChanged(evt);
            }
        });
        getContentPane().add(InitialLionsSlider);
        InitialLionsSlider.setBounds(30, 140, 200, 30);

        InitialEnergySlider.setMaximum(500);
        InitialEnergySlider.setToolTipText("");
        InitialEnergySlider.setValue(100);
        InitialEnergySlider.setPreferredSize(new java.awt.Dimension(200, 30));
        InitialEnergySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                InitialEnergySliderStateChanged(evt);
            }
        });
        getContentPane().add(InitialEnergySlider);
        InitialEnergySlider.setBounds(30, 190, 200, 30);

        MaxVisionSlider.setMaximum(400);
        MaxVisionSlider.setValue(200);
        MaxVisionSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        MaxVisionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MaxVisionSliderStateChanged(evt);
            }
        });
        getContentPane().add(MaxVisionSlider);
        MaxVisionSlider.setBounds(30, 240, 200, 30);

        MaxSpeedSlider.setMaximum(300);
        MaxSpeedSlider.setValue(150);
        MaxSpeedSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        MaxSpeedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MaxSpeedSliderStateChanged(evt);
            }
        });
        getContentPane().add(MaxSpeedSlider);
        MaxSpeedSlider.setBounds(30, 290, 200, 30);

        EnergyToReproduceSlider.setMaximum(600);
        EnergyToReproduceSlider.setToolTipText("");
        EnergyToReproduceSlider.setValue(300);
        EnergyToReproduceSlider.setPreferredSize(new java.awt.Dimension(200, 30));
        EnergyToReproduceSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EnergyToReproduceSliderStateChanged(evt);
            }
        });
        getContentPane().add(EnergyToReproduceSlider);
        EnergyToReproduceSlider.setBounds(30, 340, 200, 30);

        FertilisationFactor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FertilisationFactor.setText("Fertilisation Factor");
        getContentPane().add(FertilisationFactor);
        FertilisationFactor.setBounds(290, 400, 200, 20);

        MutationPercent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MutationPercent.setText("Mutation Percent");
        getContentPane().add(MutationPercent);
        MutationPercent.setBounds(290, 50, 160, 20);

        MaxAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MaxAge.setText("Max Age");
        getContentPane().add(MaxAge);
        MaxAge.setBounds(290, 100, 160, 20);

        InitialLions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InitialLions.setText("Initial no. of lions");
        getContentPane().add(InitialLions);
        InitialLions.setBounds(290, 150, 200, 20);

        EnergyToReproduce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnergyToReproduce.setText("Energy To Reproduce");
        getContentPane().add(EnergyToReproduce);
        EnergyToReproduce.setBounds(290, 350, 190, 20);

        MaxSpeed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MaxSpeed.setText("Max Speed");
        getContentPane().add(MaxSpeed);
        MaxSpeed.setBounds(290, 300, 200, 20);

        MaxVision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MaxVision.setText("Max Vision");
        getContentPane().add(MaxVision);
        MaxVision.setBounds(290, 250, 200, 20);

        EnergyToMate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnergyToMate.setText("Initial Energy");
        getContentPane().add(EnergyToMate);
        EnergyToMate.setBounds(290, 200, 200, 20);

        LabelFertilisationFactor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelFertilisationFactor.setText("50");
        LabelFertilisationFactor.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelFertilisationFactor.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelFertilisationFactor);
        LabelFertilisationFactor.setBounds(490, 400, 80, 20);

        LabelMutPerc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelMutPerc.setText("2");
        LabelMutPerc.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelMutPerc.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelMutPerc);
        LabelMutPerc.setBounds(490, 50, 80, 20);

        LabelMaxAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelMaxAge.setText("100");
        LabelMaxAge.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelMaxAge.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelMaxAge);
        LabelMaxAge.setBounds(490, 100, 80, 20);

        LabelInitialLions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelInitialLions.setText("8");
        LabelInitialLions.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelInitialLions.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelInitialLions);
        LabelInitialLions.setBounds(490, 150, 80, 20);

        LabelEnergyToMate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelEnergyToMate.setText("100");
        LabelEnergyToMate.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelEnergyToMate.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelEnergyToMate);
        LabelEnergyToMate.setBounds(490, 200, 80, 20);

        LabelMaxVision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelMaxVision.setText("200");
        LabelMaxVision.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelMaxVision.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelMaxVision);
        LabelMaxVision.setBounds(490, 250, 80, 20);

        LabelMaxSpeed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelMaxSpeed.setText("150");
        LabelMaxSpeed.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelMaxSpeed.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelMaxSpeed);
        LabelMaxSpeed.setBounds(490, 300, 80, 20);

        LabelEnergyToReproduce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelEnergyToReproduce.setText("300");
        LabelEnergyToReproduce.setMinimumSize(new java.awt.Dimension(34, 20));
        LabelEnergyToReproduce.setPreferredSize(new java.awt.Dimension(34, 20));
        getContentPane().add(LabelEnergyToReproduce);
        LabelEnergyToReproduce.setBounds(490, 350, 80, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forest/resources/lion2.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MutationPercentSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MutationPercentSliderStateChanged
        LabelMutPerc.setText(MutationPercentSlider.getValue() + "");
        Constants.mutabslvision = MutationPercentSlider.getValue() * Constants.lmaxvision / 100;
        Constants.mutabslspeed = MutationPercentSlider.getValue() * Constants.lmaxspeed / 100;
        Constants.mutabssize = MutationPercentSlider.getValue() * Constants.lsize / 100;
        Constants.mutabslefficiency = MutationPercentSlider.getValue() * Constants.mutabslefficiency / 100;
    }//GEN-LAST:event_MutationPercentSliderStateChanged

    private void MaxAgeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MaxAgeSliderStateChanged
        LabelMaxAge.setText(MaxAgeSlider.getValue() + "");
        Constants.lmaxage = MaxAgeSlider.getValue();
    }//GEN-LAST:event_MaxAgeSliderStateChanged

    private void InitialLionsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_InitialLionsSliderStateChanged
        LabelInitialLions.setText(InitialLionsSlider.getValue() + "");
        Constants.ArenaInitialLions = InitialLionsSlider.getValue();
    }//GEN-LAST:event_InitialLionsSliderStateChanged

    private void InitialEnergySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_InitialEnergySliderStateChanged
        LabelEnergyToMate.setText(InitialEnergySlider.getValue() + "");
        Constants.initialLenergy = InitialEnergySlider.getValue();
    }//GEN-LAST:event_InitialEnergySliderStateChanged

    private void MaxVisionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MaxVisionSliderStateChanged
        LabelMaxVision.setText(MaxVisionSlider.getValue() + "");
        Constants.lmaxvision = MaxVisionSlider.getValue();
    }//GEN-LAST:event_MaxVisionSliderStateChanged

    private void MaxSpeedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MaxSpeedSliderStateChanged
        LabelMaxSpeed.setText(MaxSpeedSlider.getValue() + "");
        Constants.lmaxspeed = MaxSpeedSlider.getValue();
    }//GEN-LAST:event_MaxSpeedSliderStateChanged

    private void EnergyToReproduceSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EnergyToReproduceSliderStateChanged
        LabelEnergyToReproduce.setText(EnergyToReproduceSlider.getValue() + "");
        Constants.lenergytoreproduce= EnergyToReproduceSlider.getValue();
    }//GEN-LAST:event_EnergyToReproduceSliderStateChanged

    private void FertilisationFactorSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FertilisationFactorSliderStateChanged
        LabelFertilisationFactor.setText(FertilisationFactorSlider.getValue() + "");
        Constants.lfertiliationfactor = FertilisationFactorSlider.getValue() / 100.0;// TODO add your handling code here:
    }//GEN-LAST:event_FertilisationFactorSliderStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditLionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EditLionParameters().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnergyToMate;
    private javax.swing.JLabel EnergyToReproduce;
    private javax.swing.JSlider EnergyToReproduceSlider;
    private javax.swing.JLabel FertilisationFactor;
    private javax.swing.JSlider FertilisationFactorSlider;
    private javax.swing.JSlider InitialEnergySlider;
    private javax.swing.JLabel InitialLions;
    private javax.swing.JSlider InitialLionsSlider;
    private javax.swing.JLabel LabelEnergyToMate;
    private javax.swing.JLabel LabelEnergyToReproduce;
    private javax.swing.JLabel LabelFertilisationFactor;
    private javax.swing.JLabel LabelInitialLions;
    private javax.swing.JLabel LabelMaxAge;
    private javax.swing.JLabel LabelMaxSpeed;
    private javax.swing.JLabel LabelMaxVision;
    private javax.swing.JLabel LabelMutPerc;
    private javax.swing.JLabel MaxAge;
    private javax.swing.JSlider MaxAgeSlider;
    private javax.swing.JLabel MaxSpeed;
    private javax.swing.JSlider MaxSpeedSlider;
    private javax.swing.JLabel MaxVision;
    private javax.swing.JSlider MaxVisionSlider;
    private javax.swing.JLabel MutationPercent;
    private javax.swing.JSlider MutationPercentSlider;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}