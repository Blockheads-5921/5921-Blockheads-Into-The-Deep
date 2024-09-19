package org.firstinspires.ftc.teamcode;

import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Base Drive-Destin", group="Drive")
//@Disabled
public class BaseDriveDestin extends OpMode {
    /* Declare OpMode members. */
    HardwareDrive robot = new HardwareDrive();
    double joystick = 0;
    /** The relativeLayout field is used to aid in providing interesting visual feedback
     * in this sample application; you probably *don't* need this when you use a color sensor on your
     * robot. Note that you won't see anything change on the Driver Station, only on the Robot Controller. */
    View relativeLayout;

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
        joystick = gamepad1.left_stick_y;
        robot.rf.setPower(joystick);
        telemetry.addData("left front encoder position (clicks)", robot.rf.getCurrentPosition());
        telemetry.addData("left front POWER", robot.rf.getPower());
        telemetry.addData("joystick Y", joystick);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
