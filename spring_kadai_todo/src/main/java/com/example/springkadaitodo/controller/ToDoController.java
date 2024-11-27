package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {
	//serviceの変数宣言
	private final ToDoService toDoService;
	
	//コンストラクタインジェクション
	public ToDoController (ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	@GetMapping("/todo")
	public String toDo(Model model) {
		
		//ToDo一覧を取得
		List<ToDo> todos = toDoService.getAllToDo();
		
		//modelにデータを保存
		model.addAttribute("todos",todos);
		
		//ビューの呼び出し
		return "todoView";
		
	}
	

}
