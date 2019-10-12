package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="Front Left Motor Test", group="Linear Opmode")
//@Disabled
public class BackLeftMotor extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor BL;


    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        BL = hardwareMap.dcMotor.get("Back Left");

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            BL.setPower(gamepad1.right_stick_y + gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x);
        }
    }
}
