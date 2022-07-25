package Playstation;

import DesignJoysticks.BasicFunctions;

public enum PlaystationClassicJoystick implements BasicFunctions {

	SQUARE, X, CIRCLE, TRIANGLE;

	@Override
	public Enum pass() {
		return PlaystationClassicJoystick.X;
	}

	@Override
	public Enum kick() {
		return PlaystationClassicJoystick.CIRCLE;
	}

	@Override
	public Enum thrown() {
		return PlaystationClassicJoystick.SQUARE;
	}

	@Override
	public Enum longPass() {
		return PlaystationClassicJoystick.TRIANGLE;
	}
}
