package com.java.testapp.problemsolving;

import java.util.*;

public class TestProblemSolving
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Text: ");
		String inputText = scanner.nextLine();
		List<String> textSubstring = StringUtilsTest.substringText(inputText);
		String finalText = inputText;
		for (String str : textSubstring)
		{
			String textSubstringReversed = StringUtilsTest.reverseString(str);
			finalText = finalText.replace(str, textSubstringReversed);
		}
		System.out.print("Result is: " + finalText);
	}
}
