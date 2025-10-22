package com.team271.frc2023.subystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Joystick;

public class Drive {

    // Creates TalonFX Objects
    TalonFX kfrontDriver = new TalonFX(Constants.FRONT_DRIVER_ID);
    TalonFX kfrontPassenger = new TalonFX(Constants.FRONT_PASSENGER_ID);
    TalonFX kbackDriver = new TalonFX(Constants.BACK_DRIVER_ID);
    TalonFX kbackPassenger = new TalonFX(Constants.BACK_PASSENGER_ID);

    Joystick kxboxController = new Joystick(0);
    double driverSpeed;
    double passengerSpeed;
    double speedAxis;
    double rotationAxis;


    public void differentialDrive() {
        speedAxis = kxboxController.getRawAxis(Constants.KALI_SPEED_AXIS_NUMBER) * 0.6;
        rotationAxis = kxboxController.getRawAxis(Constants.ROTATION_AXIS_NUMBER) * 0.4;

        setMotorOutputs(getDriverSpeed(speedAxis, rotationAxis), getPassengerSpeed(speedAxis, rotationAxis));
    }

    public double getDriverSpeed(double speed, double rotation) {
        return speed + rotation;
    }

    public double getPassengerSpeed(double speed, double rotation) {
        return speed - rotation;
    }

    public void setMotorOutputs(double driverSpeed, double passengerSpeed) {
        kfrontDriver.set(driverSpeed);
        kbackDriver.set(driverSpeed);
        kfrontPassenger.set(passengerSpeed);
        kbackPassenger.set(passengerSpeed);
    }

    


}
