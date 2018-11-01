package com.newer.service;

import com.newer.dao.TMemberMapper;
import com.newer.pojo.TMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("tMemberService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class TMemberServiceImp implements TMemberService {
    @Autowired
    private TMemberMapper dao;

    @Override
    public List<TMember> findAll() {
        return dao.findAll();
    }

    @Override
    public TMember findByNameNO(String mName, int mCardNo) {
        return dao.findByNameNO(mName,mCardNo);
    }
}
