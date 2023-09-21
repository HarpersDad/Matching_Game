import javax.swing.*;
import java.awt.*;

public class UI
{
    // set and initialize variables
    static int y = 800;
    static int x = 1040;
    static int width = 120;
    static int height = 168;
    static int lowerBottomRow = y - height - 45;
    static int upperBottomRow = y - (2*height) - 55;
    static int lowerTopRow = y - (3*height) - 65;
    static int upperTopRow = y - (4*height) - 75;
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
    static JButton buttonK = new JButton();
    static JButton buttonL = new JButton();
    static JButton buttonM = new JButton();
    static JButton buttonN = new JButton();
    static JButton buttonO = new JButton();
    static JButton buttonP = new JButton();
    static JButton buttonQ = new JButton();
    static JButton buttonR = new JButton();
    static JButton buttonS = new JButton();
    static JButton buttonT = new JButton();
    static JButton buttonU = new JButton();
    static JButton buttonV = new JButton();
    static JButton buttonW = new JButton();
    static JButton buttonX = new JButton();
    static JButton buttonY = new JButton();
    static JButton buttonZ = new JButton();
    static JLabel scoreL = new JLabel("Score: 0");
    static String[] buttonText = {"A", "A", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7",
            "8", "8", "9", "9", "10", "10", "J", "J", "Q", "Q", "K", "K"};
    static Object[] buttons = {buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI,
            buttonJ, buttonK, buttonL, buttonM, buttonN, buttonO, buttonP, buttonQ, buttonR, buttonS, buttonT,
            buttonU, buttonV, buttonW, buttonX, buttonY, buttonZ};

    // function that creates the UI
    static void createUI()
    {
        myFrame.setTitle("Match-It");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(x, y);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().setBackground(Color.GRAY);

        // function call that rearranges the buttonText array
        Functions.shuffleAndSet(buttonText);

        // function calls that create the buttons
        Functions.setButtonBounds(myFrame, buttonA, 120, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonB, 250, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonC, 380, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonD, 510, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonE, 640, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonF, 770, upperTopRow, width, height);

        Functions.setButtonBounds(myFrame, buttonG, 55, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonH, 185, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonI, 315, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonJ, 445, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonK, 575, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonL, 705, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonM, 835, lowerTopRow, width, height);

        Functions.setButtonBounds(myFrame, buttonN, 55, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonO, 185, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonP, 315, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonQ, 445, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonR, 575, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonS, 705, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonT, 835, upperBottomRow, width, height);

        Functions.setButtonBounds(myFrame, buttonU, 120, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonV, 250, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonW, 380, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonX, 510, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonY, 640, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonZ, 770, lowerBottomRow, width, height);

        Functions.setLabelBounds(myFrame, scoreL, 25, upperTopRow - 25, 100, 20);

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
        buttonK.addActionListener(e -> Functions.checkClick(buttonK));
        buttonL.addActionListener(e -> Functions.checkClick(buttonL));
        buttonM.addActionListener(e -> Functions.checkClick(buttonM));
        buttonN.addActionListener(e -> Functions.checkClick(buttonN));
        buttonO.addActionListener(e -> Functions.checkClick(buttonO));
        buttonP.addActionListener(e -> Functions.checkClick(buttonP));
        buttonQ.addActionListener(e -> Functions.checkClick(buttonQ));
        buttonR.addActionListener(e -> Functions.checkClick(buttonR));
        buttonS.addActionListener(e -> Functions.checkClick(buttonS));
        buttonT.addActionListener(e -> Functions.checkClick(buttonT));
        buttonU.addActionListener(e -> Functions.checkClick(buttonU));
        buttonV.addActionListener(e -> Functions.checkClick(buttonV));
        buttonW.addActionListener(e -> Functions.checkClick(buttonW));
        buttonX.addActionListener(e -> Functions.checkClick(buttonX));
        buttonY.addActionListener(e -> Functions.checkClick(buttonY));
        buttonZ.addActionListener(e -> Functions.checkClick(buttonZ));
    }
}
