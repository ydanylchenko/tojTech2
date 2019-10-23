package com.example;

import org.junit.Assert;

public class StringInteraction {
    public static void main(String[] args) {
//        Append strings
        System.out.println("aaa" + "bbb"); //"aaabbb"
        System.out.println("aaa".concat("ccc"));//"aaaccc"
//        Replace part of the string
        System.out.println(String.format("aa%sbb", "cc")); // "aaccbb"
        System.out.println(String.format("aa %s b %s dd", "cc", "ee")); // "aa cc b ee dd"
//        Substring: excluding FROM but including TO
        System.out.println("abcdefg".substring(2)); // cdefg
        System.out.println("abcdefg".substring(2,4)); // cd
//        isEmpty and similar
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".contains("bc"));
        System.out.println("".isEmpty());
        System.out.println("aa".isEmpty());
//        Length
        System.out.println("abc".length());//3
        System.out.println("aBc".toUpperCase());//ABC
        System.out.println("aBc".toLowerCase());//abc
//        Equality
        System.out.println("abc".equals("aBc")); //false
        System.out.println("abc".equalsIgnoreCase("aBc")); //true
        String returnedByDriverValue = "someTITLE";
//        Assert.assertEquals(true, "someTitle".equals(returnedByDriverValue));
        Assert.assertEquals(true, "someTitle".equalsIgnoreCase(returnedByDriverValue));
//        Assert.assertTrue("someTitle".equals(returnedByDriverValue));
        Assert.assertTrue("someTitle".equalsIgnoreCase(returnedByDriverValue));
        Assert.assertEquals("someTitle".toLowerCase(), returnedByDriverValue.toLowerCase());
    }
}
