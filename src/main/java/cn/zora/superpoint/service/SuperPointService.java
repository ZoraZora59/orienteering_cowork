package cn.zora.superpoint.service;

import cn.zora.superpoint.common.RuleUtils;
import cn.zora.superpoint.handler.CommandHandlerFactory;
import cn.zora.superpoint.model.wechat.ReceiveMessage;
import cn.zora.superpoint.model.wechat.ResponseMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * SuperPointService
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Service
public class SuperPointService {
    @Resource
    private CommandHandlerFactory commandHandlerFactory;

    public ResponseMessage handleTextMessage(ReceiveMessage request) {
        String rule = RuleUtils.getRule(request.getContent());
        return commandHandlerFactory.getInstance(rule).runCommand(request);
    }

}
