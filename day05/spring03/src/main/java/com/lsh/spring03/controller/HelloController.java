package com.lsh.spring03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // '이제부터 SpringBoot에서 컨트롤러로 동작할거야' 라고 지칭해주는 주석(어노테이션)
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello") // 웹서비승에서 사용할 길을 하나 만들거야. /hello
    @ResponseBody
    public String helloSpring() {
        logger.info("hello  URL 오픈");
        // 문제발생시 로그를 남길때
        logger.debug("디버그시 필요한 로그입니다"); //디버깅으로 할때만 표시
        logger.trace("디버그시 필요한 로그에요");
        
        logger.warn("경고표시 나타내는 로그입니다"); 
        logger.error("오류표시 나타내는 로그입니다"); 
        
        return "Hello SpringBoot!";
    }
}
