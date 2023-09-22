import javax.swing.*;
import java.awt.*;

public class UI
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
        Functions.setButtonBounds(myFrame, buttonA1, 320, uppermostTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonB1, 400, uppermostTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonC1, 480, uppermostTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonD1, 560, uppermostTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonE1, 640, uppermostTopRow, width, height);

        Functions.setButtonBounds(myFrame, buttonF1, 240, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonG1, 320, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonH1, 400, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonI1, 480, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonJ1, 560, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonK1, 640, upperTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonL1, 720, upperTopRow, width, height);

        Functions.setButtonBounds(myFrame, buttonM1, 160, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonN1, 240, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonO1, 320, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonP1, 400, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonQ1, 480, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonR1, 560, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonS1, 640, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonT1, 720, lowerTopRow, width, height);
        Functions.setButtonBounds(myFrame, buttonU1, 800, lowerTopRow, width, height);

        Functions.setButtonBounds(myFrame, buttonV1, 120, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonW1, 200, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonX1, 280, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonY1, 360, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonZ1, 440, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonA2, 520, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonB2, 600, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonC2, 680, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonD2, 760, middleRow, width, height);
        Functions.setButtonBounds(myFrame, buttonE2, 840, middleRow, width, height);

        Functions.setButtonBounds(myFrame, buttonF2, 160, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonG2, 240, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonH2, 320, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonI2, 400, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonJ2, 480, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonK2, 560, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonL2, 640, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonM2, 720, upperBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonN2, 800, upperBottomRow, width, height);

        Functions.setButtonBounds(myFrame, buttonO2, 240, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonP2, 320, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonQ2, 400, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonR2, 480, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonS2, 560, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonT2, 640, lowerBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonU2, 720, lowerBottomRow, width, height);

        Functions.setButtonBounds(myFrame, buttonV2, 320, lowestBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonW2, 400, lowestBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonX2, 480, lowestBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonY2, 560, lowestBottomRow, width, height);
        Functions.setButtonBounds(myFrame, buttonZ2, 640, lowestBottomRow, width, height);

        Functions.setLabelBounds(myFrame, scoreL, 25, upperTopRow - 25, 300, 20);

        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        // action listeners that call the function that checks if two of the same "card" were flipped
        buttonA1.addActionListener(e ->
                {if (buttonClicked != buttonA1) {buttonClicked = buttonA1;Functions.checkClick(buttonA1);}});

        buttonB1.addActionListener(e ->
                {if (buttonClicked != buttonB1) {buttonClicked = buttonB1;Functions.checkClick(buttonB1);}});

        buttonC1.addActionListener(e ->
                {if (buttonClicked != buttonC1) {buttonClicked = buttonC1;Functions.checkClick(buttonC1);}});

        buttonD1.addActionListener(e ->
                {if (buttonClicked != buttonD1) {buttonClicked = buttonD1;Functions.checkClick(buttonD1);}});

        buttonE1.addActionListener(e ->
                {if (buttonClicked != buttonE1) {buttonClicked = buttonE1;Functions.checkClick(buttonE1);}});

        buttonF1.addActionListener(e ->
                {if (buttonClicked != buttonF1) {buttonClicked = buttonF1;Functions.checkClick(buttonF1);}});

        buttonG1.addActionListener(e ->
                {if (buttonClicked != buttonG1) {buttonClicked = buttonG1;Functions.checkClick(buttonG1);}});

        buttonH1.addActionListener(e ->
                {if (buttonClicked != buttonH1) {buttonClicked = buttonH1;Functions.checkClick(buttonH1);}});

        buttonI1.addActionListener(e ->
                {if (buttonClicked != buttonI1) {buttonClicked = buttonI1;Functions.checkClick(buttonI1);}});

        buttonJ1.addActionListener(e ->
                {if (buttonClicked != buttonJ1) {buttonClicked = buttonJ1;Functions.checkClick(buttonJ1);}});

        buttonK1.addActionListener(e ->
                {if (buttonClicked != buttonK1) {buttonClicked = buttonK1;Functions.checkClick(buttonK1);}});

        buttonL1.addActionListener(e ->
                {if (buttonClicked != buttonL1) {buttonClicked = buttonL1;Functions.checkClick(buttonL1);}});

        buttonM1.addActionListener(e ->
                {if (buttonClicked != buttonM1) {buttonClicked = buttonM1;Functions.checkClick(buttonM1);}});

        buttonN1.addActionListener(e ->
                {if (buttonClicked != buttonN1) {buttonClicked = buttonN1;Functions.checkClick(buttonN1);}});

        buttonO1.addActionListener(e ->
                {if (buttonClicked != buttonO1) {buttonClicked = buttonO1;Functions.checkClick(buttonO1);}});
        buttonP1.addActionListener(e ->
                {if (buttonClicked != buttonP1) {buttonClicked = buttonP1;Functions.checkClick(buttonP1);}});

        buttonQ1.addActionListener(e ->
                {if (buttonClicked != buttonQ1) {buttonClicked = buttonQ1;Functions.checkClick(buttonQ1);}});

        buttonR1.addActionListener(e ->
                {if (buttonClicked != buttonR1) {buttonClicked = buttonR1;Functions.checkClick(buttonR1);}});

        buttonS1.addActionListener(e ->
                {if (buttonClicked != buttonS1) {buttonClicked = buttonS1;Functions.checkClick(buttonS1);}});

        buttonT1.addActionListener(e ->
                {if (buttonClicked != buttonT1) {buttonClicked = buttonT1;Functions.checkClick(buttonT1);}});

        buttonU1.addActionListener(e ->
                {if (buttonClicked != buttonU1) {buttonClicked = buttonU1;Functions.checkClick(buttonU1);}});

        buttonV1.addActionListener(e ->
                {if (buttonClicked != buttonV1) {buttonClicked = buttonV1;Functions.checkClick(buttonV1);}});

        buttonW1.addActionListener(e ->
                {if (buttonClicked != buttonW1) {buttonClicked = buttonW1;Functions.checkClick(buttonW1);}});

        buttonX1.addActionListener(e ->
                {if (buttonClicked != buttonX1) {buttonClicked = buttonX1;Functions.checkClick(buttonX1);}});

        buttonY1.addActionListener(e ->
                {if (buttonClicked != buttonY1) {buttonClicked = buttonY1;Functions.checkClick(buttonY1);}});

        buttonZ1.addActionListener(e ->
                {if (buttonClicked != buttonZ1) {buttonClicked = buttonZ1;Functions.checkClick(buttonZ1);}});

        buttonA2.addActionListener(e ->
                {if (buttonClicked != buttonA2) {buttonClicked = buttonA2;Functions.checkClick(buttonA2);}});

        buttonB2.addActionListener(e ->
                {if (buttonClicked != buttonB2) {buttonClicked = buttonB2;Functions.checkClick(buttonB2);}});

        buttonC2.addActionListener(e ->
                {if (buttonClicked != buttonC2) {buttonClicked = buttonC2;Functions.checkClick(buttonC2);}});

        buttonD2.addActionListener(e ->
                {if (buttonClicked != buttonD2) {buttonClicked = buttonD2;Functions.checkClick(buttonD2);}});

        buttonE2.addActionListener(e ->
                {if (buttonClicked != buttonE2) {buttonClicked = buttonE2;Functions.checkClick(buttonE2);}});

        buttonF2.addActionListener(e ->
                {if (buttonClicked != buttonF2) {buttonClicked = buttonF2;Functions.checkClick(buttonF2);}});

        buttonG2.addActionListener(e ->
                {if (buttonClicked != buttonG2) {buttonClicked = buttonG2;Functions.checkClick(buttonG2);}});

        buttonH2.addActionListener(e ->
                {if (buttonClicked != buttonH2) {buttonClicked = buttonH2;Functions.checkClick(buttonH2);}});

        buttonI2.addActionListener(e ->
                {if (buttonClicked != buttonI2) {buttonClicked = buttonI2;Functions.checkClick(buttonI2);}});

        buttonJ2.addActionListener(e ->
                {if (buttonClicked != buttonJ2) {buttonClicked = buttonJ2;Functions.checkClick(buttonJ2);}});

        buttonK2.addActionListener(e ->
                {if (buttonClicked != buttonK2) {buttonClicked = buttonK2;Functions.checkClick(buttonK2);}});

        buttonL2.addActionListener(e ->
                {if (buttonClicked != buttonL2) {buttonClicked = buttonL2;Functions.checkClick(buttonL2);}});

        buttonM2.addActionListener(e ->
                {if (buttonClicked != buttonM2) {buttonClicked = buttonM2;Functions.checkClick(buttonM2);}});

        buttonN2.addActionListener(e ->
                {if (buttonClicked != buttonN2) {buttonClicked = buttonN2;Functions.checkClick(buttonN2);}});

        buttonO2.addActionListener(e ->
                {if (buttonClicked != buttonO2) {buttonClicked = buttonO2;Functions.checkClick(buttonO2);}});

        buttonP2.addActionListener(e ->
                {if (buttonClicked != buttonP2) {buttonClicked = buttonP2;Functions.checkClick(buttonP2);}});

        buttonQ2.addActionListener(e ->
                {if (buttonClicked != buttonQ2) {buttonClicked = buttonQ2;Functions.checkClick(buttonQ2);}});

        buttonR2.addActionListener(e ->
                {if (buttonClicked != buttonR2) {buttonClicked = buttonR2;Functions.checkClick(buttonR2);}});

        buttonS2.addActionListener(e ->
                {if (buttonClicked != buttonS2) {buttonClicked = buttonS2;Functions.checkClick(buttonS2);}});

        buttonT2.addActionListener(e ->
                {if (buttonClicked != buttonT2) {buttonClicked = buttonT2;Functions.checkClick(buttonT2);}});

        buttonU2.addActionListener(e ->
                {if (buttonClicked != buttonU2) {buttonClicked = buttonU2;Functions.checkClick(buttonU2);}});

        buttonV2.addActionListener(e ->
                {if (buttonClicked != buttonV2) {buttonClicked = buttonV2;Functions.checkClick(buttonV2);}});

        buttonW2.addActionListener(e ->
                {if (buttonClicked != buttonW2) {buttonClicked = buttonW2;Functions.checkClick(buttonW2);}});

        buttonX2.addActionListener(e ->
                {if (buttonClicked != buttonX2) {buttonClicked = buttonX2;Functions.checkClick(buttonX2);}});

        buttonY2.addActionListener(e ->
                {if (buttonClicked != buttonY2) {buttonClicked = buttonY2;Functions.checkClick(buttonY2);}});

        buttonZ2.addActionListener(e ->
                {if (buttonClicked != buttonZ2) {buttonClicked = buttonZ2;Functions.checkClick(buttonZ2);}});
    }
}
