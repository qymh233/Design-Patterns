package example;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Floder floder=new Floder("C");
		
		Floder floderindex=new Floder("index");		
		File floderfile=new File("file.txt");
		
		floder.add(floderindex);
		floder.add(floderfile);
		
		Floder floderindex2=new Floder("index2");
		File floderfile2=new File("file2.txt");
		
		floderindex.add(floderindex2);
		floderindex.add(floderfile2);
		
		Floder floderindex3=new Floder("index3");
		File floderfile3=new File("file3.txt");
		
		floderindex2.add(floderindex3);
		floderindex2.add(floderfile3);
		
		displaytree(floder,0);
	}

	public static void displaytree(IFile floder,int deep) {
		for(int i=0;i<deep;i++) {
			System.out.print("--");
		}
		floder.display();
		//获得子树
		List<IFile> children=floder.getChild();
		//遍历子树
		for(IFile file:children) {
			if(file instanceof File) {
				for(int i=0;i<=deep;i++) {
					System.out.print("--");
				}
				file.display();
				
			}else {
				displaytree(file,deep+1);
			}
		}
	}
}
