package cn.zora.superpoint.repository.mapper;

import cn.zora.superpoint.model.superpoint.Point;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PointMapper extends BaseMapper<Point> {
    int updateBatch(List<Point> list);

    int batchInsert(@Param("list") List<Point> list);

    int insertOrUpdate(Point record);

    int insertOrUpdateSelective(Point record);
}