package cn.zora.zorawebsite.repository.mapper;

import cn.zora.zorawebsite.model.superpoint.Player;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlayerMapper extends BaseMapper<Player> {
    int updateBatch(List<Player> list);

    int batchInsert(@Param("list") List<Player> list);

    int insertOrUpdate(Player record);

    int insertOrUpdateSelective(Player record);
}