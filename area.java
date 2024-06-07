class area{

//fields to calculate area
private int length;
private int breadht;

//constructor to initialize values 

area (int len, int breadht)
{
    this.length = len;
    this.breadht = breadht;
}

//method to calculate area
public void getarea(){

    int area=length*breadht;
    system.out.println("area: " + area);

}
}




