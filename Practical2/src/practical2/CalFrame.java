package practical2;

public class CalFrame extends javax.swing.JFrame {
    public CalFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtno1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtno2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblshowresult = new javax.swing.JLabel();
        btnmultiplication = new javax.swing.JButton();
        btnadd1 = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnsubstraction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simple Calculator");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Number 2");

        txtno1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtno1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number 1");

        txtno2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Result");

        lblshowresult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblshowresult.setForeground(new java.awt.Color(255, 255, 255));

        btnmultiplication.setBackground(new java.awt.Color(204, 204, 204));
        btnmultiplication.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnmultiplication.setForeground(new java.awt.Color(102, 0, 102));
        btnmultiplication.setText("x");
        btnmultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicationActionPerformed(evt);
            }
        });

        btnadd1.setBackground(new java.awt.Color(204, 204, 204));
        btnadd1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnadd1.setForeground(new java.awt.Color(102, 0, 102));
        btnadd1.setText("+");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1ActionPerformed(evt);
            }
        });

        btndivision.setBackground(new java.awt.Color(204, 204, 204));
        btndivision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btndivision.setForeground(new java.awt.Color(102, 0, 102));
        btndivision.setText("/");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });

        btnsubstraction.setBackground(new java.awt.Color(204, 204, 204));
        btnsubstraction.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnsubstraction.setForeground(new java.awt.Color(102, 0, 102));
        btnsubstraction.setText("-");
        btnsubstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubstractionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addGap(66, 66, 66)
                        .addComponent(txtno1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66)
                        .addComponent(txtno2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(lblshowresult, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnsubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnmultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtno1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtno2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndivision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblshowresult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicationActionPerformed
        double num1= Double.parseDouble(txtno1.getText());
        double num2= Double.parseDouble(txtno2.getText());
        
        String result = Double.toString(num1*num2);
        lblshowresult.setText(result);
    }//GEN-LAST:event_btnmultiplicationActionPerformed

    private void btnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1ActionPerformed
        double num1= Double.parseDouble(txtno1.getText());
        double num2= Double.parseDouble(txtno2.getText());
        
        String result = Double.toString(num1+num2);
        lblshowresult.setText(result);
    }//GEN-LAST:event_btnadd1ActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        double num1= Double.parseDouble(txtno1.getText());
        double num2= Double.parseDouble(txtno2.getText());
        
        String result = Double.toString(num1/num2);
        lblshowresult.setText(result);
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnsubstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubstractionActionPerformed
        double num1= Double.parseDouble(txtno1.getText());
        double num2= Double.parseDouble(txtno2.getText());
        
        String result=Double.toString(num1-num2);
        lblshowresult.setText(result);
    }//GEN-LAST:event_btnsubstractionActionPerformed

    private void txtno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtno1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd1;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnmultiplication;
    private javax.swing.JButton btnsubstraction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblshowresult;
    private javax.swing.JTextField txtno1;
    private javax.swing.JTextField txtno2;
    // End of variables declaration//GEN-END:variables
}
