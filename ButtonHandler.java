import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 21.12.2016
 * Created by user Schalk (Lukas Schalk).
 */

public class ButtonHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == GUI.getUpdateBtn()) {
            GUI.setJahr(GUI.getInput());
            GUI.updateAusgabeText();
            GUI.resetInputField();
        }
    }
}
