package huangxun.live.community.controller;

import huangxun.live.community.dto.PaginationDTO;
import huangxun.live.community.mapper.UserMapper;
import huangxun.live.community.model.User;
import huangxun.live.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-18 19:52:00
 */
@Controller
public class ProfileController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name = "action") String action,
                          @RequestParam(name = "page", defaultValue = "1") Integer page,
                          @RequestParam(name = "size", defaultValue = "5") Integer size,
                          Model model,
                          HttpServletRequest request) {

        User user = (User) request.getSession().getAttribute("user");

        if (user == null) { //如果用户不存在，跳回首页面
            return "redirect:/";
        }
        if ("questions".contains(action)) {
            model.addAttribute("section", "questions");
            model.addAttribute("sectionName", "我的提问");
        } else if ("replies".equals(action)) {
            model.addAttribute("section", "replies");
            model.addAttribute("sectionName", "最新回复");
        }

        PaginationDTO paginationDTO = questionService.list(user.getId(), page, size);

        model.addAttribute("pagination", paginationDTO);
        return "profile";
    }
}
