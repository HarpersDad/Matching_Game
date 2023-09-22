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
    static int scoreCount = 26;
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
        myFrame.getContentPane().add(myButton);

        //setBackImage(myButton);
        jank(myButton);
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
            Image myImage = ImageIO.read(Objects.requireNonNull(Functions.class.getResource("Resources/cards/cardBack.png")));
            myButton.setIcon(new ImageIcon(myImage));
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void setFrontImage(JButton myButton)
    {
        getCardPath(myButton);

        myButton.setIcon(null);

        myButton.setText(null);

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

    public static void getCardPath(JButton myButton)
    {
        switch (myButton.getText())
        {
            case "2b":
                cardPath = "Resources/cards/2b.png";
                break;
            case "3b":
                cardPath = "Resources/cards/3b.png";
                break;
            case "4b":
                cardPath = "Resources/cards/4b.png";
                break;
            case "5b":
                cardPath = "Resources/cards/5b.png";
                break;
            case "6b":
                cardPath = "Resources/cards/6b.png";
                break;
            case "7b":
                cardPath = "Resources/cards/7b.png";
                break;
            case "8b":
                cardPath = "Resources/cards/8b.png";
                break;
            case "9b":
                cardPath = "Resources/cards/9b.png";
                break;
            case "10b":
                cardPath = "Resources/cards/10b.png";
                break;
            case "Jb":
                cardPath = "Resources/cards/Jb.png";
                break;
            case "Qb":
                cardPath = "Resources/cards/Qb.png";
                break;
            case "Kb":
                cardPath = "Resources/cards/Kb.png";
                break;
            case "Ab":
                cardPath = "Resources/cards/Ab.png";
                break;
            case "2r":
                cardPath = "Resources/cards/2r.png";
                break;
            case "3r":
                cardPath = "Resources/cards/3r.png";
                break;
            case "4r":
                cardPath = "Resources/cards/4r.png";
                break;
            case "5r":
                cardPath = "Resources/cards/5r.png";
                break;
            case "6r":
                cardPath = "Resources/cards/6r.png";
                break;
            case "7r":
                cardPath = "Resources/cards/7r.png";
                break;
            case "8r":
                cardPath = "Resources/cards/8r.png";
                break;
            case "9r":
                cardPath = "Resources/cards/9r.png";
                break;
            case "10r":
                cardPath = "Resources/cards/10r.png";
                break;
            case "Jr":
                cardPath = "Resources/cards/Jr.png";
                break;
            case "Qr":
                cardPath = "Resources/cards/Qr.png";
                break;
            case "Kr":
                cardPath = "Resources/cards/Kr.png";
                break;
            case "Ar":
                cardPath = "Resources/cards/Ar.png";
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
            //System.out.println(button1.getText());

            // sets button image
            setFrontImage(button1);

            // remove the text from the button
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
            //System.out.println(button2.getText());

            // sets button image
            setFrontImage(button2);

            // remove the text from the button
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
        if (cardPathA == cardPathB)
        {
            UI.myFrame.remove(button1);
            UI.myFrame.remove(button2);

            scoreCount--;

            UI.scoreL.setText("Pairs Remaining: " + scoreCount);

            UI.myFrame.repaint();
        }
        else if (cardPathA != cardPathB)
        {
            JOptionPane.showMessageDialog(null, "The two tiles do not match");

            button1.setText("");
            button2.setText("");

            button1.setBackground(Color.BLUE);
            button2.setBackground(Color.BLUE);

            setBackImage(button1);
            setBackImage(button2);
        }

        //System.out.println("next pair");

        UI.buttonClicked = null;
        button1 = null;
        button2 = null;

        //resetGame();
    }

    // rearranges the buttonText array
    public static void shuffleAndSet(String[] myButtons)
    {
        List<String> top = Arrays.asList(myButtons);

        Collections.shuffle(top);

        top.toArray(UI.buttonText);
    }

    // sets the passed button's text to that of corresponding letter at the same array position
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

    static void resetGame()
    {
        if (scoreCount == 0)
        {
            int option = JOptionPane.showConfirmDialog(null, "Play Again?", "Game Over", JOptionPane.YES_NO_OPTION);

            if (option == 0)
            {
                UI.myFrame.dispose();

                scoreCount = 26;

                UI.buttonClicked = null;

                cardPath = null;
                cardPathA = null;
                cardPathB = null;

                button1 = null;
                button2 = null;

                UI.createUI();
            }
            else
            {
                System.exit(0);
            }
        }
    }

    public static void jank(JButton thisButton)
    {
        setButtonText(thisButton);
        setFrontImage(thisButton);

        UI.myFrame.repaint();
    }
}
