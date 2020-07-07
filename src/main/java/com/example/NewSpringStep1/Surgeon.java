package com.example.NewSpringStep1;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import org.hibernate.annotations.Entity;
//import org.springframework.data.annotation.Id;




@Entity
public class Surgeon {
	
	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String dayOfSurgery;
	private String morningSession;
	private String afternoonSession;
	private String fullDay;
	private String equipmentCode;
	private String surgeryType;
	private String aneasthetist;
	private String todaysDate;
	private String teamMember1;
	private String teamMember2;
	private String teamMember3;
	private String teamMember4;
	private String teamMember5;
	private String teamMember6;
	private String theatreNumber;
	
	private Surgeon () {}
	
	public Surgeon(String firstName,String lastName,String dayOfSurgery,String morningSession,String afternoonSession,
	String fullDay,String equipmentCode,String surgeryType,String aneasthetist,String todaysDate,String teamMember1,
	String teamMember2,String teamMember3, String teamMember4,String teamMember5,String teamMember6,String theatreNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfSurgery = dayOfSurgery;
		this.morningSession = morningSession;
		this.afternoonSession = afternoonSession;
		this.fullDay = fullDay;
		this.equipmentCode = equipmentCode;
		this.surgeryType = surgeryType;
		this.aneasthetist = aneasthetist;
		this.todaysDate = todaysDate;
		this.teamMember1 = teamMember1;
		this.teamMember2 = teamMember2;
		this.teamMember3 = teamMember3;
		this.teamMember4 = teamMember4;
		this.teamMember5 = teamMember5;
		this.teamMember6 = teamMember6;
		this.theatreNumber = theatreNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Surgeon surgeon = (Surgeon) o;
		return Objects.equals(id, surgeon.id) &&
			Objects.equals(firstName, surgeon.firstName) &&
			Objects.equals(lastName, surgeon.lastName) &&
			Objects.equals(dayOfSurgery, surgeon.dayOfSurgery)&&
			Objects.equals(morningSession, surgeon.morningSession)&&
			Objects.equals(afternoonSession, surgeon.afternoonSession)&&
			Objects.equals(fullDay, surgeon.fullDay)&&
			Objects.equals(equipmentCode, surgeon.equipmentCode)&&
			Objects.equals(surgeryType, surgeon.surgeryType)&&
			Objects.equals(aneasthetist, surgeon.aneasthetist)&&
			Objects.equals(todaysDate , surgeon.todaysDate )&&
			Objects.equals(teamMember1, surgeon.teamMember1)&&
			Objects.equals(teamMember2, surgeon.teamMember2)&&
			Objects.equals(teamMember3, surgeon.teamMember3)&&
			Objects.equals(teamMember4, surgeon.teamMember4)&&
			Objects.equals(teamMember5, surgeon.teamMember5)&&
			Objects.equals(teamMember6, surgeon.teamMember6)&&
			Objects.equals(theatreNumber, surgeon.theatreNumber);
			
	}
	
	@Override
	public int hashCode() {

		return Objects.hash(id,firstName,lastName,dayOfSurgery,morningSession,afternoonSession,fullDay,equipmentCode,surgeryType,aneasthetist,todaysDate,teamMember1,teamMember2,teamMember3,teamMember4,teamMember5,teamMember6,theatreNumber);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		System.out.println("The firstname is:= "+firstName);
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDayOfSurgery() {
		return dayOfSurgery;
	}
	
	public void setDayOfSurgery(String dayOfSurgery) {
		this.dayOfSurgery = dayOfSurgery;
	}
	
	public String getMorningSession() {
		return morningSession;
	}
	
	public void setMorningSession(String morningSession) {
		this.morningSession = morningSession;
	}
	
	public String getAfternoonSession() {
		return afternoonSession;
	}
	
	public void setAfternoonSession(String afternoonSession) {
		this.afternoonSession = afternoonSession;
	}
	
	public String getFullDay() {
		return fullDay;
	}
	
	public void setFullDay(String fullDay) {
		this.fullDay = fullDay;
	}
	
	public String getEquipmentCode() {
		return equipmentCode;
	}
	
	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}
	
	public String getAneasthetist() {
		return aneasthetist;
	}
	
	public void setAneasthetist(String aneasthetist) {
		this.aneasthetist = aneasthetist;
	}
	
	public String getTodaysDate() {
		return todaysDate;
	}
	
	public void setTodaysDate(String todaysDate) {
		this.todaysDate = todaysDate;
	}
	
	public String getTeamMember1() {
		return teamMember1;
	}
	
	public void setTeamMember1(String teamMember1) {
		this.teamMember1 = teamMember1;
	}
	
	public String getTeamMember2() {
		return teamMember2;
	}
	
	public void setTeamMember2(String teamMember2) {
		this.teamMember2 = teamMember2;
	}
	
	public String getTeamMember3() {
		return teamMember3;
	}
	
	public void setTeamMember3(String teamMember3) {
		this.teamMember3 = teamMember3;
	}
	
	public String getTeamMember4() {
		return teamMember4;
	}
	
	public void setTeamMember4(String teamMember4) {
		this.teamMember4 = teamMember4;
	}
	
	public String getTeamMember5() {
		return teamMember5;
	}
	
	public void setTeamMember5(String teamMember5) {
		this.teamMember5 = teamMember5;
	}
	
	public String getTeamMember6() {
		return teamMember6;
	}
	
	public void setTeamMember6(String teamMember6) {
		this.teamMember6 = teamMember6;
	}
	
	public String getTheatreNumber() {
		return theatreNumber;
	}
	
	public void setTheatreNumber(String theatreNumber) {
		this.theatreNumber = theatreNumber;
		 System.out.println("Object Classs at least Called");
	}
	
	@Override
	public String toString() {
		 System.out.println("Object Classs at least Called");
		return "Surgeon{" +
			"id=" + id +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", dayOfSurgery='" + dayOfSurgery + '\'' +
			", morningSession='" + morningSession + '\'' +
			", afternoonSession='" + afternoonSession + '\'' +
			", fullDay='" + fullDay + '\'' +
			", equipmentCode='" + equipmentCode + '\'' +
			", surgeryType='" + surgeryType + '\'' +
			", aneasthetist='" + aneasthetist + '\'' +
			", todaysDate='" + todaysDate + '\'' +
			", teamMember1='" + teamMember1 + '\'' +
			", teamMember2='" + teamMember2 + '\'' +
			", teamMember3='" + teamMember3 + '\'' +
			", teamMember4='" + teamMember4 + '\'' +
			", teamMember5='" + teamMember5 + '\'' +
			", teamMember6='" + teamMember6 + '\'' +
			", theatreNumber='" + theatreNumber + '\'' +
			'}';
	}
	
     
}
