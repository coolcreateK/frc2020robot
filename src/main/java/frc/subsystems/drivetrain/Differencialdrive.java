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
public class Differencialdrive {
    public SpeedController left, right;
    public Differencialdrive(SpeedController left1, SpeedController right1){
        left = left1;
        right = right1;
    }
    public void drive(double leftY, double rightX, boolean isQuickTurn) {
        //rightX = -rightX;
        double leftPower = 0, rightPower = 0;

        left.drive(leftPower);
        right.drive(-rightPower);
    }

}
