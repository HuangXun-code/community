package huangxun.live.community.exception;

/**
 * @author :黄珣
 * @description :
 * @create :2021-04-21 15:14:00
 */
public class CustomizeException extends RuntimeException{
    private String message;

    public CustomizeException(String message){
        this.message = message;
    }

    public CustomizeException(ICustomizeErrorCode errorCode){
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
