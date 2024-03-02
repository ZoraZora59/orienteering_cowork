package cn.zora.superpoint.common;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * RuleUtils
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Slf4j
public final class RuleUtils {

    public static String getRule(String content) {
        if(content==null||content.isEmpty()){
            return CommandEnum.COMMUNICATE.getValue();
        }
        for (CommandEnum commandEnum : CommandEnum.values()) {
            if (content.startsWith(commandEnum.getValue())) {
                return commandEnum.getValue();
            }
        }
        log.warn("获取命令失败");
        return CommandEnum.COMMUNICATE.getValue();
    }
}
