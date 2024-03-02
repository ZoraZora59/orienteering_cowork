package cn.zora.superpoint.handler;

import cn.zora.superpoint.common.CommandEnum;
import cn.zora.superpoint.model.wechat.ReceiveMessage;
import org.springframework.stereotype.Component;

/**
 * RegisterTeamCommandHandler
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Component
public class RegisterTeamCommandHandler extends AbstractCommandHandler{
    @Override
    public String handleCommand(ReceiveMessage message) {
        return null;
    }

    /**
     * CommandHandler对应响应的命令
     *
     * @return 命令全写
     */
    @Override
    public CommandEnum respondCommand() {
        return CommandEnum.REGISTER_TEAM;
    }
}
