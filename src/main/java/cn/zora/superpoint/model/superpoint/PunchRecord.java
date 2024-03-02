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
@TableName(value = "punch_record")
public class PunchRecord {
    @TableId(value = "id", type = IdType.AUTO)
    private Object id;

    @TableField(value = "player_id")
    private Object playerId;

    @TableField(value = "point_id")
    private Object pointId;

    @TableField(value = "match_id")
    private Object matchId;

    @TableField(value = "team_id")
    private Object teamId;

    @TableField(value = "facility_id")
    private Object facilityId;

    @TableField(value = "expect_serial")
    private Integer expectSerial;

    @TableField(value = "punched")
    private Object punched;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @TableField(value = "punch_time")
    private LocalDateTime punchTime;
}