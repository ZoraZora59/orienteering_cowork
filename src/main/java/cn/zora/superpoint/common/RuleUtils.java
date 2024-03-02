package cn.zora.superpoint.common;

/**
 * RuleUtils
 *
 * @author 阿左
 * @since 2024/03/02
 */
public final class RuleUtils {

    public static String getRule(String content) {
        if(content==null||content.isEmpty()){
            return Constants.COMMUNICATE;
        }

        if (content.startsWith(Constants.REBOOT)) {
            return Constants.REBOOT;
        }
        if (content.startsWith(Constants.SIGN_UP)) {
            return Constants.SIGN_UP;
        }
        if (content.startsWith(Constants.CONFIG_NODES)) {
            return Constants.CONFIG_NODES;
        }
        if (content.startsWith(Constants.ACHIEVE)) {
            return Constants.ACHIEVE;
        }
        if (content.startsWith(Constants.CANCEL)) {
            return Constants.CANCEL;
        }
        if (content.startsWith(Constants.TEAM_STATE)) {
            return Constants.TEAM_STATE;
        }
        if (content.startsWith(Constants.TEAM_STATE_DETAIL)) {
            return Constants.TEAM_STATE_DETAIL;
        }
        if (content.startsWith(Constants.MY_STATE)) {
            return Constants.MY_STATE;
        }
        return Constants.COMMUNICATE;
    }
}
