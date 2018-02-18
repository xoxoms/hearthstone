package com.xoxoms.service;

import com.xoxoms.core.domain.pack.Pack;
import com.xoxoms.core.entity.UserCardMap;
import com.xoxoms.type.PackCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import java.util.List;

/**
 * Created by ms on 2018. 2. 15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PackServiceTest {
    @Inject private PackService packService;

    @Test
    public void test() {
        List<UserCardMap> userCardMaps = packService.getUserCards(1L);
        System.out.println(userCardMaps.size());

        for(int i = 0; i < 10; i++) {
            Pack pack = packService.unpack(PackCode.EXPERT1);
            pack.getCards().forEach(e -> {
                System.out.println(e.getName());
            });
        }
    }
}