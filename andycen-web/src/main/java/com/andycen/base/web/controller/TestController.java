package com.andycen.base.web.controller;

import com.andycen.base.core.meta.po.TestPo;
import com.andycen.base.core.dao.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy Cen
 */
@RestController
public class TestController {

    private final TestMapper testMapper;

    @Autowired
    public TestController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @GetMapping(value = "/test")
    public String test() {
        return "ok";
    }

    @GetMapping(value = "/testSelect")
    public Long testSelect() {
        TestPo testPo = testMapper.selectByPrimaryKey(1L);
        return testPo.getId();
    }

}
