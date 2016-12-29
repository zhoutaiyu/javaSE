import java.util.Scanner;

public class ATM {
	private Account CurrentAccount = null;
	Scanner input = new Scanner(System.in);
	private String choice="Y";
	private Login l;

	// �����û���Ϣ
	public ATM() {}
	
	public boolean login(){
		l=new Login();
		CurrentAccount=l.enter();
		if(CurrentAccount!=null)
			return true;
		else
			return false;
	}

	public void meue() {
        System.out.println("");
		while (choice.equals("Y")) {
			System.out.println("***1.��ѯ������Ϣ   ***");
			System.out.println("***2.   ���          ***");
			System.out.println("***3.   ȡ��          ***");
			System.out.println("***4.  �޸�����     ***");
			System.out.println("***5.   ת��          ***");
			System.out.println("***6.   �˳�          ***");
			System.out.println("������������в������");
			switch (input.nextInt()) {
			//��ѯ������Ϣ
			case 1:
				System.out.println(CurrentAccount.toString());
				break;
			//���
			case 2:
				System.out.println("�������Ҫ��������");
				new Deposit(this.CurrentAccount).deposit(input.nextDouble());
				break;
			//ȡ��
			case 3:
				System.out.println("����������ȡ���Ľ��");
				new WithDraw(this.CurrentAccount).withDraw(input.nextDouble());
				break;
			// �����޸�
			case 4:
				System.out.println("���������������");
				new ModPassword(this.CurrentAccount).modify(input.next());
				break;
			//ת��
			case 5:
                System.out.println("�����뱻ת���û��˺�");
                String s=input.next();
                Account a;
                if((a=new Query().query(s))!=null){
                System.out.println("��������");
                double x=input.nextDouble();
                new AtoB(this.CurrentAccount).aTOb(x,a);
                System.out.println(this.CurrentAccount);
                System.out.println(a);
                }
				break;
			case 6:
				input.close();
				System.out.println("��ӭ����ʹ�ã��ټ�");
				System.exit(0);
			}
			System.out.println("�Ƿ�������й��ܲ�����");
			System.out.println("�ǵĻ��밴Y,if not,�˳��밴������");
			System.out.println("����С����һֱ�����");
			if(input.next().equals("Y")==false){
				choice=" ";
				System.exit(0);
			}
			
		}
	}

}