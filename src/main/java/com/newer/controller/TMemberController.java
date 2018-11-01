package com.newer.controller;

import com.newer.pojo.TMember;
import com.newer.service.TMemberService;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/members")
public class TMemberController {
        @Autowired
        private TMemberService tMemberService;

        @ResponseBody
        @RequestMapping(value = "/findAll",method = RequestMethod.GET)
        public List<TMember> findAll(){
                System.out.println(11111);
                System.out.println(tMemberService.findAll().size());
                System.out.println(tMemberService.findAll().toString());
                tMemberService.findAll().forEach(TMember-> System.out.println(TMember.toString()));
                return tMemberService.findAll();
        }
        @ResponseBody
        @RequestMapping(value = "/find",method = RequestMethod.GET)
        public TMember find( @RequestParam("mName") String mName, int mCardNo){
                System.out.println(mName);
                System.out.println(mCardNo);
                return  tMemberService.findByNameNO(mName,mCardNo);
        }
}
