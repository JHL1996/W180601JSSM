package com.newer.service;

import com.newer.pojo.TMember;

import java.util.List;

public interface TMemberService {

    List<TMember> findAll();
    TMember findByNameNO(String mName , int mCardNo);
}
