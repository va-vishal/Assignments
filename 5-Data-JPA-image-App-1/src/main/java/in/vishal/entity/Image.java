package in.vishal.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Image {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String description;
	@Lob
	private byte[] image;
	
	public Image()
	{
		
	}
	public Image(Long id, String name, String description, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", description=" + description + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
	
}
