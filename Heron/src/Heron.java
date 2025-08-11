public class Heron {


    double a;
    double b;
    double c;

    Heron(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    double yariCevre(){

        double s=((a+b+c)/2);
        return s;

    }

    double Alan(){

        double s= yariCevre();
        double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return A;

    }

    double yariCap(){

        double A= Alan();
        double R= (a*b*c)/4*A;
        return R;

    }


    void yazdir(){

        double s=yariCevre();
        double A= Alan();

        System.out.println("Girdiginiz s degeri "+s);
        System.out.println("Girdiginiz A degeri "+A);

    }
}
