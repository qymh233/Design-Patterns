package example;

import java.util.ArrayList;
import java.util.List;

public class Floder implements IFile {

	private String name;
	private List<IFile> children;
	
	public Floder(String name) {
	
		this.name=name;
		children=new ArrayList<IFile>();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public boolean add(IFile file) {
		// TODO Auto-generated method stub
		return children.add(file);
	}

	@Override
	public boolean remove(IFile file) {
		// TODO Auto-generated method stub
		return children.remove(file);
	}

	@Override
	public List<IFile> getChild() {
		// TODO Auto-generated method stub
		return children;
	}

}
