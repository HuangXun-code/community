package huangxun.live.community.service;

import huangxun.live.community.exception.CustomizeErrorCode;
import huangxun.live.community.exception.CustomizeException;
import huangxun.live.community.model.Comment;
import org.springframework.stereotype.Service;

/**
 * @author :黄珣
 * @description : 集成commentmapper和questionmapper
 * @create :2021-04-21 22:34:00
 */
@Service
public class CommentService {

    public void insert(Comment comment) {
        if (comment.getParentId() == null || comment.getParentId() == 0) {
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }
    }
}
