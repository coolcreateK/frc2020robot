package frc.subsystems.drivetrain;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.sensors.*;

public class SpeedController extends SubsystemBase {
    public TalonSRX A, B;

    public SpeedController(TalonSRX A1, TalonSRX B1) {
        A = A1;
        B = B1;

    }

    public void drive(double value) {
        A.set(ControlMode.PercentOutput,value);
        B.set(ControlMode.PercentOutput,value);


    }
}
