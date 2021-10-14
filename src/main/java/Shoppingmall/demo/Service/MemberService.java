package Shoppingmall.demo.Service;

import Shoppingmall.demo.Member.Member;
import Shoppingmall.demo.MemberRepository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    private void UniqueName(Member member){
        Optional<Member> result = memberRepository.FindById(member.getId());
        result.ifPresent(m ->{
            throw new IllegalStateException("이미 존재하는 회원입니다");
        });
    }


    public String join(Member member){
        UniqueName(member);
        memberRepository.save(member);
        return member.getId();
    }
}
