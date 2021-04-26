package huangxun.live.community.controller;

import huangxun.live.community.dto.NotificationDTO;
import huangxun.live.community.dto.PaginationDTO;
import huangxun.live.community.enums.NotificationTypeEnum;
import huangxun.live.community.model.User;
import huangxun.live.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author :黄珣
 * @description : 查看回复的跳转逻辑
 * @create :2021-04-26 16:20:00
 */
@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String notification(@PathVariable(name = "id") Long id,
                          HttpServletRequest request) {

        User user = (User) request.getSession().getAttribute("user");

        if (user == null) { //如果用户不存在，跳回首页面
            return "redirect:/";
        }

        NotificationDTO notificationDTO = notificationService.read(id, user);

        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
                || NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType()) {
            return "redirect:/question/" + notificationDTO.getOuterId();
        }else{
            return "redirect:/";
        }
    }
}
