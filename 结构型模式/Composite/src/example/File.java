package example;

import java.util.List;

public class File implements IFile {

	private String name;
	
	public File(String name) {
	
		this.name=name;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public boolean add(IFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(IFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<IFile> getChild() {
		// TODO Auto-generated method stub
		return null;
	}

}
