package cn.zora.zorawebsite.repository.mapper;

import cn.zora.zorawebsite.model.superpoint.Team;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeamMapper extends BaseMapper<Team> {
    int updateBatch(List<Team> list);

    int batchInsert(@Param("list") List<Team> list);

    int insertOrUpdate(Team record);

    int insertOrUpdateSelective(Team record);
}