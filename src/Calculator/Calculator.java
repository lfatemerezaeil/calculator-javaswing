/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 *
 * @author mohsen
 */
public class Calculator extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;
    public Calculator() {
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

        jtxt = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jbtn17 = new javax.swing.JButton();
        jbtn18 = new javax.swing.JButton();
        jbtn19 = new javax.swing.JButton();
        jbtn20 = new javax.swing.JButton();
        jbtn21 = new javax.swing.JButton();
        jbtn22 = new javax.swing.JButton();
        lable = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxt.setForeground(new java.awt.Color(222, 203, 203));
        jtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt.setBorder(new javax.swing.border.MatteBorder(null));

        jbtn1.setBackground(new java.awt.Color(255, 255, 255));
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(0, 102, 102));
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(255, 255, 255));
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(0, 102, 102));
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(255, 255, 255));
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(0, 102, 102));
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(255, 255, 255));
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(0, 102, 102));
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(255, 255, 255));
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(0, 102, 102));
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(255, 255, 255));
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(0, 102, 102));
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(255, 255, 255));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(0, 102, 102));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(255, 255, 255));
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(0, 102, 102));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(255, 255, 255));
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(0, 102, 102));
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn10.setBackground(new java.awt.Color(255, 255, 255));
        jbtn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn10.setForeground(new java.awt.Color(0, 102, 102));
        jbtn10.setText("0");
        jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10ActionPerformed(evt);
            }
        });

        jbtn11.setBackground(new java.awt.Color(255, 255, 255));
        jbtn11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn11.setForeground(new java.awt.Color(0, 102, 102));
        jbtn11.setText(".");
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });

        jbtn12.setBackground(new java.awt.Color(255, 255, 255));
        jbtn12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn12.setForeground(new java.awt.Color(0, 102, 102));
        jbtn12.setText("p");
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });

        jbtn13.setBackground(new java.awt.Color(255, 255, 255));
        jbtn13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn13.setForeground(new java.awt.Color(255, 112, 141));
        jbtn13.setText("X");
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });

        jbtn14.setBackground(new java.awt.Color(255, 255, 255));
        jbtn14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn14.setForeground(new java.awt.Color(255, 112, 141));
        jbtn14.setText("-");
        jbtn14.setAlignmentX(0.5F);
        jbtn14.setMargin(new java.awt.Insets(14, 14, 14, 14));
        jbtn14.setMaximumSize(new java.awt.Dimension(43, 23));
        jbtn14.setMinimumSize(new java.awt.Dimension(43, 23));
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });

        jbtn15.setBackground(new java.awt.Color(255, 255, 255));
        jbtn15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn15.setForeground(new java.awt.Color(255, 112, 141));
        jbtn15.setText("=");
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });

        jbtn16.setBackground(new java.awt.Color(255, 255, 255));
        jbtn16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn16.setForeground(new java.awt.Color(255, 112, 141));
        jbtn16.setText("C");
        jbtn16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });

        jbtn17.setBackground(new java.awt.Color(255, 255, 255));
        jbtn17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn17.setForeground(new java.awt.Color(255, 112, 141));
        jbtn17.setText("+");
        jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn17ActionPerformed(evt);
            }
        });

        jbtn18.setBackground(new java.awt.Color(255, 255, 255));
        jbtn18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn18.setForeground(new java.awt.Color(255, 112, 141));
        jbtn18.setText("%");
        jbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn18ActionPerformed(evt);
            }
        });

        jbtn19.setBackground(new java.awt.Color(255, 255, 255));
        jbtn19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn19.setForeground(new java.awt.Color(255, 112, 141));
        jbtn19.setText("/");
        jbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn19ActionPerformed(evt);
            }
        });

        jbtn20.setBackground(new java.awt.Color(255, 255, 255));
        jbtn20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn20.setForeground(new java.awt.Color(255, 112, 141));
        jbtn20.setText("!");
        jbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn20ActionPerformed(evt);
            }
        });

        jbtn21.setBackground(new java.awt.Color(255, 255, 255));
        jbtn21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn21.setForeground(new java.awt.Color(255, 112, 141));
        jbtn21.setText("^");
        jbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn21ActionPerformed(evt);
            }
        });

        jbtn22.setBackground(new java.awt.Color(255, 255, 255));
        jbtn22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn22.setForeground(new java.awt.Color(255, 112, 141));
        jbtn22.setText("???");
        jbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn22ActionPerformed(evt);
            }
        });

        lable.setForeground(new java.awt.Color(255, 153, 153));
        lable.setText("calcute");

        jMenu1.setText("theme");

        jMenuItem1.setText("Dark");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("colorful");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lable)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lable)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn22, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        jtxt.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
         String Enternumber = jtxt.getText()+jbtn2.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
         String Enternumber = jtxt.getText()+jbtn7.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
 String Enternumber = jtxt.getText()+jbtn1.getText();
 jtxt.setText(Enternumber);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10ActionPerformed
  String Enternumber = jtxt.getText()+jbtn10.getText();
 jtxt.setText(Enternumber);
    }//GEN-LAST:event_jbtn10ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Enternumber = jtxt.getText()+jbtn3.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
         String Enternumber = jtxt.getText()+jbtn4.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
         String Enternumber = jtxt.getText()+jbtn5.getText();
         jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
         String Enternumber = jtxt.getText()+jbtn6.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
         String Enternumber = jtxt.getText()+jbtn8.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
         String Enternumber = jtxt.getText()+jbtn9.getText();
 jtxt.setText(Enternumber);

    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn16ActionPerformed
        jtxt.setText("");
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn18ActionPerformed
        firstnum=Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        operations=("%");

    }//GEN-LAST:event_jbtn18ActionPerformed

    private void jbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn19ActionPerformed
        firstnum=Double.parseDouble(jtxt.getText());
        jtxt.setText(null);
        operations=("/");

    }//GEN-LAST:event_jbtn19ActionPerformed

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn13ActionPerformed
        firstnum = Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        operations = "X";

    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn14ActionPerformed
        firstnum = Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        operations = "-";

    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn15ActionPerformed
        secondnum = Double.parseDouble(jtxt.getText());
        switch(operations) {
        case "+":
            result = firstnum + secondnum;
            jtxt.setText(String.valueOf(result));
            break;
            
        case "-":
            result = firstnum - secondnum;
            jtxt.setText(String.valueOf(result));
            break;
            
        case "X":
            result = firstnum * secondnum;
            jtxt.setText(String.valueOf(result));
            break;
            
        case "/":
            result = firstnum / secondnum;
            jtxt.setText(String.valueOf(result));
            break;
            
        case "%":
            result = firstnum * (secondnum/100);
            jtxt.setText(String.valueOf(result));
            break;
            
        case "^":
            result = Math.pow(firstnum, secondnum);
            jtxt.setText(String.valueOf(result));
            break;
        case "p":
            result = firstnum;
            break;
        }
    }//GEN-LAST:event_jbtn15ActionPerformed
 
    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn11ActionPerformed
        String enterValue = jtxt.getText() + jbtn11.getText();
        jtxt.setText(enterValue);
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn20ActionPerformed
 firstnum = Integer.parseInt(jtxt.getText());
        int fact = 1;
        for(int i=1;i<=firstnum;i++) {
            fact= fact * i;
        }
        jtxt.setText(String.valueOf(fact));                                               

    }//GEN-LAST:event_jbtn20ActionPerformed

    private void jbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn21ActionPerformed
        firstnum = Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        operations = "^";
    }//GEN-LAST:event_jbtn21ActionPerformed

    private void jbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn22ActionPerformed
       firstnum = Double.parseDouble(jtxt.getText());
       double sqrt = Math.sqrt(firstnum);
       jtxt.setText(String.valueOf(sqrt));
    }//GEN-LAST:event_jbtn22ActionPerformed

    private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn17ActionPerformed
         firstnum=Double.parseDouble(jtxt.getText());
        jtxt.setText("");
        operations=("+");
    }//GEN-LAST:event_jbtn17ActionPerformed

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn12ActionPerformed
      
      int num=Integer.parseInt(String.valueOf(jtxt.getText()));
      int i,count=0;
      for(i=2;i<num;i++)
      {
          if(num%i==0)
          {
             count++;
             break;
          }
      }
      if(count==0)
      {
          jtxt.setText("prime");
      }
      else 
      {
          jtxt.setText("not prime");
      }
       
      
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        new Calculatorview().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        new Calculatorview2().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn17;
    private javax.swing.JButton jbtn18;
    private javax.swing.JButton jbtn19;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn20;
    private javax.swing.JButton jbtn21;
    private javax.swing.JButton jbtn22;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JTextField jtxt;
    private javax.swing.JLabel lable;
    // End of variables declaration//GEN-END:variables
}
