
package com.test;

import junit.framework.TestCase;

/**
 * @author royleexh
 * update 201311071613
 */
public class SampleStringTest extends TestCase {

    protected void setUp() throws Exception {

    }

    protected void tearDown() {

    }

    public void testCharAt() {
        String str = "abcde";
        try {
            assertEquals("testCharAt", 'b', str.charAt(12));
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
        // assertEquals("testCharAt", "b", str.charAt(2));
        // assertEquals("testCharAt", 'b', str.charAt(1));
    }

    public void testCompareTo() {
        String str = "hello";
        assertEquals("testCompareTo", 0, str.compareTo("hello"));
    }

    public void testCompareToIgnoreCase() {
        String str = "hello";
        assertEquals("testCompareToIgnoreCase", 0, str.compareToIgnoreCase("HELlo"));
    }

    public void testConcat() {
        String str1 = "Hello";
        String str2 = "Hello";
        assertEquals("testConcat", "HelloHello", str1.concat(str2));
    }

    public void testContains() {
        String str1 = "hello";
        String str2 = "el";
        assertTrue("testContains", str1.contains(str2));
    }

    public void testContentEquals() {
        String str1 = "hello";
        String str2 = "el";
        assertFalse("testContentEquals", str1.contentEquals(str2));
    }

    public void testEndsWith() {
        String str = "hello";
        String s = "lo";
        assertTrue("testEndsWith", str.endsWith(s));
    }

    public void testEquals() {
        String a = "String";
        String b = "string";
        assertFalse("testEquals", a.equals(b));
    }

    public void testEqualsIgnoreCase() {
        String a = "String";
        String b = "STRING";
        assertTrue("testEqualsIgnoreCase", a.equalsIgnoreCase(b));
    }

    public void testHashCode() {
        String str = "String";
        assertEquals("testHashCode", -1808118735, str.hashCode());
    }

    public void testIndexOf() {
        String str = "String";
        assertEquals("testIndexOf", 3, str.indexOf("i"));
    }

    public void testLastIndexOf() {
        String str = "Stiring";
        assertEquals("testLastIndexOf", 4, str.lastIndexOf("i"));
    }

    public void testIsEmpty() {
        String str = "String";
        assertFalse("testIsEmpty", str.isEmpty());
    }

    public void testlength() {
        String str = "String";
        assertEquals("testlength", 6, str.length());
    }

    public void testReplace() {
        String str1 = "abfddddddd";
        String str2 = "ccc";
        String str = str1.replace("ddd", str2);
        assertEquals("testReplace", "abfccccccd", str);
    }

    public void testReplaceFirst() {
        String str = "a.b?c,d%gd'fd";
        String str1 = str.replaceFirst("\\?", "jun");
        String str2 = str.replaceFirst("\\.", "jun");
        assertEquals("testReplaceFirst", "a.bjunc,d%gd'fd", str1);
        assertEquals("testReplaceFirst", "ajunb?c,d%gd'fd", str2);
    }

    public void testSplit() {
        String str = "a:b:c:d:e:F";
        String[] str1 = str.split(":");
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i]);
        }
    }

    public void teststartsWith() {
        String str = "String";
        assertFalse("teststartsWith", str.startsWith("abc"));
    }

    public void testSubstring() {
        String str = "hellochinese";
        String s = str.substring(0, 3);
        assertEquals("hel", s);
    }

    public void testToCharArray() {
        String str = "Hello";
        char[] A = new char[5];
        A = str.toCharArray();
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public void testToLowerCase() {
        String s = "ABdFGjke123";
        String A = s.toLowerCase();
        assertEquals("testToLowerCase", "abdfgjke123", A);
    }

    public void testToUpperCase() {
        String s = "ABdFGjke123";
        String A = s.toUpperCase();
        assertEquals("testToUpperCase", "ABDFGJKE123", A);
    }

    public void testTrim() {
        String str = "            hi   hi   hi            ";
        String str1 = str.trim();
        assertEquals("testTrim", "hi   hi   hi", str1);
    }

    // ========================combination==========================
    public void testCombination1() {
        String str = "SampleStringTest.java";
        String subStr = str.substring(0, str.indexOf("ing"));
        assertEquals("", "SampleStr", subStr);
    }
}
