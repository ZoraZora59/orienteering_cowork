package cn.zora.superpoint.handler;

import cn.zora.superpoint.common.CommandEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * CommandHandlerFactory
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Component
public class CommandHandlerFactory {
    @Autowired
    public void injectFields(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    private Map<String, ICommandHandler> map;

    private ApplicationContext applicationContext;

    @PostConstruct
    private void init() {
        Map<String, ICommandHandler> beans = applicationContext.getBeansOfType(ICommandHandler.class);
        map = new HashMap<>(beans.size());
        for (ICommandHandler handle : beans.values()) {
            map.put(handle.respondCommandString(), handle);
        }
    }

    public ICommandHandler getInstance(String type) {
        if (!map.containsKey(type)) {
            return map.get(CommandEnum.COMMUNICATE.getValue());
        }
        return map.get(type);
    }

}
