/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui;

import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.FileUtils;
import acousticfield3d.utils.Parse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author am14010
 */
public class SoundCalibDataForm extends javax.swing.JFrame {
    final MainForm mf;
    
    public SoundCalibDataForm(MainForm mf) {
        this.mf = mf;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        outputText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelText = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mPerDimText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        xSText = new javax.swing.JTextField();
        ySText = new javax.swing.JTextField();
        zSText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xAvgText = new javax.swing.JTextField();
        yAvgText = new javax.swing.JTextField();
        zAvgText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        xStdText = new javax.swing.JTextField();
        yStdText = new javax.swing.JTextField();
        zStdText = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generate Data for Sound Calib");

        jLabel1.setText("folder output:");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("llabel:");

        labelText.setText("testData");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("measures per dimension:");

        mPerDimText.setText("3");

        jLabel13.setText("S:");

        jLabel10.setText("S:");

        jLabel7.setText("S:");

        xSText.setText("0.05");

        ySText.setText("0.05");
        ySText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ySTextActionPerformed(evt);
            }
        });

        zSText.setText("0.05");

        jLabel12.setText("Avg:");

        jLabel9.setText("Avg:");

        jLabel6.setText("Avg:");

        xAvgText.setText("0.01");

        yAvgText.setText("0.01");

        zAvgText.setText("0.01");

        jLabel11.setText("Std:");

        jLabel8.setText("Std:");

        jLabel14.setText("Std:");

        xStdText.setText("0.01");

        yStdText.setText("0.01");

        zStdText.setText("0.01");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputText, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelText))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mPerDimText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zSText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zStdText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xSText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xStdText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ySText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yStdText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mPerDimText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(xAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(xStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(yStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ySText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(zAvgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(zStdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(generateButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ySTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ySTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ySTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String file = FileUtils.selectDirectory(this, "select", null);
        if (file != null){
            outputText.setText(file);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        //get the selected point
        if (mf.selection.isEmpty()) {
            return;
        }

        final List<Transducer> transducers = mf.simulation.transducers;
        final int nTrans = transducers.size();
        final String output = outputText.getText();
        final String label = labelText.getText();
        final int mPerDim = Parse.toInt(mPerDimText.getText());
        final Vector3f scale = new Vector3f(xSText.getText(), ySText.getText(), zSText.getText());
        final Vector3f avg = new Vector3f(xAvgText.getText(), yAvgText.getText(), zAvgText.getText());
        final Vector3f std = new Vector3f(xStdText.getText(), yStdText.getText(), zStdText.getText());

        //pick the first entity in the selection as the position to start the measures
        final Vector3f initMPos = mf.selection.get(0).getTransform().getTranslation().clone();
        
        initMPos.subtractLocal( scale.divide(2) );
        scale.divideLocal(mPerDim);

        StringBuilder tReal = new StringBuilder();
        StringBuilder tInitial = new StringBuilder();
        StringBuilder mReal = new StringBuilder();
        StringBuilder mInitial = new StringBuilder();
        StringBuilder distances = new StringBuilder();
        

        final Vector3f pos = new Vector3f();
        final Vector3f posReal = new Vector3f();
        final Vector3f noise = new Vector3f();
        
        for(Transducer t : transducers){
            noise.setRandomGaus(avg, std);
                    
            posReal.set( t.getTransform().getTranslation() );
            pos.set( posReal ).addLocal( noise );
            
            tReal.append(posReal.toStringSimple(",") + "\n");
            tInitial.append(pos.toStringSimple(",") + "\n");
        }
        
        for (int ix = 0; ix < mPerDim; ++ix) {
            for (int iy = 0; iy < mPerDim; ++iy) {
                for (int iz = 0; iz < mPerDim; ++iz) {
                    pos.set(scale).multLocal(ix, iy, iz).addLocal(initMPos);
                    noise.setRandomGaus(avg, std);
                    posReal.set(pos).addLocal(noise);

                    mReal.append(posReal.toStringSimple(",") + "\n");
                    mInitial.append(pos.toStringSimple(",") + "\n");

                    for (int i = 0; i < nTrans; ++i) {
                        final Transducer t = transducers.get(i);
                        distances.append( posReal.distance( t.getTransform().getTranslation()) );
                        if (i != nTrans - 1) {
                            distances.append(",");
                        }
                    }
                    distances.append("\n");
                }

            }
        }
        
        try {
            FileUtils.writeBytesInFile(new File(output, label + "_distances.csv"), distances.toString());
            FileUtils.writeBytesInFile(new File(output, label + "_initMeasures.csv"), mInitial.toString());
            FileUtils.writeBytesInFile(new File(output, label + "_realMeasures.csv"), mReal.toString());
            FileUtils.writeBytesInFile(new File(output, label + "_realTransducers.csv"), tReal.toString());
            FileUtils.writeBytesInFile(new File(output, label + "_initialTransducers.csv"), tInitial.toString());
        } catch (IOException ex) {
            Logger.getLogger(SoundCalibDataForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField labelText;
    private javax.swing.JTextField mPerDimText;
    private javax.swing.JTextField outputText;
    private javax.swing.JTextField xAvgText;
    private javax.swing.JTextField xSText;
    private javax.swing.JTextField xStdText;
    private javax.swing.JTextField yAvgText;
    private javax.swing.JTextField ySText;
    private javax.swing.JTextField yStdText;
    private javax.swing.JTextField zAvgText;
    private javax.swing.JTextField zSText;
    private javax.swing.JTextField zStdText;
    // End of variables declaration//GEN-END:variables
}
