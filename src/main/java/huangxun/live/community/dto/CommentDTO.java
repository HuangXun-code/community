package huangxun.live.community.dto;

import lombok.Data;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-21 20:07:00
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
