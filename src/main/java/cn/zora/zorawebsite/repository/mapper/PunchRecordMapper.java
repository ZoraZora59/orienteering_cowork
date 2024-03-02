package cn.zora.zorawebsite.repository.mapper;

import cn.zora.zorawebsite.model.superpoint.PunchRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PunchRecordMapper extends BaseMapper<PunchRecord> {
    int updateBatch(List<PunchRecord> list);

    int batchInsert(@Param("list") List<PunchRecord> list);

    int insertOrUpdate(PunchRecord record);

    int insertOrUpdateSelective(PunchRecord record);
}