package cn.zora.zorawebsite.controller;

import cn.zora.zorawebsite.model.wechat.ReceiveMessage;
import cn.zora.zorawebsite.model.wechat.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RefactorController
 *
 * @author 阿左
 * @since 2024/03/02
 */
@Slf4j
@Controller("/v2")
public class RefactorController {
    @GetMapping("/")
    public ResponseEntity<String> get(@RequestParam(required = false) String signature, @RequestParam(required = false) Long timestamp, @RequestParam(required = false) Long nonce, @RequestParam(required = false) String echostr) {
        log.info("get: signature={}, timestamp={}, nonce={}, echostr={}", signature, timestamp, nonce, echostr);
        return ResponseEntity.ok(echostr);
    }

    @PostMapping(value = "/", consumes = MediaType.TEXT_XML_VALUE, produces = MediaType.TEXT_XML_VALUE)
    public ResponseEntity<ResponseMessage> post(@RequestBody ReceiveMessage request) {
        log.info("post: {}", request);
        return ResponseEntity.ok(null);
    }
}
