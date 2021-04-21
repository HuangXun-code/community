package huangxun.live.community.dto;

import huangxun.live.community.exception.CustomizeErrorCode;
import huangxun.live.community.exception.CustomizeException;
import lombok.Data;

/**
 * @author :黄珣
 * @description :增强返回结果
 * @create :2021-04-21 22:21:00
 */
@Data
public class ResultDTO {
    private String message;
    private Integer code;

    public static ResultDTO errorOf(Integer code, String message) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(), errorCode.getMessage());
    }

    public static ResultDTO errorOf(CustomizeException e) {
        return errorOf(e.getCode(), e.getMessage());
    }

    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功");
        return resultDTO;
    }


}
