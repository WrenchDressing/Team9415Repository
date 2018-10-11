import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;



@Autonomous
public class FIRSTautonomousmode extends LinearOpMode {

    //numbers after underscores indicate ports and orientation (i.e. fl= front left)
    private Gyroscope imu;
    private DcMotor motor_drive_fl;
    private DcMotor motor_drive_fr;
    private DcMotor motor_drive_bl;
    private DcMotor motor_drive_br;
    private DigitalChannel digitalTouch_01;
    private DistanceSensor sensorColorRange_0;
    //private Servo servoTest_0;

    @Override
    public void runOpMode() throws InterruptedException {

        imu = hardwareMap.get(Gyroscope.class, "imu");
        motor_drive_fl = hardwareMap.get(DcMotor.class, "motor_drive_fl");
        motor_drive_fr = hardwareMap.get(DcMotor.class, "motor_drive_fr");
        motor_drive_bl = hardwareMap.get(DcMotor.class, "motor_drive_bl");
        motor_drive_br = hardwareMap.get(DcMotor.class, "motor_drive_br");
        motor_drive_fl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor_drive_fr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor_drive_bl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor_drive_br.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor_drive_fl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor_drive_fr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor_drive_bl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor_drive_br.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        digitalTouch_01 = hardwareMap.get(DigitalChannel.class, "digitalTouch");
        sensorColorRange_0 = hardwareMap.get(DistanceSensor.class, "sensorColorRange");
        //servoTest_0 = hardwareMap.get(Servo.class, "servoTest_0");
        // set digital channel to input mode.
        digitalTouch_01.setMode(DigitalChannel.Mode.INPUT);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        // run until the end of the match (driver presses STOP)
        double tgtpowerfl;
        double tgtpowerfr;
        double tgtpowerbl;
        double tgtpowerbr;


        Thread.sleep(500);
        while (digitalTouch_01.getState()) {
            //motor will run at a determined speed
        }
        //stop motor to prevent striping
        Thread.sleep(1000);
        motor_drive_fl.setTargetPosition(1440);
        motor_drive_fr.setTargetPosition(1440);
        motor_drive_bl.setTargetPosition(1440);
        motor_drive_br.setTargetPosition(1440);
        //code about running rest of auto
        //1440 ticks = one revolution of dc motor
        //one revolution = about 12.57 inches moved

    }
}

