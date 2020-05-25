package demo.gestion.notes.mp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;

import demo.gestion.notes.mp.model.Notes;


@ApplicationScoped
public class NotesService {
	
	
	private static final List<Notes> notes =new  ArrayList<>();
	
	static {
		
		notes.add(new Notes("1", "Math", "A"));
		notes.add(new Notes("1", "Francais", "B"));
		notes.add(new Notes("1", "Histoires", "A-"));
		notes.add(new Notes("2", "Math", "B-"));
		notes.add(new Notes("3", "Math", "c+"));
		notes.add(new Notes("4", "Math", "B"));
		notes.add(new Notes("2", "Francais", "A"));
		notes.add(new Notes("3", "Histoires", "B+"));
		
	}
	
	
	public List<Notes>  getNotes(){
		return notes;
		
	}
	
	public List<Notes>  getEtudiantNotes(String id){
		return notes.stream().filter(notes-> notes.getIdEtudiant().equals(id)).collect(Collectors.toList());
		
	}

}
