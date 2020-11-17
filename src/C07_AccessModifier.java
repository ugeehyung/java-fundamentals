import myobj.C07_diffPackage;

public class C07_AccessModifier extends C07_diffPackage {

	//※포함 관계 = include
	//상속을 통해 해당 클래스를 포함하는 것
	//아주 높은 결합도를 지닌다
	
	//※의존 관계 = dependency
	//하나의 클래스가 다른 클래스를 사용하는 것
	
	//※접근제어자 = access modifier
	//다른 클래스가 해당 클래스를 사용(포함,의존) 하려고 할 때 
	//해당 객체와의 거리에 따른 허용 여부를 설정한다.
	
	//※구분할 수 없는 거리의 종류
	//같은 클래스 내부의 다른 자원(가장 가까운 거리)
	//같은 패키지 내부의 다른 자원
	//다른 패키지에 있지만 상속받은 자원
	//다른 패키지의 자원 (가장 먼 거리)
	
	//※접근제어자의 종류
	// - private			: 같은 클래스 내부에서만 사용할 수 있는 자원이 된다.
	// - default (아무것도 안씀): 다른 패키지에서는 사용할 수 없는 자원이 된다. 
	//					      (같은 패키지 내부세어만 사용할 수 있다.)
	// - protected			: 다른 패키지에서는 상속을 받으면 쓸 수 있는 자원이 된다.
	//						  (같은 패키지에서는 자유롭게 사용이 가능하다)
	// - public				: 가장 먼거리에서도 자유롭게 쓸 수 있는 자원이 된다.
	//						  (같은 패키지에서도 자유롭게 사용이 가능하다)
	
	public static void main(String[] args) {
		
		//같은 패키지 내부의 자원은 private 제외 모두 보임
		
		System.out.println(C07_samePackage.package_sInt);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);
				
		C07_samePackage same_package_instance = new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_int);
		System.out.println(same_package_instance.public_int);

		//다른 패키지 자원은 상속을 받으면 protected 까지 보인다
		System.out.println(C07_diffPackage.protected_sInt);
		System.out.println(C07_diffPackage.public_sInt);
		
		C07_diffPackage diff_package_instance = new C07_diffPackage();
		
		System.out.println(diff_package_instance.public_int);
		//System.out.println(diff_package_instance.protected_int); => 불가능
		System.out.println(new C07_AccessModifier().protected_int);
		
		C07_AccessModifier child = new C07_AccessModifier();
		System.out.println(child.protected_int);
		System.out.println(child.public_int);
		
	}
}
