package com.megvii.csp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Liu wei on 2017/1/5.
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    @RequestMapping(value = {"/index", "/"})
    public String Hello() {
        return "demo";
    }
}
