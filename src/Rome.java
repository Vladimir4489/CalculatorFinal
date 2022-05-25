import java.lang.management.ThreadInfo;

public enum Rome {
    I(1,"I"),II(2,"II"),III(3,"III"),IV(4,"IV"),V(5,"V"),VI(6,"VI"),VII(7,"VII"),VIII(8,"VIII"),IX(9,"IX"),X(10,"X"),XX(20,"XX"),XXX(30,"XXX"),XL(40,"XL"),L(50,"L"),LX(60,"LX"),LXX(70,"LXX"),LXXX(80,"LXXX"),XC(90,"XC"),C(100,"C") ;
    private int index; // Создаем целочисленную переменную index
    private  String name;
    Rome(int index, String name){ // Создаем конструктор
        this.index = index;
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public int getIndex(){ // Возвращаем индекс с помощью метода getIndex(){}

        return index;
    }

    //public String toString(){  // Переопределение базового метода toString(), который в базовом варианте возвращает название объекта из Enam в виде строки
    //    return "Арабское значение числа "+index;
    //}

}
