import util.*;
import XucXac.*;
import referee.*;
import Player.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Player> players = new ArrayList<> () ;
    public List<XucXac> xucXacs = Arrays.asList(new XucXac1(), new XucXac2(), new XucXac3(), new XucXac4());
    public List<Player> virtualPlayers = Arrays.asList(new VirtualPlayer1(), new VirtualPlayer2(), new VirtualPlayer3(), new VirtualPlayer4());
    public Referee referee = new Referee();


    public void start () {
        System.out.println("Chao mung den voi tro choi xuc xac") ;
        System.out.println("So nguoi choi tham gia la: ");
        Scanner sc = Utils.getScanner();
        int n = sc.nextInt();
        sc.nextLine();
        while (n < 0 || n > 4) {
            System.out.println("Vui long nhap so luong hop le( 0 den 4)");
            n = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 1; i <= n ; i++) {
            System.out.println("Nhap ten nguoi choi thu " + i +": ");
            String name = sc.nextLine();
            Player p = new Player(name);
            players.add(p);
        }

        for(int i = n+1 ; i<= 4 ; i++) {
            players.add(virtualPlayers.get(i-n-1));
        }
        System.out.println("Bat dau choi");
        int turn = 1;
        while (true) {
            System.out.println("------------------");
            System.out.println("Luot choi thu " + turn);
            Player cur = referee.choosePlayer(players);
            System.out.println("Nguoi choi " + cur.getName() + "duoc lua chon");
            int point = referee.pickFromXucXac(xucXacs);
            System.out.println("Nguoi choi " + cur.getName() + " nhan duoc " + point + " diem");
            cur.updatePoint(point);
            System.out.println("So diem cua cac nguoi choi la ");
            for (Player p : players) {
                System.out.println("Nguoi choi " + p.getName()+": "+ p.getPoint() + " diem");
            }
            if (cur.checkWinning()) {
                for(Player p : players) {
                    if(!p.equals(cur) && p instanceof VirtualPlayer) {
                        ((VirtualPlayer)p).showLosingExpression();
                    }
                }
                System.out.println("Ket thuc tro choi");
                return;
            }
            turn++;
        }
    }



    public static void main(String[] args) {
        Main m = new Main () ;
        m.start();

    }
}