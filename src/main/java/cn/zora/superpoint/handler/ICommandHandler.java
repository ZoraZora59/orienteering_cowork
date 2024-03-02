package cn.zora.superpoint.handler;

import cn.zora.superpoint.common.CommandEnum;
import cn.zora.superpoint.model.wechat.ReceiveMessage;
import cn.zora.superpoint.model.wechat.ResponseMessage;

/**
 * ICommandHandler
 *
 * @author 阿左
 * @since 2024/03/02
 */
public interface ICommandHandler {


    /**
     * 执行命令，只用在外层接口调用
     *
     * @return 对应的执行结果消息
     */
    ResponseMessage runCommand(ReceiveMessage message);

    /**
     * 响应命令
     *
     * @return 命令全写
     */
    String respondCommandString();

    /**
     * CommandHandler对应响应的命令枚举
     *
     * @return 命令全写
     */
    CommandEnum respondCommand();


}
