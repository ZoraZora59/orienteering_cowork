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
@TableName(value = "player_team_relation")
public class PlayerTeamRelation {
    @TableField(value = "player_id")
    private Integer playerId;

    @TableField(value = "team_id")
    private Integer teamId;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    public static final String COL_PLAYER_ID = "player_id";

    public static final String COL_TEAM_ID = "team_id";

    public static final String COL_CREATE_TIME = "create_time";
}