package org.usfirst.frc.team1884.robot.commands.shooter;

import org.usfirst.frc.team1884.robot.subsystems.Elevator;
import org.usfirst.frc.team1884.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake extends Command {

    // Called just before this Command runs the first time
    protected void initialize() {
    	Shooter.INSTANCE.getInternalIntake().set(0.5);
    	Shooter.INSTANCE.getExternalIntake().set(-0.5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Shooter.INSTANCE.getInternalIntake().set(0);
    	Shooter.INSTANCE.getExternalIntake().set(0);
    }
}
