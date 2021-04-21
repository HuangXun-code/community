package huangxun.live.community.advice;

import huangxun.live.community.dto.ResultDTO;
import huangxun.live.community.exception.CustomizeErrorCode;
import huangxun.live.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;

/**
 * @author :黄珣
 * @description : 使用springboot提供的异常处理方法，解决业务异常页面问题，使用ControllerAdvice
 * @create :2021-04-21 14:54:00
 */
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    Object handle(Throwable e, Model model, HttpServletRequest request) {
        String contentType = request.getContentType();
        if ("application/json".equals(contentType)) {
            //返回json
            if (e instanceof CustomizeException) {
                return ResultDTO.errorOf((CustomizeException) e);
            } else {
                return ResultDTO.errorOf(CustomizeErrorCode.SYS_ERROR);
            }

        } else {
            //错误页面跳转
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message", CustomizeErrorCode.SYS_ERROR.getMessage());
            }
            return new ModelAndView("error");
        }
    }
}
