package projektas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;

public class MyProjectManager implements ProjectManager {
	
	private ArrayList <Issue> issues = new ArrayList();
	
	private Project project;
	private Issue issue;
	
	private ArrayList <Project> projects = new ArrayList();
	
	
	

	@Override
	public Issue createIssue(Project pro, String su) {
		// TODO Auto-generated method stub
		
		
		if (su.equals(null)) {
			throw new NullPointerException();
		       
		      }
		if (pro.equals(null)) {
			throw new NullPointerException();
		    
		}
		if (su.isEmpty()) {
			  throw new IllegalArgumentException();
		}
		   
		if (pro.getIssues().isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		/*for(Project sarasas: projects) {
			for(Issue sarasass: issues) {
			if (sarasas.getSummary().equals(su)&& sarasass.getProject().equals(pro)){
				return sarasass;
			}
			}	projects.add(sarasas);*/
		Issue is = new Issue(pro, su);
		pro.addIssue(is);
		/*issues.add(is);*/
	
		return is;
	}

	@Override
	public Issue createIssue(String su, String id) {
		// TODO Auto-generated method stub
		if (su.equals(null)) {
			throw new NullPointerException();
		}
		if (id.equals(null)) {
			throw new NullPointerException();
		}
		if (su.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if (id.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
	/*	for(Issue sarasas:issues) {
			if (sarasas.getSummary().equals(su)&& project.getId().equals(id)) {
			return sarasas;	
			}issues.add(sarasas);
		}*/
		Issue is = new Issue(getProjectById(id),su);
		getProjectById(id).addIssue(is);
		/*issues.add(is);*/
		return is ;
		
	}

	@Override
	public Project createProject(String i, String s) {
		// TODO Auto-generated method stub
		if (i.equals(null)) {
			throw new NullPointerException();
			
		}
		if (s.equals(null)) {
			throw new NullPointerException();
			
		}
		if (i.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if (s.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		/*for (Project pp: projects) {
			if (pp.getId().equals(i)&&pp.getSummary().equals(s)) {
				return pp;
			}
		
		}*/
		Project p = new Project (i,s);
		projects.add(p);
		return p;
	}

	@Override
	public Collection<Issue> getIssues(Project p) {
		// sarasas
		List <Issue> newissue= new ArrayList();
		
		if (p.equals(null)) {
			throw new NullPointerException();
			
		}
		if(p.getIssues().isEmpty()){
			throw new IllegalArgumentException();
		}
		if (p.getIssues().equals(null)) {
			throw new NullPointerException();
			
		}
		/*
	
		for (Issue naujas:issues) {
			if (naujas.getProject().equals(p)) {
				newissue.add(naujas);
			}
		}
		return newissue;*/
		return project.getIssues();
	}

	@Override
	public Collection<Issue> getIssues(String pI) {
		// TODO Auto-generated method stub
		
		List <Issue> naujasissue = new ArrayList();
		
		if (pI.equals(null)) {
			throw new NullPointerException();
		}
		else if (pI.isEmpty()){
			throw new IllegalArgumentException();
			
		} {
		
		/*for (Issue naujas:issues) {
			if (naujas.getProject().getId().equals(pI)) {
				naujasissue.add(naujas);
			}
		}
		return naujasissue;*/
		return getProjectById(pI).getIssues();
	}
	}
	@Override
	public Project getProjectById(String id) {
		// TODO Auto-generated method stub
		
		if (id.equals(null)) {
			throw new NullPointerException();
		}
		if (id.isEmpty()) {
			throw new IllegalArgumentException();
			
		}
		
		
		for (Project pnaujas: projects) {
			if (pnaujas.getId().equals(id)) {
				return pnaujas;
				
			}
		}
		
		return null;
	}

	@Override
	public Collection<Project> getProjects() {
		// TODO Auto-generated method stub
		return this.projects;
	}

}
