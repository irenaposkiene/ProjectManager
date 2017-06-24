package projektas;

import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

public class Mytest extends BaseTest{

	@Override
	protected ProjectManager createProjectTracker() {
		// TODO Auto-generated method stub
		
		return new MyProjectManager();
	}

}
