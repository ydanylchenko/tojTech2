package day8.tests.naming;

import org.junit.Test;

//Name of class with test should match pattern:
//        "**/Test*.java" - start with "Test".
//        "**/*Test.java" - end with "Test".
//        "**/*Tests.java" - end with "Tests".
//        "**/*TestCase.java" - end with "TestCase".
public class ClassNameEndsWithTestCase {
    @Test
    public void thisIsTestInClassThatStartsWithTestWord(){
        System.out.println("\"**/*TestCase.java\" - end with \"TestCase\".");
    }
}
