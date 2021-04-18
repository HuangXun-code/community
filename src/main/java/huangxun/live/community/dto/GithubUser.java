package huangxun.live.community.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String name;

    private Long id;

    private String bio;

    private String avatarUrl; //fastJSON可以自动把下划线标识映射到驼峰属性
}
