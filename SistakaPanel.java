import javax.swing.*;
import javax.swing.border.EmptyBorder;

public abstract class SistakaPanel extends JPanel {
    protected final HomeGUI main;

    public SistakaPanel(HomeGUI main) {
        this.main = main;
        setBorder(new EmptyBorder(10,10,10,10));
    }

    public abstract void refresh();
}
