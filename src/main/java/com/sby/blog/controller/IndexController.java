package com.sby.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sby
 * @Title: IndexController
 * @Description: TODO
 * @date 2018/9/12 15:01
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {

        log.info("-------->log");
        return "index";
    }
}
