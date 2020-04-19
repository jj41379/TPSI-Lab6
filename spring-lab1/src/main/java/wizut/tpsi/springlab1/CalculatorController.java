package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
    
    
    @RequestMapping("/wynik")
        public String wynik(Model model, Integer x, Integer y) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        Integer suma = x + y;
        model.addAttribute("suma", suma);
        return "wynik";
}
    
     @RequestMapping("/wynikOperacja")
        public String wynikOperacja(Model model, Integer x, Integer y, String operacja) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("operacja", operacja);
        Integer wynik;
        if(operacja.equals("+")){
            wynik = x + y;
        }
        
        else if(operacja.equals("-")){
            wynik = x - y;
        }
        
        else{
            wynik = x * y;
        }

        model.addAttribute("wynik", wynik);
        return "wynikOperacja";
}
        @RequestMapping("/wynikForm")
        public String wynikForm(Model model, CalculatorForm form) {
        Integer x = form.getx();
        Integer y = form.gety();
        String operacja = form.getoperacja();
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("operacja", operacja);
        Integer wynik;
        if(operacja.equals("+")){
            wynik = x + y;
        }
        
        else if(operacja.equals("-")){
            wynik = x - y;
        }
        
        else{
            wynik = x * y;
        }

        model.addAttribute("wynik", wynik);
        return "wynikOperacja";
}
}
