import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeGUI {
    private final CardLayout layout = new CardLayout();
    private final JFrame frame;
    private final JPanel mainPanel = new JPanel();
    private final Map<String, SistakaPanel> panelMap = new HashMap<>();
    private User user;
    private static ArrayList<User> users = new ArrayList<User>();

    // Silahkan mengganti settingnya sesuai dengan keinginan Anda
    public HomeGUI(JFrame frame) {
        this.frame = frame;
        mainPanel.setLayout(layout);
        initGUI();
        frame.setContentPane(mainPanel);
    }

    private void initGUI() {
        frame.setSize(520, 500);
        SistakaPanel mainMenuPanel = new MainMenuPanel(this);
        panelMap.put("mainMenu", mainMenuPanel);
        mainPanel.add(mainMenuPanel, "mainMenu");

        SistakaPanel registerPanel = new RegisterPanel(this);
        panelMap.put("register", registerPanel);
        mainPanel.add(registerPanel, "register");

        SistakaPanel questionPanel = new QuestionPanel(this);
        panelMap.put("question", questionPanel);
        mainPanel.add(questionPanel, "question");

        SistakaPanel gameOverPanel = new GameOverPanel(this);
        panelMap.put("gameOver", gameOverPanel);
        mainPanel.add(gameOverPanel, "gameOver");

        SistakaPanel leaderboardPanel = new LeaderboardPanel(this);
        panelMap.put("leaderboard", leaderboardPanel);
        mainPanel.add(leaderboardPanel, "leaderboard");
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setPanel(String target){
        panelMap.get(target).refresh();
        layout.show(mainPanel, target);
    }

    public void exit() {
        frame.dispose();
    }
    
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static boolean userAvailable(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
}
