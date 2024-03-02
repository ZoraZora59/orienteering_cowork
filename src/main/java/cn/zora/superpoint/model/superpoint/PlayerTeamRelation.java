package cn.zora.superpoint.model.superpoint;

import com.baomidou.mybatisplus.annotation.TableField;
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
}