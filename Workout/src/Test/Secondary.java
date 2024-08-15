package Test;

public class Secondary {
private  String cell;
public String getCell() {
	return cell;
}

public void setCell(String cell) {
	this.cell = cell;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

private String location;

 public Secondary(String cell,String location) {
	this.cell=cell;
	this.location=location;

}
 public String toString() {
	 return "mobile" +" "+cell+" "+"loc"+" "+location;
 }
}
