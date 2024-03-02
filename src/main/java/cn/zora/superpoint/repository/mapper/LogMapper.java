package cn.zora.superpoint.repository.mapper;

import cn.zora.superpoint.model.superpoint.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogMapper extends BaseMapper<Log> {
    int updateBatch(List<Log> list);

    int batchInsert(@Param("list") List<Log> list);

    int insertOrUpdate(Log record);

    int insertOrUpdateSelective(Log record);
}