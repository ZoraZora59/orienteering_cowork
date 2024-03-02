package cn.zora.superpoint.repository.mapper;

import cn.zora.superpoint.model.superpoint.Match;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MatchMapper extends BaseMapper<Match> {
    int updateBatch(List<Match> list);

    int batchInsert(@Param("list") List<Match> list);

    int insertOrUpdate(Match record);

    int insertOrUpdateSelective(Match record);
}