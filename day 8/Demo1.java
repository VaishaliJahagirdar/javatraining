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
}

 class PrimitiveNonprimitive{
public static void main(String args[]){
Address ad=new Address();
ad.setHouse_num(100);
ad.setArea_name("abc");
ad.setCity("Aurangabad");
//creat student class obj
Student st=new Student();
st.setId(101);
st.setName("xyz");  //non primitive data
st.setAdr(ad); // [rimitive data
int id1;
id1=st.getId();
String n;
n=set.getName;
Address ad1;
ad1=st.getadr();
// read address obj values
int hn;
hn=ad1.getHouse_num();
String area;
area=ad1.get;

}
}