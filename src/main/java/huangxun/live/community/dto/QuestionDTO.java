package huangxun.live.community.dto;

import huangxun.live.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;

    private String title;

    private String description;

    private String tag;

    private Integer creator;

    private Long gmtCreate;

    private Long gmtModified;

    private Integer viewCount;

    private Integer commentCount;

    private Integer likeCount;

    private User user;
}