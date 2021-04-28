package huangxun.live.community.mapper;

import huangxun.live.community.dto.QuestionQueryDTO;
import huangxun.live.community.model.Question;
import huangxun.live.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

//由于mapper和数据库语句需要重复写而引入mybatis generator
public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}