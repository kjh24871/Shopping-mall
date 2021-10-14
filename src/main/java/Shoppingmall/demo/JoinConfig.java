package Shoppingmall.demo;


import Shoppingmall.demo.MemberRepository.MemberRepository;
import Shoppingmall.demo.MemberRepository.MemoryMemberRepository;
import Shoppingmall.demo.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class JoinConfig {

    private final DataSource dataSource;
    private final EntityManager em;

    @Autowired
    public JoinConfig(DataSource dataSource,EntityManager em){
        this.dataSource= dataSource;
        this.em = em;
    }

    @Bean
    public MemberService memberService()
    {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository(em);
    }
}
