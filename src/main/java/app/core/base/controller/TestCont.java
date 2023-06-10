package app.core.base.controller;

import app.core.base.vo.UserVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpResponse;

@Controller
public class TestCont {

    public static final Logger logger = LogManager.getLogger(TestCont.class);

    @Value("${prop}")
    private String baseUrl;

    @GetMapping("/")
    public ModelAndView mappingTest(ModelAndView model) {
        model.addObject("url", baseUrl);
        model.setViewName("index");
        return model;
    }
}
