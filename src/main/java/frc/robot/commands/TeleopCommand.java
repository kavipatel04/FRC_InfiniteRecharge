/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class TeleopCommand extends CommandBase {
  private final int DRIVE_THROTTLE_AXIS = 1;
  private final int DRIVE_TURN_AXIS = 4;
  private XboxController m_joy;
  private DriveSubsystem m_drive;

  /**
   * Creates a new TeleopCommand.
   */

  public TeleopCommand(DriveSubsystem driveSubsystem, XboxController joy) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drive = driveSubsystem;
    m_joy = joy;

    addRequirements(m_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drive.setDrivePower(-m_joy.getRawAxis(DRIVE_THROTTLE_AXIS), m_joy.getRawAxis(DRIVE_TURN_AXIS));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
