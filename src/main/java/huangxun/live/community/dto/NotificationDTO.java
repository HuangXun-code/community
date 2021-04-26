package huangxun.live.community.dto;

import huangxun.live.community.model.User;
import lombok.Data;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-26 11:08:00
 */
@Data
public class NotificationDTO {
    private Long id;
    private Integer status;
    private Long gmtCreate;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerId;
    private String typeName;
    private Integer type;
}
