// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SUBSYSTEM.*;

public class Sucker extends SubsystemBase {
  public WPI_TalonSRX Sucker = new WPI_TalonSRX(SUCKER_ID);
  /** Creates a new Sucker. */
  public Sucker(){}

  public void suck (double speed){
    // speed > 0 thi suck hut ra ngoai ( ban ) , < 0 thi hut vao trong
    Sucker.set(speed);
  }

  public void release(){
    Sucker.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
