package cn.zora.superpoint.handler;

import cn.zora.superpoint.common.BooleanMysqlEnum;
import cn.zora.superpoint.common.CommandEnum;
import cn.zora.superpoint.model.superpoint.Team;
import cn.zora.superpoint.model.wechat.ReceiveMessage;
import cn.zora.superpoint.repository.mapper.TeamMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * RegisterTeamCommandHandler
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Component
public class RegisterTeamCommandHandler extends AbstractCommandHandler{
    @Resource
    private TeamMapper teamMapper;

    /**
     * 命令的使用说明
     *
     * @return 说明
     */
    @Override
    public String guidance() {
        return "需要注册团队的话，发送的消息内容请参考示例“创建团队 冲冲小队”";
    }

    @Override
    protected boolean argsIsValid(String[] args) {
        return args.length == 1;
    }

    @Override
    public String handleCommand(ReceiveMessage message) {
        Team team = new Team();
        team.setName(message.getArgs()[0]);
        team.setActive(BooleanMysqlEnum.TRUE);
        int rows = teamMapper.insert(team);
        if (rows > 0) {
            return "注册团队成功";
        }
        return "注册团队失败，请留言联系我人工解决";
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
