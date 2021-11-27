// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class SUBSYSTEM{
        public static final int RIGHTMASTER_ID = 1;
        public static final int RIGHTFOLLOW_ID = 2;
        public static final int LEFTMASTER_ID = 3;
        public static final int LEFTFOLLOW_ID = 4;
        public static final int SUCKER_ID = 5;
        public static final int LIFTER_ID = 6;
        public static final int SHOOTER_ID = 7;
        public static final int OPENER_ID = 8;
}
    public static final class JOYSTICK{
        public static final int X = 2;
        public static final int Y = 1;
        public static final int Z = 3;
}
}
