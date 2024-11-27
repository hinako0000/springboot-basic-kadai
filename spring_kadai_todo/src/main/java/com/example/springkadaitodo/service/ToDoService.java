package com.example.springkadaitodo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Service
public class ToDoService {
	//リポジトリの変数宣言
	private final ToDoRepository toDoRepository;
	
	//コンストラクタインジェクション
	public ToDoService(ToDoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;
	}
	
	//タスクの一括取得
	public List<ToDo> getAllToDo(){
		return toDoRepository.findAll();
	}

}
