package is.ntc.simpleMVCweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/addbook")
	public String addbook(
			@RequestParam(name="id", required=false, defaultValue="1") int id,
			@RequestParam(name="name", required=false, defaultValue="") String name, 
			@RequestParam(name="author", required=false, defaultValue="") String author,
			@RequestParam(name="publisher", required=false, defaultValue="") String publisher,
			@RequestParam(name="year", required=false, defaultValue="2000") int year,
			Model model) {
		model.addAttribute("book", new Book(id, name, author, publisher, year));
		return "addbook";
	}
	
	@PostMapping("/addbook")
	  public String addbookSubmit(@ModelAttribute Book book) {
	    return "newbook";
	}

}
