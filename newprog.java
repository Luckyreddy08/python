class Show3{

String name;
int age;


static void first(){
System.out.println(this.name);
System.out.println(this.age);

}
}


class Show4{

static void prog(){
System.out.println("Sup");
}
}

class hello{

public static void main(String [ ] args){

Show3 k =new Show3();
k.name="amaan";
k.age=18;
Show3.first();
Show4 k1=new Show4();
Show4.prog();
}
}





