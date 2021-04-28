package huangxun.live.community.dto;

import lombok.Data;

/**
 * @author :黄珣
 * @description : 搜索问题列表
 * @create :2021-04-27 15:28:00
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
