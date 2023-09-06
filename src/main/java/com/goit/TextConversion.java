package com.goit;

public final class TextConversion {
    private TextConversion() {
    }
    public static String conversionText(final String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(symbol));
            } else {
                sb.append(Character.toLowerCase(symbol));
            }
        }
        return sb.toString();
    }
}
