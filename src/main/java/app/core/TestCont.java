package app.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestCont {

    public static final Logger logger = LogManager.getLogger(TestCont.class);

    @GetMapping("/")
    public String mappingTest() {
        logger.debug("#######################");
        logger.debug("## 이거슨 로그를 찍는   ##");
        logger.debug("## 수많은 방법 중 하나  ##");
        logger.debug("#######################");
        return "index";
    }
}
