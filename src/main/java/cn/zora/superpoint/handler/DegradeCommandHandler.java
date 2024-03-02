package cn.zora.superpoint.handler;

import cn.zora.superpoint.common.Constants;
import cn.zora.superpoint.model.wechat.ReceiveMessage;
import cn.zora.superpoint.model.wechat.ResponseMessage;
import org.springframework.stereotype.Component;

/**
 * DegradeCommandHandler
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Component
public class DegradeCommandHandler extends AbstractCommandHandler{
    @Override
    public String handleCommand(ReceiveMessage message) {
       return "你好，我正在维护这套系统，预计在3月5日前将不能提供服务，很抱歉，敬请谅解🙏";

    }

    /**
     * 响应命令
     *
     * @return 命令全写
     */
    @Override
    public String respondCommand() {
        return Constants.COMMUNICATE;
    }
}
