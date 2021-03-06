package controller;

import doto.TestLogin;

import doto.TestOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: Xiaowawa
 * Date: 2017/11/27
 * Time: 17:33
 */
@Controller
public class Helllocontroller {
    @RequestMapping("/")
    public String hello() throws Exception {
        return "hello";
    }

    @RequestMapping(value = "/Im", method = RequestMethod.GET)
    public ModelAndView xx(ModelAndView modelAndView, TestLogin testLogin) throws InterruptedException {
        if (testLogin.login()){
            modelAndView.addObject("msg", "ok");
        }
        else{
            modelAndView.addObject("msg", testLogin.resultmsg());
        }
        modelAndView.setViewName("hello");
        return modelAndView;
    }

@RequestMapping(value = "/Is",method = RequestMethod.GET)
    public ModelAndView xxs(ModelAndView modelAndView, TestOrder testOrder) throws InterruptedException {
        if (testOrder.order()){
            modelAndView.addObject("msg", "ok");
        }
        else{
            modelAndView.addObject("msg", testOrder.resultmsg());
        }
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(value = "/Iss",method = RequestMethod.GET)
    public ModelAndView xxss(ModelAndView modelAndView, TestOrder testOrder) throws InterruptedException {
        if (testOrder.ordret()){
            modelAndView.addObject("msg", "ok");
            modelAndView.addObject("mss1","~");
        }
        else{
            modelAndView.addObject("msg", testOrder.resultmsg());
            modelAndView.addObject("mss1","`");
        }
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}


// ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
//        // cache stream
//        PrintStream cacheStream = new PrintStream(baoStream);
//        // old stream
//        PrintStream oldStream = System.out;
//
//        System.setOut(cacheStream);
//
//        System.out.print("hello world!");
//
//        String message = baoStream.toString();
//
//        message = "<-- " + message + " -->";
//
//        // Restore old stream
//        System.setOut(oldStream);
//
//        System.out.println(message);
