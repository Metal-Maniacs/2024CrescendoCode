// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.AmpShoot;
import frc.robot.commands.IntakeNote;
import frc.robot.commands.SpeakerShoot;
import frc.robot.commands.Autos;
import frc.robot.commands.ClimbChain;
import frc.robot.commands.ReleaseChain;
import frc.robot.commands.DriveTank;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {

  public static Joystick leftJoystick = new Joystick(OperatorConstants.DRIVER_LEFT_STICK);
  public static Joystick rightJoystick = new Joystick(OperatorConstants.DRIVER_RIGHT_STICK);
  public static final Drivetrain m_drivetrain = new Drivetrain();
  public static final Shooter m_shooter = new Shooter();
  public static final Climber m_climber = new Climber();
  //public static final Shooter m_ampShooter = new Shooter();
  //public static final Shooter m_intake = new Shooter();
  //private final AmpShoot com_AmpShoot = new AmpShoot();
  //private final SpeakerShoot com_SpeakerShoot = new SpeakerShoot();
  //private final IntakeNote com_IntakeNote = new IntakeNote();
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

    //sets default command on subsystems
    m_drivetrain.setDefaultCommand(new DriveTank());
    //m_ampShooter.setDefaultCommand(new AmpShoot());
    m_shooter.setDefaultCommand(new SpeakerShoot());
    //m_intake.setDefaultCommand(new IntakeNote());
    m_climber.setDefaultCommand(new ClimbChain());
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    //new Trigger(m_exampleSubsystem::exampleCondition)
    //    .onTrue(new ExampleCommand(m_exampleSubsystem));
    new JoystickButton(rightJoystick, 3).whileTrue(new SpeakerShoot());
    new JoystickButton(leftJoystick, 3).whileTrue(new IntakeNote());
    //new JoystickButton(rightJoystick, 2).whileTrue(new AmpShoot());    
    new JoystickButton(rightJoystick, 4).whileTrue(new ClimbChain());
    new JoystickButton(rightJoystick, 5).whileTrue(new ReleaseChain());
    
    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    //m_driverController.a().whileTrue(new SpeakerShoot());
    //m_driverController.b().whileTrue(new AmpShoot());
    //m_driverController.x().whileTrue(new IntakeNote());
    //m_driverController.y().whileTrue(new ClimbChain());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    // return Autos.taxi(m_drivetrain);
    return Commands.print("No Auto Selected!");
  }
}
