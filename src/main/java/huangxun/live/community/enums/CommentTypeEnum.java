package huangxun.live.community.enums;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-21 22:31:00
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
