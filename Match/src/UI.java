import javax.swing.*;
import java.awt.*;

public class UI
{
    // function that creates the UI
    static void createUI()
    {
        Variables.myFrame.setTitle("Match-It");
        Variables.myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.myFrame.setSize(Variables.x, Variables.y);
        Variables.myFrame.setLocationRelativeTo(null);
        Variables.myFrame.getContentPane().setBackground(Color.GRAY);

        // function call that rearranges the buttonText array
        Functions.shuffleAndSet(Variables.buttonText);

        // function calls that create the buttons
        Functions.setButtonBounds(Variables.buttonA1, 320, Variables.uppermostTopRow);
        Functions.setButtonBounds(Variables.buttonB1, 400, Variables.uppermostTopRow);
        Functions.setButtonBounds(Variables.buttonC1, 480, Variables.uppermostTopRow);
        Functions.setButtonBounds(Variables.buttonD1, 560, Variables.uppermostTopRow);
        Functions.setButtonBounds(Variables.buttonE1, 640, Variables.uppermostTopRow);

        Functions.setButtonBounds(Variables.buttonF1, 240, Variables.upperTopRow);
        Functions.setButtonBounds(Variables.buttonG1, 320, Variables.upperTopRow);
        Functions.setButtonBounds(Variables.buttonH1, 400, Variables.upperTopRow);
        Functions.setButtonBounds(Variables.buttonI1, 480, Variables.upperTopRow);
        Functions.setButtonBounds(Variables.buttonJ1, 560, Variables.upperTopRow);
        Functions.setButtonBounds(Variables.buttonK1, 640, Variables.upperTopRow);
        Functions.setButtonBounds(Variables.buttonL1, 720, Variables.upperTopRow);

        Functions.setButtonBounds(Variables.buttonM1, 160, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonN1, 240, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonO1, 320, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonP1, 400, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonQ1, 480, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonR1, 560, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonS1, 640, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonT1, 720, Variables.lowerTopRow);
        Functions.setButtonBounds(Variables.buttonU1, 800, Variables.lowerTopRow);

        Functions.setButtonBounds(Variables.buttonV1, 120, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonW1, 200, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonX1, 280, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonY1, 360, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonZ1, 440, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonA2, 520, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonB2, 600, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonC2, 680, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonD2, 760, Variables.middleRow);
        Functions.setButtonBounds(Variables.buttonE2, 840, Variables.middleRow);

        Functions.setButtonBounds(Variables.buttonF2, 160, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonG2, 240, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonH2, 320, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonI2, 400, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonJ2, 480, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonK2, 560, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonL2, 640, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonM2, 720, Variables.upperBottomRow);
        Functions.setButtonBounds(Variables.buttonN2, 800, Variables.upperBottomRow);

        Functions.setButtonBounds(Variables.buttonO2, 240, Variables.lowerBottomRow);
        Functions.setButtonBounds(Variables.buttonP2, 320, Variables.lowerBottomRow);
        Functions.setButtonBounds(Variables.buttonQ2, 400, Variables.lowerBottomRow);
        Functions.setButtonBounds(Variables.buttonR2, 480, Variables.lowerBottomRow);
        Functions.setButtonBounds(Variables.buttonS2, 560, Variables.lowerBottomRow);
        Functions.setButtonBounds(Variables.buttonT2, 640, Variables.lowerBottomRow);
        Functions.setButtonBounds(Variables.buttonU2, 720, Variables.lowerBottomRow);

        Functions.setButtonBounds(Variables.buttonV2, 320, Variables.lowestBottomRow);
        Functions.setButtonBounds(Variables.buttonW2, 400, Variables.lowestBottomRow);
        Functions.setButtonBounds(Variables.buttonX2, 480, Variables.lowestBottomRow);
        Functions.setButtonBounds(Variables.buttonY2, 560, Variables.lowestBottomRow);
        Functions.setButtonBounds(Variables.buttonZ2, 640, Variables.lowestBottomRow);

        Functions.setLabelBounds(Variables.scoreL, 25, Variables.upperTopRow - 25, 300, 20);

        Variables.myFrame.setResizable(false);
        Variables.myFrame.setLayout(null);
        Variables.myFrame.setVisible(true);
    }
}
