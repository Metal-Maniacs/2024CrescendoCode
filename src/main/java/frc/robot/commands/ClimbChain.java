// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.Constants;

public class ClimbChain extends Command {
  /** Creates a new ClimbChain. */
  public ClimbChain() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.m_climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double climbSpeed = Constants.CLIMB_MOTOR_SPEED;
    if (RobotContainer.rightJoystick.getRawButton(Constants.CLIMB_BUTTON)) {
      RobotContainer.m_climber.chainClimb(climbSpeed);
    } 
    else {
      RobotContainer.m_climber.chainClimb(0);
    }


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.m_climber.chainClimb(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
