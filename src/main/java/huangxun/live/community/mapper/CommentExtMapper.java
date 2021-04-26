package huangxun.live.community.mapper;

import huangxun.live.community.model.Comment;
import huangxun.live.community.model.CommentExample;
import huangxun.live.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);

}