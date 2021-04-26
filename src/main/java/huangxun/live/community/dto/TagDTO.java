package huangxun.live.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author :黄珣
 * @description : 定义标签结构
 * @create :2021-04-25 21:38:00
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;

}
