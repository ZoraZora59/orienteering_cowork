package cn.zora.superpoint.common;

import lombok.Getter;

/**
 * GenderTypeEnum
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Getter
public enum GenderTypeEnum {
    MALE("男"),FEMALE("女"),UNKNOWN("未知");
    private final String value;

    GenderTypeEnum(String value) {
        this.value = value;
    }

}
