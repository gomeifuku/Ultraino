/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui.misc;

import acousticfield3d.algorithms.CalcField;
import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Transform;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.Scene;
import acousticfield3d.simulation.Transducer;
import acousticfield3d.utils.Parse;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author am14010
 */
public class SweepTinyLevParameters extends javax.swing.JFrame {
    final MainForm mf;
    
    final List<Transform> transforms = new ArrayList<>();
    public SweepTinyLevParameters(MainForm mf) {
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

        jLabel1 = new javax.swing.JLabel();
        pointsRadText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radiousVarText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        angleVarText = new javax.swing.JTextField();
        pointsAngleText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        evaluateButton = new javax.swing.JButton();
        snapButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("NPoints:");

        pointsRadText.setText("25");

        jLabel2.setText("Radious variation:");

        radiousVarText.setText("0.5");

        jLabel3.setText("Angle variation:");

        angleVarText.setText("0.5");

        pointsAngleText.setText("25");

        jLabel4.setText("NPoints:");

        evaluateButton.setText("Evaluate");
        evaluateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateButtonActionPerformed(evt);
            }
        });

        snapButton.setText("Snap");
        snapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapButtonActionPerformed(evt);
            }
        });

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiousVarText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pointsRadText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angleVarText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pointsAngleText)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(evaluateButton)
                        .addGap(18, 18, 18)
                        .addComponent(snapButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(applyButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pointsRadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(radiousVarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pointsAngleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(angleVarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evaluateButton)
                    .addComponent(snapButton)
                    .addComponent(applyButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluateButtonActionPerformed
        final Entity cp = Scene.getFirstWithTag( mf.getSelection(), Entity.TAG_CONTROL_POINT );
        if (cp == null){
            return;
        }
        final float particleR = cp.getTransform().getScale().maxComponent() / 2.0f;
        final Vector3f point = cp.getTransform().getTranslation();
        
        final List<Transducer> trans = mf.simulation.transducers;
        final int nTrans = trans.size();
        snapTransforms();
        
        
        final int nAngles = Parse.toInt( pointsAngleText.getText() );
        final int nRadious = Parse.toInt( pointsRadText.getText() );
        final float vAngles = Parse.toFloat( angleVarText.getText() );
        final float vRadious = Parse.toFloat( radiousVarText.getText() );
        
        System.out.println("Angle \t Radious \t forceX \t forceY \t forceZ");
        
        for(int iAngle = 0; iAngle < nAngles; ++iAngle){
            for(int iRadious = 0; iRadious < nRadious; ++iRadious){
                final float angleChange = 1.0f + M.lerp(-vAngles,vAngles, iAngle/(float)nAngles);
                final float radiousChange = 1.0f + M.lerp(-vRadious,vRadious, iRadious/(float)nRadious);
                
                applyTransform(trans, point, radiousChange, angleChange);
                
                //calculate forces
                final Vector3f forceG = CalcField.calcForceGradients(point.x, point.y, point.z, particleR, mf);
                
                //report
                System.out.println(angleChange + "\t" + radiousChange + "\t" + forceG.x + "\t" + forceG.y + "\t" + forceG.z);
            }
        }
        
        for(int i = 0; i < nTrans; ++i){
            final Transform original = transforms.get(i);
            final Transform target = trans.get(i).getTransform();
            target.set(original);
        }
        transforms.clear();
    }//GEN-LAST:event_evaluateButtonActionPerformed

    public void applyTransform(final List<Transducer> trans, final Vector3f point, float radiousChange, float angleChange){
        
        final int nTrans = trans.size();
        for (int i = 0; i < nTrans; ++i) {
            final Transform original = transforms.get(i);
            final Transform target = trans.get(i).getTransform();

            target.set(original);
            final Vector3f polar = new Vector3f();
            original.getTranslation().toPolar(polar);
            polar.x *= radiousChange;
            //polar.y *= angleChange;
            if (polar.z < M.HALF_PI){
                polar.z *= angleChange;
            }else{
                polar.z = M.PI - ((M.PI - polar.z) * angleChange);
            }
            target.getTranslation().fromPolar(polar.x, polar.y, polar.z);

            //point to point
            target.lookAt(point);
            target.rotateLocal(M.degToRad(-90), 0, 0);
        }
    }
    
    private void snapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapButtonActionPerformed
        snapTransforms();
    }//GEN-LAST:event_snapButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        final Entity cp = Scene.getFirstWithTag(mf.getSelection(), Entity.TAG_CONTROL_POINT);
        if (cp == null) {
            return;
        }
        final float particleR = cp.getTransform().getScale().maxComponent() / 2.0f;
        final Vector3f point = cp.getTransform().getTranslation();

        final List<Transducer> trans = mf.simulation.transducers;

        final float vAngles = Parse.toFloat(angleVarText.getText());
        final float vRadious = Parse.toFloat(radiousVarText.getText());

        applyTransform(trans, point, vRadious, vAngles);

        //calculate forces
        final Vector3f forceG = CalcField.calcForceGradients(point.x, point.y, point.z, particleR, mf);

        //report
        System.out.println(vAngles + "\t" + vRadious + "\t" + forceG.x + "\t" + forceG.y + "\t" + forceG.z);
        mf.needUpdate();
    }//GEN-LAST:event_applyButtonActionPerformed

    public void snapTransforms(){
        transforms.clear();
        for (Transducer t : mf.simulation.transducers){
            transforms.add( t.getTransform().clone() );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angleVarText;
    private javax.swing.JButton applyButton;
    private javax.swing.JButton evaluateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pointsAngleText;
    private javax.swing.JTextField pointsRadText;
    private javax.swing.JTextField radiousVarText;
    private javax.swing.JButton snapButton;
    // End of variables declaration//GEN-END:variables
}
