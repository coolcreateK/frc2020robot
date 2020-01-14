package frc.robot;


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.subsystems.drivetrain.Drivetrain;

/**
 * Don't change the name of this class since the VM is set up to run this
 */
public class Robot extends TimedRobot {
    public static Drivetrain drivetrain = new Drivetrain();
    public static OI oi = new OI();


    @Override
    public void robotInit() {

    }

    /**
     * This function is called every robot packet, no matter the mode. Use
     * this for items like diagnostics that you want ran during disabled,
     * autonomous, teleoperated and test.
     */
    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }


    @Override
    public void autonomousInit() {
        //Example of setting auto: Scheduler.getInstance().add(YOUR AUTO);
    }

    /**
     * This function is called periodically during autonomous.
     */
    @Override
    public void autonomousPeriodic() {
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() {
        CommandScheduler.getInstance().run();
        //rightA.set(-0.25);
        //rightB.set(-0.25);
        //leftA.set(0.25);
        //leftB.set(0.25); forward


    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() {
    }
}