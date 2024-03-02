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
@TableName(value = "facility")
public class Facility {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "province")
    private String province;

    @TableField(value = "city")
    private String city;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PROVINCE = "province";

    public static final String COL_CITY = "city";
}