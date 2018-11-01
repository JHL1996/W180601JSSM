package com.newer.test;

import com.newer.pojo.TMember;
import com.newer.service.TMemberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TMemberServiceTest {

   @Test
   public void Test(){
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

       TMemberService tMember= (TMemberService) context.getBean("tMemberService");

       System.out.println(tMember.findAll().toString());
   }
}
