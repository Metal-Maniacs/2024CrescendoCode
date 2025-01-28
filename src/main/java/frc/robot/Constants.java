// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  
  public static final int DRIVER_LEFT_Y_AXIS = 1;
  public static final int DRIVER_RIGHT_Y_AXIS = 1;

  public static final int LEFT_FRONT_MOTOR_CAN = 7;
  public static final int LEFT_BACK_MOTOR_CAN = 6;
  public static final int RIGHT_FRONT_MOTOR_CAN = 5;
  public static final int RIGHT_BACK_MOTOR_CAN = 11;
  public static final int TOP_MOTOR_CAN = 12;
  public static final int LOWER_MOTOR_CAN = 8;
  public static final int AMP_BUTTON = 2;
  public static final int SPEAKER_BUTTON = 3;
  public static final int INTAKE_BUTTON = 3;
  public static final int CLIMB_BUTTON = 4;
  public static final double AMP_MOTOR_SPEED = 0.5;
  public static final double SPEAKER_MOTOR_SPEED = 1.0;
  public static final double INTAKE_MOTOR_SPEED = -0.3;
  public static final double CLIMB_MOTOR_SPEED = 0.5;
  public static final int CLIMB_DOWN_BUTTON = 5;


  public static class OperatorConstants {
    public static final int kDriverControllerPort = 2;
    public static final int DRIVER_LEFT_STICK = 0;
    public static final int DRIVER_RIGHT_STICK = 1;
  }
}
