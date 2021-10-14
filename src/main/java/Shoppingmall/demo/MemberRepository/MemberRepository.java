package Shoppingmall.demo.MemberRepository;

import Shoppingmall.demo.Member.Member;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> FindById(String id);
}
