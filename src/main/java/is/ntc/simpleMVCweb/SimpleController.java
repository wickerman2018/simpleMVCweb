package is.ntc.simpleMVCweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SimpleController {
	
	Book book1 = new Book(1, "Бьярне Страуструп", "Программирование: принципы и практика использования C++", 
    		"Издательский дом Вильямс", 2011);
	
	@GetMapping("/book")
	public String book(Model model) {
		model.addAttribute("id", book1.getId());
		model.addAttribute("name", book1.getName());
		model.addAttribute("author", book1.getAuthor());
		model.addAttribute("publisher", book1.getPublisher());
		model.addAttribute("year", book1.getYear());
		return "book";
	}
	
	@GetMapping("/book/{id}")
	public String book(Model model, @PathVariable int id) {
		model.addAttribute("id", id);
		model.addAttribute("name", book1.getName());
		model.addAttribute("author", book1.getAuthor());
		model.addAttribute("publisher", book1.getPublisher());
		model.addAttribute("year", book1.getYear());
		return "book";
	}
	
}
