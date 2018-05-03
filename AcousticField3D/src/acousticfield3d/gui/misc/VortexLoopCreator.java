/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d.gui.misc;

import acousticfield3d.algorithms.Kinoforms;
import acousticfield3d.algorithms.KinoformsOnlyPhase;
import acousticfield3d.gui.MainForm;
import acousticfield3d.math.M;
import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.MeshEntity;
import acousticfield3d.simulation.ControlPoint;
import acousticfield3d.utils.Color;
import acousticfield3d.utils.Parse;
import java.util.ArrayList;

/**
 *
 * @author am14010
 */
public class VortexLoopCreator extends javax.swing.JFrame {

    final MainForm mf;
    
    public VortexLoopCreator(MainForm mf) {
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
        loopRadiousText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nCirclesText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loopChargeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        circleChageText = new javax.swing.JTextField();
        nPointsText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        circleRadText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        transText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rotText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        itersText = new javax.swing.JTextField();
        forceAmpCheck = new javax.swing.JCheckBox();
        calcButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vortex Loop Creation");

        jLabel1.setText("Radious:");

        loopRadiousText.setText("0.05");

        jLabel2.setText("nCircles:");

        nCirclesText.setText("32");

        jLabel3.setText("Charge(2pi):");

        loopChargeText.setText("1");

        jLabel4.setText("nPoints:");

        jLabel5.setText("Charge(2pi):");

        circleChageText.setText("1");

        nPointsText.setText("16");

        jLabel6.setText("Radious:");

        circleRadText.setText("0.004");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Translation:");

        transText.setText("0 0 0");

        jLabel8.setText("Rotation:");

        rotText.setText("0 0 0");

        jLabel9.setText("Iters:");

        itersText.setText("5000");

        forceAmpCheck.setText("forceAmp");

        calcButton.setText("Calc");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
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
                                .addComponent(nCirclesText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loopChargeText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loopRadiousText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(circleChageText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(circleRadText, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotText)
                            .addComponent(transText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itersText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forceAmpCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nCirclesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(loopRadiousText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loopChargeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(circleRadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(circleChageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(transText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rotText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(itersText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forceAmpCheck)
                    .addComponent(calcButton))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        mf.cpPanel.deleteAllPoints();
        mf.needUpdate();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        final int nCircles = Parse.toInt( nCirclesText.getText() );
        final float loopRad = Parse.toFloat( loopRadiousText.getText() );
        final float loopCharge = Parse.toFloat( loopChargeText.getText() );
        final int nPoints = Parse.toInt( nPointsText.getText() );
        final float circleRad = Parse.toFloat( circleRadText.getText() );
        final float circleCharge = Parse.toFloat( circleChageText.getText() );
        final Vector3f trans = new Vector3f().parse( transText.getText() );
        final Vector3f rot = new Vector3f().parse( rotText.getText() );
        
        //create the template circle 
        final ArrayList<ControlPoint> circlePoints = new ArrayList<>();
        for(int i = 0; i < nPoints; ++i){
            final ControlPoint cp = new ControlPoint();
            circlePoints.add(cp);
            cp.getMaterial().setSpecular(circleCharge * M.TWO_PI * i / nPoints); //specular contains the phase
            cp.getTransform().getTranslation().x = circleRad * M.cos( M.TWO_PI * i / nPoints);
            cp.getTransform().getTranslation().y = circleRad * M.sin( M.TWO_PI * i / nPoints);
        }
        
        //create the loop
        final ArrayList<ControlPoint> allPoints = new ArrayList<>();
        for (int i = 0; i < nCircles; ++i){
           for(int j = 0; j < nPoints; ++j){
               final ControlPoint original = circlePoints.get(j);
               final ControlPoint cp = mf.cpPanel.addControlPoint(0, 0, 0);
               allPoints.add(cp);
               cp.getMaterial().setSpecular(original.getMaterial().getSpecular());
               cp.getTransform().getTranslation().set( original.getTransform().getTranslation() );
               
                //rotate them along Z (charge)
                cp.rotateAround(Vector3f.ZERO, 0, 0, M.TWO_PI * loopCharge * i / nCircles);
                
                //rotate them along Y
                cp.rotateAround(Vector3f.ZERO, 0, -M.TWO_PI * i / nCircles, 0);

                //translate them to their destination
                cp.getTransform().getTranslation().x += loopRad * M.cos( M.TWO_PI * i / nCircles);
                cp.getTransform().getTranslation().z += loopRad * M.sin( M.TWO_PI * i / nCircles);
                
                cp.rotateAround(Vector3f.ZERO, rot.x, rot.y, rot.z);
                cp.getTransform().getTranslation().addLocal(trans);
           }
        }
        
        //add all the points
        mf.cpPanel.addPoints( allPoints );
        colorizePoints();
        mf.needUpdate();
    }//GEN-LAST:event_addButtonActionPerformed

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        KinoformsOnlyPhase smp = KinoformsOnlyPhase.create(mf, mf.simulation.controlPoints);
        smp.forceAmp = forceAmpCheck.isSelected();
        final int iters = Parse.toInt(itersText.getText());
        for (int i = 0; i < iters; ++i) {
            smp.iterate();
        }
        smp.applySolution(mf.simulation);
        mf.needUpdate();
    }//GEN-LAST:event_calcButtonActionPerformed

    public void colorizePoints(){
        for(MeshEntity cp : mf.simulation.controlPoints){
            final float phase = cp.getMaterial().getSpecular() / M.PI;
            final float p = M.abs( (phase + 1.0f) / 2.0f % 1.0f );
            cp.setColor( Gradients.get().getGradientPhase( p ) );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton calcButton;
    private javax.swing.JTextField circleChageText;
    private javax.swing.JTextField circleRadText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox forceAmpCheck;
    private javax.swing.JTextField itersText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField loopChargeText;
    private javax.swing.JTextField loopRadiousText;
    private javax.swing.JTextField nCirclesText;
    private javax.swing.JTextField nPointsText;
    private javax.swing.JTextField rotText;
    private javax.swing.JTextField transText;
    // End of variables declaration//GEN-END:variables
}