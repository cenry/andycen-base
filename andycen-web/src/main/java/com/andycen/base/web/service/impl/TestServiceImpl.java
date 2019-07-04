package com.andycen.base.web.service.impl;


import com.andycen.base.web.dao.mapper.TestMapper;
import com.andycen.base.web.meta.po.TestPo;
import com.andycen.base.web.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * @author cenruyi
 */
@Service
public class TestServiceImpl implements ITestService {

    private final TestMapper testMapper;

    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public TestPo testSelect() {
        return testMapper.selectByPrimaryKey(1L);
    }

}
