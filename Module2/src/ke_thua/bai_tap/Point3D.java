package ke_thua.bai_tap;

public class Point3D extends Point2D {
    protected float z=0.0f;
    public Point3D(){

    }
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = this.x;
        XYZ[1]= this.y;
        XYZ[2]= this.z;
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
