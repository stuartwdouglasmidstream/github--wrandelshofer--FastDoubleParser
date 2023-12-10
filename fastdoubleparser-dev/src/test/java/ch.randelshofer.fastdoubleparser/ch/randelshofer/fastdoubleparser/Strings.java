/*
 * @(#)Strings.java
 * Copyright © 2023 Werner Randelshofer, Switzerland. MIT License.
 */
package ch.randelshofer.fastdoubleparser;

public class Strings {
    public static StringBuilder repeatStringBuilder(String str, int count) {
        StringBuilder b = new StringBuilder(str.length() * count);
        while (count-- > 0) {
            b.append(str);
        }
        return b;
    }

    public static String repeat(String str, int count) {
        return repeatStringBuilder(str, count).toString();
    }
}
