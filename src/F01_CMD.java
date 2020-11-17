
public class F01_CMD {

	//sqlplus
	// = 커맨드 창에서 설치된 Oracle DB를 실행하는 명령어
	
	//sys as sysdba
	//관리자 계정이다.
	//비밀번호는 입력해도 보이지는 않지만 입력되고 있다.
	
	//alter session set container=XEPDB1;
	// = 최근 오라클 DB버전에 생긴 개념인 컨테이너를 변경하는 명령어 컨테이너마다 보유하고 있는 계정이 다르다.
	
	//alter user hr account unlock;
	// = 계정 잠금 해제 명령어
	// = 처음 설치하면 존재하면 연습용 계정인 hr의 잠금을 해제한다.
	
	//alter user hr identified by 1234;
	// = hr 계정의 비밀번호를 1234로 변경한다.
	
	
}
