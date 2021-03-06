package cn.anpe.website.service.impl;

import cn.anpe.website.dao.RotationMapper;
import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Rotation;
import cn.anpe.website.service.RotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-13 00:03
 * @Description:
 */
@Service
public class RotationServiceImpl implements RotationService {

    @Autowired
    RotationMapper rotationMapper;

    @Override
    public List<Rotation> getAllRotationList(Integer page, Integer num) {
        Integer from = (page - 1) * num;
        List<Rotation> rotations = rotationMapper.selectRotationListByPageAndNum(from, num);
        return rotations;
    }

    @Override
    public List<Rotation> getAllRotationList() {
        return rotationMapper.selectAll();
    }

    @Override
    public Integer countTotalNum() {
        return rotationMapper.countTotalNum();
    }

    @Override
    public boolean addRotation(Rotation rotation) {
        return rotationMapper.insert(rotation) > 0;
    }

    @Override
    public List<Rotation> selectRotationShowList() {
        return rotationMapper.selectRotationShowList();
    }

    @Override
    public boolean changeRotationShowStatus(String rid, int status) {
        return rotationMapper.changeRotationShowStatus(rid, status) == 1;
    }

    @Override
    public Rotation selectRotationByRid(String rid) {
        return rotationMapper.selectByPrimaryKey(rid);
    }

    @Override
    public int updateRotation(Rotation rotation) {
        return rotationMapper.updateByPrimaryKeySelective(rotation);
    }

    @Override
    public boolean deleteRotation(String rid) {
        int i = rotationMapper.deleteByPrimaryKey(rid);
        return i == 1;
    }


}
