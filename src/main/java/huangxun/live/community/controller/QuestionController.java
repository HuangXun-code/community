package huangxun.live.community.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import huangxun.live.community.dto.QuestionDTO;
import huangxun.live.community.mapper.QuestionMapper;
import huangxun.live.community.mapper.UserMapper;
import huangxun.live.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-20 16:03:00
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
