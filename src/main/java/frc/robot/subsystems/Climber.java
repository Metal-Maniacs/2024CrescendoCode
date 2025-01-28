// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  /** Creates a new Climber. */

   PWMSparkMax climbMotor = null;
  
  public Climber() {

    climbMotor = new PWMSparkMax(0);
    addChild("climbMotor",climbMotor);
    climbMotor.setInverted(false);
  }

  public void chainClimb(double climbSpeed) {
    
    climbMotor.set(climbSpeed);
  
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
