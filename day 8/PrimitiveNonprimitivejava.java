// HAS A RELATIONSHIP:
//
//
//
class Address{
int house_num;
String area_name;
String city;
void setHouse_num(int house_num){
this.house_num=house_num;
}
int getHouse_num(){
return house_num;
}
void setArea_name(String area_name){
this.area_name=area_name;
}
String getArea_name(){
return area_name;
}
void setCity(String city){
this.city=city;
}
String getCity(){
return city;
}



}



class Student{
int id;
String name;
Address adr;

void setId(int id){
this.id=id;
}
void setAdr(Address adr){
this.adr=adr;
}
int getId(){
return id;
}
Address  getAdr(){
return adr;
}
void setName(String name){
this.name=name;
}
String getName(){
return name;
}

}

 class PrimitiveNonprimitive{
public static void main(String args[]){
Address ad=new Address();
ad.setHouse_num(19);
ad.setArea_name("navjeevan colony,Hadco");
ad.setCity("Aurangabad");
//creat student class obj
Student st=new Student();
st.setId(1819000926);
st.setName("Pooja Patil");  //non primitive data
st.setAdr(ad); //primitive data
int id1;
id1=st.getId();
String n;
n=st.getName();
Address ad1;
ad1=st.getAdr();
// read address obj values
int hn;
hn=ad1.getHouse_num();
String area;
area=ad1.getArea_name();
String city=ad1.getCity();
System.out.println(" name of student "+n);
System.out.println(" Id of student "+id1);
System.out.println(" city of student  "+city);
System.out.println(" address  of student  "+area);
System.out.println(" House number  of student  "+hn);
}
}