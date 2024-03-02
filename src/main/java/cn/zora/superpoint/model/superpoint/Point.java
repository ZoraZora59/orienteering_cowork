package cn.zora.superpoint.model.superpoint;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "point")
public class Point {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "facility_id")
    private Integer facilityId;

    @TableField(value = "match_id")
    private Integer matchId;

    @TableField(value = "point_type")
    private Object pointType;

    @TableField(value = "lane")
    private String lane;

    @TableField(value = "geo_point")
    private Object geoPoint;

    @TableField(value = "create_time")
    private LocalDateTime createTime;
}