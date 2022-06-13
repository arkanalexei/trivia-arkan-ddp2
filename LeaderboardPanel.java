import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class LeaderboardPanel extends SistakaPanel {
    // get list of users from homegui.java
    ArrayList<User> users = HomeGUI.getUsers();
    public LeaderboardPanel(HomeGUI main){
        super(main);
        initComponents(); // init panel
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
        peringkatTextArea = new javax.swing.JTextArea();
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

        peringkatTextArea.setBackground(new java.awt.Color(102, 102, 255));
        peringkatTextArea.setColumns(20);
        peringkatTextArea.setFont(new java.awt.Font("Super Legend Boy", 0, 12)); // NOI18N
        peringkatTextArea.setLineWrap(true);
        peringkatTextArea.setRows(5);
        peringkatTextArea.setBorder(null);
        jScrollPane1.setViewportView(peringkatTextArea);

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
        main.setPanel("mainMenu");
    }//GEN-LAST:event_kembaliButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea peringkatTextArea;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refresh() {
        StringBuilder peringkat = new StringBuilder();
        ArrayList<User> users = HomeGUI.getUsers();
        
        Collections.sort(users); // sorted by skor
        if (users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                peringkat.append(String.format("%d. %s: dengan skor %d\n", i+1, user.getName(), user.getSkor()));
            }
            peringkatTextArea.setText(peringkat.toString());
        } else {
            peringkatTextArea.setText("Leaderboard masih kosong!");

        }
    }

}
