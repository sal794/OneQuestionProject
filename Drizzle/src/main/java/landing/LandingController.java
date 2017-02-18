package landing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LandingController {

    @RequestMapping(value={"/landing", "/"})
    public String greeting(){
        return "landing";
    }

}
