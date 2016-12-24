package com.cinema.api.rest.liqpay;

import com.cinema.api.rest.liqpay.liqPayApi.LiqPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Kobylyatskyy Alexander
 */
@Controller
@RequestMapping("/api/rest/liqpay")
public class LiqPayRestController {

    @Autowired
    private LiqPayService liqPayService;


    @RequestMapping(value = "/account/getLiqPayParam", method = RequestMethod.POST)
    @ResponseBody
    public String[] getLiqPayParam(@RequestParam("amount") String email, @RequestParam("amount") Integer amount, @RequestParam("amount") String seatId) {

        Map<String, String> result = liqPayService.liqPayGenerateParamForHtmlForm(email, amount, seatId);
        return new String[]{result.get("data"), result.get("signature")};
    }

}
