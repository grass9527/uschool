package com.uschool.esearch.controller;
/**
 * @author ：caomu
 * @date ：Created in 2020/11/25 19:33
 * @description：
 * @modified By：
 * @version:
 */

import com.uschool.common.vo.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName HelloController
 *@Description TODO
 *@aurhor caomu
 *@Date 2020/11/25 19:33
 *@Version 1.0
 */
@RestController

public class HelloController {
    @GetMapping("/provider/hi.do")
    public R hi() {
        return R.ok("hi"+System.currentTimeMillis()/1000);
    }
}
