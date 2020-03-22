package com.hello.demo.service.impl;

import com.hello.demo.dao.RecordTermDao;
import com.hello.demo.entity.RecordTerm;
import com.hello.demo.service.RecordTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class RecordTermServiceImpl implements RecordTermService {
    @Autowired
    private RecordTermDao recordTermDao;

    @Override
    public List<RecordTerm> getRecordTermList() {
        return recordTermDao.queryRecordTerm();
    }

    @Override
    public List<RecordTerm> getRecordTermById(String userId) {
        return recordTermDao.queryRecordTermById(userId);
    }

    @Transactional
    @Override
    public boolean addRecordTerm(RecordTerm recordTerm) {
        System.out.println("[FWJ]"+recordTerm.getUser_wx_id());
        if(recordTerm.getUser_wx_id()!=null && !"".equals(recordTerm.getUser_wx_id())){
            try{
                int effectedNum = recordTermDao.insertRecordTerm(recordTerm);
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
    public boolean modifyRecordTerm(RecordTerm recordTerm) {
        if(recordTerm.getUser_wx_id()!= null ){
            try{
                int effectedNum = recordTermDao.updateRecordTerm(recordTerm);
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
}
