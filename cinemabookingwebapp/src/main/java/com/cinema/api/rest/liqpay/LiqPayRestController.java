package com.cinema.api.rest.liqpay;

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




//
//    @RequestMapping(value = "/account/getLiqPayParam", method = RequestMethod.POST)
//    @ResponseBody
//    public String[] getLiqPayParam(@RequestParam("amount") Long amount) {
//
//
//        if (loggedUserId != null) {
//            Map<String, String> result = session.liqPayGenerateParamForHtmlForm(loggedUserId, amount);
//            return new String[]{result.get("data"), result.get("signature")};
//        } else {
//            return new String[]{};
//        }
//
//    }




}
