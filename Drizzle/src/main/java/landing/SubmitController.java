package landing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmitController {

	@RequestMapping("/success")
    public String greeting(Model model, @RequestParam("answer") String answer, @RequestParam("explination") String explination){
		model.addAttribute("answer", answer);
		model.addAttribute("explination", explination);
        return "success";
    }
	
}
