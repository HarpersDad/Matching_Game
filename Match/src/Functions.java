import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.List;

public class Functions
{
    static int scoreCount = 0;
    static JButton button1 = null;
    static JButton button2 = null;

    // create and set Button bounds
    public static void setButtonBounds(JFrame myFrame, JButton myButton, int x, int y, int w, int h)
    {
        myButton.setFont(new Font("Arial", Font.PLAIN, 12));
        myButton.setBounds(x, y, w, h);
        myButton.setForeground(Color.BLACK);
        myButton.setBackground(Color.BLUE);
        myFrame.getContentPane().add(myButton);
    }

    // create and set character data labels
    public static void setLabelBounds(JFrame myFrame, JLabel myLabel, int x, int y, int w, int h)
    {
        myLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        myLabel.setBounds(x, y, w, h);
        myLabel.setForeground(Color.BLACK);
        myFrame.getContentPane().add(myLabel);
    }

    // checks if the two clicked tiles match
    public static void checkClick(JButton myButton)
    {
        if (button1 == null)
        {
            button1 = myButton;
            button1.setBackground(Color.WHITE);
            setButtonText(button1);
        }
        else
        {
            button2 = myButton;
            button2.setBackground(Color.WHITE);
            setButtonText(button2);
            checkMatch();
        }
    }

    public static void checkMatch()
    {
        if (Objects.equals(button1.getText(), button2.getText()))
        {
            UI.myFrame.remove(button1);
            UI.myFrame.remove(button2);

            button1 = null;
            button2 = null;

            scoreCount++;

            UI.scoreL.setText("Score: " + scoreCount);

            System.out.println(UI.score);

            UI.myFrame.repaint();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The two tiles do not match");

            button1.setText("");
            button2.setText("");

            button1.setBackground(Color.BLUE);
            button2.setBackground(Color.BLUE);

            button1 = null;
            button2 = null;
        }
    }

    public static void shuffleAndSet(String[] myButtons)
    {
        List<String> top = Arrays.asList(myButtons);

        Collections.shuffle(top);

        top.toArray(UI.buttonText);
    }

    public static void setButtonText(JButton thisButton)
    {
        for (int i = 0; i < UI.buttons.length; i++)
        {
            if (thisButton == UI.buttons[i])
            {
                thisButton.setText(UI.buttonText[i]);
            }
        }
    }
}
