package Playstation;

import DesignJoysticks.BasicFunctions;

public enum PlaystationAlternativeJoystick implements BasicFunctions {

	SQUARE, X, CIRCLE, TRIANGLE;

	@Override
	public Enum pass() {
		return PlaystationAlternativeJoystick.X;
	}

	@Override
	public Enum kick() {
		return PlaystationAlternativeJoystick.SQUARE;
	}

	@Override
	public Enum thrown() {
		return PlaystationAlternativeJoystick.CIRCLE;
	}

	@Override
	public Enum longPass() {
		return PlaystationAlternativeJoystick.TRIANGLE;
	}

}
