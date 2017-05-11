package com.example.blue.baithuchanh03;

import java.util.ArrayList;

/**
 * Created by blue on 15/01/2017.
 */

public class BoiToan {


    private String tenNam;
    private String tenNU;
    private char[] nam;
    private char[] nu;
    private int so;
    private int phantram=0;

    public int getSo() {
        return so;
    }

    public BoiToan(String tenNam, String tenNU) {
        this.tenNam = tenNam;
        this.tenNU = tenNU;
        nam = tenNam.toCharArray();
        nu = tenNU.toCharArray();
    }


    int kiemTra(char[] name) {

        int m = 0;
        int l = 0;
        int o = 0;
        int v = 0;
        int e = 0;
        int s = 0;
        for (char a : name) {
            if (Character.toString(a).equalsIgnoreCase("a")) {
                m = m + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("k")) {
                m = m + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("u")) {
                m = m + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("b")) {
                m = m + 2;
            }
            if (Character.toString(a).equalsIgnoreCase("s")) {
                m = m + 2;
                s = s + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("j")) {
                m = m + 2;
            }
            if (Character.toString(a).equalsIgnoreCase("c")) {
                m = m + 3;
            }
            if (Character.toString(a).equalsIgnoreCase("l")) {
                m = m + 3;
                l = l + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("t")) {
                m = m + 3;
            }
            if (Character.toString(a).equalsIgnoreCase("d")) {
                m = m + 4;
            }
            if (Character.toString(a).equalsIgnoreCase("n")) {
                m = m + 4;
            }
            if (Character.toString(a).equalsIgnoreCase("x")) {
                m = m + 4;
            }
            if (Character.toString(a).equalsIgnoreCase("e")) {
                m = m + 5;
                e = e + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("m")) {
                m = m + 5;
            }
            if (Character.toString(a).equalsIgnoreCase("w")) {
                m = m + 5;
            }
            if (Character.toString(a).equalsIgnoreCase("f")) {
                m = m + 6;
            }
            if (Character.toString(a).equalsIgnoreCase("o")) {
                m = m + 6;
                o = o + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("v")) {
                m = m + 6;
                v = v + 1;
            }
            if (Character.toString(a).equalsIgnoreCase("g")) {
                m = m + 7;
            }
            if (Character.toString(a).equalsIgnoreCase("q")) {
                m = m + 7;
            }
            if (Character.toString(a).equalsIgnoreCase("z")) {
                m = m + 7;
            }
            if (Character.toString(a).equalsIgnoreCase("h")) {
                m = m + 8;
            }
            if (Character.toString(a).equalsIgnoreCase("p")) {
                m = m + 8;
            }
            if (Character.toString(a).equalsIgnoreCase("y")) {
                m = m + 8;
            }
            if (Character.toString(a).equalsIgnoreCase("i")) {
                m = m + 9;
            }
            if (Character.toString(a).equalsIgnoreCase("r")) {
                m = m + 9;

            }

        }
        phantram = phantram+l * 10000 + o * 1000 + v * 100 + e * 10 + s;

        return m;
    }

    String ketQua() {
        int tong = kiemTra(nam) + kiemTra(nu);
        System.out.println(tong);
        System.out.println(phantram);
        String temp = "";
        so = tong;
        while (true) {

            if (tong > 9) {
                String a = Integer.toString(tong);
                String[] b = a.split("");
tong=0;
                for (int i = 1; i < b.length; i++) {

                    tong = tong + Integer.parseInt(b[i]);
                }
            } else {
                break;
            }
        }

        switch (tong) {
            case 1:
                temp = "Tình yêu của bạn rất đẹp đó nha. Tình cảm mặn nồng, nồng thắm khiến cho "
                        + "chúng tôi rất ngưỡng mộ và cảm phục tình yêu của các bạn. Người ta thường "
                        + "nói là duyên phận ý trời mà, có tránh cũng không tránh được đâu nhá. Bạn "
                        + "nên đón nhận tình cảm thật của mình đi đừng có chốn tránh nữa nhé.";
                break;
            case 2:
                temp = "Chúng tôi cứ tưởng tình yêu của các bạn có kết quả là số 2 cũng là một tình "
                        + "yêu đẹp nữa cơ. Hóa ra lại không phải như vậy, trái tim mách bảo tình yêu "
                        + "nhưng con tim lại không làm chủ được lý trí của mình. Do yêu nhau nồng "
                        + "thắm nhưng các bạn không có lý trí chỉ vì gia đình phản đối mà các bạn lại từ "
                        + "bỏ nhau, xa nhau mãi mãi.";
                break;
            case 3:
                temp = "Các bạn có một tình bạn rất là đẹp và trong sáng, nhưng một trong hai bạn "
                        + "muốn vượt qua giới hạn của tình bạn để tiến tới tình yêu, một tình yêu vĩnh "
                        + "cửu. Một tình yêu mà bao nhiêu người ngưỡng mộ. Các bạn đã hiểu từng chân "
                        + "tơ kẽ tóc của nhau, nên yêu nhau là chuyện bình thường thôi mà tu vi tuong so";
                break;
            case 4:
                temp = "Tình yêu của các bạn gắn với câu chuyện của ông tơ bà nguyệt nhé. Họ đã se "
                        + "duyên cho các bạn đó, tại kiếp trước hai bạn đã mắc nợ nhau một cái gì đó, "
                        + "nên kiếp này các bạn được bên nhau trọn đời.";
                break;
            case 5:
                temp = "Bạn là người có số đào hoa, nhiều người theo đuổi nhưng bạn không thích. "
                        + "Không phải là do bạn kén chọn đâu, mà là do bạn ý chưa cảm nhận được tấm "
                        + "long chân thành của người ta thôi. Nhanh tay và chọn lấy một người đi, kẻo "
                        + "sau hối hận đấy bạn ạ.";
                break;
            case 6:
                temp = "Hai bạn gặp nhau là đã yêu nhau ngay từ cái nhìn đầu tiên rồi đấy. Đây phải "
                        + "gọi là tình yêu sét đánh, một tình yêu đẹp và chân thành hãy nghe con tim "
                        + "mình mách bảo để hai bạn có một tình yêu thật là tuyệt vời nhé.";
                break;
            case 7:
                temp = "Yêu nhau không phải vì tiền, đây là một trong những suy nghĩ đầu tiên của hai "
                        + "bạn, bởi vì tiền không phải làm lên tất cả, chỉ có con người mới làm ra tiền mà "
                        + "thôi. Chính vì suy nghĩ này mà hai bạn rất là hợp nhau.";
                break;
            case 8:
                temp = "Bạn là một con người không kén chọn trong tình yêu, tình yêu đến bạn đã biết "
                        + "bắt lấy kịp thời, và bạn đang rất hạnh phúc với tình yêu này. Chúng tôi chúc "
                        + "cho hai bạn tram năm hạnh phúc nhé. xem tu vi online .";
                break;
            case 9:
                temp = "Tình yêu của hai bạn không tốt đẹp gì. Hai người không nhớ đến nhau mà lại "
                        + "nhớ đến người khác, một người thứ ba đang xuất hiện trong cuộc sống này nó "
                        + "làm ảnh hưởng đến tình yêu của hai bạn. yêu nhau là phải tin tưởng nhau, nếu "
                        + "không tin tưởng nhau thì hạnh phúc mãi mãi chia xa.";
                break;
        }
        return temp;
    }

    public int tinhPhanTram() {
        while (true) {
            if (phantram > 100) {

                String a = Integer.toString(phantram);

                System.out.println(phantram);
                String[] b = a.split("");
                a = Integer.toString(Integer.parseInt(b[1]) + Integer.parseInt(b[2]));
                for (int i = 3; i < b.length; i++) {
                    a = a + Integer.toString(Integer.parseInt(b[1]) + Integer.parseInt(b[i]));
                }
                phantram = Integer.parseInt(a);
            } else {
                break;
            }
        }
        return phantram;
    }

}


