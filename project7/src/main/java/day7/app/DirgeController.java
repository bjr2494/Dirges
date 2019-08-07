package day7.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping
public class DirgeController {
	
	@Autowired
	DirgeRepository dirgeRepository;

	@GetMapping("/allDirges")
	public String allDirges(Model model) {
		model.addAttribute("dirges", dirgeRepository.findAll());
		return "allDirges";
	}
	
	@GetMapping("/allDirges/{dirgeId}")
	public String oneDirge(Model model, @PathVariable Long dirgeId) {
		Optional<Dirge> dirge = dirgeRepository.findById(dirgeId);
		if (dirge.isPresent()) {
			model.addAttribute("dirge", dirge.get());
			return "oneDirge";
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
}
