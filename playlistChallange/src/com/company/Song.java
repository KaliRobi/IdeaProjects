package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Song {
    private String title;
    private double duration;

    public String getTitle() {
        return title;
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public int length() {
        return title.length();
    }

    public boolean isEmpty() {
        return title.isEmpty();
    }

    public char charAt(int index) {
        return title.charAt(index);
    }

    public int codePointAt(int index) {
        return title.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return title.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return title.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return title.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        title.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        title.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return title.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return title.getBytes(charset);
    }

    public byte[] getBytes() {
        return title.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return title.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return title.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return title.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return title.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return title.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return title.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return title.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return title.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return title.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return title.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return title.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return title.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return title.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return title.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return title.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return title.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return title.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return title.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return title.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return title.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return title.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return title.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return title.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return title.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return title.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return title.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return title.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return title.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return title.split(regex, limit);
    }

    public String[] split(String regex) {
        return title.split(regex);
    }

    public String toLowerCase(Locale locale) {
        return title.toLowerCase(locale);
    }

    public String toLowerCase() {
        return title.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return title.toUpperCase(locale);
    }

    public String toUpperCase() {
        return title.toUpperCase();
    }

    public String trim() {
        return title.trim();
    }

    public String strip() {
        return title.strip();
    }

    public String stripLeading() {
        return title.stripLeading();
    }

    public String stripTrailing() {
        return title.stripTrailing();
    }

    public boolean isBlank() {
        return title.isBlank();
    }

    public Stream<String> lines() {
        return title.lines();
    }

    public IntStream chars() {
        return title.chars();
    }

    public IntStream codePoints() {
        return title.codePoints();
    }

    public char[] toCharArray() {
        return title.toCharArray();
    }

    public String intern() {
        return title.intern();
    }

    public String repeat(int count) {
        return title.repeat(count);
    }
}
