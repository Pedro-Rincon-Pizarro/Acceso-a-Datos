/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Pedro
 */
public final class StringUtils {
	
	@SuppressWarnings("unused")
	private static final StringUtils JUST_TO_SILENCE_COBERTURA = new StringUtils();

	public static boolean isBlank(final String test) {
		return test == null || "".equals(test.trim());
	}
	public static boolean isEmpty(final String test) {
		return test == null || "".equals(test);
	}
}
