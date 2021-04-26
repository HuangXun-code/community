package huangxun.live.community.exception;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-21 15:40:00
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND(2001, "你找的问题不在了，要不要换个试试"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题或评论进行回复"),
    NO_LOGIN(2003, "当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004, "服务冒烟了要不然你稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在！！！"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不在了，要不要换个试试" ),
    REQUEST_WRONG(2007, "你这个请求错了吧，要不然换个姿势？"),
    CONTENT_IS_EMPTY(2008, "输入内容不能为空噢~亲"),
    READ_NOTIFICATION_FAIL(2009, "兄弟你这是读别人的信息呢？"),
    NOTIFICATION_NOT_FOUND(2010, "消息莫非不翼而飞了？")
    ;

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
