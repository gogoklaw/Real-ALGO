
import java.util.*;

public class Arraytest {

    public static void main(String[] args) {
        // เมนูเก็บเป็น code -> [ชื่อ, ราคา]
        Map<Integer, String> menu = new LinkedHashMap<>();
        Map<Integer, Integer> price = new LinkedHashMap<>();

        menu.put(10, "โค้ก");
        price.put(10, 20);

        menu.put(11, "สไปร์ท");
        price.put(11, 18);

        menu.put(12, "แฟนต้า");
        price.put(12, 18);

        menu.put(13, "ชาเขียว");
        price.put(13, 25);

        menu.put(14, "น้ำเปล่า");
        price.put(14, 10);

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ตู้กดน้ำพร้อมราคา ===");
        menu.forEach((k, v)
                -> System.out.println(k + " : " + v + " (" + price.get(k) + " บาท)")
        );

        System.out.print("ใส่หมายเลข: ");
        if (!sc.hasNextInt()) {
            System.out.println("กรอกเป็นตัวเลขเท่านั้นน้า");
            return;
        }
        int code = sc.nextInt();

        if (menu.containsKey(code)) {
            String item = menu.get(code);
            int cost = price.get(code);
            System.out.println("คุณเลือก: " + item + " ราคา " + cost + " บาท");
        } else {
            System.out.println("ไม่พบหมายเลข " + code + " ในเมนู");
        }

        sc.close();
    }
}
