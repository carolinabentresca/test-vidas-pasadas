/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author EXO
 */
@Controller
public class Controlador {

    ModelAndView mv = new ModelAndView();

    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "test1.htm", method = RequestMethod.GET)
    public ModelAndView getTest1() {
        mv.setViewName("test1");
        return mv;
    }

    @RequestMapping(value = "test2.htm", method = RequestMethod.GET)
    public ModelAndView getTest2() {
        mv.setViewName("test2");
        return mv;
    }

    @RequestMapping(value = "test3.htm", method = RequestMethod.GET)
    public ModelAndView getTest3() {
        mv.setViewName("test3");
        return mv;
    }

    @RequestMapping(value = "test4.htm", method = RequestMethod.GET)
    public ModelAndView getTest4() {
        mv.setViewName("test4");
        return mv;
    }

    @RequestMapping(value = "result1.htm", method = RequestMethod.GET)
    public ModelAndView getResult1() {
        mv.setViewName("result1");
        return mv;
    }

    @RequestMapping(value = "result2.htm", method = RequestMethod.GET)
    public ModelAndView getResult2() {
        mv.setViewName("result2");
        return mv;
    }

    @RequestMapping(value = "result3.htm", method = RequestMethod.GET)
    public ModelAndView getResult3() {
        mv.setViewName("result3");
        return mv;
    }

    @RequestMapping(value = "result4.htm", method = RequestMethod.GET)
    public ModelAndView getResult4() {
        mv.setViewName("result4");
        return mv;
    }

    @RequestMapping(value = "result5.htm", method = RequestMethod.GET)
    public ModelAndView getResult5() {
        mv.setViewName("result5");
        return mv;
    }

    @RequestMapping(value = "result6.htm", method = RequestMethod.GET)
    public ModelAndView getResult6() {
        mv.setViewName("result6");
        return mv;
    }
    

    @RequestMapping(value = "test4.htm", method = RequestMethod.POST)
    public ModelAndView getValidar(HttpServletRequest request, HttpServletResponse response) {
        String sexo = request.getParameter("sexo");
        String edad = request.getParameter("edad");

        try {

            if (sexo.equals("hombre") && edad.equals("menor o igual 35")) {
                return new ModelAndView("redirect:/result1.htm");

            } else if (sexo.equals("hombre") && edad.equals("mayor 35")) {
                return new ModelAndView("redirect:/result2.htm");

            } else if (sexo.equals("hombre") && edad.equals("mayor 60")) {
                return new ModelAndView("redirect:/result3.htm");

            } else if (sexo.equals("mujer") && edad.equals("menor o igual 35")) {
                return new ModelAndView("redirect:/result4.htm");

            } else if (sexo.equals("mujer") && edad.equals("mayor 35")) {
                return new ModelAndView("redirect:/result6.htm");

            } else if (sexo.equals("mujer") && edad.equals("mayor 60")) {
                return new ModelAndView("redirect:/result5.htm");

            } else {
                return new ModelAndView("redirect:/test4.htm");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return mv;
    }

}
