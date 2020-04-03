package com.lttbookshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/t")
public class TestController {

    @GetMapping("/getName")
    public List<String> getListName(@RequestParam(defaultValue = "王五") String userName) {
        List<String> nameList = Arrays.asList("张三", "李四", userName);
        return nameList;
    }

}
