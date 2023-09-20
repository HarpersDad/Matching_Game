import javax.swing.*;
import java.awt.*;

public class UI
{
    // set and initialize variables
    static int y = 800;
    static int x = 1040;
    static int width = 175;
    static int height = 300;
    static int bottomRow = y - height - 75;
    static int topRow = y - (2*height) - 100;
    static int score = 0;
    static JFrame myFrame = new JFrame();
    static JButton buttonA = new JButton();
    static JButton buttonB = new JButton();
    static JButton buttonC = new JButton();
    static JButton buttonD = new JButton();
    static JButton buttonE = new JButton();
    static JButton buttonF = new JButton();
    static JButton buttonG = new JButton();
    static JButton buttonH = new JButton();
    static JButton buttonI = new JButton();
    static JButton buttonJ = new JButton();
    static JLabel scoreL = new JLabel("Score: 0");
    static String[] buttonText = {"A", "B", "C", "D", "E", "A", "B", "C", "D", "E"};
    static Object[] buttons = {buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI, buttonJ};

    // function that creates the UI
    static void createUI()
    {
        myFrame.setTitle("Match-It");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(x, y);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().setBackground(Color.WHITE);

        // function call that rearranges the buttonText array
        Functions.shuffleAndSet(buttonText);

        // function calls that create the buttons
        Functions.setButtonBounds(myFrame, buttonA, 25, topRow, width, height);
        Functions.setButtonBounds(myFrame, buttonB, 25, bottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonC, 225, topRow, width, height);
        Functions.setButtonBounds(myFrame, buttonD, 225, bottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonE, 425, topRow, width, height);
        Functions.setButtonBounds(myFrame, buttonF, 425, bottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonG, 625, topRow, width, height);
        Functions.setButtonBounds(myFrame, buttonH, 625, bottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonI, 825, topRow, width, height);
        Functions.setButtonBounds(myFrame, buttonJ, 825, bottomRow, width, height);
        Functions.setLabelBounds(myFrame, scoreL, 25, topRow - 50, 50, 20);

        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        // action listeners that call the function that checks if two of the same "card" were flipped
        buttonA.addActionListener(e -> Functions.checkClick(buttonA));
        buttonB.addActionListener(e -> Functions.checkClick(buttonB));
        buttonC.addActionListener(e -> Functions.checkClick(buttonC));
        buttonD.addActionListener(e -> Functions.checkClick(buttonD));
        buttonE.addActionListener(e -> Functions.checkClick(buttonE));
        buttonF.addActionListener(e -> Functions.checkClick(buttonF));
        buttonG.addActionListener(e -> Functions.checkClick(buttonG));
        buttonH.addActionListener(e -> Functions.checkClick(buttonH));
        buttonI.addActionListener(e -> Functions.checkClick(buttonI));
        buttonJ.addActionListener(e -> Functions.checkClick(buttonJ));
    }
}
