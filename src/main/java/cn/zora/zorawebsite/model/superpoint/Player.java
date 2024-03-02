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
@TableName(value = "player")
public class Player {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "nick_name")
    private String nickName;

    @TableField(value = "wechat_user")
    private String wechatUser;

    @TableField(value = "avatar")
    private String avatar;

    @TableField(value = "gender")
    private Object gender;

    @TableField(value = "phone_number")
    private String phoneNumber;

    @TableField(value = "id_card_number")
    private String idCardNumber;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    public static final String COL_ID = "id";

    public static final String COL_NICK_NAME = "nick_name";

    public static final String COL_WECHAT_USER = "wechat_user";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_GENDER = "gender";

    public static final String COL_PHONE_NUMBER = "phone_number";

    public static final String COL_ID_CARD_NUMBER = "id_card_number";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}