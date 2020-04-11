package cn.anpe.website.service.impl;

import cn.anpe.website.dao.MetaMapper;
import cn.anpe.website.domain.Meta;
import cn.anpe.website.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-10 16:58
 * @Description:
 */
@Service
public class MetaServiceImpl implements MetaService {
    @Autowired
    MetaMapper metaMapper;

    @Override
    public List<Meta> getAllMetas() {
        return metaMapper.selectAll();
    }
}
