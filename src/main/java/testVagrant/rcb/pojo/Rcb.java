package testVagrant.rcb.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Rcb {
	private String name;
	private String location;
	private List<Player> player = null;
}
