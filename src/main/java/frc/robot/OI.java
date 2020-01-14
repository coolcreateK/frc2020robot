package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {


    public XboxController driverController, manipController;

    public OI() {
        initControllers();

    }

    /**
     * Initialize JoystickButtons and Controllers
     */
    private void initControllers() {
        driverController = new XboxController(0);
        manipController = new XboxController(1);
    }
    public double leftDriverY() {
        return -1*driverController.getY(GenericHID.Hand.kLeft);
    }
    public double rightDriverX() {
        return driverController.getX(GenericHID.Hand.kRight);
    }
    public boolean driverLeftBumper() {
        return driverController.getBumper(GenericHID.Hand.kLeft);
    }


}