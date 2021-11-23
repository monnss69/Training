// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotContainer;
import static frc.robot.Constants.SUBSYSTEM.*;
import static frc.robot.Constants.JOYSTICK.*;

public class Drivebase extends SubsystemBase {
  /** Creates a new driveBase. */

  // WPI_TalonSRX(deviceNumber) - device Number : maybe mã pin?
  public WPI_TalonSRX rightMaster = new WPI_TalonSRX(RIGHTMASTER_ID);
  public WPI_TalonSRX rightFollow = new WPI_TalonSRX(RIGHTFOLLOW_ID);
  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFTMASTER_ID);
  public WPI_TalonSRX leftFollow = new WPI_TalonSRX(LEFTFOLLOW_ID);

  public Drivebase(){
    // Cho bánh sau đi theo bánh Master (tránh trg hợp các motor quay khác hướng)
    rightFollow.follow(rightMaster);
    leftFollow.follow(leftMaster);
    // để bot chạy mượt hơn
    leftFollow.setNeutralMode(NeutralMode.Brake);
   	leftMaster.setNeutralMode(NeutralMode.Brake);
   	rightFollow.setNeutralMode(NeutralMode.Brake);
   	rightMaster.setNeutralMode(NeutralMode.Brake);
    // đảo hướng quay , default = theo chiều kim đồng hồ
    leftMaster.setInverted(true);
  }

  public void drive( double leftDrive , double rightDrive ){
    // set speed
    leftMaster.set(leftDrive);
    rightMaster.set(rightDrive); 
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // khi an nut so 2 , boost = 0.8 , nut so 1 , boost = 0.4
    double boost = RobotContainer.stick.getRawButton(X) ? 0.8 : 0.4;

    // axis , nếu gạt lên trên axis value = 1 , dưới = -1 . ngang = 0
    drive(RobotContainer.stick.getRawAxis(Y) * boost , RobotContainer.stick.getRawAxis(Z) * boost);
  }
}
