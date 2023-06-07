package less_04;

public class Main {
    public static void main(String[] args) {

        MyHashMap mhm = new MyHashMap();

        System.out.println();
        System.out.println("Добавить элемент");
        System.out.println(mhm.put(1, 8));
        System.out.println(mhm.put(2, 3));
        System.out.println(mhm.put(3, 14));
        System.out.println(mhm.put(4, 7));
        System.out.println(mhm.put(17, 0));
        System.out.println(mhm.put(18, 96));
        System.out.println(mhm.put(33, 2));
        System.out.println(mhm.put(1, 0));

        System.out.println();
        System.out.println("Получить элемент по ключу"); 
        System.out.println(mhm.get(1));
        System.out.println(mhm.get(106));

        System.out.println();
        System.out.println("Удалить элемент по ключу");
        System.out.println("Размер до удаления: " + mhm.size());
        System.out.println(mhm.remove(106));
        System.out.println(mhm.remove(17));
        System.out.println("Размер после удаления: " + mhm.size());

        System.out.println();
        System.out.println("Заменить значение");
        System.out.println("До: " + mhm.get(4));
        System.out.println(mhm.replace(4, 90));
        System.out.println("После: " + mhm.get(4));

        System.out.println();
        System.out.println("Наличие ключа");
        System.out.println(mhm.containsKey(1));
        System.out.println(mhm.containsKey(106));
    
        System.out.println();
        System.out.println("Наличие значения");
        System.out.println(mhm.containsValue(0));
        System.out.println(mhm.containsKey(106));

        System.out.println();
    }
}

