class Car{
     color;
     model;
     
     constructor(color,model){
         this.color=color;
         this.model=model;

     }
     running(){
         document.write("<br>car is runnit ..");
     }

}

maruti=new Car();
maruti.running();

bmw=new Car();
bmw.running();

skoda=new Car("white","rapid");

document.write(skoda);
console.log(skoda);
