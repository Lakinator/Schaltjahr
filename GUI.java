import javax.swing.*;
import java.util.Calendar;

/**
 * 21.12.2016
 * Created by user Schalk (Lukas Schalk).
 */

public class GUI {
    private static Jahr jahr;

    private static JFrame jf;
    private static JButton updateBtn;
    private static JTextField eingabeField;
    private static JLabel ausgabeLabel, copyrightLabel;

    public GUI() {
        jf = new JFrame();
        jf.setTitle("Schaltjahr");
        jf.setSize(400, 150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

        jahr = new Jahr(Calendar.getInstance().get(Calendar.YEAR));

        updateBtn = new JButton();
        updateBtn.setText("Berechne");
        updateBtn.setBounds(275, 70, 100, 30);
        updateBtn.addActionListener(new ButtonHandler());
        jf.add(updateBtn);

        eingabeField = new JTextField();
        eingabeField.setBounds(25, 70, 100, 30);
        eingabeField.setText("" + Calendar.getInstance().get(Calendar.YEAR));
        jf.add(eingabeField);

        ausgabeLabel = new JLabel();
        ausgabeLabel.setBounds(125, 20, 200, 15);
        ausgabeLabel.setText("Frohes Berechnen!");
        jf.add(ausgabeLabel);

        copyrightLabel = new JLabel();
        copyrightLabel.setBounds(5, 105, 300, 15);
        copyrightLabel.setText("Made by Laki || Lakinator.bplaced.net");
        jf.add(copyrightLabel);

        jf.setVisible(true);
    }

    public static JButton getUpdateBtn() {
        return updateBtn;
    }

    public static void updateAusgabeText() {
        if (jahr.getJahr() != 0)ausgabeLabel.setText("Jahr " + jahr.getJahr() + " ist " + (jahr.isSchaltjahr() ? "ein Schaltjahr" : "kein Schaltjahr"));
        else ausgabeLabel.setText("No valid number or year!");
    }

    public static void setJahr(int neuesJahr) {
        jahr.setJahr(neuesJahr);
    }

    public static int getInput() {
        int temp;

        try {
            temp = Integer.parseInt(eingabeField.getText());
        } catch (NumberFormatException e) {
            //System.out.println("NO VALID NUMBER/YEAR");
            temp = 0;
        }

        return temp;
    }

    public static void resetInputField() {
        eingabeField.setText("");
    }
}
