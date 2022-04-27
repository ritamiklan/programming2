package hashmap;

import java.time.LocalDate;

public class Friend {

	private String nickname;
	private String name;
	private LocalDate birthdate;
	
	public Friend(String nickname, String name, LocalDate localDate) {
		
		this.nickname = nickname;
		this.name = name;
		this.birthdate = localDate;
		
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirhtdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return nickname + ": " + name + ", born " +
	birthdate.getDayOfMonth() + "." + birthdate.getMonthValue() + "." + birthdate.getYear();
	}
	
}
