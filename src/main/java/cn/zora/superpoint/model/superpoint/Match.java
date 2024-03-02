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
@TableName(value = "`match`")
public class Match {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "apply_start_time")
    private LocalDateTime applyStartTime;

    @TableField(value = "apply_end_time")
    private LocalDateTime applyEndTime;

    @TableField(value = "match_start_time")
    private LocalDateTime matchStartTime;

    @TableField(value = "match_end_time")
    private LocalDateTime matchEndTime;

    @TableField(value = "series_name")
    private String seriesName;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time")
    private LocalDateTime updateTime;
}