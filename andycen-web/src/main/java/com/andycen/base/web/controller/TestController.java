package com.andycen.base.web.controller;

import com.andycen.base.web.meta.po.TestPo;
import com.andycen.base.web.service.ITestService;
import com.andycen.utils.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy Cen
 */
@RestController
public class TestController {

    private final ITestService testService;

    @Autowired
    public TestController(ITestService testService) {
        this.testService = testService;
    }

    @GetMapping(value = "/test")
    public String test() {
        Test test = new Test();
        return "ok";
    }

    @GetMapping(value = "/testSelect")
    public Long testSelect() {
        TestPo testPo = testService.testSelect();
        return testPo.getId();
    }

}
