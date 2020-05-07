package com.seattleacademy.team20;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SkilluploadController {
 @RequestMapping(value = "/skill-upload", method = RequestMethod.POST)
 public String login(Model model) {
 return "skill-upload";
 }
}