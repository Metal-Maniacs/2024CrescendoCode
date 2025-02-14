// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Drivetrain;






public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command taxi(Drivetrain a_Drivetrain) {
       double leftAutoSpeed = 0.8;
   double rightAutoSpeed = 0.8;
   return Commands.run(() -> a_Drivetrain.tankDrive(leftAutoSpeed, rightAutoSpeed), a_Drivetrain);
  }

//  public static Command red1(Drivetrain a_Drivetrain) {
//    double leftAutoSpeed = 0.8;
//    double rightAutoSpeed = 0.8;
//    return Commands.sequence(a_Drivetrain.tankDrive(leftAutoSpeed, rightAutoSpeed), new DriveTank());
//  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
