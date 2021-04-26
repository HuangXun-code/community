package huangxun.live.community.exception;

/**
 * @author :黄珣
 * @description : 定义接口是因为以后可能还有别的业务异常需要处理，所以不应该把所有异常都写到一个类中，应该分开写，所以每个异常处理的类中都有
 * getMessage和getCode方法，这时就可以把方法抽离出来写在通用的接口上
 * @create :2021-04-21 15:39:00
 */
public interface ICustomizeErrorCode {
    String getMessage();
    Integer getCode();
}
