package org.firstinspires.ftc.teamcode;

import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Base Drive", group="Drive")
//@Disabled
public class BaseDrivePreston extends OpMode {
    /* Declare OpMode members. */
    HardwareDrive robot = new HardwareDrive();

    /** The relativeLayout field is used to aid in providing interesting visual feedback
     * in this sample application; you probably *don't* need this when you use a color sensor on your
     * robot. Note that you won't see anything change on the Driver Station, only on the Robot Controller. */
    View relativeLayout;

    double JoystickBIG =0;



    @Override
    public void init() {
        robot.init(hardwareMap);

        telemetry.addData("Say", "Hello Driver");
    }

    @Override
    public void init_loop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        JoystickBIG = gamepad1.left_stick_y;

        robot.rf.setPower(JoystickBIG);
        telemetry.addData( "left front encoder position (clicks)", robot.lf.getPower());
        telemetry.addData("Joystick", gamepad1.left_stick_y);
    }


    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
