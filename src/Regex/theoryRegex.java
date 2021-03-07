package Regex;

public class theoryRegex {

//    The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
//
//    It is widely used to define the constraint on strings such as password and email validation. After learning Java regex tutorial, you will be able to test your regular expressions by the Java Regex Tester Tool.
//
//    Java Regex API provides 1 interface and 3 classes in java.util.regex package.


//    java.util.regex package
//    The Matcher and Pattern classes provide the facility of Java regular expression. The java.util.regex package provides following classes and interfaces for regular expressions.
//
//    MatchResult interface
//    Matcher class
//    Pattern class
//    PatternSyntaxException class

    //************************************

// Character Class	Description
//1	[abc]	a, b, or c (simple class)
//2	[^abc]	Any character except a, b, or c (negation)
//3	[a-zA-Z]	a through z or A through Z, inclusive (range)
//4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
//5	[a-z&&[def]]	d, e, or f (intersection)
//6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
//7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)







    //**********************

//    Regex	Description
//    X?	X occurs once or not at all
//    X+	X occurs once or more times
//    X*	X occurs zero or more times
//    X{n}	X occurs n times only
//    X{n,}	X occurs n or more times
//    X{y,z}	X occurs at least y times but less than z time

    //************************************

//           Regex	Description
//            .	    Any character (may or may not match terminator)
//            \d	Any digits, short of [0-9]
//            \D	Any non-digit, short for [^0-9]
//            \s	Any whitespace character, short for [\t\n\x0B\f\r]
//            \S	Any non-whitespace character, short for [^\s]
//            \w	Any word character, short for [a-zA-Z_0-9]
//            \W	Any non-word character, short for [^\w]
//            \b	A word boundary
//            \B	A non word boundary

    //*******************

//    Matcher class

//            No.	Method	Description
//            1	boolean matches()	test whether the regular expression matches the pattern.
//            2	boolean find()	finds the next expression that matches the pattern.
//            3	boolean find(int start)	finds the next expression that matches the pattern from the given start number.
//            4	String group()	returns the matched subsequence.
//            5	int start()	returns the starting index of the matched subsequence.
//            6	int end()	returns the ending index of the matched subsequence.
//            7	int groupCount()	returns the total number of the matched subsequence.

}
