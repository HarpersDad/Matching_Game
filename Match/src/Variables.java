import javax.swing.*;

public class Variables
{
    // set and initialize variables
    static int y = 800;
    static int x = 1040;
    static int width = 65;
    static int height = 91;
    static int lowestBottomRow = y - height - 45;
    static int lowerBottomRow = y - (2*height) - 55;
    static int upperBottomRow = y - (3*height) - 65;
    static int middleRow = y - (4*height) - 75;
    static int lowerTopRow = y - (5*height) - 85;
    static int upperTopRow = y - (6*height) - 95;
    static int uppermostTopRow = y - (7*height) - 105;
    static JButton buttonClicked;
    static JFrame myFrame = new JFrame();
    static JButton buttonA1 = new JButton();
    static JButton buttonB1 = new JButton();
    static JButton buttonC1 = new JButton();
    static JButton buttonD1 = new JButton();
    static JButton buttonE1 = new JButton();
    static JButton buttonF1 = new JButton();
    static JButton buttonG1 = new JButton();
    static JButton buttonH1 = new JButton();
    static JButton buttonI1 = new JButton();
    static JButton buttonJ1 = new JButton();
    static JButton buttonK1 = new JButton();
    static JButton buttonL1 = new JButton();
    static JButton buttonM1 = new JButton();
    static JButton buttonN1 = new JButton();
    static JButton buttonO1 = new JButton();
    static JButton buttonP1 = new JButton();
    static JButton buttonQ1 = new JButton();
    static JButton buttonR1 = new JButton();
    static JButton buttonS1 = new JButton();
    static JButton buttonT1 = new JButton();
    static JButton buttonU1 = new JButton();
    static JButton buttonV1 = new JButton();
    static JButton buttonW1 = new JButton();
    static JButton buttonX1 = new JButton();
    static JButton buttonY1 = new JButton();
    static JButton buttonZ1 = new JButton();
    static JButton buttonA2 = new JButton();
    static JButton buttonB2 = new JButton();
    static JButton buttonC2 = new JButton();
    static JButton buttonD2 = new JButton();
    static JButton buttonE2 = new JButton();
    static JButton buttonF2 = new JButton();
    static JButton buttonG2 = new JButton();
    static JButton buttonH2 = new JButton();
    static JButton buttonI2 = new JButton();
    static JButton buttonJ2 = new JButton();
    static JButton buttonK2 = new JButton();
    static JButton buttonL2 = new JButton();
    static JButton buttonM2 = new JButton();
    static JButton buttonN2 = new JButton();
    static JButton buttonO2 = new JButton();
    static JButton buttonP2 = new JButton();
    static JButton buttonQ2 = new JButton();
    static JButton buttonR2 = new JButton();
    static JButton buttonS2 = new JButton();
    static JButton buttonT2 = new JButton();
    static JButton buttonU2 = new JButton();
    static JButton buttonV2 = new JButton();
    static JButton buttonW2 = new JButton();
    static JButton buttonX2 = new JButton();
    static JButton buttonY2 = new JButton();
    static JButton buttonZ2 = new JButton();
    static JLabel scoreL = new JLabel("Pairs Remaining: 26");

    // initialize variables
    static int scoreCount = 26;
    static JButton button1 = null;
    static JButton button2 = null;
    static String cardPath = "";
    static String cardPathA = "";
    static String cardPathB = "";
    static String[] buttonText =
            {
                    // black
                    "Ab", "Ab", "2b", "2b", "3b", "3b", "4b", "4b", "5b", "5b", "6b", "6b", "7b", "7b", "8b", "8b",
                    "9b", "9b", "10b", "10b", "Jb", "Jb", "Qb", "Qb", "Kb", "Kb",

                    // red
                    "Ar", "Ar", "2r", "2r", "3r", "3r", "4r", "4r", "5r", "5r", "6r", "6r", "7r", "7r", "8r", "8r",
                    "9r", "9r", "10r", "10r", "Jr", "Jr", "Qr", "Qr", "Kr", "Kr"
            };
    static JButton[] buttons =
            {
                    buttonA1, buttonB1, buttonC1, buttonD1, buttonE1, buttonF1, buttonG1, buttonH1, buttonI1, buttonJ1,
                    buttonK1, buttonL1, buttonM1, buttonN1, buttonO1, buttonP1, buttonQ1, buttonR1, buttonS1, buttonT1,
                    buttonU1, buttonV1, buttonW1, buttonX1, buttonY1, buttonZ1, buttonA2, buttonB2, buttonC2, buttonD2,
                    buttonE2, buttonF2, buttonG2, buttonH2, buttonI2, buttonJ2, buttonK2, buttonL2, buttonM2, buttonN2,
                    buttonO2, buttonP2, buttonQ2, buttonR2, buttonS2, buttonT2, buttonU2, buttonV2, buttonW2, buttonX2,
                    buttonY2, buttonZ2
            };
}
