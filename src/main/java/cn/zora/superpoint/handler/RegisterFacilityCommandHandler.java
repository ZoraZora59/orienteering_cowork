package cn.zora.superpoint.handler;

import cn.zora.superpoint.common.CommandEnum;
import cn.zora.superpoint.model.superpoint.Facility;
import cn.zora.superpoint.model.wechat.ReceiveMessage;
import cn.zora.superpoint.repository.mapper.FacilityMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * RegisterFacilityCommandHandler
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Component
public class RegisterFacilityCommandHandler extends AbstractCommandHandler {

    @Resource
    private FacilityMapper facilityMapper;

    /**
     * 命令的使用说明
     *
     * @return 说明
     */
    @Override
    public String guidance() {
        return "需要注册场地的话，发送的消息内容请参考示例“注册雪场 万龙度假天堂 河北省 张家口市”";
    }

    @Override
    protected boolean argsIsValid(String[] args) {
        return args.length == 3;
    }

    @Override
    public String handleCommand(ReceiveMessage message) {
        Facility facility = new Facility();
        facility.setName(message.getArgs()[0]);
        facility.setProvince(message.getArgs()[1]);
        facility.setCity(message.getArgs()[2]);
        int rows = facilityMapper.insert(facility);
        if (rows > 0) {
            return "注册场地成功";
        }
        return "注册场地失败，请留言联系我人工解决";
    }

    /**
     * CommandHandler对应响应的命令
     *
     * @return 命令全写
     */
    @Override
    public CommandEnum respondCommand() {
        return CommandEnum.REGISTER_FACILITY;
    }
}
