package cn.zora.zorawebsite.model.superpoint;

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

    public static final String COL_ID = "id";

    public static final String COL_PLAYER_ID = "player_id";

    public static final String COL_POINT_ID = "point_id";

    public static final String COL_MATCH_ID = "match_id";

    public static final String COL_TEAM_ID = "team_id";

    public static final String COL_FACILITY_ID = "facility_id";

    public static final String COL_EXPECT_SERIAL = "expect_serial";

    public static final String COL_PUNCHED = "punched";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_PUNCH_TIME = "punch_time";
}