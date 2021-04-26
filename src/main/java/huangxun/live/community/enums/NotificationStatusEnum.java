package huangxun.live.community.enums;

/**
 * @author :黄珣
 * @description :通知状态的枚举
 * @create :2021-04-26 10:35:00
 */
public enum NotificationStatusEnum {
    UN_READ(0),
    READ(1);
    private int status;

    NotificationStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
