package Java111Q1;
class Data{
    private String name;
    private Test score;

    class Test{
        int english;
        int math;

        Test(int eng, int m){
            english = eng;
            math = m;
        }

        public double avg(){
            return (english + math) / 2.0;
        }
    }

    public Data(String na, int eng, int ma){
        name = na;
        score = new Test(eng, ma);
    }

    public void show(){
        System.out.printf("name:%s english=%d math=%d avg=%.1f\n", name ,score.english, score.math, score.avg());
    }
}
public class Class02 {
    public static void main(String[] args) {
        Data s[] = new Data[2];
        s[0] = new Data("Annie", 85, 92);
        s[0].show();
        s[1] = new Data("Brian", 77, 56);
        s[1].show();
    }
}
