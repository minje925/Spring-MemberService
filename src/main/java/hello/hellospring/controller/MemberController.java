package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired // 이걸 쓰면 MemberController가 생성될 때, 스프링 컨테이너에 있는 MemberService 객체를 찾아서 넣어준다.
    // 이게 바로 Defendency Injection(DI) 의존관계 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
