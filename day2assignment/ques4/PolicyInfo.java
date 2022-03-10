package day2assignment.ques4;

public class PolicyInfo implements CustomerExtend {
    String name;
    int id;
    int contact;
    public PolicyInfo(String name,int id,int contact) {
    	this.name=name;
    	this.id=id;
    	this.contact=contact;
    }
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public int getContact() {
		return this.contact;
	}
	

}
