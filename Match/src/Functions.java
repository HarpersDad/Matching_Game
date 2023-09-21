import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.List;

public class Functions
{
    // initialize variables
    static int scoreCount = 0;
    static JButton button1 = null;
    static JButton button2 = null;
    static String cardPath = "";
    static String cardPathA = "";
    static String cardPathB = "";

    // create and set Button bounds
    public static void setButtonBounds(JFrame myFrame, JButton myButton, int x, int y, int w, int h)
    {
        myButton.setFont(new Font("Arial", Font.PLAIN, 0));
        myButton.setBounds(x, y, w, h);
        myButton.setForeground(Color.BLACK);
        myButton.setBackground(Color.BLUE);
        myFrame.getContentPane().add(myButton);

        setBackImage(myButton);
    }

    // create and set character data labels
    public static void setLabelBounds(JFrame myFrame, JLabel myLabel, int x, int y, int w, int h)
    {
        myLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        myLabel.setBounds(x, y, w, h);
        myLabel.setForeground(Color.BLACK);
        myFrame.getContentPane().add(myLabel);
    }

    // sets the button image
    public static void setBackImage(JButton myButton)
    {
        try
        {
            Image myImage = ImageIO.read(Objects.requireNonNull(Functions.class.getResource("Resources/cardBack.png")));
            myButton.setIcon(new ImageIcon(myImage));
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void setFrontImage(JButton myButton)
    {
        getCard(myButton);

        myButton.setIcon(null);

        try
        {
            Image myImage = ImageIO.read(Objects.requireNonNull(Functions.class.getResource(cardPath)));
            myButton.setIcon(new ImageIcon(myImage));
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void getCard(JButton myButton)
    {
        switch (myButton.getText())
        {
            case "2":
                cardPath = "Resources/cards/2.png";
                break;
            case "3":
                cardPath = "Resources/cards/3.png";
                break;
            case "4":
                cardPath = "Resources/cards/4.png";
                break;
            case "5":
                cardPath = "Resources/cards/5.png";
                break;
            case "6":
                cardPath = "Resources/cards/6.png";
                break;
            case "7":
                cardPath = "Resources/cards/7.png";
                break;
            case "8":
                cardPath = "Resources/cards/8.png";
                break;
            case "9":
                cardPath = "Resources/cards/9.png";
                break;
            case "10":
                cardPath = "Resources/cards/10.png";
                break;
            case "J":
                cardPath = "Resources/cards/J.png";
                break;
            case "Q":
                cardPath = "Resources/cards/Q.png";
                break;
            case "K":
                cardPath = "Resources/cards/K.png";
                break;
            case "A":
                cardPath = "Resources/cards/A.png";
                break;
        }
    }

    // sets button1 and button2
    public static void checkClick(JButton myButton)
    {
        if (button1 == null)
        {
            button1 = myButton;
            button1.setBackground(Color.WHITE);

            // sets the button text
            setButtonText(button1);

            // sets button image
            setFrontImage(button1);

            button1.setText(null);

            // sets the card's image path for reference
            cardPathA = cardPath;
        }
        else
        {
            button2 = myButton;
            button2.setBackground(Color.WHITE);
            button2.setIcon(null);

            // sets the button text
            setButtonText(button2);

            // sets button image
            setFrontImage(button2);

            button2.setText(null);

            // sets the card's image path for reference
            cardPathB = cardPath;

            // checks if the two "cards" match
            checkMatch();
        }
    }

    // checks to see if the two chosen cards match
    public static void checkMatch()
    {
        if (Objects.equals(cardPathA, cardPathB))
        {
            UI.myFrame.remove(button1);
            UI.myFrame.remove(button2);

            button1 = null;
            button2 = null;

            scoreCount++;

            UI.scoreL.setText("Score: " + scoreCount);

            UI.myFrame.repaint();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The two tiles do not match");

            button1.setText("");
            button2.setText("");

            button1.setBackground(Color.BLUE);
            button2.setBackground(Color.BLUE);

            setBackImage(button1);
            setBackImage(button2);

            button1 = null;
            button2 = null;
        }
    }

    // rearranges the buttonText array
    public static void shuffleAndSet(String[] myButtons)
    {
        List<String> top = Arrays.asList(myButtons);

        Collections.shuffle(top);

        top.toArray(UI.buttonText);
    }

    // sets the passed button's text to that of corresponding letter at the same array position
    public static void setButtonText(JButton thisButton) {
        for (int i = 0; i < UI.buttons.length; i++) {
            if (thisButton == UI.buttons[i]) {
                thisButton.setText(UI.buttonText[i]);
            }
        }
    }
}
