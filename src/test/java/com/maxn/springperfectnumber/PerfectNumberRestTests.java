package com.maxn.springperfectnumber;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PerfectNumberRestTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testPerfectNumber6() {
        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity("/perfect-number/6", Boolean.class);
        Assert.assertTrue(responseEntity.getBody());
    }

    @Test
    public void testNotPerfectNumber1() {
        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity("/perfect-number/1", Boolean.class);
        Assert.assertFalse(responseEntity.getBody());
    }

    @Test
    public void testPerfectNumberRange() {
        ResponseEntity<Integer[]> responseEntity = restTemplate.getForEntity("/perfect-number-range?start=0&end=1000", Integer[].class);

        Integer[] expectedNumbers = {6, 28, 496};
        Assert.assertArrayEquals(expectedNumbers, responseEntity.getBody());
    }

}
