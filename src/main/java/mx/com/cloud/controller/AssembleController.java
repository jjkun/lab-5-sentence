package mx.com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import mx.com.cloud.service.SentenceService;

@RestController
public class AssembleController {

	@Autowired
	private SentenceService sentenceService;

	/**
	 * Display a small list of Sentences to the caller:
	 */
	@GetMapping("/sentence")
	public @ResponseBody String getSentences() {
		return "<h3>Some Sentences</h3><br/>" + sentenceService.buildSentence() + "<br/><br/>"
				+ sentenceService.buildSentence() + "<br/><br/>" + sentenceService.buildSentence() + "<br/><br/>"
				+ sentenceService.buildSentence() + "<br/><br/>" + sentenceService.buildSentence() + "<br/><br/>";
	}

}
