package cn.zora.zorawebsite.model.superpoint;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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

    public static final String COL_MATCH_ID = "match_id";

    public static final String COL_TEAM_ID = "team_id";
}