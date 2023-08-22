package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Book;
import com.example.demo.repositoty.BookRepo;

@Service
public class Bookservice {

	@Autowired
	BookRepo sr;
	public Book saveinfo( Book ss)
	{
		return sr.save(ss);
	}
	public List <Book > showinfo()
	{
		return sr.findAll();
	}
	public Optional<Book> showid(int id)
	{
		return sr.findById(id);
	}
	public Book updateinfo( Book ss)
	{
		return sr.saveAndFlush(ss);
	}
	public String updateinfobyid(int id,Book ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "ENter valid id";
		}
	}
	public void deleteinfo( Book ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
}
