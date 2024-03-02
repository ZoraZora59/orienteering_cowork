package cn.zora.superpoint.common;

/**
 * ParamUtils
 *
 * @author 阿左
 * @since 2024/03/02
 */
public final class ParamUtils {
    public static String[] getArgs(String content) {
        if (content == null || content.isEmpty()) {
            return new String[0];
        }
        String[] rawArgs = content.split(" ");
        if (rawArgs.length == 1) {
            return new String[0];
        }
        String[] args = new String[rawArgs.length - 1];
        System.arraycopy(rawArgs, 1, args, 0, rawArgs.length - 1);
        return args;
    }
}
