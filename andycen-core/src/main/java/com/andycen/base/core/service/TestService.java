package com.andycen.base.core.service;

import com.andycen.base.core.dao.mapper.TestMapper;
import com.andycen.base.core.meta.po.TestPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cenruyi
 */
@Service
public class TestService {

    private TestMapper testMapper;

    @Autowired
    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public TestPo testSelect() {
        return testMapper.selectByPrimaryKey(1L);
    }

}
