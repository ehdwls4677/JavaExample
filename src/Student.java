public class Student {
        int StudentID;
        String StudentName;
        int Grade ;
        String StudentAdress;

        public void showStudentInfo() {
            System.out.println(" 학년은 " + Grade +"학년" + " 학번은 " + StudentID +"이고" + " 이름은 " + StudentName + "이며" + " 주소는 " + StudentAdress + " 입니다. ");

    }
    public static void main(String[] args) {
            Student studentYun = new Student();
            studentYun.Grade = 1;
            studentYun.StudentID = 0;
            studentYun.StudentName = "윤동진";
            studentYun.StudentAdress = "경기도 시흥시 정왕동";
            studentYun.showStudentInfo();

    }
}
