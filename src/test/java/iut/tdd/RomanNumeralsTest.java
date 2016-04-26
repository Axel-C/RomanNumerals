package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
	
	
	@Test
	public void should_return_1_when_I () {
		//Given
		String input = "I";
		String expected = "1";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToArabe(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_5_when_V () {
		//Given
		String input = "V";
		String expected = "5";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToArabe(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_1462_when_MCCCCLII () {
		//Given
		String input = "MCCCCLII";
		String expected = "1452";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToArabe(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_9_when_IX () {
		//Given
		String input = "IX";
		String expected = "9";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToArabe(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	}
