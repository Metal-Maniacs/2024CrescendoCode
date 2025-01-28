// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

 WPI_TalonSRX topMotor = null;
 WPI_TalonSRX lowerMotor = null;

  /** Creates a new Shooter. */
  public Shooter() {

    topMotor = new WPI_TalonSRX(Constants.TOP_MOTOR_CAN);
    addChild("topMotor",topMotor);
    topMotor.setInverted(true);

    lowerMotor = new WPI_TalonSRX(Constants.LOWER_MOTOR_CAN);
    addChild("lowerMotor",lowerMotor);
    lowerMotor.setInverted(true);

    lowerMotor.follow(topMotor);

  }
 
public void ampScore(double ampSpeed) {

  topMotor.set(ampSpeed);

}

public void speakerScore(double speakerSpeed) {

  topMotor.set(speakerSpeed);

}

public void intakeNote(double intakeSpeed) {

  topMotor.set(intakeSpeed);

}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
