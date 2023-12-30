package org.ENSAJ.entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Groupe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String year;
	
	@ManyToOne
	private Professor professor;
	
	@ManyToMany (mappedBy = "groups", fetch = FetchType.EAGER)
	private List<PW> pws;
	
	@ManyToMany (mappedBy = "groupes", fetch = FetchType.EAGER)
	private List<Student> students;
	

}
