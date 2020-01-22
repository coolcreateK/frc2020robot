package frc.subsystems.shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.subsystems.drivetrain.Differencialdrive;
import frc.subsystems.drivetrain.SpeedController;

public class Shooter_with_controller extends SubsystemBase {
    public SpeedController leftDrive;
    // public CANSparkMax rightA, rightB;
    public SpeedController rightDrive;
    public Differencialdrive diffDrive;
    public TalonSRX A,B;
    public TalonSRX Y,X;
    public TalonSRX right_bumber,left_bumber;
    public OI oi = new OI();

    public Shooter_with_controller() {
        A = new TalonSRX(5);
        B = new TalonSRX(6);
        Y = new TalonSRX(3);
        X = new TalonSRX(4);
        right_bumber = new TalonSRX(1);
        left_bumber = new TalonSRX(2);
    }

    public Timer timer = new Timer();
    @Override
    public void periodic() {
        A.set(ControlMode.PercentOutput,0);
        B.set(ControlMode.PercentOutput,0);
        Y.set(ControlMode.PercentOutput,0);
        X.set(ControlMode.PercentOutput,0);
        left_bumber.set(ControlMode.PercentOutput,0);
        right_bumber.set(ControlMode.PercentOutput,0);

        left_bumber.set(ControlMode.PercentOutput,oi.leftDriverY());
        right_bumber.set(ControlMode.PercentOutput,-oi.leftDriverY());
        A.set(ControlMode.PercentOutput,oi.rightDriverY()/2);
        B.set(ControlMode.PercentOutput,-oi.rightDriverY()/2);

        if(oi.driverA()){
            Y.set(ControlMode.PercentOutput,0.5);
        }
        if(oi.driverB()){
            X.set(ControlMode.PercentOutput,-0.5);
        }

    }

}
