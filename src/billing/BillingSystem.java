/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author Shrikant
 */
public class BillingSystem extends javax.swing.JFrame {

    String operations;
    String answer;
    double firstnum,secondnum,result;
    /**
     * Creates new form BillingSystem
     */
    public BillingSystem() {
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

        jPanel1 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bmin = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(txtDisplay);
        txtDisplay.setBounds(22, 19, 260, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("=");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 350, 110, 50);

        b7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(20, 80, 50, 50);

        b8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(90, 80, 50, 50);

        b9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(160, 80, 50, 50);

        bmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bmin.setText("-");
        bmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminActionPerformed(evt);
            }
        });
        jPanel1.add(bmin);
        bmin.setBounds(230, 80, 50, 50);

        bplus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });
        jPanel1.add(bplus);
        bplus.setBounds(230, 150, 50, 50);

        b6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(160, 150, 50, 50);

        b5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(90, 150, 50, 50);

        b4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(20, 150, 50, 50);

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(20, 220, 50, 50);

        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(90, 220, 50, 50);

        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(160, 220, 50, 50);

        bdiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        jPanel1.add(bdiv);
        bdiv.setBounds(230, 220, 50, 50);

        bmul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bmul.setText("*");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });
        jPanel1.add(bmul);
        bmul.setBounds(230, 290, 50, 50);

        bmod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bmod.setText("%");
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });
        jPanel1.add(bmod);
        bmod.setBounds(160, 290, 50, 50);

        bdot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bdot.setText(".");
        bdot.setActionCommand(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });
        jPanel1.add(bdot);
        bdot.setBounds(90, 290, 50, 50);

        b0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(20, 290, 50, 50);

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("CLEAR");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(20, 350, 110, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 310, 420);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 370));
        jPanel2.setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCheckBox1.setText("Biscuits");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(10, 230, 120, 20);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCheckBox2.setText("Fruits");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(10, 20, 120, 30);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCheckBox3.setText("Veges");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3);
        jCheckBox3.setBounds(10, 70, 120, 30);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCheckBox4.setText("Pizza");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4);
        jCheckBox4.setBounds(10, 120, 110, 37);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCheckBox5.setText("Wafer");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox5);
        jCheckBox5.setBounds(10, 180, 110, 20);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(130, 20, 70, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(130, 70, 70, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(130, 120, 70, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(130, 170, 70, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(130, 220, 70, 28);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Cost of items");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 24, 170, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Delivery Cost");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 60, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total Cost of Mileage");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 110, 190, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("GST");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 170, 120, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jPanel3.add(jTextField6);
        jTextField6.setBounds(410, 30, 100, 30);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jPanel3.add(jTextField7);
        jTextField7.setBounds(410, 70, 100, 28);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jPanel3.add(jTextField8);
        jTextField8.setBounds(410, 110, 100, 30);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9);
        jTextField9.setBounds(410, 160, 100, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(250, 20, 520, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(350, 30, 790, 290);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Sub Total");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(40, 30, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Tax");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(40, 70, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Total Amount");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 120, 180, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Rs.0.00");
        jPanel4.add(jTextField11);
        jTextField11.setBounds(240, 40, 250, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Rs.0.00");
        jPanel4.add(jTextField12);
        jTextField12.setBounds(240, 120, 250, 30);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Rs.0.00");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField13);
        jTextField13.setBounds(240, 80, 250, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(590, 30, 180, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("CALCULATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(590, 90, 180, 50);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(350, 340, 800, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        String EnterNumber = txtDisplay.getText() + b0.getText();
        txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         String EnterNumber = txtDisplay.getText() + b1.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
         String EnterNumber = txtDisplay.getText() + b2.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         String EnterNumber = txtDisplay.getText() + b3.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
         String EnterNumber = txtDisplay.getText() + b6.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
         String EnterNumber = txtDisplay.getText() + b5.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        String EnterNumber = txtDisplay.getText() + b4.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b4ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        String EnterNumber = txtDisplay.getText() + b9.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
         String EnterNumber = txtDisplay.getText() + b8.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
         String EnterNumber = txtDisplay.getText() + b7.getText();
        txtDisplay.setText(EnterNumber);

    }//GEN-LAST:event_b7ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        if(!txtDisplay.getText().contains("."))
        {
            txtDisplay.setText(txtDisplay.getText() + bdot.getText());
        }
    }//GEN-LAST:event_bdotActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_bplusActionPerformed

    private void bminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_bminActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
       firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_bdivActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_bmulActionPerformed

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "%";
    }//GEN-LAST:event_bmodActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        txtDisplay.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        secondnum = Double.parseDouble(txtDisplay.getText());
        if(operations == "+")
         {
           result = firstnum + secondnum;
           answer = String.format("%.2f",result);
           txtDisplay.setText(answer);
        }
         else if(operations == "-")
         {
           result = firstnum - secondnum;
           answer = String.format("%.2f",result);
           txtDisplay.setText(answer);
        }
        else if(operations == "/")
         {
           result = firstnum / secondnum;
           answer = String.format("%.2f",result);
           txtDisplay.setText(answer);
        }
         else if(operations == "*")
         {
           result = firstnum * secondnum;
           answer = String.format("%.2f",result);
           txtDisplay.setText(answer);
        }
         else
         {
               result = firstnum % secondnum;
           answer = String.format("%.2f",result);
           txtDisplay.setText(answer);  
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected())
        {
            jTextField3.setEditable(true);
            jTextField3.setText("");
            jTextField3.requestFocus();
        }
        else
        {
            jTextField3.setEditable(false);
            jTextField3.setText("0");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        txtDisplay.setText("");
        jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        
        jTextField11.setText("Rs. 0.00");
        jTextField12.setText("Rs. 0.00");
        jTextField13.setText("Rs. 0.00");
        
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected())
        {
            jTextField1.setEditable(true);
            jTextField1.setText("");
            jTextField1.requestFocus();
        }
        else
        {
            jTextField1.setEditable(false);
            jTextField1.setText("0");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected())
        {
            jTextField2.setEditable(true);
            jTextField2.setText("");
            jTextField2.requestFocus();
        }
        else
        {
            jTextField2.setEditable(false);
            jTextField2.setText("0");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected())
        {
            jTextField4.setEditable(true);
            jTextField4.setText("");
            jTextField4.requestFocus();
        }
        else
        {
            jTextField4.setEditable(false);
            jTextField4.setText("0");
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            jTextField5.setEditable(true);
            jTextField5.setText("");
            jTextField5.requestFocus();
        }
        else
        {
            jTextField5.setEditable(false);
            jTextField5.setText("0");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if((jCheckBox1.isSelected()) ||(jCheckBox2.isSelected()) || (jCheckBox3.isSelected())||(jCheckBox4.isSelected())||(jCheckBox5.isSelected()))
        {
            double f = Double.parseDouble(jTextField1.getText())*50;
            double v = Double.parseDouble(jTextField2.getText())*100;
            double p = Double.parseDouble(jTextField3.getText())*150;
            double w = Double.parseDouble(jTextField4.getText())*20;
            double b = Double.parseDouble(jTextField5.getText())*10;
            
            double totalitems = f + v + p + w + b;
            double del = totalitems *5/100;
            double mil = del * 50/100;
            
            double subtotal = totalitems + del + mil;
            double gst =subtotal *9/100;
            
            
            double tax = gst;
            double amount = subtotal + tax;
            
            String item = String.format("%.2f", totalitems);
            jTextField6.setText((String)item);
            
            String d = String.format("%.2f", del);
            jTextField7.setText((String)d);
            
            String m = String.format("%.2f", mil);
            jTextField8.setText((String)m);
            
            String g = String.format("%.2f", gst);
            jTextField9.setText((String)g);
            
            String sub = String.format("%.2f", subtotal);
            jTextField11.setText((String)sub);
            
            String tx = String.format("%.2f", tax);
            jTextField13.setText((String)tx);
            
            String a = String.format("%.2f",amount);
            jTextField12.setText((String)a);
        }
        else
        {
            txtDisplay.setText("Enter Choice");
        }
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bmin;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bplus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
