package XboxOne;

import DesignJoysticks.BasicFunctions;

public enum XboxOneJoystick implements BasicFunctions {

	A, X, B, Y;

	@Override
	public Enum pass() {
		return A;
	}

	@Override
	public Enum kick() {
		return X;

	}

	@Override
	public Enum thrown() {
		return B;
	}

	@Override
	public Enum longPass() {
		return Y;
	}

}
