package Shoppingmall.demo.MemberRepository;

import Shoppingmall.demo.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository{

    private final EntityManager em;

    public MemoryMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> FindById(String id) {
        Member member = em.find(Member.class,id);
        return Optional.ofNullable(member);
    }
}
