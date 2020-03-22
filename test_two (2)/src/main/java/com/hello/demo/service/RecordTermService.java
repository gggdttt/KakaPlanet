package com.hello.demo.service;

import com.hello.demo.entity.RecordTerm;

import java.util.List;

public interface RecordTermService {
    List<RecordTerm> getRecordTermList();
    List<RecordTerm> getRecordTermById(String userId);
    boolean addRecordTerm(RecordTerm recordTerm);
    boolean modifyRecordTerm(RecordTerm recordTerm);
}
