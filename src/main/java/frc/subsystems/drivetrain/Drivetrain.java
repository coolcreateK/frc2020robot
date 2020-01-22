package frc.subsystems.drivetrain;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.sensors.*;

public class Drivetrain extends SubsystemBase {
    //public CANSparkMax leftA, leftB;
    public SpeedController leftDrive;
   // public CANSparkMax rightA, rightB;
    public SpeedController rightDrive;
    public Differencialdrive diffDrive;
    public TalonSRX leftA,leftB;
    public TalonSRX rightA,rightB;
    public OI oi = new OI();

    public Drivetrain() {
        rightA = new TalonSRX(4);
        rightB = new TalonSRX(2);
        rightDrive = new SpeedController(rightA, rightB);
        leftA = new TalonSRX(3);
        leftB = new TalonSRX(1);
        leftDrive = new SpeedController(leftA, leftB);
        diffDrive = new Differencialdrive(leftDrive, rightDrive);

    }

    public Timer timer = new Timer();




}
