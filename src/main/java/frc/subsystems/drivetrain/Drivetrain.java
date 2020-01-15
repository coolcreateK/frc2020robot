package frc.subsystems.drivetrain;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

public class Drivetrain extends SubsystemBase {
    public Timer timer = new Timer();

    public CANEncoder leftAEncoder, leftBEncoder, rightAEncoder, rightBEncoder;

    public CANSparkMax leftA, leftB;
    public SpeedControllerGroup leftDrive;
    public CANSparkMax rightA, rightB;
    public SpeedControllerGroup rightDrive;
    public DifferentialDrive drive;

    public Drivetrain() {


        rightA = new CANSparkMax(1,CANSparkMaxLowLevel.MotorType.kBrushless);
        rightB = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightDrive = new SpeedControllerGroup(rightA, rightB);

        leftA = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftB = new CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftB.setInverted(true);
        leftDrive = new SpeedControllerGroup(leftA, leftB);

        leftDrive.setInverted(true);

        drive = new DifferentialDrive(leftDrive, rightDrive);

        leftAEncoder = leftA.getEncoder();
        leftBEncoder = leftB.getEncoder();
        rightAEncoder = rightA.getEncoder();
        rightBEncoder = rightB.getEncoder();
    }

    @Override
    public void periodic() {
        drive.curvatureDrive(Robot.oi.leftDriverY(), Robot.oi.rightDriverX(), Robot.oi.driverLeftBumper());
        System.out.println("RPM: " + leftAEncoder.getVelocity());
    }

}
