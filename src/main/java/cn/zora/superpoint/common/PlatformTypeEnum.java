package cn.zora.superpoint.common;

import lombok.Getter;

/**
 * PlatformTypeEnum
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Getter
public enum PlatformTypeEnum {
    WECHAT_MP("微信公众号-阿左小院");

    private final String value;
    PlatformTypeEnum(String value){
        this.value=value;
    }

}
