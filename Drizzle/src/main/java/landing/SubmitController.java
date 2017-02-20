package landing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmitController {

	@RequestMapping("/success")
    public String greeting(Model model, @RequestParam("answer") String answer, @RequestParam("explanation") String explanation){
		
		AnswerManager ansMan = new AnswerManager();
		if(!ansMan.shortAnswer(answer)){
			model.addAttribute("shortAnswer", "Please enter an answer that is less than 25 characters long.");
			return"landing";
		}
		if(!ansMan.shortExplanation(explanation)){
			model.addAttribute("shortexplanation", "Please enter an explanation that is less than 144 characters.");
			return "landing";
		}
		boolean exists = ansMan.checkAnswer(answer, explanation);
		if (!exists){
			ansMan.addAnswer(answer, explanation);
		}
		List<Answer> allAnswers = new ArrayList<Answer>();
		allAnswers.add(ansMan.currentAns(answer));
		model.addAttribute("answer", answer);
		model.addAttribute("eplanation", allAnswers);
        return "success";
    }
	
}
