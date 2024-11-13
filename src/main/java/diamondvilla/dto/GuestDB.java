package diamondvilla.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GuestDB {
@Column(nullable = false)
private String gname;
@Id
private String gemail;
@Column(unique = true, nullable = false)
private String gaadhar;
@Column(unique = true, nullable = false)
private long Mobile;
private String loc;
private int floor;
private String flat;
private double rent;
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getGemail() {
	return gemail;
}
public void setGemail(String gemail) {
	this.gemail = gemail;
}
public String getGaadhar() {
	return gaadhar;
}
public void setGaadhar(String gaadhar) {
	this.gaadhar = gaadhar;
}
public long getMobile() {
	return Mobile;
}
public void setMobile(long mobile) {
	Mobile = mobile;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public int getFloor() {
	return floor;
}
public void setFloor(int floor) {
	this.floor = floor;
}
public String getFlat() {
	return flat;
}
public void setFlat(String flat) {
	this.flat = flat;
}
public double getRent() {
	return rent;
}
public void setRent(double rent) {
	this.rent = rent;
}
@Override
public String toString() {
	return "GuestDB [gname=" + gname + ", gemail=" + gemail + ", gaadhar=" + gaadhar + ", Mobile=" + Mobile + ", loc="
			+ loc + ", floor=" + floor + ", flat=" + flat + ", rent=" + rent + "]";
}
}
