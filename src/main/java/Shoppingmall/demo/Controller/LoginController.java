package Shoppingmall.demo.Controller;

import Shoppingmall.demo.Member.Member;
import Shoppingmall.demo.MemberRepository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;


@Controller

public class LoginController {
    private final MemberRepository memberRepository;

    public LoginController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/login.html")
    public String singinPage(){
        return "login";
    }
    @PostMapping("/login.html")
    public String signin(MemberForm form) {
        Member member = new Member();
        member.setId(form.getId());
        member.setPassword(form.getPassword());
        Optional<Member> findid = this.memberRepository.FindById(member.getId());
        if (findid.isPresent())
        {
            if( member.getPassword().equals(findid.get().getPassword()) ) {
                System.out.println("find");
            }
            else
            {
                System.out.println("no password");
            }
        }
        else
        {
            System.out.println("not found");
        }

    return "redirect:/";
    }

}
