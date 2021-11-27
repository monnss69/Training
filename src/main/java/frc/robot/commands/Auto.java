// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivebase;
import frc.robot.subsystems.Opener;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Sucker;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Auto extends SequentialCommandGroup {
  /** Creates a new Auto. */
  public Auto(Opener opener, Shooter shooter , Drivebase drivebase , Sucker sucker){
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(parallel(new driveStraight(drivebase , 1.0).withTimeout(0.5), new Open(opener, 0.5).withTimeout(0.5)),
    parallel(new driveStraight(drivebase, 1.0).withTimeout(1.0), new Suck(sucker, 0.8).withTimeout(1.0)), new Open(opener, -0.5).withTimeout(0.5),
    new Shoot(shooter, 1.0).withTimeout(0.4));
  }
}
