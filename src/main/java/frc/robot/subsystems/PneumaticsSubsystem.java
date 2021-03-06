package frc.robot.subsystems;

import frc.robot.Constants;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class PneumaticsSubsystem {

    //compressor object 
    public static final Compressor compressor = new Compressor(Constants.PCM);

    //Solanoids
    public static final DoubleSolenoid beltSolenoid = new DoubleSolenoid(Constants.BELT_SOLENOID_FWD, Constants.BELT_SOLENOID_BCK);
    public static final DoubleSolenoid climbSolenoid = new DoubleSolenoid(Constants.CLIMB_SOLENOID_FWD, Constants.CLIMB_SOLENOID_BCK);
    
    //compressor run and regulate
    public static void runCompressor(){
        if(!compressor.getPressureSwitchValue()){
            compressor.setClosedLoopControl(true);
            SmartDashboard.putBoolean("Pressure Switch", compressor.getPressureSwitchValue());
        }
        else{
            compressor.setClosedLoopControl(false);
            SmartDashboard.putBoolean("Pressure Switch", compressor.getPressureSwitchValue());
        }
    }
    
}