package com.maxn.springperfectnumber;


import com.maxn.springperfectnumber.utils.PerfectNumberUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberUnitTests {

    @Test
    public void testPerfectNumberNegativeNumber() {
        assertFalse(PerfectNumberUtil.isPerfect(-6));
    }

    @Test
    public void testNotPerfectNumber4() {
        assertFalse(PerfectNumberUtil.isPerfect(4));
    }

    @Test
    public void testPerfectNumber6() {
        assertTrue(PerfectNumberUtil.isPerfect(6));
    }

    @Test
    public void testPerfectNumber28() {
        assertTrue(PerfectNumberUtil.isPerfect(28));
    }

    @Test
    public void testRangePerfectNumbers() {
        List<Integer> numbers = PerfectNumberUtil.getRange(0, 1000);
        List<Integer> expectedNumbers = Arrays.asList(6, 28, 496);
        Assert.assertEquals(expectedNumbers, numbers);
    }

}
