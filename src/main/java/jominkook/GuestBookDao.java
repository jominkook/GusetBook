package jominkook;

import java.util.List;

public interface GuestBookDao {
	public boolean insert(GuestBookVo vo);
	public List<GuestBookVo> getlist();
	public boolean delete(GuestBookVo vo);
	
}
