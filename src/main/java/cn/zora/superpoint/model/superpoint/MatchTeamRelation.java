package cn.zora.superpoint.model.superpoint;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "match_team_relation")
public class MatchTeamRelation {
    @TableField(value = "match_id")
    private Integer matchId;

    @TableField(value = "team_id")
    private Integer teamId;
}