package frc.subsystems.drivetrain;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

public class Drivetrain extends SubsystemBase {
    public CANSparkMax leftA, leftB;
    public SpeedControllerGroup leftDrive;
    public CANSparkMax rightA, rightB;
    public SpeedControllerGroup rightDrive;
    public DifferentialDrive drive;

    public Drivetrain() {
        rightA = new CANSparkMax(1,CANSparkMaxLowLevel.MotorType.kBrushless);
        rightB = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightDrive = new SpeedControllerGroup(rightA, rightB);
        leftA = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftB = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftDrive = new SpeedControllerGroup(leftA, leftB);

        drive = new DifferentialDrive(leftDrive, rightDrive);
    }

    @Override
    public void periodic() {
        drive.curvatureDrive(Robot.oi.leftDriverY(), Robot.oi.rightDriverX(), Robot.oi.driverLeftBumper());
    }

}
