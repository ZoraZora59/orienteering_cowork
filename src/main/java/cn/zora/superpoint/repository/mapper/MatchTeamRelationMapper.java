package cn.zora.superpoint.repository.mapper;

import cn.zora.superpoint.model.superpoint.MatchTeamRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MatchTeamRelationMapper extends BaseMapper<MatchTeamRelation> {
    int batchInsert(@Param("list") List<MatchTeamRelation> list);

    int insertOrUpdate(MatchTeamRelation record);

    int insertOrUpdateSelective(MatchTeamRelation record);
}