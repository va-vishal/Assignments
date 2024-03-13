package in.vishal.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Paint")
public class PaintEntity {
	
	@Id
	@GenericGenerator(name = "paint_id_gen",strategy ="in.vishal.generators.PaintIdGenerator")
	@GeneratedValue(generator = "paint_id_gen")
	private String id;
	private String name;
	private Integer qun;
	private Date manDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQun() {
		return qun;
	}
	public void setQun(Integer qun) {
		this.qun = qun;
	}
	public Date getManDate() {
		return manDate;
	}
	public void setManDate(Date manDate) {
		this.manDate = manDate;
	}
	
	

}
