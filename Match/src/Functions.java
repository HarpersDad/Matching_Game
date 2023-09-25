import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.List;

public class Functions
{
    // create and set Button bounds
    public static void setButtonBounds(JButton myButton, int x, int y)
    {
        myButton.setFont(new Font("Arial", Font.PLAIN, 0));
        myButton.setBounds(x, y, Variables.width, Variables.height);
        Variables.myFrame.getContentPane().add(myButton);

        setBackImage(myButton);

        myButton.addActionListener(e ->
        {if (Variables.buttonClicked != myButton) {Variables.buttonClicked = myButton;Functions.checkClick(myButton);}});
    }

    // create and set character data labels
    public static void setLabelBounds(JLabel myLabel, int x, int y, int w, int h)
    {
        myLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        myLabel.setBounds(x, y, w, h);
        myLabel.setForeground(Color.BLACK);
        Variables.myFrame.getContentPane().add(myLabel);
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

        try
        {
            Image myImage = ImageIO.read(Objects.requireNonNull(Functions.class.getResource(Variables.cardPath)));
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
                Variables.cardPath = "Resources/cards/2b.png";
                break;
            case "3b":
                Variables.cardPath = "Resources/cards/3b.png";
                break;
            case "4b":
                Variables.cardPath = "Resources/cards/4b.png";
                break;
            case "5b":
                Variables.cardPath = "Resources/cards/5b.png";
                break;
            case "6b":
                Variables.cardPath = "Resources/cards/6b.png";
                break;
            case "7b":
                Variables.cardPath = "Resources/cards/7b.png";
                break;
            case "8b":
                Variables.cardPath = "Resources/cards/8b.png";
                break;
            case "9b":
                Variables.cardPath = "Resources/cards/9b.png";
                break;
            case "10b":
                Variables.cardPath = "Resources/cards/10b.png";
                break;
            case "Jb":
                Variables.cardPath = "Resources/cards/Jb.png";
                break;
            case "Qb":
                Variables.cardPath = "Resources/cards/Qb.png";
                break;
            case "Kb":
                Variables.cardPath = "Resources/cards/Kb.png";
                break;
            case "Ab":
                Variables.cardPath = "Resources/cards/Ab.png";
                break;
            case "2r":
                Variables.cardPath = "Resources/cards/2r.png";
                break;
            case "3r":
                Variables.cardPath = "Resources/cards/3r.png";
                break;
            case "4r":
                Variables.cardPath = "Resources/cards/4r.png";
                break;
            case "5r":
                Variables.cardPath = "Resources/cards/5r.png";
                break;
            case "6r":
                Variables.cardPath = "Resources/cards/6r.png";
                break;
            case "7r":
                Variables.cardPath = "Resources/cards/7r.png";
                break;
            case "8r":
                Variables.cardPath = "Resources/cards/8r.png";
                break;
            case "9r":
                Variables.cardPath = "Resources/cards/9r.png";
                break;
            case "10r":
                Variables.cardPath = "Resources/cards/10r.png";
                break;
            case "Jr":
                Variables.cardPath = "Resources/cards/Jr.png";
                break;
            case "Qr":
                Variables.cardPath = "Resources/cards/Qr.png";
                break;
            case "Kr":
                Variables.cardPath = "Resources/cards/Kr.png";
                break;
            case "Ar":
                Variables.cardPath = "Resources/cards/Ar.png";
                break;
        }
    }

    // sets button1 and button2
    public static void checkClick(JButton myButton)
    {
        if (Variables.button1 == null)
        {
            Variables.button1 = myButton;
            Variables.button1.setBackground(Color.WHITE);

            // sets the button text
            setButtonText(Variables.button1);
            //System.out.println(button1.getText());

            // sets button image
            setFrontImage(Variables.button1);

            // remove the text from the button
            Variables.button1.setText(null);

            // sets the card's image path for reference
            Variables.cardPathA = Variables.cardPath;
        }
        else
        {
            Variables.button2 = myButton;
            Variables.button2.setBackground(Color.WHITE);
            Variables.button2.setIcon(null);

            // sets the button text
            setButtonText(Variables.button2);
            //System.out.println(button2.getText());

            // sets button image
            setFrontImage(Variables.button2);

            // remove the text from the button
            Variables.button2.setText(null);

            // sets the card's image path for reference
            Variables.cardPathB = Variables.cardPath;

            // checks if the two "cards" match
            checkMatch();
        }
    }

    // checks to see if the two chosen cards match
    public static void checkMatch()
    {
        if (Objects.equals(Variables.cardPathA, Variables.cardPathB))
        {
            Variables.myFrame.remove(Variables.button1);
            Variables.myFrame.remove(Variables.button2);

            Variables.scoreCount--;

            Variables.scoreL.setText("Pairs Remaining: " + Variables.scoreCount);

            Variables.myFrame.repaint();
        }
        else if (!Objects.equals(Variables.cardPathA, Variables.cardPathB))
        {
            JOptionPane.showMessageDialog(null, "The two tiles do not match");

            Variables.button1.setText("");
            Variables.button2.setText("");

            Variables.button1.setBackground(Color.BLUE);
            Variables.button2.setBackground(Color.BLUE);

            setBackImage(Variables.button1);
            setBackImage(Variables.button2);
        }

        //System.out.println("next pair");

        Variables.buttonClicked = null;
        Variables.button1 = null;
        Variables.button2 = null;
    }

    // rearranges the buttonText array
    public static void shuffleAndSet(String[] myButtons)
    {
        List<String> top = Arrays.asList(myButtons);

        Collections.shuffle(top);

        top.toArray(Variables.buttonText);
    }

    // sets the passed button's text to that of corresponding letter at the same array position
    public static void setButtonText(JButton thisButton)
    {
        for (int i = 0; i < Variables.buttons.length; i++)
        {
            if (thisButton == Variables.buttons[i])
            {
                thisButton.setText(Variables.buttonText[i]);
            }
        }
    }
}
