package com.team271.frc2023.subystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drive {
    Constants constants = new Constants();

    // Creates TalonFX Objects
    TalonFX kfrontDriver = new TalonFX(constants.FRONT_DRIVER_ID);
    TalonFX kfrontPassenger = new TalonFX(constants.FRONT_PASSENGER_ID);
    TalonFX kbackDriver = new TalonFX(constants.BACK_DRIVER_ID);
    TalonFX kbackPassenger = new TalonFX(constants.BACK_PASSENGER_ID);

    Joystick kxboxController = new Joystick(0);
    double driverSpeed;
    double passengerSpeed;
    double speedAxis;
    double rotationAxis;


    public void differentialDrive() {
        speedAxis = kxboxController.getRawAxis(constants.KALI_SPEED_AXIS_NUMBER);
        rotationAxis = kxboxController.getRawAxis(constants.ROTATION_AXIS_NUMBER);
    }


}
