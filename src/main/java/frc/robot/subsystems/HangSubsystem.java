/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class HangSubsystem extends SubsystemBase {
  /**
   * Creates a new HangSubsystem.
   */
  ///TODO: Add Winch
  private final CANSparkMax m_winch;
  private double m_speed=0;
  


  ///TODO: Add Hook



  public HangSubsystem() {
    ///TODO: Add Winch
    m_winch = new CANSparkMax(Constants.Hang.CANID_WINCH, MotorType.kBrushless);
    m_winch.set(0.0);

    ///TODO: Add Hook

  }

  @Override
  public void periodic() {
    m_winch.set(m_speed);
    // This method will be called once per scheduler run
  }

  public void MoveWinch(double speed){
   m_speed= speed;
  }
}
