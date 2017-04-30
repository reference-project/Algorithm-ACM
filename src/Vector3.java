//三维向量及其运算
public class Vector3 {
    double x;
    double y;
    double z;
    Vector3(){}
    Vector3(double x,double y,Double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    //复制
    void clone(Vector3 b){
        x=b.x;
        y=b.y;
        z=b.z;
    }
    //长度
    double length(){return Math.sqrt(x*x+y*y+z*z);}
    //加
    Vector3 add(Vector3 b){
        return new Vector3(x+b.x,y+b.y,z+b.z);
    }
    //减
    Vector3 sub(Vector3 b){
        return new Vector3(x-b.x,y-b.y,z-b.z);
    }
    //数乘
    Vector3 numberMul(double n){return new Vector3(x*n,y*n,z*n);}
    //点乘
    double dotMul(Vector3 b){return x*b.x+y*b.y+z*b.z;}
    //叉乘
    Vector3 crossMul(Vector3 b){
        return new Vector3(y*b.z-z*b.y,x*b.z-z*b.x,x*b.y-y*b.x);
    }
    //是否垂直
    boolean isVertical(Vector3 b){
        if(this.dotMul(b)==0)
            return true;
        return false;
    }
    //是否相等
    boolean equal(Vector3 b){
        if(x==b.x&&y==b.y&&z==b.z)return true;
        else return false;
    }
    //两向量间的夹角
    double angle(Vector3 b){
        return Math.acos(this.dotMul(b)/(this.length()*b.length()));
    }
}
