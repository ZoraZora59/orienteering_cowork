package cn.zora.superpoint.model;

import cn.zora.superpoint.common.PlatformTypeEnum;
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
@TableName(value = "log")
public class Log {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "`user`")
    private String user;

    @TableField(value = "platform")
    private PlatformTypeEnum platform;

    @TableField(value = "receive_message_json")
    private String receiveMessageJson;

    @TableField(value = "response_message_json")
    private String responseMessageJson;

    @TableField(value = "create_time")
    private LocalDateTime createTime;
}