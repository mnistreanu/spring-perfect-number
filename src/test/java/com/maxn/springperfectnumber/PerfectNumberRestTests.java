package com.maxn.springperfectnumber;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;


public class PerfectNumberRestTests {
    private static final String serverUrl = "http://localhost:8080";

    @Test
    public void testPerfectNumber6() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(serverUrl + "/perfect-number/6");

        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity(uri, Boolean.class);
        Assert.assertTrue(responseEntity.getBody());
    }

    @Test
    public void testNotPerfectNumber1() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(serverUrl + "/perfect-number/1");

        ResponseEntity<Boolean> responseEntity = restTemplate.getForEntity(uri, Boolean.class);
        Assert.assertFalse(responseEntity.getBody());
    }

    @Test
    public void testPerfectNumberRange() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(serverUrl + "/perfect-number-range?start=0&end=1000");
        ResponseEntity<Integer[]> responseEntity = restTemplate.getForEntity(uri, Integer[].class);

        Integer[] expectedNumbers = {6, 28, 496};
        Assert.assertArrayEquals(expectedNumbers, responseEntity.getBody());
    }

}
