package com.team271.frc2023.subystems;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;

public class Wrist {
    TalonFX kwristMotor1 = new TalonFX(Constants.WRIST_ID_1);
    TalonFX kwristMotor2 = new TalonFX(Constants.WRIST_ID_2);
    CANcoder kwristMotor1Encoder = new CANcoder(Constants.WRIST_ID_1);
    CANcoder kwristMotor2Encoder = new CANcoder(Constants.WRIST_ID_2); 
}
