import java.util.ArrayList;

public class Query {
	private ArrayList<Account> list;

	Query() {
		Login l = new Login(new ATMServer().getDatabase().getList());
		list = l.getList();
	}

	// ��ѯ���޴��˻�
	public Account query(String number) {

		for (Account a : list) {
			if (a.getID().equals(number)) {
				// System.out.println("�˿�����");
				return a;
			}
		}
		System.out.println("�˿��޷���ȡ");
		return null;
	}

}