package ex05;
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
//출력:번호 이름 국어 영어 수학 총점 평균 등급
// 모든 Field는 private
// 생성자, Getter/Setter, toString() 만들어서 작업

class Score {
	// num, name, kor, eng, mat(필드 생성)
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//Constructor
	public Score() {
		
	}
	
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// getter / setter
    public int getNum() { 
    	return num; }
    public void setNum(int num) { 
    	this.num = num; }

    public String getName() { 
    	return name; }
    public void setName(String name) { 
    	this.name = name; }

    public int getKor() { 
    	return kor; }
    public void setKor(int kor) { 
    	this.kor = kor; }

    public int getEng() {
    	return eng; }
    public void setEng(int eng) { 
    	this.eng = eng; }

    public int getMat() { 
    	return mat; }
    public void setMat(int mat) { 
    	this.mat = mat; }

    public int getTot() {
        return getKor() + getEng() + getMat(); 
    }

    public double getAvg() {
        return getTot() / 3.0;
    }

    public String getGrade() {
        double avg = getAvg();

        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return getNum() + " " + getName() + " " + getKor() + " " + getEng() + " " + getMat()
                + " " + getTot()
                + " " + String.format("%.2f", getAvg())
                + " " + getGrade();
    }
	
}//class end 
public class TestScore {

	public static void main(String[] args) {
		Score[] arr = {
				new Score(1,"사나",70,80,90),
				new Score(2,"모모",0,70,100),
				new Score(3,"쯔위",70,90,90),
				new Score(4,"정연",80,90,70),
				new Score(5,"원영",90,90,89),
				new Score(6,"유진",100,100,100)
				};
				
			 // 출력
	        System.out.println("번호 이름 국어 영어 수학 총점 평균");

	        for (Score s : arr) {
	            System.out.println(s);
		
		
	        }
	}


}
