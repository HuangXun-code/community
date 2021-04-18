package huangxun.live.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;

    private String title;

    private String description;

    private String tag;

    private Integer creator; //关联id，获取avatarUrl

    private Long gmtCreate;

    private Long gmtModified;

    private Integer viewCount;

    private Integer commentCount;

    private Integer likeCount;

}
