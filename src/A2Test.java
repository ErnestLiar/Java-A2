import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class A2Test {

    @Test
    void testIsMidDiff() {
        assertEquals(true, A2.isMidDiff("$"));

        assertEquals(false, A2.isMidDiff("23"));
        assertEquals(false, A2.isMidDiff("2A2"));
        assertEquals(false, A2.isMidDiff("22A"));
        assertEquals(false, A2.isMidDiff("A22"));
        assertEquals(false, A2.isMidDiff("AAA"));
        assertEquals(false, A2.isMidDiff("AABC"));
        assertEquals(true, A2.isMidDiff("abcdefg2A%abcdefg"));
        assertEquals(false, A2.isMidDiff("abcdefg2A2abcdefg"));
        assertEquals(false, A2.isMidDiff("abcdefg22Aabcdefg"));
        assertEquals(false, A2.isMidDiff("abcdefgA22abcdefg"));
        assertEquals(false, A2.isMidDiff("abcdefgAAAabcdefg"));
        assertEquals(true, A2.isMidDiff("abcdefg2A%abcdefg"));
        assertEquals(false, A2.isMidDiff("abcdefg2A%abcdefgh"));
    }

    @Test
    void testAddCapsToSmalls() {
        assertEquals("", A2.addCapsToSmalls(""));
        assertEquals("Bb", A2.addCapsToSmalls("b"));
        assertEquals("B", A2.addCapsToSmalls("B"));
        assertEquals("å", A2.addCapsToSmalls("å"));
        assertEquals("$", A2.addCapsToSmalls("$"));
        assertEquals("1ABCDEFXx", A2.addCapsToSmalls("1ABCDEFx"));
        assertEquals("1Z$BBbYy", A2.addCapsToSmalls("1Z$Bby"));
        assertEquals("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz",
            A2.addCapsToSmalls("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void testPrevLowerCase() {
        assertEquals("", A2.prevLowerCase(""));
        assertEquals("åç", A2.prevLowerCase("åç"));
        assertEquals("zabcdefghijklmnopqrstuvwxy", A2.prevLowerCase("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", A2.prevLowerCase("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals("1y$zàēĤƀ", A2.prevLowerCase("1z$aàēĤƀ"));

    }

    @Test
    void testExactly1() {
        assertEquals(true, A2.exactly1("", ""));
        assertEquals(false, A2.exactly1("a", ""));
        assertEquals(false, A2.exactly1("abc", ""));
        assertEquals(false, A2.exactly1("abbb", "c"));
        assertEquals(true, A2.exactly1("acbb", "c"));
        assertEquals(true, A2.exactly1("abbb", "ab"));

        assertEquals(false, A2.exactly1("aa", "a"));
        assertEquals(false, A2.exactly1("", "a"));
        assertEquals(true, A2.exactly1("aa", "aa"));
        assertEquals(false, A2.exactly1("aaa", "aa"));
    }

    @Test
    void testAreAnagrams() {
        assertEquals(true, A2.areAnagrams("", ""));
        assertEquals(true, A2.areAnagrams("noon", "noon"));
        assertEquals(true, A2.areAnagrams("mary", "army"));
        assertEquals(true, A2.areAnagrams("tom marvolo riddle", "i am lordvoldemort"));
        assertEquals(false, A2.areAnagrams("tommarvoloriddle", "i am lordvoldemort"));
        assertEquals(false, A2.areAnagrams("world", "hello"));
        assertEquals(false, A2.areAnagrams("a", "A"));
    }

    @Test
    void testIsCat() {
        assertEquals(true, A2.isCat("", ""));
        assertEquals(false, A2.isCat("x", ""));
        assertEquals(false, A2.isCat("", "x"));
        assertEquals(true, A2.isCat("x", "x"));
        assertEquals(true, A2.isCat("xxx", "x"));
        assertEquals(false, A2.isCat("ccbbbb", "bb"));
        assertEquals(false, A2.isCat("bbbbcc", "bb"));
        assertEquals(true, A2.isCat("bbbbbb", "bb"));
        assertEquals(true, A2.isCat("bbbbbb", "bbb"));
        assertEquals(false, A2.isCat("bbbbbb", "bbbb"));
        assertEquals(false, A2.isCat("bbbbbb", "bbbbb"));
        assertEquals(true, A2.isCat("bbbbbb", "bbbbbb"));
        assertEquals(false, A2.isCat("bbbbbb", "bbbbbbb"));
        assertEquals(true, A2.isCat("xyzxyz", "xyz"));
        assertEquals(true, A2.isCat("xyzxyz", "xyzxyz"));
        String s= "asdfadsfyu$%^345";
        assertEquals(false, A2.isCat("xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzx", "xyz"));
        assertEquals(true, A2.isCat("xyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz", "xyz"));
        assertEquals(true, A2.isCat(s, s));
    }

    @Test
    void testFindShort() {
        assertEquals("", A2.findShort(""));
        assertEquals("x", A2.findShort("x"));
        assertEquals("x", A2.findShort("xxxxx"));
        assertEquals("x", A2.findShort("xxxxxxxxxxxxxxxxxxxxx"));
        assertEquals("xy", A2.findShort("xy"));
        assertEquals("xy", A2.findShort("xyxy"));
        assertEquals("xy", A2.findShort("xyxyxyxyxyxy"));
        assertEquals("hello", A2.findShort("hellohellohello"));
        assertEquals("hellohelloworld", A2.findShort("hellohelloworld"));

    }

}
