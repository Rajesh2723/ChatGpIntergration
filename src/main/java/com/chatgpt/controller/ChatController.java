package com.chatgpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chatgpt.dto.Request;
import com.chatgpt.dto.Response;

@RestController
@RequestMapping("/bot")
public class ChatController {
			
	@Value("${openai.model}")
	private String model;
	
	@Value("${openai.api.url")
	private String apiUrl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/chat")
	public String chat(@RequestParam("prompt") String prompt) {
		Request request=new Request(model,prompt);
		Response response=restTemplate.postForObject(apiUrl, request, Response.class);
		 return response.getChoices().get(0).getMessage().getContent();
	}
	
}	
