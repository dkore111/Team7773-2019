/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // 1.)Instantiate new motor controller objects...
  public PWMVictorSPX victorLeftControllerA = new PWMVictorSPX(RobotMap.leftMotorA);
  public PWMVictorSPX victorLeftControllerB = new PWMVictorSPX(RobotMap.leftMotorB);
  public PWMVictorSPX victorRightControllerA = new PWMVictorSPX(RobotMap.rightMotorA);
  public PWMVictorSPX victorRightControllerB = new PWMVictorSPX(RobotMap.rightMotorB);

   // 2.)Create Constructor...
   public DriveSubsystem() {
    victorLeftControllerA.set(0.0);
    victorLeftControllerB.set(0.0);
    victorRightControllerA.set(0.0);
    victorRightControllerB.set(0.0);
    // continue here Vid 3...
  }

  // 3.)Create a type of drive...
  public void move(double leftSpeed, double rightSpeed) {
    victorLeftControllerA.set(-leftSpeed);
    victorLeftControllerB.set(-leftSpeed);
    victorRightControllerA.set(rightSpeed);
    victorRightControllerB.set(rightSpeed);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }
}
