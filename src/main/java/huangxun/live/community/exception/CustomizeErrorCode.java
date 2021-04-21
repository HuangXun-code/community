package huangxun.live.community.exception;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-21 15:40:00
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("你找的问题不在了，要不要换个试试");

    private String message;

    CustomizeErrorCode(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
