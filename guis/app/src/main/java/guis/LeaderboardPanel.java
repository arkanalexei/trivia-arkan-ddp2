/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package guis;

/**
 *
 * @author arkan
 */
public class LeaderboardPanel extends javax.swing.JPanel {

    /**
     * Creates new form LeaderboardPanel
     */
    public LeaderboardPanel() {
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

        welcome = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kembaliButton = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(null);

        welcome.setFont(new java.awt.Font("Super Legend Boy", 1, 18)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("LEADERBOARD");
        add(welcome);
        welcome.setBounds(40, 40, 430, 30);

        welcomePanel.setBackground(new java.awt.Color(255, 102, 255));
        welcomePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        add(welcomePanel);
        welcomePanel.setBounds(100, 30, 310, 50);

        jTextArea1.setBackground(new java.awt.Color(102, 102, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Super Legend Boy", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 90, 310, 280);

        kembaliButton.setBackground(new java.awt.Color(102, 255, 102));
        kembaliButton.setFont(new java.awt.Font("Super Legend Boy", 0, 12)); // NOI18N
        kembaliButton.setText("KEMBALI");
        kembaliButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });
        add(kembaliButton);
        kembaliButton.setBounds(170, 390, 160, 40);

        buttonPanel.setBackground(new java.awt.Color(51, 51, 51));
        buttonPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(buttonPanel);
        buttonPanel.setBounds(160, 380, 180, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}