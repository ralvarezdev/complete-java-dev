package practices.traversinggame.commons;

import javafx.geometry.Insets;

public class CommonNodes {
	public static Insets getInset(int top, int right, int bottom, int left) {
		return new Insets(top, right, bottom, left);
	}

	public static Insets getRightInset(int right) {
		return getInset(0, right, 0, 0);
	}

	public static Insets getBottomInset(int bottom) {
		return getInset(0, 0, bottom, 0);
	}
}