package cn.zora.superpoint.repository.mapper;

import cn.zora.superpoint.model.superpoint.PlayerTeamRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlayerTeamRelationMapper extends BaseMapper<PlayerTeamRelation> {
    int batchInsert(@Param("list") List<PlayerTeamRelation> list);

    int insertOrUpdate(PlayerTeamRelation record);

    int insertOrUpdateSelective(PlayerTeamRelation record);
}