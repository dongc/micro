package com.micro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongc on 15/12/3.
 */
@RestController
public class ApiController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String index() {
        return "hello world!";
    }
}
