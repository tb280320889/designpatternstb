/**
 * Created by TangBin on 14-9-7.
 */
public abstract class Person {
	private Clothing clothing;
	private String sex;
	public Clothing getClothing(){
		return clothing;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	public abstract void dress();
}
