package com.andycen.base.web.dao.mapper;

import com.andycen.base.web.meta.po.TestPo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author cenruyi
 */
@Service
@org.apache.ibatis.annotations.Mapper
public interface TestMapper extends Mapper<TestPo> {

}
