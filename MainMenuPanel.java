public class MainMenuPanel extends SistakaPanel {
    public MainMenuPanel(HomeGUI main){
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

        exitButton = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        leaderboardButton = new javax.swing.JButton();
        triviaArkan = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(null);

        exitButton.setBackground(new java.awt.Color(255, 102, 102));
        exitButton.setFont(new java.awt.Font("Super Legend Boy", 0, 12)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        add(exitButton);
        exitButton.setBounds(180, 320, 160, 40);

        newGameButton.setBackground(new java.awt.Color(102, 255, 102));
        newGameButton.setFont(new java.awt.Font("Super Legend Boy", 0, 12)); // NOI18N
        newGameButton.setText("NEW GAME");
        newGameButton.setActionCommand("NEW GAME");
        newGameButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        add(newGameButton);
        newGameButton.setBounds(180, 220, 160, 40);

        leaderboardButton.setBackground(new java.awt.Color(255, 255, 102));
        leaderboardButton.setFont(new java.awt.Font("Super Legend Boy", 0, 12)); // NOI18N
        leaderboardButton.setText("LEADERBOARD");
        leaderboardButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaderboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardButtonActionPerformed(evt);
            }
        });
        add(leaderboardButton);
        leaderboardButton.setBounds(180, 270, 160, 40);

        triviaArkan.setFont(new java.awt.Font("Super Legend Boy", 1, 18)); // NOI18N
        triviaArkan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        triviaArkan.setText("TRIVIA ARKAN");
        add(triviaArkan);
        triviaArkan.setBounds(40, 110, 430, 50);

        welcome.setFont(new java.awt.Font("Super Legend Boy", 1, 18)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("SELAMAT DATANG DI");
        add(welcome);
        welcome.setBounds(40, 80, 430, 30);

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
            .addGap(0, 86, Short.MAX_VALUE)
        );

        add(welcomePanel);
        welcomePanel.setBounds(100, 70, 310, 90);

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
            .addGap(0, 160, Short.MAX_VALUE)
        );

        add(buttonPanel);
        buttonPanel.setBounds(170, 210, 180, 160);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        main.exit();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void leaderboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardButtonActionPerformed
        // TODO add your handling code here:
        main.setPanel("leaderboard");
    }//GEN-LAST:event_leaderboardButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        // TODO add your handling code here:
        main.setPanel("register");
    }//GEN-LAST:event_newGameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton leaderboardButton;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel triviaArkan;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refresh() {
        
    }

}

