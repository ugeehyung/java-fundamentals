package myobj.machine;

public interface Electronics {

	// ���� ��� �������̽�
	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�.
	// 2. ��� ���ڱ��� ������ �ִ� ������ �ֿܼ� ����Ѵ�.
	// 3. ��� ���ڱ��� �ֿܼ� �ѹ� ����� ������ �� �ʸ��� ���� �Һ񷮸�ŭ�� ������ �Һ��Ѵ�.

	// �� ���߿� ������ �� �� �ʿ��� �޼������ �����Ѵ�.

	void setConnect(Generator src);
	String execute(); 
	Generator getConnectedGenerator();

}	
