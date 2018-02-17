package com.xoxoms.controller;

import com.xoxoms.core.domain.pack.Pack;
import com.xoxoms.service.PackService;
import com.xoxoms.type.PackCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Created by ms on 2018. 2. 17..
 */
@Controller
@RequestMapping("/api/v1/packs")
public class PackController {
    private final PackService packService;

    @Inject
    public PackController(PackService packService) {
        this.packService = packService;
    }

    @RequestMapping(value = "/{packCode}",method = RequestMethod.GET)
    public void unpack(@PathVariable PackCode packCode) {
        Long userId = 1L;
        Pack pack = packService.unpack(packCode);
        packService.applyPack(userId, pack);
    }
}
