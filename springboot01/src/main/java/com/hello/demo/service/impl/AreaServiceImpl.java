package com.hello.demo.service.impl;

import com.hello.demo.dao.AreaDao;
import com.hello.demo.entity.Area;
import com.hello.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;
import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName()!=null && !"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try{
                int effectedNum = areaDao.insertArea(area);
                if(effectedNum>0){
                    return true;
                }else {
                    throw new RuntimeException("插入失败了！");
                    }
                } catch(Exception e){
                    throw new RuntimeException("插入失败了！" + e.getMessage());
                }
            } else {
            throw new RuntimeException("不能为空！");
        }
    }


    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaId() != null && area.getAreaId()>0){
            area.setLastEditTime(new Date());
            try{
                int effectedNum = areaDao.updateArea(area);
                if(effectedNum>0){
                    return true;
                }else {
                    throw new RuntimeException("更新失败了！");
                }
            } catch(Exception e){
                throw new RuntimeException("更新失败了！" + e.getMessage());
            }
        } else {
            throw new RuntimeException("不能为空！");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId>0){
            try{
                int effectedNum = areaDao.deleteArea(areaId);
                if(effectedNum>0){
                    return true;
                }else {
                    throw new RuntimeException("删除失败了！");
                }
            } catch(Exception e){
                throw new RuntimeException("删除失败了！" + e.getMessage());
            }
        } else {
            throw new RuntimeException("不能为空！");
        }
    }
}
