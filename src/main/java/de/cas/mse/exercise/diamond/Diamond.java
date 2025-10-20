package de.cas.mse.exercise.diamond;

import java.util.Arrays;

public class Diamond {

	private static final char LINEBREAK = '\n';
	private static final char FILLER = '*';
	private static final char BLANK = ' ';

	public String getFromSize(int maxSize) {
		if (isInvalidSize(maxSize)) {
			return null;
		}
		return createDiamond(maxSize);
	}

	private String createDiamond(int maxSize) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < maxSize; i++) {
			builder.append(getDiamondLine(maxSize, getLineSize(i, maxSize)));
		}
		return builder.toString();
	}

	private int getLineSize(int lineIndex, int maxSize) {
		if (isLineOnUpperSide(lineIndex, maxSize)) {
			return lineIndex * 2 + 1;
		}
		return (maxSize - lineIndex - 1) * 2 + 1;
	}

	private boolean isLineOnUpperSide(int lineIndex, int maxSize) {
		return lineIndex <= maxSize / 2;
	}

	private boolean isInvalidSize(int n) {
		return n <= 0 || n % 2 == 0;
	}

	private char[] getDiamondLine(int maxSize, int lineSize) {
		int whiteSpaceCount = getWhiteSpaceCount(maxSize, lineSize);
		char[] chars = new char[whiteSpaceCount + lineSize + 1];
		Arrays.fill(chars, 0, whiteSpaceCount, BLANK);
		Arrays.fill(chars, whiteSpaceCount, whiteSpaceCount + lineSize, FILLER);
		chars[chars.length - 1] = LINEBREAK;
		return chars;
	}

	private int getWhiteSpaceCount(int maxSize, int lineSize) {
		return (maxSize - lineSize) / 2;
	}

}
