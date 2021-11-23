// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import static frc.robot.Constants.JOYSTICK.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SUBSYSTEM.*;

public class Lifter extends SubsystemBase {
  /** Creates a new Lifter. */
  public WPI_TalonSRX mLifter = new WPI_TalonSRX(LIFTER_ID);

  public Lifter() {}

  public void Lift(double speed){
    mLifter.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    double multiplier = RobotContainer.stick.getRawButton(Y) ? 0.5 : 0.5 ;
    Lift(RobotContainer.stick.getRawAxis(X) * multiplier);
  }
}
