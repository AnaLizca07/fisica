public class Cálculos {
    public int q1,q2,q3,q4,qp;
    public double distancia,f1x,f1y,f2x,f2y,f3x,f3y,f4x,f4y,f1,f2,f3,f4,frx,fry;
    public void fuerzas(){
        f1=Math.abs((9e9*qp*q1)/(Math.pow(distancia,2)));
        f2=Math.abs((9e9*qp*q2)/(Math.pow(distancia,2)));
        f3=Math.abs(((9e9*qp*q3))/(Math.pow(distancia,2)));
        f4=Math.abs(((9.00e9)*(qp*q4))/(Math.pow(distancia,2)));
    }
    public void respectQ1(){
        f4x = -(f4*Math.cos(45));
        f4y = f4*Math.sin(45);
        f3x = 0;
        f3y = f3;
        f2x = -f2;
        f2y = 0;
        frx = f4x+f3x+f2x;
        fry = f4y+f3y+f2y;
    }
    public void respectQ2(){
     f1x = f1;
     f1y = 0;
     f3x = f3+Math.cos(45);
     f3y = f3*Math.sin(45);
     f4x = 0;
     f4y = f4;
     frx = f1x+f3x+f4x;
     fry = f1y+f3y+f4y;
    }
    public void respectQ3(){
        f1x = 0;
        f1y = f1;
        f2x = f2*Math.cos(45);
        f2y = f2*Math.sin(45);
        f4x = f4;
        f4y = 0;
        frx = f1x-f2x-f4x;
        fry = -f1y-f2y+f4y;
    }
    public void respectQ4(){
        f1x = f1*Math.sin(45);
        f1y = f1*Math.cos(45);
        f2x = 0;
        f2y = f2;
        f3x = f3;
        f3y = 0;
        frx = f1x+f2x+f3x;
        fry = -f1y-f2y+f3y;
    }
}
