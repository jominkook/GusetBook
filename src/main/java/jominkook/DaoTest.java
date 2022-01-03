package jominkook;

public class DaoTest {

	public static void main(String[] args) {
		GuestBookDao dao = new GuestBookDaoImpl();
		//List<GuestBookVo> list = dao.getlist();
		GuestBookVo vo = new GuestBookVo();
		
		vo.setNo(1);
		vo.setPassword("1234");
		if(dao.delete(vo)) {
			
			System.out.println("데이터삭제 성공");
		}
		else {
			System.out.println("실패");
		}
	}

}
