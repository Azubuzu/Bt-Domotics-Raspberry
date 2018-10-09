package local.leo.BtDomotics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestController {
    private int count = 0;

    @GetMapping("/")
    public String index(@RequestParam(required = false,defaultValue = "stranger") String name, Model model) {
        model.addAttribute("menu","Dashboard");
        return "dashboard";
    }

    @GetMapping("/{menu}")
    public String user(@PathVariable String menu, Model model) {
        String menu_format = menu.substring(0, 1).toUpperCase() + menu.substring(1);
        model.addAttribute("menu",menu_format);
        return menu;
    }
}
