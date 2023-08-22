package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.Bookservice;

@RestController
public class ApiController {
@Autowired
	Bookservice sser;
	@PostMapping("add")
	public Book add(@RequestBody Book ss)
	{
		
		return sser.saveinfo(ss);
	}
	@GetMapping("show")
	public List<Book> showdetail(Book ss)
	{
		return sser.showinfo();
	}
	@GetMapping("showid/{id}")
	public Optional<Book> showbyid(@PathVariable int id)
	{
		return sser.showid(id);
	}
	@PutMapping("update")
	public Book updatedetail (@RequestBody Book ss)
	{
		return sser.updateinfo(ss);
	}
	@PutMapping("updateid/{id}")
	public String updatenid(@PathVariable int id,@RequestBody Book ss)
	{
		return sser.updateinfobyid(id,ss);
	}
	@DeleteMapping("delete")
	public String delete(@RequestBody Book ss)
	{
		sser.deleteinfo(ss);
		return "Delete Successfully";
	}
	@DeleteMapping("deleteid/{id}")
	public void deterByid(@PathVariable int id)
	{
		sser.deleteid(id);
		
	}
}
