package cn.zora.superpoint.common;

import lombok.Getter;

/**
 * PointTypeEnum
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Getter
public enum PointTypeEnum {
    NECESSARY("necessary"),UNNECESSARY("unnecessary");
    private final String value;
    PointTypeEnum(String value){
        this.value=value;
    }
}
