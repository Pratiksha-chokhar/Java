package StringAssign;

public class CompareClass implements Comparable<CompareClass>{
	
	private String name;
	
	public CompareClass (String name)
	{
	this.name=name;
}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CompareClass name=" + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(CompareClass o) {
		if(this.getName().length()> o.getName().length())
			 return 1;
			else if(this.getName().length()<o.getName().length())
				return -1;
			else 
				return 0;
	}
}


	

		