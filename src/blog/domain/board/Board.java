package blog.domain.board;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

	
	private int id;
	private int userid;
	private String title;
	private String content;
	private int readCount;
	private Timestamp createDate;
}
