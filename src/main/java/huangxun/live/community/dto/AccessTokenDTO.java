package huangxun.live.community.dto;

import lombok.Data;

//超过两个以上参数就把方法改写成类
@Data
public class AccessTokenDTO {
    private String client_id;

    private String client_secret;

    private String code;

    private String redirect_uri;

    private String state;

}
