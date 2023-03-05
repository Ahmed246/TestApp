package com.java.testapp.problemsolving;

import java.util.*;
import java.util.regex.*;

public class StringUtilsTest
{

	public static List<String> substringText(String text)
	{
		List<String> stringList = new ArrayList<>();
		if (!text.contains("(") || !text.contains(")"))
			return stringList;
		Matcher matcher = Pattern.compile("\\((.*?)\\)").matcher(text);
		while (matcher.find())
		{
			stringList.add(matcher.group(1));
		}
		return stringList;
	}

	public static String reverseString(String textToRevers)
	{
		StringBuilder builder = new StringBuilder(textToRevers);
		builder.reverse();
		return builder.toString();
	}
}
