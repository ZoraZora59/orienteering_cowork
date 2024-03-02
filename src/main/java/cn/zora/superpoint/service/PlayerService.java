package cn.zora.superpoint.service;

import cn.zora.superpoint.model.superpoint.Player;
import cn.zora.superpoint.repository.mapper.PlayerMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * PlayerService
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Service
public class PlayerService {
    @Resource
    private PlayerMapper playerMapper;


    public synchronized int registerPlayer(Player player) {
        Long count = playerMapper.selectCount(new LambdaQueryWrapper<Player>().eq(Player::getWechatUser, player.getWechatUser()));
        if (count != 0) {
            return 0;
        }
        return playerMapper.insert(player);
    }

    public Player getPlayerByID(String id) {
        return playerMapper.selectById(new LambdaQueryWrapper<Player>().eq(Player::getId, id));
    }

    public Player getPlayerByWechat(String wechatId) {
        return playerMapper.selectOne(new LambdaQueryWrapper<Player>().eq(Player::getWechatUser, wechatId));
    }

    public List<Player> getPlayersByNickName(String nickName) {
        return playerMapper.selectList(new LambdaQueryWrapper<Player>().eq(Player::getNickName, nickName));
    }
}
