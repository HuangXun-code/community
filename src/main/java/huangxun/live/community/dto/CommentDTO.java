package huangxun.live.community.dto;

import huangxun.live.community.model.User;
import lombok.Data;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-22 21:24:00
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
    private Integer commentCount;
}
