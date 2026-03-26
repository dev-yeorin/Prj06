package ex01;

class Score {
/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

//입력:번호,이름,국어,영어,수학
//	  num, name, kor, eng, mat
//출력:번호 이름 국어 영어 수학 총점 평균
//	  num, name, kor, eng, mat, tot, avg, grade

// Field
// 입력  num, name, kor, eng, mat
	int num;
	String name;
	int kor;
	int eng;
	int mat;

// 출력
	int tot;
	double avg;
	char grade;

// Constructor
// sts 에서 우클릭 -> source -> Generate Constructor using Field
// 단축키 : alt + shift + s
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;


	
// 계산
	getTot();
	getAverage();
	getGrade();
	} // score end
	
	private void getTot() {
		this.tot = this.kor + this.eng + this.mat;
	} // tot end
	private void getAverage() {
		this.avg = (this.kor + this.eng + this.mat) / 3.0;
		
	} // avg end
	private void getGrade() {
		// ctrl + shift + P : 대응하는 중괄호를 찾음
		int v =(int) this.avg / 10;
		switch(v) {
		case 10 : this.grade = 'A'; break;
		case 9 : this.grade = 'A'; break;
		case 8 : this.grade = 'B'; break;
		case 7 : this.grade = 'C'; break;
		case 6 : this.grade = 'D'; break;
		default : this.grade = 'F'; break;
		}
		/* if 방식
		if (this.avg >= 90) {
			this.grade = 'A';			
		} else if (this.avg >= 80) {
			this.grade = 'B';			
		} else if (this.avg >= 70) {
			this.grade = 'C';						
		} else if (this.avg >= 60) {
			this.grade = 'D';
		} else if (this.avg < 60) {
			this.grade = 'F';
			
	} if end
	*/
	} // class end
	
	



// Method
	void disp() {
		String title = "번호 이름 국어 영어 수학 총점 평균 등급";
		String fmt   = "%d  %s  %d  %d  %d  %d  %.2f %c\n";
		System.out.println(title);
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
	}


}
public class TestScore {

	public static void main(String[] args) {
		
		Score sc1 = new Score(1,"사나",70,80,90); //  The constructor Score() is undefined
		// 기본 생성자가 없고 다른 생성자만 존재할 때 new Score(); 에러 
		sc1.disp();
		
		Score sc2 = new Score(2,"모모",0,70,100);
		sc2.disp();
		
		Score sc3 = new Score(3,"쯔위",70,90,90);
		sc3.disp();
		
		Score sc4 = new Score(4,"정연",80,90,70);
		sc4.disp();
		
		Score sc5 = new Score(5,"원영",90,90,89);
		sc5.disp();
		
		Score sc6 = new Score(6,"유진",100,100,100);
		sc6.disp();

	}

}
