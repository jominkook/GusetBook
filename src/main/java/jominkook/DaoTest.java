package jominkook;

public class DaoTest {

	public static void main(String[] args) {
		GuestBookDao dao = new GuestBookDaoImpl();
		//List<GuestBookVo> list = dao.getlist();
		GuestBookVo vo = new GuestBookVo();
		
		vo.setNo(1);
		vo.setPassword("1234");
		if(dao.delete(vo)) {
			
			System.out.println("�����ͻ��� ����");
		}
		else {
			System.out.println("����");
		}
	}

}
