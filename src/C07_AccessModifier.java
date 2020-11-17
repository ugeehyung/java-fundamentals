import myobj.C07_diffPackage;

public class C07_AccessModifier extends C07_diffPackage {

	//������ ���� = include
	//����� ���� �ش� Ŭ������ �����ϴ� ��
	//���� ���� ���յ��� ���Ѵ�
	
	//������ ���� = dependency
	//�ϳ��� Ŭ������ �ٸ� Ŭ������ ����ϴ� ��
	
	//������������ = access modifier
	//�ٸ� Ŭ������ �ش� Ŭ������ ���(����,����) �Ϸ��� �� �� 
	//�ش� ��ü���� �Ÿ��� ���� ��� ���θ� �����Ѵ�.
	
	//�ر����� �� ���� �Ÿ��� ����
	//���� Ŭ���� ������ �ٸ� �ڿ�(���� ����� �Ÿ�)
	//���� ��Ű�� ������ �ٸ� �ڿ�
	//�ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	//�ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
	
	//�������������� ����
	// - private			: ���� Ŭ���� ���ο����� ����� �� �ִ� �ڿ��� �ȴ�.
	// - default (�ƹ��͵� �Ⱦ�): �ٸ� ��Ű�������� ����� �� ���� �ڿ��� �ȴ�. 
	//					      (���� ��Ű�� ���μ�� ����� �� �ִ�.)
	// - protected			: �ٸ� ��Ű�������� ����� ������ �� �� �ִ� �ڿ��� �ȴ�.
	//						  (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	// - public				: ���� �հŸ������� �����Ӱ� �� �� �ִ� �ڿ��� �ȴ�.
	//						  (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	
	public static void main(String[] args) {
		
		//���� ��Ű�� ������ �ڿ��� private ���� ��� ����
		
		System.out.println(C07_samePackage.package_sInt);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);
				
		C07_samePackage same_package_instance = new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_int);
		System.out.println(same_package_instance.public_int);

		//�ٸ� ��Ű�� �ڿ��� ����� ������ protected ���� ���δ�
		System.out.println(C07_diffPackage.protected_sInt);
		System.out.println(C07_diffPackage.public_sInt);
		
		C07_diffPackage diff_package_instance = new C07_diffPackage();
		
		System.out.println(diff_package_instance.public_int);
		//System.out.println(diff_package_instance.protected_int); => �Ұ���
		System.out.println(new C07_AccessModifier().protected_int);
		
		C07_AccessModifier child = new C07_AccessModifier();
		System.out.println(child.protected_int);
		System.out.println(child.public_int);
		
	}
}
