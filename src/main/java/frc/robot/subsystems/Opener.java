// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SUBSYSTEM.*;

public class Opener extends SubsystemBase {
  /** Creates a new Opener. */
  public WPI_TalonSRX Opener = new WPI_TalonSRX(OPENER_ID);

  public Opener() {}

  public void Open(double speed){
    Opener.set(speed);
  }

  public void Close(){
    Opener.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
