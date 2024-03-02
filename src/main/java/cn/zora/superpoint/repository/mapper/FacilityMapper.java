package cn.zora.superpoint.repository.mapper;

import cn.zora.superpoint.model.superpoint.Facility;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FacilityMapper extends BaseMapper<Facility> {
    int updateBatch(List<Facility> list);

    int batchInsert(@Param("list") List<Facility> list);

    int insertOrUpdate(Facility record);

    int insertOrUpdateSelective(Facility record);
}