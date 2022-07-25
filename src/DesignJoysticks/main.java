package DesignJoysticks;

import Playstation.PlaystationAlternativeJoystick;
import Playstation.PlaystationClassicJoystick;
import XboxOne.XboxOneJoystick;

public class main {

	public static void main(String[] args) {

		// Inicializando enums
		PlaystationClassicJoystick classic = PlaystationClassicJoystick.X;
		PlaystationAlternativeJoystick alter = PlaystationAlternativeJoystick.X;
		XboxOneJoystick xbox = XboxOneJoystick.X;

		// lança, passa e chuta
		System.out.println("Classic Joystick--->" + classic.thrown() + "," + classic.pass() + "," + classic.kick());

		// lança, passa e chuta
		System.out.println("Alternative Joystick--->" + alter.thrown() + "," + alter.pass() + "," + alter.kick());

		// lança, passa e chuta
		System.out.println("Alternative Joystick--->" + xbox.thrown() + "," + xbox.pass() + "," + xbox.kick());

	}

}
