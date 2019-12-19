package is.ntc.simpleMVCweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	@GetMapping("/book")
	public String book(Model model) {
		model.addAttribute("name", "Программирование: принципы и практика использования C++");
		model.addAttribute("author", "Бьярне Страуструп");
		model.addAttribute("publisher", "Издательский дом Вильямс");
		model.addAttribute("year", 2011);
		return "book";
	}
}
