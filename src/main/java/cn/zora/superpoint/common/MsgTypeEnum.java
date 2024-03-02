package cn.zora.superpoint.common;

import lombok.Getter;

/**
 * MsgTypeEnum
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Getter
public enum MsgTypeEnum {
    /**
     * 文本消息
     */
    TEXT("text", "文本消息"),
    /**
     * 图片消息
     */
    IMAGE("image", "图片消息"),
    /**
     * 语音消息
     */
    VOICE("voice", "语音消息"),
    /**
     * 视频消息
     */
    VIDEO("video", "视频消息"),
    /**
     * 小视频消息
     */
    SHORT_VIDEO("shortvideo", "小视频消息"),
    /**
     * 地理位置消息
     */
    LOCATION("location", "地理位置消息"),
    /**
     * 链接消息
     */
    LINK("link", "链接消息"),
    /**
     * 事件消息
     */
    EVENT("event", "事件消息"),
    /**
     * 其他消息
     */
    OTHER("other", "其他消息");

    private final String name;
    private final String description;

    MsgTypeEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static MsgTypeEnum fromName(String name) {
        for (MsgTypeEnum value : values()) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return OTHER;
    }
}
