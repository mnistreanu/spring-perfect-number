package com.maxn.springperfectnumber.controllers;

import com.maxn.springperfectnumber.utils.PerfectNumberUtil;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfectNumberController {

    @RequestMapping(path = "/perfect-number/{number}", method = RequestMethod.GET)
    public boolean isPerfect(@PathVariable("number") int number) {
        return PerfectNumberUtil.isPerfect(number);
    }

    @RequestMapping(path = "/perfect-number-range", method = RequestMethod.GET)
    public List<Integer> isPerfect(@RequestParam("start") int start, @RequestParam("end") int end) {
        return PerfectNumberUtil.getRange(start, end);
    }

}
