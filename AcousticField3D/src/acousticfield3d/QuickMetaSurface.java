/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acousticfield3d;

import acousticfield3d.math.M;
import acousticfield3d.math.Vector2f;
import acousticfield3d.utils.Parse;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author am14010
 */
public class QuickMetaSurface extends javax.swing.JFrame {
    final CustomPanel cPanel;
    
    int nPoints;
    float wavelenght;
    float layer;
    float minWallFirst;
    float minWall;
    float angle;
    final List<Vector2f> angles = new ArrayList<>();
    
    public QuickMetaSurface() {
        initComponents();
        cPanel = (CustomPanel)panel;
    }

    public class CustomPanel extends JPanel{
        BufferedImage bi = null;
        public void setImage(BufferedImage bi){
            this.bi = bi;
        }
        @Override
        public void paint(Graphics g) {
            super.paint(g); //To change body of generated methods, choose Tools | Templates.
            if (bi != null){
                g.drawImage(bi, 0, 0, null);
            }
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

        jLabel1 = new javax.swing.JLabel();
        nPointsText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        wavelenghtText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        layerThicknessText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        minFirstWallText = new javax.swing.JTextField();
        minWallText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panel = new CustomPanel();
        calc3Button = new javax.swing.JButton();
        calc4Button = new javax.swing.JButton();
        calc5Button = new javax.swing.JButton();
        calc6Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nPoints:");

        nPointsText.setText("128");

        jLabel2.setText("wavelenght:");

        wavelenghtText.setText("0.0085");

        jLabel3.setText("layer thickness:");

        layerThicknessText.setText("0.001");

        jLabel5.setText("minFirstWall");

        minFirstWallText.setText("0.1");

        minWallText.setText("0");

        jLabel6.setText("min wall");

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        calc3Button.setText("C3");
        calc3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc3ButtonActionPerformed(evt);
            }
        });

        calc4Button.setText("C4");
        calc4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc4ButtonActionPerformed(evt);
            }
        });

        calc5Button.setText("C5");
        calc5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc5ButtonActionPerformed(evt);
            }
        });

        calc6Button.setText("C6");
        calc6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc6ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wavelenghtText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(layerThicknessText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minFirstWallText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minWallText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calc3Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc4Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc5Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc6Button)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nPointsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(wavelenghtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(layerThicknessText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(minFirstWallText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(minWallText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calc3Button)
                    .addComponent(calc4Button)
                    .addComponent(calc5Button)
                    .addComponent(calc6Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void getDatafromGUI(){
         nPoints = Parse.toInt( nPointsText.getText() );
         wavelenght = Parse.toFloat(wavelenghtText.getText() );
         layer = Parse.toFloat( layerThicknessText.getText() );
         minWallFirst = Parse.toFloat( minFirstWallText.getText() );
         minWall = Parse.toFloat( minWallText.getText() );
        
         angle = layer * 2.0f * M.TWO_PI / wavelenght ;
    }
    private void calcAngles(final int nAngles){
        angles.clear();
        for(int i = 0; i < nAngles; ++i){
            angles.add( new Vector2f().setAngle( i * angle) );
        }
    }
    
    private void drawData(final List<Vector2f> angles, final List<Vector2f> points){
        final int w = panel.getWidth();
        final int h = panel.getHeight();
        final BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        final Graphics g = bi.getGraphics();
        
        //draw the lines
        g.setColor(Color.blue);
        for ( Vector2f v : angles){
            drawAngleline(g, v.getAngle(), w, h);
        }
        
        //draw the points
        g.setColor(Color.red);
        for(Vector2f v : points){
            g.drawRect((int)((v.x + 1f) * w / 2f), (int)((v.y + 1f) * h / 2f), 1, 1);
        }
        
        //draw circe
        g.setColor(Color.green);
        g.drawOval(0, 0, w, h);
        
        g.dispose();
        cPanel.setImage(bi);
        cPanel.repaint();
    }
    
    
    
    private void calc3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc3ButtonActionPerformed
        getDatafromGUI();
        calcAngles(3);
        
        float maxLenght = 0;
        final List<Vector2f> points = new ArrayList<>();
        for (int a1 = 0; a1 < nPoints; ++a1) {
            for (int a2 = 0; a2 <= a1; ++a2) {
                //for (int a3 = 0; a3 <= a2; ++a3) {
                    final float ap1 = a1 / (float)nPoints;
                    final float ap2 = a2 / (float)nPoints;
                    //final float ap3 = a3 / (float)nPoints;

                    final float area1 = 1.0f - ap1 * ap1;
                    final float area2 = ap1 * ap1 - ap2 * ap2;
                    final float area3 = ap2 * ap2;
                    //final float area3 = ap2 * ap2 - ap3 * ap3;
                    //final float area4 = ap3 * ap3;
                    
                    if (area1 < minWallFirst) {continue;}
                    //if (area1 < minWall || area2 < minWall || area3 < minWall ||  area4 < minWall ){ continue;}
                    if (area1 < minWall || area2 < minWall || area3 < minWall ){ continue;}
                    
                    final Vector2f p = new Vector2f();
                    p.addMultLocal(angles.get(0), area1);
                    p.addMultLocal(angles.get(1), area2);
                    p.addMultLocal(angles.get(2), area3);
                    //p.addMultLocal(deg4, area4);
                    maxLenght = M.max(maxLenght, p.length());
                    points.add(p);
                //}
            }
        }
        
        drawData(angles, points);
    }//GEN-LAST:event_calc3ButtonActionPerformed

    private void calc4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc4ButtonActionPerformed
        getDatafromGUI();
        calcAngles(4);
        
        float maxLenght = 0;
        final List<Vector2f> points = new ArrayList<>();
        for (int a1 = 0; a1 < nPoints; ++a1) {
            for (int a2 = 0; a2 <= a1; ++a2) {
                for (int a3 = 0; a3 <= a2; ++a3) {
                    final float ap1 = a1 / (float)nPoints;
                    final float ap2 = a2 / (float)nPoints;
                    final float ap3 = a3 / (float)nPoints;

                    final float area1 = 1.0f - ap1 * ap1;
                    final float area2 = ap1 * ap1 - ap2 * ap2;
                    final float area3 = ap2 * ap2 - ap3 * ap3;
                    final float area4 = ap3 * ap3;
                    
                    if (area1 < minWallFirst) {continue;}
                    if (area1 < minWall || area2 < minWall || area3 < minWall ||  area4 < minWall ){ continue;}
                    
                    final Vector2f p = new Vector2f();
                    p.addMultLocal(angles.get(0), area1);
                    p.addMultLocal(angles.get(1), area2);
                    p.addMultLocal(angles.get(2), area3);
                    p.addMultLocal(angles.get(3), area4);
                    maxLenght = M.max(maxLenght, p.length());
                    points.add(p);
                }
            }
        }
        
        drawData(angles, points);
    }//GEN-LAST:event_calc4ButtonActionPerformed

    private void calc5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc5ButtonActionPerformed
        getDatafromGUI();
        calcAngles(5);

        float maxLenght = 0;
        final List<Vector2f> points = new ArrayList<>();
        for (int a1 = 0; a1 < nPoints; ++a1) {
            for (int a2 = 0; a2 <= a1; ++a2) {
                for (int a3 = 0; a3 <= a2; ++a3) {
                    for (int a4 = 0; a4 <= a3; ++a4) {
                        final float ap1 = a1 / (float) nPoints;
                        final float ap2 = a2 / (float) nPoints;
                        final float ap3 = a3 / (float) nPoints;
                        final float ap4 = a4 / (float) nPoints;

                        final float area1 = 1.0f - ap1 * ap1;
                        final float area2 = ap1 * ap1 - ap2 * ap2;
                        final float area3 = ap2 * ap2 - ap3 * ap3;
                        final float area4 = ap3 * ap3 - ap4 * ap4;
                        final float area5 = ap4 * ap4;

                        if (area1 < minWallFirst) {
                            continue;
                        }
                        if (area1 < minWall || area2 < minWall || area3 < minWall || area4 < minWall || area5 < minWall) {
                            continue;
                        }

                        final Vector2f p = new Vector2f();
                        p.addMultLocal(angles.get(0), area1);
                        p.addMultLocal(angles.get(1), area2);
                        p.addMultLocal(angles.get(2), area3);
                        p.addMultLocal(angles.get(3), area4);
                        p.addMultLocal(angles.get(4), area5);
                        maxLenght = M.max(maxLenght, p.length());
                        points.add(p);
                    }
                }
            }
        }

        drawData(angles, points);
    }//GEN-LAST:event_calc5ButtonActionPerformed

    private void calc6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc6ButtonActionPerformed
        getDatafromGUI();
        calcAngles(6);

        float maxLenght = 0;
        final List<Vector2f> points = new ArrayList<>();
        for (int a1 = 0; a1 < nPoints; ++a1) {
            for (int a2 = 0; a2 <= a1; ++a2) {
                for (int a3 = 0; a3 <= a2; ++a3) {
                    for (int a4 = 0; a4 <= a3; ++a4) {
                        for (int a5 = 0; a5 <= a4; ++a5) {
                        final float ap1 = a1 / (float) nPoints;
                        final float ap2 = a2 / (float) nPoints;
                        final float ap3 = a3 / (float) nPoints;
                        final float ap4 = a4 / (float) nPoints;
                        final float ap5 = a5 / (float) nPoints;

                        final float area1 = 1.0f - ap1 * ap1;
                        final float area2 = ap1 * ap1 - ap2 * ap2;
                        final float area3 = ap2 * ap2 - ap3 * ap3;
                        final float area4 = ap3 * ap3 - ap4 * ap4;
                        final float area5 = ap4 * ap4 - ap5 * ap5;
                        final float area6 = ap5 * ap5;

                        if (area1 < minWallFirst) {
                            continue;
                        }
                        if (area1 < minWall || area2 < minWall || area3 < minWall 
                                || area4 < minWall || area5 < minWall || area6 < minWall) {
                            continue;
                        }

                        final Vector2f p = new Vector2f();
                        p.addMultLocal(angles.get(0), area1);
                        p.addMultLocal(angles.get(1), area2);
                        p.addMultLocal(angles.get(2), area3);
                        p.addMultLocal(angles.get(3), area4);
                        p.addMultLocal(angles.get(4), area5);
                        p.addMultLocal(angles.get(5), area6);
                        maxLenght = M.max(maxLenght, p.length());
                        points.add(p);
                        }
                    }
                }
            }
        }

        drawData(angles, points);
    }//GEN-LAST:event_calc6ButtonActionPerformed

    private void drawAngleline(final Graphics g, final float angle, final int w, final int h){
        final float lenght = M.sqrt(w*w + h*h);
        g.drawLine(w/2, h/2,(int)( w/2 + M.cos(angle)*lenght ), (int)( h/2 + M.sin(angle)*lenght ));
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
            java.util.logging.Logger.getLogger(QuickMetaSurface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuickMetaSurface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuickMetaSurface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuickMetaSurface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuickMetaSurface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc3Button;
    private javax.swing.JButton calc4Button;
    private javax.swing.JButton calc5Button;
    private javax.swing.JButton calc6Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField layerThicknessText;
    private javax.swing.JTextField minFirstWallText;
    private javax.swing.JTextField minWallText;
    private javax.swing.JTextField nPointsText;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField wavelenghtText;
    // End of variables declaration//GEN-END:variables
}
