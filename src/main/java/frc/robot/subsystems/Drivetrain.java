// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends SubsystemBase {
  WPI_TalonSRX leftMotor = null;
  WPI_TalonSRX rightMotor = null;
  //DifferentialDrive differentialDrive;
  WPI_TalonSRX leftMotor2 = null;
  WPI_TalonSRX rightMotor2 = null;
  
  DifferentialDrive differentialDrive = null;

  
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    leftMotor = new WPI_TalonSRX(Constants.LEFT_FRONT_MOTOR_CAN);
    addChild("leftMotor",leftMotor);
    leftMotor.setInverted(true);
   
    rightMotor = new WPI_TalonSRX(Constants.RIGHT_FRONT_MOTOR_CAN);
    addChild("rightMotor",rightMotor);
    rightMotor.setInverted(false);

    leftMotor2 = new WPI_TalonSRX(Constants.LEFT_BACK_MOTOR_CAN);
    addChild("leftMotor2",leftMotor2);
    leftMotor2.setInverted(true);

    rightMotor2 = new WPI_TalonSRX(Constants.RIGHT_BACK_MOTOR_CAN);
    addChild("rightMotor2",rightMotor2);
    rightMotor2.setInverted(false);


    leftMotor2.follow(leftMotor);
    rightMotor2.follow(rightMotor);

    differentialDrive = new DifferentialDrive(leftMotor, rightMotor);

  }

  public void tankDrive(double leftSpeed, double rightSpeed)
  {
    differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
