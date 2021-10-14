package Shoppingmall.demo.Controller;

import Shoppingmall.demo.Member.Member;
import Shoppingmall.demo.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {


    private final MemberService memberService;

    @Autowired
    public JoinController(MemberService memberService) {
        this.memberService = memberService;
    }
    @GetMapping("/join")
    public String home(){
        return "join";
    }

    @PostMapping("/join")
    public String create(MemberForm form){
        Member member = new Member();
        member.setId(form.getId());
        member.setPassword(form.getPassword());
        member.setE_mail(form.getE_mail());
        member.setPhone1(form.getPhone1());
        member.setPhone2(form.getPhone2());
        member.setPhone3(form.getPhone3());
        memberService.join(member);


        return "redirect:/";
    }
}
