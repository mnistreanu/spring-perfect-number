package com.maxn.springperfectnumber.controllers;

import com.maxn.springperfectnumber.utils.PerfectNumberUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class PerfectNumberController {

    @RequestMapping(path = "/perfect-number/{number}", method = RequestMethod.GET)
    public boolean isPerfect(@PathVariable("number") int number) {
        return PerfectNumberUtil.isPerfect(number);
    }

    @RequestMapping(path = "/perfect-number-range", method = RequestMethod.GET)
    public List<Integer> isPerfect(@PathParam("start") int start, @PathParam("end") int end) {
        return PerfectNumberUtil.getRange(start, end);
    }

}
